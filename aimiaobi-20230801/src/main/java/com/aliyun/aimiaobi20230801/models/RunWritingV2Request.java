// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingV2Request extends TeaModel {
    @NameInMap("Articles")
    public java.util.List<RunWritingV2RequestArticles> articles;

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
    public java.util.List<String> keywords;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("MiniDocs")
    public java.util.List<RunWritingV2RequestMiniDocs> miniDocs;

    @NameInMap("Outlines")
    public java.util.List<RunWritingV2RequestOutlines> outlines;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>Template</p>
     */
    @NameInMap("PromptMode")
    public String promptMode;

    @NameInMap("SearchSources")
    public java.util.List<RunWritingV2RequestSearchSources> searchSources;

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
    public java.util.List<RunWritingV2RequestSummarization> summarization;

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
    public java.util.Map<String, String> writingParams;

    /**
     * <strong>example:</strong>
     * <p>media</p>
     */
    @NameInMap("WritingScene")
    public String writingScene;

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
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 14:25:59</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        /**
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
        @NameInMap("Content")
        public String content;

        @NameInMap("Index")
        public String index;

        /**
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
        @NameInMap("Content")
        public String content;

        @NameInMap("Title")
        public String title;

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
        @NameInMap("Articles")
        public java.util.List<RunWritingV2RequestOutlinesArticles> articles;

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
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

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
        @NameInMap("Event")
        public String event;

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
