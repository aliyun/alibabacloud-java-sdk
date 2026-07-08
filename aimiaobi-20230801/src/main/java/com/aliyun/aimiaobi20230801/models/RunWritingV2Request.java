// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingV2Request extends TeaModel {
    /**
     * <p>A list of articles to use as references. <strong>Note:</strong> When you provide this parameter, web search is disabled, overriding the <code>UseSearch</code> and <code>SearchSources</code> parameters.</p>
     */
    @NameInMap("Articles")
    public java.util.List<RunWritingV2RequestArticles> articles;

    /**
     * <p>Specifies whether to enable step-by-step writing. For more information, see the <code>Step</code> parameter description.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DistributeWriting")
    public Boolean distributeWriting;

    /**
     * <p>The number of articles to write. If you request multiple articles, the system returns them concurrently, each with a unique session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GcNumberSize")
    public Integer gcNumberSize;

    /**
     * <p>A string that specifies the desired article length. Examples: &quot;about 300 words&quot;, &quot;about 600 words&quot;, &quot;about 1,000 words&quot;, or &quot;about 2,000 words&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>2000字左右</p>
     */
    @NameInMap("GcNumberSizeTag")
    public String gcNumberSizeTag;

    /**
     * <p>A list of keywords used for both search and writing.</p>
     */
    @NameInMap("Keywords")
    public java.util.List<String> keywords;

    /**
     * <p>The output language for the article.</p>
     * <ul>
     * <li><p><code>en</code>: English</p>
     * </li>
     * <li><p><code>zh</code>: Chinese</p>
     * </li>
     * <li><p>Other languages or specific style requirements can also be specified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>A list of article snippets.</p>
     */
    @NameInMap("MiniDocs")
    public java.util.List<RunWritingV2RequestMiniDocs> miniDocs;

    /**
     * <p>A list of outlines for step-by-step writing.</p>
     */
    @NameInMap("OutlineList")
    public java.util.List<WritingOutline> outlineList;

    /**
     * <p>A list of outlines for step-by-step writing. This parameter is deprecated. Use <code>OutlineList</code> instead.</p>
     */
    @NameInMap("Outlines")
    public java.util.List<RunWritingV2RequestOutlines> outlines;

    /**
     * <p>The writing prompt. You must provide either <code>Prompt</code> or <code>WritingParams</code>. For more information, see the description of the <code>PromptMode</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>提示词</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The prompt mode. Valid values: <code>Template</code> (template mode) and <code>PE</code> (advanced PE mode).</p>
     * <ol>
     * <li><p>If this parameter is omitted, you must provide the <code>Prompt</code> parameter. We recommend that the prompt includes the topic, length, requirements, and prohibitions.</p>
     * </li>
     * <li><p>If <code>PromptMode</code> is set to <code>Template</code>, you must provide <code>WritingParams</code>, which is a dictionary of string key-value pairs. For the required schema, see the <code>.Data.TemplateDefine[].Fields</code> field in the response of the <a href="https://help.aliyun.com/document_detail/2922609.html">ListWritingStyles</a> operation.</p>
     * </li>
     * <li><p>If <code>PromptMode</code> is set to <code>PE</code>, you must pass <code>WritingParams</code> with the following two fields:</p>
     * <ol>
     * <li><p><code>topic</code>: Required. The topic to write about.</p>
     * </li>
     * <li><p><code>prompt</code>: Optional. Any additional custom prompts or writing requirements.</p>
     * </li>
     * </ol>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>Template</p>
     */
    @NameInMap("PromptMode")
    public String promptMode;

    /**
     * <p>A list of specified search sources to use.</p>
     */
    @NameInMap("SearchSources")
    public java.util.List<RunWritingV2RequestSearchSources> searchSources;

    /**
     * <p>The ID of a single-turn conversation. This parameter is deprecated and its use is discouraged.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The source tracing method. Currently, only <code>modelSourceTrace</code> is supported. If set to <code>modelSourceTrace</code>, the model adds citation markers (for example, <code>[[1]]</code>) to the end of each cited snippet in the generated text. The citation index starts at 1.</p>
     * 
     * <strong>example:</strong>
     * <p>modelSourceTrace</p>
     */
    @NameInMap("SourceTraceMethod")
    public String sourceTraceMethod;

    /**
     * <p>The step for step-by-step writing. Valid values:</p>
     * <ul>
     * <li><p><code>OutlineGenerate</code>: Outline generation</p>
     * </li>
     * <li><p><code>Writing</code>: Article writing</p>
     * </li>
     * </ul>
     * <p>When <code>DistributeWriting</code> is <code>true</code>, the default flow for step-by-step writing is to first generate an outline and then write the content based on it.</p>
     * 
     * <strong>example:</strong>
     * <p>Writing</p>
     */
    @NameInMap("Step")
    public String step;

    /**
     * <p>A list of summarization objects, used for step-by-step writing.</p>
     */
    @NameInMap("Summarization")
    public java.util.List<RunWritingV2RequestSummarization> summarization;

    /**
     * <p>The unique ID of the task. You can reuse the same task ID for a multi-turn conversation.</p>
     * <blockquote>
     * <p>The system automatically generates a <code>TaskId</code> if you do not specify one. Reusing the same <code>TaskId</code> for subsequent requests groups them into a single conversation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Specifies whether to enable web search. If <code>true</code>, the system uses its built-in web search feature. Default: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseSearch")
    public Boolean useSearch;

    /**
     * <p>The unique ID of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Obtain a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The parameters for template-based writing, provided as a dictionary of string key-value pairs. You must provide either <code>Prompt</code> or <code>WritingParams</code>. For more information, see the description of the <code>PromptMode</code> parameter.</p>
     */
    @NameInMap("WritingParams")
    public java.util.Map<String, String> writingParams;

    /**
     * <p>The writing scene. Valid values: <code>government</code> (government affairs), <code>media</code>, <code>market</code> (marketing), <code>office</code>, and <code>custom</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>media</p>
     */
    @NameInMap("WritingScene")
    public String writingScene;

    /**
     * <p>The writing style. For a list of supported styles, see <a href="https://help.aliyun.com/document_detail/2922609.html">ListWritingStyles</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>新闻评论</p>
     */
    @NameInMap("WritingStyle")
    public String writingStyle;

    public static RunWritingV2Request build(java.util.Map<String, ?> map) throws Exception {
        RunWritingV2Request self = new RunWritingV2Request();
        return TeaModel.build(map, self);
    }

    public RunWritingV2Request setArticles(java.util.List<RunWritingV2RequestArticles> articles) {
        this.articles = articles;
        return this;
    }
    public java.util.List<RunWritingV2RequestArticles> getArticles() {
        return this.articles;
    }

    public RunWritingV2Request setDistributeWriting(Boolean distributeWriting) {
        this.distributeWriting = distributeWriting;
        return this;
    }
    public Boolean getDistributeWriting() {
        return this.distributeWriting;
    }

    public RunWritingV2Request setGcNumberSize(Integer gcNumberSize) {
        this.gcNumberSize = gcNumberSize;
        return this;
    }
    public Integer getGcNumberSize() {
        return this.gcNumberSize;
    }

    public RunWritingV2Request setGcNumberSizeTag(String gcNumberSizeTag) {
        this.gcNumberSizeTag = gcNumberSizeTag;
        return this;
    }
    public String getGcNumberSizeTag() {
        return this.gcNumberSizeTag;
    }

    public RunWritingV2Request setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    public RunWritingV2Request setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RunWritingV2Request setMiniDocs(java.util.List<RunWritingV2RequestMiniDocs> miniDocs) {
        this.miniDocs = miniDocs;
        return this;
    }
    public java.util.List<RunWritingV2RequestMiniDocs> getMiniDocs() {
        return this.miniDocs;
    }

    public RunWritingV2Request setOutlineList(java.util.List<WritingOutline> outlineList) {
        this.outlineList = outlineList;
        return this;
    }
    public java.util.List<WritingOutline> getOutlineList() {
        return this.outlineList;
    }

    public RunWritingV2Request setOutlines(java.util.List<RunWritingV2RequestOutlines> outlines) {
        this.outlines = outlines;
        return this;
    }
    public java.util.List<RunWritingV2RequestOutlines> getOutlines() {
        return this.outlines;
    }

    public RunWritingV2Request setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunWritingV2Request setPromptMode(String promptMode) {
        this.promptMode = promptMode;
        return this;
    }
    public String getPromptMode() {
        return this.promptMode;
    }

    public RunWritingV2Request setSearchSources(java.util.List<RunWritingV2RequestSearchSources> searchSources) {
        this.searchSources = searchSources;
        return this;
    }
    public java.util.List<RunWritingV2RequestSearchSources> getSearchSources() {
        return this.searchSources;
    }

    public RunWritingV2Request setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunWritingV2Request setSourceTraceMethod(String sourceTraceMethod) {
        this.sourceTraceMethod = sourceTraceMethod;
        return this;
    }
    public String getSourceTraceMethod() {
        return this.sourceTraceMethod;
    }

    public RunWritingV2Request setStep(String step) {
        this.step = step;
        return this;
    }
    public String getStep() {
        return this.step;
    }

    public RunWritingV2Request setSummarization(java.util.List<RunWritingV2RequestSummarization> summarization) {
        this.summarization = summarization;
        return this;
    }
    public java.util.List<RunWritingV2RequestSummarization> getSummarization() {
        return this.summarization;
    }

    public RunWritingV2Request setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunWritingV2Request setUseSearch(Boolean useSearch) {
        this.useSearch = useSearch;
        return this;
    }
    public Boolean getUseSearch() {
        return this.useSearch;
    }

    public RunWritingV2Request setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunWritingV2Request setWritingParams(java.util.Map<String, String> writingParams) {
        this.writingParams = writingParams;
        return this;
    }
    public java.util.Map<String, String> getWritingParams() {
        return this.writingParams;
    }

    public RunWritingV2Request setWritingScene(String writingScene) {
        this.writingScene = writingScene;
        return this;
    }
    public String getWritingScene() {
        return this.writingScene;
    }

    public RunWritingV2Request setWritingStyle(String writingStyle) {
        this.writingStyle = writingStyle;
        return this;
    }
    public String getWritingStyle() {
        return this.writingStyle;
    }

    public static class RunWritingV2RequestArticles extends TeaModel {
        /**
         * <p>The content of the article.</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The publication time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 14:25:59</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>The name of the search source.</p>
         * 
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <p>The source of the article.</p>
         * 
         * <strong>example:</strong>
         * <p>新华社</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The title of the article.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the article.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static RunWritingV2RequestArticles build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2RequestArticles self = new RunWritingV2RequestArticles();
            return TeaModel.build(map, self);
        }

        public RunWritingV2RequestArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunWritingV2RequestArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunWritingV2RequestArticles setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunWritingV2RequestArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunWritingV2RequestArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunWritingV2RequestArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunWritingV2RequestMiniDocs extends TeaModel {
        /**
         * <p>The content of the snippet.</p>
         * 
         * <strong>example:</strong>
         * <p>片段内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The index of the article snippet in the referenced article.</p>
         * 
         * <strong>example:</strong>
         * <p>索引</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>Specifies whether to prioritize this snippet.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Star")
        public Boolean star;

        public static RunWritingV2RequestMiniDocs build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2RequestMiniDocs self = new RunWritingV2RequestMiniDocs();
            return TeaModel.build(map, self);
        }

        public RunWritingV2RequestMiniDocs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunWritingV2RequestMiniDocs setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public RunWritingV2RequestMiniDocs setStar(Boolean star) {
            this.star = star;
            return this;
        }
        public Boolean getStar() {
            return this.star;
        }

    }

    public static class RunWritingV2RequestOutlinesArticles extends TeaModel {
        /**
         * <p>The content of the article.</p>
         * 
         * <strong>example:</strong>
         * <p>正文内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The title of the article.</p>
         * 
         * <strong>example:</strong>
         * <p>标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the article.</p>
         * 
         * <strong>example:</strong>
         * <p>文章URL</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunWritingV2RequestOutlinesArticles build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2RequestOutlinesArticles self = new RunWritingV2RequestOutlinesArticles();
            return TeaModel.build(map, self);
        }

        public RunWritingV2RequestOutlinesArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunWritingV2RequestOutlinesArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunWritingV2RequestOutlinesArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunWritingV2RequestOutlines extends TeaModel {
        /**
         * <p>A list of articles referenced by the outline.</p>
         */
        @NameInMap("Articles")
        public java.util.List<RunWritingV2RequestOutlinesArticles> articles;

        /**
         * <p>The outline.</p>
         * 
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        public static RunWritingV2RequestOutlines build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2RequestOutlines self = new RunWritingV2RequestOutlines();
            return TeaModel.build(map, self);
        }

        public RunWritingV2RequestOutlines setArticles(java.util.List<RunWritingV2RequestOutlinesArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunWritingV2RequestOutlinesArticles> getArticles() {
            return this.articles;
        }

        public RunWritingV2RequestOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

    }

    public static class RunWritingV2RequestSearchSources extends TeaModel {
        /**
         * <p>The type of search source. Valid values: <code>SystemSearch</code> (built-in system search), <code>CustomSemanticSearch</code> (search of a custom semantic index), and <code>ThirdSearch</code> (search through a third-party API).</p>
         * 
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The unique identifier of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>The description of the search source. This parameter is deprecated and has no effect.</p>
         * 
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("Name")
        public String name;

        public static RunWritingV2RequestSearchSources build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2RequestSearchSources self = new RunWritingV2RequestSearchSources();
            return TeaModel.build(map, self);
        }

        public RunWritingV2RequestSearchSources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RunWritingV2RequestSearchSources setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public RunWritingV2RequestSearchSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RunWritingV2RequestSummarization extends TeaModel {
        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>事件名称</p>
         */
        @NameInMap("Event")
        public String event;

        /**
         * <p>The summary of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>事件摘编</p>
         */
        @NameInMap("Message")
        public String message;

        public static RunWritingV2RequestSummarization build(java.util.Map<String, ?> map) throws Exception {
            RunWritingV2RequestSummarization self = new RunWritingV2RequestSummarization();
            return TeaModel.build(map, self);
        }

        public RunWritingV2RequestSummarization setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public RunWritingV2RequestSummarization setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
