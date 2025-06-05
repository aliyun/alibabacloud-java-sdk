// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchGenerationRequest extends TeaModel {
    @NameInMap("AgentContext")
    public RunSearchGenerationRequestAgentContext agentContext;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ChatConfig")
    public RunSearchGenerationRequestChatConfig chatConfig;

    /**
     * <strong>example:</strong>
     * <p>qwen-max-latest</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("OriginalSessionId")
    public String originalSessionId;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
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
        @NameInMap("Chunks")
        public java.util.List<String> chunks;

        /**
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>文档-自定义的唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 14:25:59</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("SearchSource")
        public String searchSource;

        /**
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("SearchSourceName")
        public String searchSourceName;

        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("SearchSourceType")
        public String searchSourceType;

        /**
         * <strong>example:</strong>
         * <p>新华社</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
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
         * <strong>example:</strong>
         * <p>原始会话唯一标识：搜索结果取这个会话中的全量，目前仅媒资搜索场景需要</p>
         */
        @NameInMap("OriginalSessionId")
        public String originalSessionId;

        /**
         * <strong>example:</strong>
         * <p>TextGenerate</p>
         */
        @NameInMap("SearchModel")
        public String searchModel;

        /**
         * <strong>example:</strong>
         * <p>分类1</p>
         */
        @NameInMap("SearchModelDataValue")
        public String searchModelDataValue;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("SelectionType")
        public String selectionType;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

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
        @NameInMap("AskUser")
        public String askUser;

        @NameInMap("AskUserKeywords")
        public java.util.List<String> askUserKeywords;

        @NameInMap("CurrentStep")
        public String currentStep;

        @NameInMap("MultimodalMediaSelection")
        public RunSearchGenerationRequestAgentContextBizContextMultimodalMediaSelection multimodalMediaSelection;

        @NameInMap("NextStep")
        public String nextStep;

        @NameInMap("SkipCurrentSupplement")
        public Boolean skipCurrentSupplement;

        @NameInMap("SupplementDataType")
        public String supplementDataType;

        @NameInMap("SupplementEnable")
        public Boolean supplementEnable;

        @NameInMap("UserBack")
        public String userBack;

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
         * <strong>example:</strong>
         * <p>1725983999999</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("MultimodalSearchTypes")
        public java.util.List<String> multimodalSearchTypes;

        @NameInMap("SearchSources")
        public java.util.List<RunSearchGenerationRequestChatConfigSearchParamSearchSources> searchSources;

        /**
         * <strong>example:</strong>
         * <p>1725983999999</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static RunSearchGenerationRequestChatConfigSearchParam build(java.util.Map<String, ?> map) throws Exception {
            RunSearchGenerationRequestChatConfigSearchParam self = new RunSearchGenerationRequestChatConfigSearchParam();
            return TeaModel.build(map, self);
        }

        public RunSearchGenerationRequestChatConfigSearchParam setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setMultimodalSearchTypes(java.util.List<String> multimodalSearchTypes) {
            this.multimodalSearchTypes = multimodalSearchTypes;
            return this;
        }
        public java.util.List<String> getMultimodalSearchTypes() {
            return this.multimodalSearchTypes;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setSearchSources(java.util.List<RunSearchGenerationRequestChatConfigSearchParamSearchSources> searchSources) {
            this.searchSources = searchSources;
            return this;
        }
        public java.util.List<RunSearchGenerationRequestChatConfigSearchParamSearchSources> getSearchSources() {
            return this.searchSources;
        }

        public RunSearchGenerationRequestChatConfigSearchParam setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class RunSearchGenerationRequestChatConfig extends TeaModel {
        @NameInMap("EnableThinking")
        public Boolean enableThinking;

        /**
         * <strong>example:</strong>
         * <p>concise</p>
         */
        @NameInMap("GenerateLevel")
        public String generateLevel;

        /**
         * <strong>example:</strong>
         * <p>copilotPrecise</p>
         */
        @NameInMap("GenerateTechnology")
        public String generateTechnology;

        @NameInMap("SearchModels")
        public java.util.List<String> searchModels;

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
