// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingV2ShrinkRequest extends TeaModel {
    /**
     * <p>A list of articles to use as references. <strong>Note:</strong> When you provide this parameter, web search is disabled, overriding the <code>UseSearch</code> and <code>SearchSources</code> parameters.</p>
     */
    @NameInMap("Articles")
    public String articlesShrink;

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
    public String keywordsShrink;

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
    public String miniDocsShrink;

    /**
     * <p>A list of outlines for step-by-step writing.</p>
     */
    @NameInMap("OutlineList")
    public String outlineListShrink;

    /**
     * <p>A list of outlines for step-by-step writing. This parameter is deprecated. Use <code>OutlineList</code> instead.</p>
     */
    @NameInMap("Outlines")
    public String outlinesShrink;

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
    public String searchSourcesShrink;

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
    public String summarizationShrink;

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
    public String writingParamsShrink;

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

    public static RunWritingV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunWritingV2ShrinkRequest self = new RunWritingV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunWritingV2ShrinkRequest setArticlesShrink(String articlesShrink) {
        this.articlesShrink = articlesShrink;
        return this;
    }
    public String getArticlesShrink() {
        return this.articlesShrink;
    }

    public RunWritingV2ShrinkRequest setDistributeWriting(Boolean distributeWriting) {
        this.distributeWriting = distributeWriting;
        return this;
    }
    public Boolean getDistributeWriting() {
        return this.distributeWriting;
    }

    public RunWritingV2ShrinkRequest setGcNumberSize(Integer gcNumberSize) {
        this.gcNumberSize = gcNumberSize;
        return this;
    }
    public Integer getGcNumberSize() {
        return this.gcNumberSize;
    }

    public RunWritingV2ShrinkRequest setGcNumberSizeTag(String gcNumberSizeTag) {
        this.gcNumberSizeTag = gcNumberSizeTag;
        return this;
    }
    public String getGcNumberSizeTag() {
        return this.gcNumberSizeTag;
    }

    public RunWritingV2ShrinkRequest setKeywordsShrink(String keywordsShrink) {
        this.keywordsShrink = keywordsShrink;
        return this;
    }
    public String getKeywordsShrink() {
        return this.keywordsShrink;
    }

    public RunWritingV2ShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RunWritingV2ShrinkRequest setMiniDocsShrink(String miniDocsShrink) {
        this.miniDocsShrink = miniDocsShrink;
        return this;
    }
    public String getMiniDocsShrink() {
        return this.miniDocsShrink;
    }

    public RunWritingV2ShrinkRequest setOutlineListShrink(String outlineListShrink) {
        this.outlineListShrink = outlineListShrink;
        return this;
    }
    public String getOutlineListShrink() {
        return this.outlineListShrink;
    }

    public RunWritingV2ShrinkRequest setOutlinesShrink(String outlinesShrink) {
        this.outlinesShrink = outlinesShrink;
        return this;
    }
    public String getOutlinesShrink() {
        return this.outlinesShrink;
    }

    public RunWritingV2ShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunWritingV2ShrinkRequest setPromptMode(String promptMode) {
        this.promptMode = promptMode;
        return this;
    }
    public String getPromptMode() {
        return this.promptMode;
    }

    public RunWritingV2ShrinkRequest setSearchSourcesShrink(String searchSourcesShrink) {
        this.searchSourcesShrink = searchSourcesShrink;
        return this;
    }
    public String getSearchSourcesShrink() {
        return this.searchSourcesShrink;
    }

    public RunWritingV2ShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunWritingV2ShrinkRequest setSourceTraceMethod(String sourceTraceMethod) {
        this.sourceTraceMethod = sourceTraceMethod;
        return this;
    }
    public String getSourceTraceMethod() {
        return this.sourceTraceMethod;
    }

    public RunWritingV2ShrinkRequest setStep(String step) {
        this.step = step;
        return this;
    }
    public String getStep() {
        return this.step;
    }

    public RunWritingV2ShrinkRequest setSummarizationShrink(String summarizationShrink) {
        this.summarizationShrink = summarizationShrink;
        return this;
    }
    public String getSummarizationShrink() {
        return this.summarizationShrink;
    }

    public RunWritingV2ShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunWritingV2ShrinkRequest setUseSearch(Boolean useSearch) {
        this.useSearch = useSearch;
        return this;
    }
    public Boolean getUseSearch() {
        return this.useSearch;
    }

    public RunWritingV2ShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunWritingV2ShrinkRequest setWritingParamsShrink(String writingParamsShrink) {
        this.writingParamsShrink = writingParamsShrink;
        return this;
    }
    public String getWritingParamsShrink() {
        return this.writingParamsShrink;
    }

    public RunWritingV2ShrinkRequest setWritingScene(String writingScene) {
        this.writingScene = writingScene;
        return this;
    }
    public String getWritingScene() {
        return this.writingScene;
    }

    public RunWritingV2ShrinkRequest setWritingStyle(String writingStyle) {
        this.writingStyle = writingStyle;
        return this;
    }
    public String getWritingStyle() {
        return this.writingStyle;
    }

}
