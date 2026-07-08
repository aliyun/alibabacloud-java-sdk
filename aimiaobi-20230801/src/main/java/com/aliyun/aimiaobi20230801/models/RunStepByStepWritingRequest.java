// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunStepByStepWritingRequest extends TeaModel {
    /**
     * <p>The ID of the original conversation when regenerating content.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("OriginSessionId")
    public String originSessionId;

    /**
     * <p>The prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>提示词</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The reference article data for writing.</p>
     */
    @NameInMap("ReferenceData")
    public RunStepByStepWritingRequestReferenceData referenceData;

    /**
     * <p>The ID of a single-turn conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The task ID. You can reuse the same task ID for a multi-turn conversation.</p>
     * <blockquote>
     * <p>By default, you do not need to specify this parameter. The system automatically generates a task ID. If you specify the same TaskId for subsequent tasks, the tasks are considered part of the same conversation group.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Obtain a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The writing configuration.</p>
     */
    @NameInMap("WritingConfig")
    public RunStepByStepWritingRequestWritingConfig writingConfig;

    public static RunStepByStepWritingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunStepByStepWritingRequest self = new RunStepByStepWritingRequest();
        return TeaModel.build(map, self);
    }

    public RunStepByStepWritingRequest setOriginSessionId(String originSessionId) {
        this.originSessionId = originSessionId;
        return this;
    }
    public String getOriginSessionId() {
        return this.originSessionId;
    }

    public RunStepByStepWritingRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunStepByStepWritingRequest setReferenceData(RunStepByStepWritingRequestReferenceData referenceData) {
        this.referenceData = referenceData;
        return this;
    }
    public RunStepByStepWritingRequestReferenceData getReferenceData() {
        return this.referenceData;
    }

    public RunStepByStepWritingRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunStepByStepWritingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunStepByStepWritingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunStepByStepWritingRequest setWritingConfig(RunStepByStepWritingRequestWritingConfig writingConfig) {
        this.writingConfig = writingConfig;
        return this;
    }
    public RunStepByStepWritingRequestWritingConfig getWritingConfig() {
        return this.writingConfig;
    }

    public static class RunStepByStepWritingRequestReferenceDataArticles extends TeaModel {
        /**
         * <p>The author.</p>
         * 
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The custom unique ID of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>文档-自定义的唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>The internal unique ID of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>8a20e007a6174522af4d6a2657d5526f</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>The URL of the original material.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">http://www.example.com</a></p>
         */
        @NameInMap("MediaUrl")
        public String mediaUrl;

        /**
         * <p>The publication time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-10 14:17:54</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>央视网</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The article summary.</p>
         * 
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标签</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The title.</p>
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

        public static RunStepByStepWritingRequestReferenceDataArticles build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingRequestReferenceDataArticles self = new RunStepByStepWritingRequestReferenceDataArticles();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingRequestReferenceDataArticles setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            return this;
        }
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunStepByStepWritingRequestReferenceDataArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunStepByStepWritingRequestReferenceDataOutlinesArticles extends TeaModel {
        /**
         * <p>The article content.</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The article title.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The article URL.</p>
         * 
         * <strong>example:</strong>
         * <p>文章链接</p>
         */
        @NameInMap("Url")
        public String url;

        public static RunStepByStepWritingRequestReferenceDataOutlinesArticles build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingRequestReferenceDataOutlinesArticles self = new RunStepByStepWritingRequestReferenceDataOutlinesArticles();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingRequestReferenceDataOutlinesArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunStepByStepWritingRequestReferenceDataOutlinesArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunStepByStepWritingRequestReferenceDataOutlinesArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunStepByStepWritingRequestReferenceDataOutlines extends TeaModel {
        /**
         * <p>The specified data source for the outline.</p>
         */
        @NameInMap("Articles")
        public java.util.List<RunStepByStepWritingRequestReferenceDataOutlinesArticles> articles;

        /**
         * <p>The outline.</p>
         * 
         * <strong>example:</strong>
         * <p>大纲</p>
         */
        @NameInMap("Outline")
        public String outline;

        public static RunStepByStepWritingRequestReferenceDataOutlines build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingRequestReferenceDataOutlines self = new RunStepByStepWritingRequestReferenceDataOutlines();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingRequestReferenceDataOutlines setArticles(java.util.List<RunStepByStepWritingRequestReferenceDataOutlinesArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunStepByStepWritingRequestReferenceDataOutlinesArticles> getArticles() {
            return this.articles;
        }

        public RunStepByStepWritingRequestReferenceDataOutlines setOutline(String outline) {
            this.outline = outline;
            return this;
        }
        public String getOutline() {
            return this.outline;
        }

    }

    public static class RunStepByStepWritingRequestReferenceData extends TeaModel {
        /**
         * <p>The reference article data for writing.</p>
         */
        @NameInMap("Articles")
        public java.util.List<RunStepByStepWritingRequestReferenceDataArticles> articles;

        /**
         * <p>The ranked article segments for subsequent model generation.</p>
         */
        @NameInMap("MiniDoc")
        public java.util.List<String> miniDoc;

        /**
         * <p>The outline. You can specify a data source to generate the outline.</p>
         */
        @NameInMap("Outlines")
        public java.util.List<RunStepByStepWritingRequestReferenceDataOutlines> outlines;

        /**
         * <p>The summary result from the Large Language Model (LLM).</p>
         */
        @NameInMap("Summarization")
        public java.util.List<String> summarization;

        public static RunStepByStepWritingRequestReferenceData build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingRequestReferenceData self = new RunStepByStepWritingRequestReferenceData();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingRequestReferenceData setArticles(java.util.List<RunStepByStepWritingRequestReferenceDataArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunStepByStepWritingRequestReferenceDataArticles> getArticles() {
            return this.articles;
        }

        public RunStepByStepWritingRequestReferenceData setMiniDoc(java.util.List<String> miniDoc) {
            this.miniDoc = miniDoc;
            return this;
        }
        public java.util.List<String> getMiniDoc() {
            return this.miniDoc;
        }

        public RunStepByStepWritingRequestReferenceData setOutlines(java.util.List<RunStepByStepWritingRequestReferenceDataOutlines> outlines) {
            this.outlines = outlines;
            return this;
        }
        public java.util.List<RunStepByStepWritingRequestReferenceDataOutlines> getOutlines() {
            return this.outlines;
        }

        public RunStepByStepWritingRequestReferenceData setSummarization(java.util.List<String> summarization) {
            this.summarization = summarization;
            return this;
        }
        public java.util.List<String> getSummarization() {
            return this.summarization;
        }

    }

    public static class RunStepByStepWritingRequestWritingConfigPromptTag extends TeaModel {
        /**
         * <p>Necessary tips.</p>
         * 
         * <strong>example:</strong>
         * <p>必要提示</p>
         */
        @NameInMap("NecessaryTips")
        public String necessaryTips;

        /**
         * <p>The position or stance.</p>
         * 
         * <strong>example:</strong>
         * <p>立场</p>
         */
        @NameInMap("Position")
        public String position;

        /**
         * <p>Reverse the words.</p>
         * 
         * <strong>example:</strong>
         * <p>反向词</p>
         */
        @NameInMap("ReverseWords")
        public String reverseWords;

        /**
         * <p>The theme.</p>
         * 
         * <strong>example:</strong>
         * <p>主题</p>
         */
        @NameInMap("Theme")
        public String theme;

        public static RunStepByStepWritingRequestWritingConfigPromptTag build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingRequestWritingConfigPromptTag self = new RunStepByStepWritingRequestWritingConfigPromptTag();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingRequestWritingConfigPromptTag setNecessaryTips(String necessaryTips) {
            this.necessaryTips = necessaryTips;
            return this;
        }
        public String getNecessaryTips() {
            return this.necessaryTips;
        }

        public RunStepByStepWritingRequestWritingConfigPromptTag setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public RunStepByStepWritingRequestWritingConfigPromptTag setReverseWords(String reverseWords) {
            this.reverseWords = reverseWords;
            return this;
        }
        public String getReverseWords() {
            return this.reverseWords;
        }

        public RunStepByStepWritingRequestWritingConfigPromptTag setTheme(String theme) {
            this.theme = theme;
            return this;
        }
        public String getTheme() {
            return this.theme;
        }

    }

    public static class RunStepByStepWritingRequestWritingConfigTags extends TeaModel {
        /**
         * <p>The value of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The tag of the option. For example, gcNumberSizeTag=10.</p>
         * 
         * <strong>example:</strong>
         * <p>gcNumberSizeTag</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static RunStepByStepWritingRequestWritingConfigTags build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingRequestWritingConfigTags self = new RunStepByStepWritingRequestWritingConfigTags();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingRequestWritingConfigTags setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public RunStepByStepWritingRequestWritingConfigTags setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class RunStepByStepWritingRequestWritingConfig extends TeaModel {
        /**
         * <p>The writing domain.</p>
         * <ul>
         * <li><p>media (default): Media writing.</p>
         * </li>
         * <li><p>government: Official document writing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>media</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The keywords. This affects article retrieval.</p>
         */
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        /**
         * <p>The prompt assistant.</p>
         */
        @NameInMap("PromptTag")
        public RunStepByStepWritingRequestWritingConfigPromptTag promptTag;

        /**
         * <p>The step-by-step writing scenario.</p>
         * <ul>
         * <li><p>Scenarios supported for media writing: News Writing (default), News Commentary, and General Style.</p>
         * </li>
         * <li><p>Scenarios supported for official document writing: Notification (default), Announcement, Bulletin, Request for Instruction, Decision, Letter, and General Style.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>新闻写作</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <p>The writing step.</p>
         * <ul>
         * <li><p>Generate outline: OutlineGenerate</p>
         * </li>
         * <li><p>Generate summary: MiniDocSummary</p>
         * </li>
         * <li><p>Writing (default): Generate article</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Writing</p>
         */
        @NameInMap("Step")
        public String step;

        /**
         * <p>The return type of the summary result.<br></p>
         * <ul>
         * <li><p>Structure:
         * Returns a JSON string in payload.output.text. Example format: <code>{&quot;event&quot;:&quot;{outline}&quot;,&quot;message&quot;:&quot;{message}&quot;}</code></p>
         * </li>
         * <li><p>Content: Returns only the plain text summary content in payload.output.text. Example format:
         * `Outline: {outline}</p>
         * </li>
         * </ul>
         * <p>{message}</p>
         * <p> Outline: {outline}</p>
         * <p>{message}`</p>
         * <ul>
         * <li>Event: Returns only the outline content itself in payload.output.text each time an outline is completed. Typically, six describes are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Structure</p>
         */
        @NameInMap("SummaryReturnType")
        public String summaryReturnType;

        /**
         * <p>Control parameters for writing, such as style, length, and output language.</p>
         */
        @NameInMap("Tags")
        public java.util.List<RunStepByStepWritingRequestWritingConfigTags> tags;

        /**
         * <p>Specifies whether to automatically supplement materials.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseSearch")
        public Boolean useSearch;

        public static RunStepByStepWritingRequestWritingConfig build(java.util.Map<String, ?> map) throws Exception {
            RunStepByStepWritingRequestWritingConfig self = new RunStepByStepWritingRequestWritingConfig();
            return TeaModel.build(map, self);
        }

        public RunStepByStepWritingRequestWritingConfig setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public RunStepByStepWritingRequestWritingConfig setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public RunStepByStepWritingRequestWritingConfig setPromptTag(RunStepByStepWritingRequestWritingConfigPromptTag promptTag) {
            this.promptTag = promptTag;
            return this;
        }
        public RunStepByStepWritingRequestWritingConfigPromptTag getPromptTag() {
            return this.promptTag;
        }

        public RunStepByStepWritingRequestWritingConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public RunStepByStepWritingRequestWritingConfig setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public RunStepByStepWritingRequestWritingConfig setSummaryReturnType(String summaryReturnType) {
            this.summaryReturnType = summaryReturnType;
            return this;
        }
        public String getSummaryReturnType() {
            return this.summaryReturnType;
        }

        public RunStepByStepWritingRequestWritingConfig setTags(java.util.List<RunStepByStepWritingRequestWritingConfigTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<RunStepByStepWritingRequestWritingConfigTags> getTags() {
            return this.tags;
        }

        public RunStepByStepWritingRequestWritingConfig setUseSearch(Boolean useSearch) {
            this.useSearch = useSearch;
            return this;
        }
        public Boolean getUseSearch() {
            return this.useSearch;
        }

    }

}
