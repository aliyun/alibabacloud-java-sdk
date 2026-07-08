// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchGenerationRequest extends TeaModel {
    /**
     * <p>Context.</p>
     */
    @NameInMap("AgentContext")
    public RunSearchGenerationRequestAgentContext agentContext;

    /**
     * <p>Session configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ChatConfig")
    public RunSearchGenerationRequestChatConfig chatConfig;

    /**
     * <p>Image URL. Used for image search and hybrid text-and-image (prompt) search generation.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxx">http://xxxx</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>Model ID:</p>
     * <ul>
     * <li><p>quanmiao-max: Quanmiao-Max</p>
     * </li>
     * <li><p>quanmiao-plus: Quanmiao-Plus</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>quanmiao-max</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <p>Original session identifier. Usually empty. When non-empty, it indicates that the current conversation is based on the referenced session. The system loads parameters and search results from that session and replaces the generated result. Use this for re-generation, changing data sources, or adding new agents.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("OriginalSessionId")
    public String originalSessionId;

    /**
     * <p>Search query.</p>
     * 
     * <strong>example:</strong>
     * <p>杭州亚运会吉祥物是什么</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Unique identifier for the session task.</p>
     * <blockquote>
     * <p>By default, you do not need to provide a TaskId. The system generates one automatically. If you specify the same TaskId in subsequent requests, those tasks are grouped into the same conversation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>ID of the Alibaba Cloud Model Studio workspace. To learn how to obtain this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">How to use workspaces</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunSearchGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSearchGenerationRequest self = new RunSearchGenerationRequest();
        return TeaModel.build(map, self);
    }

    public RunSearchGenerationRequest setAgentContext(RunSearchGenerationRequestAgentContext agentContext) {
        this.agentContext = agentContext;
        return this;
    }
    public RunSearchGenerationRequestAgentContext getAgentContext() {
        return this.agentContext;
    }

    public RunSearchGenerationRequest setChatConfig(RunSearchGenerationRequestChatConfig chatConfig) {
        this.chatConfig = chatConfig;
        return this;
    }
    public RunSearchGenerationRequestChatConfig getChatConfig() {
        return this.chatConfig;
    }

    public RunSearchGenerationRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public RunSearchGenerationRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public RunSearchGenerationRequest setOriginalSessionId(String originalSessionId) {
        this.originalSessionId = originalSessionId;
        return this;
    }
    public String getOriginalSessionId() {
        return this.originalSessionId;
    }

    public RunSearchGenerationRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunSearchGenerationRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunSearchGenerationRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult extends TeaModel {
        /**
         * <p>Relevant chunks.</p>
         */
        @NameInMap("Chunks")
        public java.util.List<String> chunks;

        /**
         * <p>Content.</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Custom unique document ID.</p>
         * 
         * <strong>example:</strong>
         * <p>文档-自定义的唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>Internal unique document identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>Publication time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-25 14:25:59</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>Relevance score.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <p>Unique identifier for the search source. Same as searchSource.datasetName.</p>
         * 
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <p>Name of the search source.</p>
         * 
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <p>Search source type. Same as searchSource.code.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <p>Source.</p>
         * 
         * <strong>example:</strong>
         * <p>新华社</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Article summary.</p>
         * 
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Article URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult self = new RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setChunks(java.util.List<String> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<String> getChunks() {
            return this.chunks;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setSearchSourceName(String searchSourceName) {
            this.searchSourceName = searchSourceName;
            return this;
        }
        public String getSearchSourceName() {
            return this.searchSourceName;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setSearchSourceType(String searchSourceType) {
            this.searchSourceType = searchSourceType;
            return this;
        }
        public String getSearchSourceType() {
            return this.searchSourceType;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResult extends TeaModel {
        /**
         * <p>List of text search results.</p>
         */
        @NameInMap("SearchResult")
        public java.util.List<RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult> searchResult;

        public static RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResult build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResult self = new RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResult();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResult setSearchResult(java.util.List<RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

    }

    public static class RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection extends TeaModel {
        /**
         * <p>Unique identifier for the original session. Used to retrieve full results from that session. Required only for media asset search.</p>
         * 
         * <strong>example:</strong>
         * <p>原始会话唯一标识：搜索结果取这个会话中的全量，目前仅媒资搜索场景需要</p>
         */
        @NameInMap("OriginalSessionId")
        public String originalSessionId;

        /**
         * <p>Used only for clustering. Pass ClusterGenerate when performing secondary clustering on cluster subtopics.</p>
         * 
         * <strong>example:</strong>
         * <p>TextGenerate</p>
         */
        @NameInMap("SearchModel")
        public String searchModel;

        /**
         * <p>When SearchModel = ClusterGenerate, enter the topic name for the subtopic. Include quotation marks if the original value has them.</p>
         * 
         * <strong>example:</strong>
         * <p>分类1</p>
         */
        @NameInMap("SearchModelDataValue")
        public String searchModelDataValue;

        /**
         * <p>The type of referenced data source. Valid values: ‒ all: Retrieves the full data from historical sessions. This value is supported only in clustering scenarios. ‒ selected: Retrieves data from textSearchResult during generation.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("SelectionType")
        public String selectionType;

        /**
         * <p>Unique identifier for the session used as reference during generation. Used for clustering in media asset search.</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>Text search results.</p>
         */
        @NameInMap("TextSearchResult")
        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResult textSearchResult;

        public static RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection self = new RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection setOriginalSessionId(String originalSessionId) {
            this.originalSessionId = originalSessionId;
            return this;
        }
        public String getOriginalSessionId() {
            return this.originalSessionId;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection setSearchModel(String searchModel) {
            this.searchModel = searchModel;
            return this;
        }
        public String getSearchModel() {
            return this.searchModel;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection setSearchModelDataValue(String searchModelDataValue) {
            this.searchModelDataValue = searchModelDataValue;
            return this;
        }
        public String getSearchModelDataValue() {
            return this.searchModelDataValue;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection setSelectionType(String selectionType) {
            this.selectionType = selectionType;
            return this;
        }
        public String getSelectionType() {
            return this.selectionType;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection setTextSearchResult(RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResult textSearchResult) {
            this.textSearchResult = textSearchResult;
            return this;
        }
        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelectionTextSearchResult getTextSearchResult() {
            return this.textSearchResult;
        }

    }

    public static class RunSearchGenerationRequestAgentContextBizContext extends TeaModel {
        /**
         * <p>Follow-up question.</p>
         * 
         * <strong>example:</strong>
         * <p>您想了解关于xx的哪些信息？</p>
         */
        @NameInMap("AskUser")
        public String askUser;

        /**
         * <p>List of recommended keywords for follow-up questions.</p>
         */
        @NameInMap("AskUserKeywords")
        public java.util.List<String> askUserKeywords;

        /**
         * <p>Current step.</p>
         * 
         * <strong>example:</strong>
         * <p>think</p>
         */
        @NameInMap("CurrentStep")
        public String currentStep;

        /**
         * <p>User-provided or selected multimodal data.</p>
         */
        @NameInMap("MultimodalMediaSelection")
        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection multimodalMediaSelection;

        /**
         * <p>Next step.</p>
         * 
         * <strong>example:</strong>
         * <p>generate</p>
         */
        @NameInMap("NextStep")
        public String nextStep;

        /**
         * <p>Skip follow-up questions.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SkipCurrentSupplement")
        public Boolean skipCurrentSupplement;

        /**
         * <p>Data type needed for reasoning: searchQuery.</p>
         * 
         * <strong>example:</strong>
         * <p>searchQuery</p>
         */
        @NameInMap("SupplementDataType")
        public String supplementDataType;

        /**
         * <p>Specifies whether supplementation is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupplementEnable")
        public Boolean supplementEnable;

        /**
         * <p>User feedback to follow-up questions.</p>
         * 
         * <strong>example:</strong>
         * <p>地点</p>
         */
        @NameInMap("UserBack")
        public String userBack;

        /**
         * <p>List of keywords from user feedback to follow-up questions.</p>
         */
        @NameInMap("UserBackKeywords")
        public java.util.List<String> userBackKeywords;

        public static RunSearchGenerationRequestAgentContextBizContext build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationRequestAgentContextBizContext self = new RunSearchGenerationRequestAgentContextBizContext();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationRequestAgentContextBizContext setAskUser(String askUser) {
            this.askUser = askUser;
            return this;
        }
        public String getAskUser() {
            return this.askUser;
        }

        public RunSearchGenerationRequestAgentContextBizContext setAskUserKeywords(java.util.List<String> askUserKeywords) {
            this.askUserKeywords = askUserKeywords;
            return this;
        }
        public java.util.List<String> getAskUserKeywords() {
            return this.askUserKeywords;
        }

        public RunSearchGenerationRequestAgentContextBizContext setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
        }

        public RunSearchGenerationRequestAgentContextBizContext setMultimodalMediaSelection(RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection multimodalMediaSelection) {
            this.multimodalMediaSelection = multimodalMediaSelection;
            return this;
        }
        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection getMultimodalMediaSelection() {
            return this.multimodalMediaSelection;
        }

        public RunSearchGenerationRequestAgentContextBizContext setNextStep(String nextStep) {
            this.nextStep = nextStep;
            return this;
        }
        public String getNextStep() {
            return this.nextStep;
        }

        public RunSearchGenerationRequestAgentContextBizContext setSkipCurrentSupplement(Boolean skipCurrentSupplement) {
            this.skipCurrentSupplement = skipCurrentSupplement;
            return this;
        }
        public Boolean getSkipCurrentSupplement() {
            return this.skipCurrentSupplement;
        }

        public RunSearchGenerationRequestAgentContextBizContext setSupplementDataType(String supplementDataType) {
            this.supplementDataType = supplementDataType;
            return this;
        }
        public String getSupplementDataType() {
            return this.supplementDataType;
        }

        public RunSearchGenerationRequestAgentContextBizContext setSupplementEnable(Boolean supplementEnable) {
            this.supplementEnable = supplementEnable;
            return this;
        }
        public Boolean getSupplementEnable() {
            return this.supplementEnable;
        }

        public RunSearchGenerationRequestAgentContextBizContext setUserBack(String userBack) {
            this.userBack = userBack;
            return this;
        }
        public String getUserBack() {
            return this.userBack;
        }

        public RunSearchGenerationRequestAgentContextBizContext setUserBackKeywords(java.util.List<String> userBackKeywords) {
            this.userBackKeywords = userBackKeywords;
            return this;
        }
        public java.util.List<String> getUserBackKeywords() {
            return this.userBackKeywords;
        }

    }

    public static class RunSearchGenerationRequestAgentContext extends TeaModel {
        /**
         * <p>Business context.</p>
         */
        @NameInMap("BizContext")
        public RunSearchGenerationRequestAgentContextBizContext bizContext;

        public static RunSearchGenerationRequestAgentContext build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationRequestAgentContext self = new RunSearchGenerationRequestAgentContext();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationRequestAgentContext setBizContext(RunSearchGenerationRequestAgentContextBizContext bizContext) {
            this.bizContext = bizContext;
            return this;
        }
        public RunSearchGenerationRequestAgentContextBizContext getBizContext() {
            return this.bizContext;
        }

    }

    public static class RunSearchGenerationRequestChatConfigSearchParamSearchSources extends TeaModel {
        /**
         * <p>Search source type:</p>
         * <ul>
         * <li><p>SystemSearch: Built-in system search</p>
         * </li>
         * <li><p>CustomSemanticSearch: Custom semantic index search</p>
         * </li>
         * <li><p>ThirdSearch: Third-party API search</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Unique identifier for the search source: matches the dataset name shown in the console, such as 4cb0eda3fad841758262dbe8d61191.</p>
         * 
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        public static RunSearchGenerationRequestChatConfigSearchParamSearchSources build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationRequestChatConfigSearchParamSearchSources self = new RunSearchGenerationRequestChatConfigSearchParamSearchSources();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationRequestChatConfigSearchParamSearchSources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RunSearchGenerationRequestChatConfigSearchParamSearchSources setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

    }

    public static class RunSearchGenerationRequestChatConfigSearchParam extends TeaModel {
        /**
         * <p>Unique category identifier.</p>
         */
        @NameInMap("CategoryUuids")
        public java.util.List<String> categoryUuids;

        /**
         * <p>End creation time, in UNIX timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111111</p>
         */
        @NameInMap("CreateTimeEnd")
        public Long createTimeEnd;

        /**
         * <p>Start creation time, in UNIX timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>111111111111</p>
         */
        @NameInMap("CreateTimeStart")
        public Long createTimeStart;

        /**
         * <p>Array of document IDs.</p>
         */
        @NameInMap("DocIds")
        public java.util.List<String> docIds;

        /**
         * <p>Unique document identifier.</p>
         */
        @NameInMap("DocUuids")
        public java.util.List<String> docUuids;

        /**
         * <p>End time.</p>
         * 
         * <strong>example:</strong>
         * <p>1725983999999</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Extension field 1.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Extend1")
        public String extend1;

        /**
         * <p>Extension field 2.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Extend2")
        public String extend2;

        /**
         * <p>Extension field 3.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Extend3")
        public String extend3;

        /**
         * <p>Search scope list.</p>
         */
        @NameInMap("MultimodalSearchTypes")
        public java.util.List<String> multimodalSearchTypes;

        /**
         * <p>Voice search threshold: Applies only to custom data sources (range: 0 to 1).</p>
         * 
         * <strong>example:</strong>
         * <p>0.66</p>
         */
        @NameInMap("SearchAudioMinScore")
        public Double searchAudioMinScore;

        /**
         * <p>Image search threshold: Applies only to custom data sources (range: 0 to 1).</p>
         * 
         * <strong>example:</strong>
         * <p>0.66</p>
         */
        @NameInMap("SearchImageMinScore")
        public Double searchImageMinScore;

        /**
         * <p>List of search sources.</p>
         */
        @NameInMap("SearchSources")
        public java.util.List<RunSearchGenerationRequestChatConfigSearchParamSearchSources> searchSources;

        /**
         * <p>Text search threshold: Applies only to custom data sources (range: 0 to 1).</p>
         * 
         * <strong>example:</strong>
         * <p>0.66</p>
         */
        @NameInMap("SearchTextMinScore")
        public Double searchTextMinScore;

        /**
         * <p>Video search threshold: Applies only to custom data sources (range: 0 to 1).</p>
         * 
         * <strong>example:</strong>
         * <p>0.66</p>
         */
        @NameInMap("SearchVideoMinScore")
        public Double searchVideoMinScore;

        /**
         * <p>Start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1725983999999</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static RunSearchGenerationRequestChatConfigSearchParam build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationRequestChatConfigSearchParam self = new RunSearchGenerationRequestChatConfigSearchParam();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationRequestChatConfigSearchParam setCategoryUuids(java.util.List<String> categoryUuids) {
            this.categoryUuids = categoryUuids;
            return this;
        }
        public java.util.List<String> getCategoryUuids() {
            return this.categoryUuids;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setCreateTimeEnd(Long createTimeEnd) {
            this.createTimeEnd = createTimeEnd;
            return this;
        }
        public Long getCreateTimeEnd() {
            return this.createTimeEnd;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setCreateTimeStart(Long createTimeStart) {
            this.createTimeStart = createTimeStart;
            return this;
        }
        public Long getCreateTimeStart() {
            return this.createTimeStart;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setDocIds(java.util.List<String> docIds) {
            this.docIds = docIds;
            return this;
        }
        public java.util.List<String> getDocIds() {
            return this.docIds;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setDocUuids(java.util.List<String> docUuids) {
            this.docUuids = docUuids;
            return this;
        }
        public java.util.List<String> getDocUuids() {
            return this.docUuids;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setMultimodalSearchTypes(java.util.List<String> multimodalSearchTypes) {
            this.multimodalSearchTypes = multimodalSearchTypes;
            return this;
        }
        public java.util.List<String> getMultimodalSearchTypes() {
            return this.multimodalSearchTypes;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setSearchAudioMinScore(Double searchAudioMinScore) {
            this.searchAudioMinScore = searchAudioMinScore;
            return this;
        }
        public Double getSearchAudioMinScore() {
            return this.searchAudioMinScore;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setSearchImageMinScore(Double searchImageMinScore) {
            this.searchImageMinScore = searchImageMinScore;
            return this;
        }
        public Double getSearchImageMinScore() {
            return this.searchImageMinScore;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setSearchSources(java.util.List<RunSearchGenerationRequestChatConfigSearchParamSearchSources> searchSources) {
            this.searchSources = searchSources;
            return this;
        }
        public java.util.List<RunSearchGenerationRequestChatConfigSearchParamSearchSources> getSearchSources() {
            return this.searchSources;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setSearchTextMinScore(Double searchTextMinScore) {
            this.searchTextMinScore = searchTextMinScore;
            return this;
        }
        public Double getSearchTextMinScore() {
            return this.searchTextMinScore;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setSearchVideoMinScore(Double searchVideoMinScore) {
            this.searchVideoMinScore = searchVideoMinScore;
            return this;
        }
        public Double getSearchVideoMinScore() {
            return this.searchVideoMinScore;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class RunSearchGenerationRequestChatConfig extends TeaModel {
        /**
         * <p>Enable deep thinking.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableThinking")
        public Boolean enableThinking;

        /**
         * <p>List of generation options to skip.</p>
         */
        @NameInMap("ExcludeGenerateOptions")
        public java.util.List<String> excludeGenerateOptions;

        /**
         * <p>Detailedness of the response:</p>
         * <ul>
         * <li><p>concise: Concise (default)</p>
         * </li>
         * <li><p>enhance: Enhanced</p>
         * </li>
         * <li><p>free: Free-form</p>
         * </li>
         * <li><p>deepResearch: Research-level</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>concise</p>
         */
        @NameInMap("GenerateLevel")
        public String generateLevel;

        /**
         * <p>Generation technology:</p>
         * <ul>
         * <li><p>copilotReference: Q\&amp;A-style search</p>
         * </li>
         * <li><p>copilotPrecise: Pure search</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>copilotReference</p>
         */
        @NameInMap("GenerateTechnology")
        public String generateTechnology;

        /**
         * <p>Plain-text prompt template for Q\&amp;A-style search and summary generation. Must include variables {query} and {content}. Example:</p>
         * <pre><code class="language-text"># Role
         * You are an expert article retrieval and Q&amp;A assistant.
         * 
         * # Goal
         * Answer or explain the user\\&quot;s question &quot;{query}&quot; using the retrieved articles.
         * 
         * # Constraints
         * - Filter by knowledge date if the question mentions a specific date.
         * - Structure responses clearly.
         * - Keep responses concise.
         * - Do not use external data or fabricate answers.
         * - If unable to answer, respond in the appropriate language:
         *   - Chinese: &quot;Unable to answer based on known information.&quot;
         *   - English: &quot;Unable to answer based on the known information.&quot;
         * 
         * # Input
         * ## Retrieved articles
         * {content}
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <h1>角色</h1>
         * <p>你是一个专业的文章检索和问答专家，擅长文章检索和回答用户问题。</p>
         * <h1>任务目标</h1>
         * <p>请你根据检索到的相关文章，回答或表述用户问题“{query}”。</p>
         * <h1>任务限制</h1>
         * <ul>
         * <li>如果用户问题中提到具体日期，请考虑知识日期做筛选。</li>
         * <li>生成内容结构条理。</li>
         * <li>生成内容尽量精简。</li>
         * <li>不要使用其他数据，不要杜撰。</li>
         * <li>如果不能回答用户问题，请输出对应语言的拒识文案:<ul>
         * <li>中文：&quot;根据已知信息无法回答。&quot;</li>
         * <li>英文：&quot;Unable to answer based on the known information.&quot;</li>
         * </ul>
         * </li>
         * </ul>
         * <h1>输入数据</h1>
         * <h2>检索到的相关文章</h2>
         * <p>{content}</p>
         */
        @NameInMap("ModelCustomPromptTemplate")
        public String modelCustomPromptTemplate;

        /**
         * <p>Plain-text prompt template for Q\&amp;A-style search and summary generation. Must include variables {query} and {content}. Example:</p>
         * <pre><code class="language-text"># Role
         * You are an expert article retrieval and Q&amp;A assistant.
         * 
         * # Goal
         * Answer or explain the user\\&quot;s question &quot;{query}&quot; using the retrieved articles and images.
         * 
         * # Constraints
         * - Filter by knowledge date if the question mentions a specific date.
         * - Structure responses clearly.
         * - Keep responses concise.
         * - Ignore article content if image content fully answers the question.
         * - Do not use external data or fabricate answers.
         * - If unable to answer, respond in the appropriate language:
         *     - Chinese: &quot;Unable to answer based on known information.&quot;
         *     - English: &quot;Unable to answer based on the known information.&quot;
         * 
         * # Input
         * ## Retrieved articles
         * {content}
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <h1>角色</h1>
         * <p>你是一个专业的文章检索和问答专家，擅长文章检索和回答用户问题。</p>
         * <h1>任务目标</h1>
         * <p>请你根据检索到的相关文章和图片，回答或表述用户问题“{query}”。</p>
         * <h1>任务限制</h1>
         * <ul>
         * <li>如果用户问题中提到具体日期，请考虑知识日期做筛选。</li>
         * <li>生成内容结构条理。</li>
         * <li>生成内容尽量精简。</li>
         * <li>如果图片内容可以回答，可以忽略文章内容。</li>
         * <li>不要使用其他数据，不要杜撰。</li>
         * <li>如果不能回答用户问题，请输出对应语言的拒识文案:<ul>
         * <li>中文：&quot;根据已知信息无法回答。&quot;</li>
         * <li>英文：&quot;Unable to answer based on the known information.&quot;</li>
         * </ul>
         * </li>
         * </ul>
         * <h1>输入数据</h1>
         * <h2>检索到的相关文章</h2>
         * <p>{content}</p>
         */
        @NameInMap("ModelCustomVlPromptTemplate")
        public String modelCustomVlPromptTemplate;

        /**
         * <p>List of search types.</p>
         */
        @NameInMap("SearchModels")
        public java.util.List<String> searchModels;

        /**
         * <p>Search parameters.</p>
         */
        @NameInMap("SearchParam")
        public RunSearchGenerationRequestChatConfigSearchParam searchParam;

        public static RunSearchGenerationRequestChatConfig build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationRequestChatConfig self = new RunSearchGenerationRequestChatConfig();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationRequestChatConfig setEnableThinking(Boolean enableThinking) {
            this.enableThinking = enableThinking;
            return this;
        }
        public Boolean getEnableThinking() {
            return this.enableThinking;
        }

        public RunSearchGenerationRequestChatConfig setExcludeGenerateOptions(java.util.List<String> excludeGenerateOptions) {
            this.excludeGenerateOptions = excludeGenerateOptions;
            return this;
        }
        public java.util.List<String> getExcludeGenerateOptions() {
            return this.excludeGenerateOptions;
        }

        public RunSearchGenerationRequestChatConfig setGenerateLevel(String generateLevel) {
            this.generateLevel = generateLevel;
            return this;
        }
        public String getGenerateLevel() {
            return this.generateLevel;
        }

        public RunSearchGenerationRequestChatConfig setGenerateTechnology(String generateTechnology) {
            this.generateTechnology = generateTechnology;
            return this;
        }
        public String getGenerateTechnology() {
            return this.generateTechnology;
        }

        public RunSearchGenerationRequestChatConfig setModelCustomPromptTemplate(String modelCustomPromptTemplate) {
            this.modelCustomPromptTemplate = modelCustomPromptTemplate;
            return this;
        }
        public String getModelCustomPromptTemplate() {
            return this.modelCustomPromptTemplate;
        }

        public RunSearchGenerationRequestChatConfig setModelCustomVlPromptTemplate(String modelCustomVlPromptTemplate) {
            this.modelCustomVlPromptTemplate = modelCustomVlPromptTemplate;
            return this;
        }
        public String getModelCustomVlPromptTemplate() {
            return this.modelCustomVlPromptTemplate;
        }

        public RunSearchGenerationRequestChatConfig setSearchModels(java.util.List<String> searchModels) {
            this.searchModels = searchModels;
            return this;
        }
        public java.util.List<String> getSearchModels() {
            return this.searchModels;
        }

        public RunSearchGenerationRequestChatConfig setSearchParam(RunSearchGenerationRequestChatConfigSearchParam searchParam) {
            this.searchParam = searchParam;
            return this;
        }
        public RunSearchGenerationRequestChatConfigSearchParam getSearchParam() {
            return this.searchParam;
        }

    }

}
