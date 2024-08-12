// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetLibraryListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    @NameInMap("data")
    public GetLibraryListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0a06dfe817156528535968405edce3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("time")
    public String time;

    public static GetLibraryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryListResponseBody self = new GetLibraryListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLibraryListResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetLibraryListResponseBody setData(GetLibraryListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLibraryListResponseBodyData getData() {
        return this.data;
    }

    public GetLibraryListResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetLibraryListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetLibraryListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLibraryListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLibraryListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLibraryListResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("docTreeSplit")
        public Boolean docTreeSplit;

        /**
         * <strong>example:</strong>
         * <p>160</p>
         */
        @NameInMap("docTreeSplitSize")
        public Integer docTreeSplitSize;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enhanceGraph")
        public Boolean enhanceGraph;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enhanceTable")
        public Boolean enhanceTable;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("overlap")
        public Integer overlap;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sentenceSplit")
        public Boolean sentenceSplit;

        /**
         * <strong>example:</strong>
         * <p>160</p>
         */
        @NameInMap("sentenceSplitSize")
        public Integer sentenceSplitSize;

        /**
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("split")
        public Boolean split;

        public static GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy self = new GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy();
            return TeaModel.build(map, self);
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy setDocTreeSplit(Boolean docTreeSplit) {
            this.docTreeSplit = docTreeSplit;
            return this;
        }
        public Boolean getDocTreeSplit() {
            return this.docTreeSplit;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy setDocTreeSplitSize(Integer docTreeSplitSize) {
            this.docTreeSplitSize = docTreeSplitSize;
            return this;
        }
        public Integer getDocTreeSplitSize() {
            return this.docTreeSplitSize;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy setEnhanceGraph(Boolean enhanceGraph) {
            this.enhanceGraph = enhanceGraph;
            return this;
        }
        public Boolean getEnhanceGraph() {
            return this.enhanceGraph;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy setEnhanceTable(Boolean enhanceTable) {
            this.enhanceTable = enhanceTable;
            return this;
        }
        public Boolean getEnhanceTable() {
            return this.enhanceTable;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy setOverlap(Integer overlap) {
            this.overlap = overlap;
            return this;
        }
        public Integer getOverlap() {
            return this.overlap;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy setSentenceSplit(Boolean sentenceSplit) {
            this.sentenceSplit = sentenceSplit;
            return this;
        }
        public Boolean getSentenceSplit() {
            return this.sentenceSplit;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy setSentenceSplitSize(Integer sentenceSplitSize) {
            this.sentenceSplitSize = sentenceSplitSize;
            return this;
        }
        public Integer getSentenceSplitSize() {
            return this.sentenceSplitSize;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy setSplit(Boolean split) {
            this.split = split;
            return this;
        }
        public Boolean getSplit() {
            return this.split;
        }

    }

    public static class GetLibraryListResponseBodyDataRecordsIndexSettingModelConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("temperature")
        public Double temperature;

        /**
         * <p>topP</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("topP")
        public Double topP;

        public static GetLibraryListResponseBodyDataRecordsIndexSettingModelConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryListResponseBodyDataRecordsIndexSettingModelConfig self = new GetLibraryListResponseBodyDataRecordsIndexSettingModelConfig();
            return TeaModel.build(map, self);
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingModelConfig setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingModelConfig setTopP(Double topP) {
            this.topP = topP;
            return this;
        }
        public Double getTopP() {
            return this.topP;
        }

    }

    public static class GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableFollowUp")
        public Boolean enableFollowUp;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableMultiQuery")
        public Boolean enableMultiQuery;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableOpenQa")
        public Boolean enableOpenQa;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableQueryRewrite")
        public Boolean enableQueryRewrite;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableSession")
        public Boolean enableSession;

        /**
         * <strong>example:</strong>
         * <p>sdbcjsbc</p>
         */
        @NameInMap("localKnowledgeId")
        public String localKnowledgeId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("withDocumentReference")
        public Boolean withDocumentReference;

        public static GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer self = new GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer();
            return TeaModel.build(map, self);
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer setEnableFollowUp(Boolean enableFollowUp) {
            this.enableFollowUp = enableFollowUp;
            return this;
        }
        public Boolean getEnableFollowUp() {
            return this.enableFollowUp;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer setEnableMultiQuery(Boolean enableMultiQuery) {
            this.enableMultiQuery = enableMultiQuery;
            return this;
        }
        public Boolean getEnableMultiQuery() {
            return this.enableMultiQuery;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer setEnableOpenQa(Boolean enableOpenQa) {
            this.enableOpenQa = enableOpenQa;
            return this;
        }
        public Boolean getEnableOpenQa() {
            return this.enableOpenQa;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer setEnableQueryRewrite(Boolean enableQueryRewrite) {
            this.enableQueryRewrite = enableQueryRewrite;
            return this;
        }
        public Boolean getEnableQueryRewrite() {
            return this.enableQueryRewrite;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer setEnableSession(Boolean enableSession) {
            this.enableSession = enableSession;
            return this;
        }
        public Boolean getEnableSession() {
            return this.enableSession;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer setLocalKnowledgeId(String localKnowledgeId) {
            this.localKnowledgeId = localKnowledgeId;
            return this;
        }
        public String getLocalKnowledgeId() {
            return this.localKnowledgeId;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer setWithDocumentReference(Boolean withDocumentReference) {
            this.withDocumentReference = withDocumentReference;
            return this;
        }
        public Boolean getWithDocumentReference() {
            return this.withDocumentReference;
        }

    }

    public static class GetLibraryListResponseBodyDataRecordsIndexSettingRecallStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("documentRankType")
        public String documentRankType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("limit")
        public Integer limit;

        public static GetLibraryListResponseBodyDataRecordsIndexSettingRecallStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryListResponseBodyDataRecordsIndexSettingRecallStrategy self = new GetLibraryListResponseBodyDataRecordsIndexSettingRecallStrategy();
            return TeaModel.build(map, self);
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingRecallStrategy setDocumentRankType(String documentRankType) {
            this.documentRankType = documentRankType;
            return this;
        }
        public String getDocumentRankType() {
            return this.documentRankType;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingRecallStrategy setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

    }

    public static class GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ElasticSearch</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("indexAnalyzer")
        public String indexAnalyzer;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("rankThreshold")
        public Double rankThreshold;

        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("searchAnalyzer")
        public String searchAnalyzer;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("topK")
        public Integer topK;

        public static GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting self = new GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting();
            return TeaModel.build(map, self);
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting setIndexAnalyzer(String indexAnalyzer) {
            this.indexAnalyzer = indexAnalyzer;
            return this;
        }
        public String getIndexAnalyzer() {
            return this.indexAnalyzer;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting setRankThreshold(Double rankThreshold) {
            this.rankThreshold = rankThreshold;
            return this;
        }
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting setSearchAnalyzer(String searchAnalyzer) {
            this.searchAnalyzer = searchAnalyzer;
            return this;
        }
        public String getSearchAnalyzer() {
            return this.searchAnalyzer;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ADB</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>DashScope</p>
         */
        @NameInMap("embeddingType")
        public String embeddingType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("rankThreshold")
        public Double rankThreshold;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("topK")
        public Integer topK;

        public static GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting self = new GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting();
            return TeaModel.build(map, self);
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting setEmbeddingType(String embeddingType) {
            this.embeddingType = embeddingType;
            return this;
        }
        public String getEmbeddingType() {
            return this.embeddingType;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting setRankThreshold(Double rankThreshold) {
            this.rankThreshold = rankThreshold;
            return this;
        }
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class GetLibraryListResponseBodyDataRecordsIndexSetting extends TeaModel {
        @NameInMap("chunkStrategy")
        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy chunkStrategy;

        @NameInMap("modelConfig")
        public GetLibraryListResponseBodyDataRecordsIndexSettingModelConfig modelConfig;

        @NameInMap("promptRoleStyle")
        public String promptRoleStyle;

        @NameInMap("queryEnhancer")
        public GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer queryEnhancer;

        @NameInMap("recallStrategy")
        public GetLibraryListResponseBodyDataRecordsIndexSettingRecallStrategy recallStrategy;

        @NameInMap("textIndexSetting")
        public GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting textIndexSetting;

        @NameInMap("vectorIndexSetting")
        public GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting vectorIndexSetting;

        public static GetLibraryListResponseBodyDataRecordsIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryListResponseBodyDataRecordsIndexSetting self = new GetLibraryListResponseBodyDataRecordsIndexSetting();
            return TeaModel.build(map, self);
        }

        public GetLibraryListResponseBodyDataRecordsIndexSetting setChunkStrategy(GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy chunkStrategy) {
            this.chunkStrategy = chunkStrategy;
            return this;
        }
        public GetLibraryListResponseBodyDataRecordsIndexSettingChunkStrategy getChunkStrategy() {
            return this.chunkStrategy;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSetting setModelConfig(GetLibraryListResponseBodyDataRecordsIndexSettingModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public GetLibraryListResponseBodyDataRecordsIndexSettingModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSetting setPromptRoleStyle(String promptRoleStyle) {
            this.promptRoleStyle = promptRoleStyle;
            return this;
        }
        public String getPromptRoleStyle() {
            return this.promptRoleStyle;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSetting setQueryEnhancer(GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer queryEnhancer) {
            this.queryEnhancer = queryEnhancer;
            return this;
        }
        public GetLibraryListResponseBodyDataRecordsIndexSettingQueryEnhancer getQueryEnhancer() {
            return this.queryEnhancer;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSetting setRecallStrategy(GetLibraryListResponseBodyDataRecordsIndexSettingRecallStrategy recallStrategy) {
            this.recallStrategy = recallStrategy;
            return this;
        }
        public GetLibraryListResponseBodyDataRecordsIndexSettingRecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSetting setTextIndexSetting(GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting textIndexSetting) {
            this.textIndexSetting = textIndexSetting;
            return this;
        }
        public GetLibraryListResponseBodyDataRecordsIndexSettingTextIndexSetting getTextIndexSetting() {
            return this.textIndexSetting;
        }

        public GetLibraryListResponseBodyDataRecordsIndexSetting setVectorIndexSetting(GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting vectorIndexSetting) {
            this.vectorIndexSetting = vectorIndexSetting;
            return this;
        }
        public GetLibraryListResponseBodyDataRecordsIndexSettingVectorIndexSetting getVectorIndexSetting() {
            return this.vectorIndexSetting;
        }

    }

    public static class GetLibraryListResponseBodyDataRecords extends TeaModel {
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("documentCount")
        public Long documentCount;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>24vs4aa42jv1rg7</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("indexSetting")
        public GetLibraryListResponseBodyDataRecordsIndexSetting indexSetting;

        @NameInMap("libraryName")
        public String libraryName;

        public static GetLibraryListResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryListResponseBodyDataRecords self = new GetLibraryListResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public GetLibraryListResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLibraryListResponseBodyDataRecords setDocumentCount(Long documentCount) {
            this.documentCount = documentCount;
            return this;
        }
        public Long getDocumentCount() {
            return this.documentCount;
        }

        public GetLibraryListResponseBodyDataRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLibraryListResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetLibraryListResponseBodyDataRecords setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLibraryListResponseBodyDataRecords setIndexSetting(GetLibraryListResponseBodyDataRecordsIndexSetting indexSetting) {
            this.indexSetting = indexSetting;
            return this;
        }
        public GetLibraryListResponseBodyDataRecordsIndexSetting getIndexSetting() {
            return this.indexSetting;
        }

        public GetLibraryListResponseBodyDataRecords setLibraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }
        public String getLibraryName() {
            return this.libraryName;
        }

    }

    public static class GetLibraryListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("records")
        public java.util.List<GetLibraryListResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalPages")
        public Long totalPages;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalRecords")
        public Long totalRecords;

        public static GetLibraryListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryListResponseBodyData self = new GetLibraryListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLibraryListResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetLibraryListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetLibraryListResponseBodyData setRecords(java.util.List<GetLibraryListResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<GetLibraryListResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public GetLibraryListResponseBodyData setTotalPages(Long totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Long getTotalPages() {
            return this.totalPages;
        }

        public GetLibraryListResponseBodyData setTotalRecords(Long totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }
        public Long getTotalRecords() {
            return this.totalRecords;
        }

    }

}
