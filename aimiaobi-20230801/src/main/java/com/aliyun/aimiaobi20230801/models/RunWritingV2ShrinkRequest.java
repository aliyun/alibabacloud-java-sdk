// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingV2ShrinkRequest extends TeaModel {
    @NameInMap("Articles")
    public String articlesShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DistributeWriting")
    public Boolean distributeWriting;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("GcNumberSize")
    public Integer gcNumberSize;

    @NameInMap("GcNumberSizeTag")
    public String gcNumberSizeTag;

    @NameInMap("Keywords")
    public String keywordsShrink;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("MiniDocs")
    public String miniDocsShrink;

    @NameInMap("Outlines")
    public String outlinesShrink;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>Template</p>
     */
    @NameInMap("PromptMode")
    public String promptMode;

    @NameInMap("SearchSources")
    public String searchSourcesShrink;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>Writing</p>
     */
    @NameInMap("Step")
    public String step;

    @NameInMap("Summarization")
    public String summarizationShrink;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseSearch")
    public Boolean useSearch;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("WritingParams")
    public String writingParamsShrink;

    /**
     * <strong>example:</strong>
     * <p>media</p>
     */
    @NameInMap("WritingScene")
    public String writingScene;

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
