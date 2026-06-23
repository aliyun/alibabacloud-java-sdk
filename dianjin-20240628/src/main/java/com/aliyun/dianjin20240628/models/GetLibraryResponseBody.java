// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetLibraryResponseBody extends TeaModel {
    /**
     * <p>Response time in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("cost")
    public Long cost;

    /**
     * <p>The response data object.</p>
     */
    @NameInMap("data")
    public GetLibraryResponseBodyData data;

    /**
     * <p>The data type.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>Fault type</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>44BD277A-87F9-5310-8D63-3E6645F1DA85</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>UNIX timestamp</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("time")
    public String time;

    public static GetLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryResponseBody self = new GetLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLibraryResponseBody setCost(Long cost) {
        this.cost = cost;
        return this;
    }
    public Long getCost() {
        return this.cost;
    }

    public GetLibraryResponseBody setData(GetLibraryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLibraryResponseBodyData getData() {
        return this.data;
    }

    public GetLibraryResponseBody setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public GetLibraryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetLibraryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLibraryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLibraryResponseBody setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public static class GetLibraryResponseBodyDataIndexSettingChunkStrategy extends TeaModel {
        /**
         * <p>Enable layout-based splitting.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("docTreeSplit")
        public Boolean docTreeSplit;

        /**
         * <p>The layout-based splitting size.</p>
         * 
         * <strong>example:</strong>
         * <p>160</p>
         */
        @NameInMap("docTreeSplitSize")
        public Integer docTreeSplitSize;

        /**
         * <p>Enhance images.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enhanceGraph")
        public Boolean enhanceGraph;

        /**
         * <p>Enhance tables.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enhanceTable")
        public Boolean enhanceTable;

        /**
         * <p>The overlap length between chunks.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("overlap")
        public Integer overlap;

        /**
         * <p>Split by sentence.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sentenceSplit")
        public Boolean sentenceSplit;

        /**
         * <p>The sentence-based splitting size.</p>
         * 
         * <strong>example:</strong>
         * <p>160</p>
         */
        @NameInMap("sentenceSplitSize")
        public Integer sentenceSplitSize;

        /**
         * <p>The chunk size.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <p>Enable chunking.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("split")
        public Boolean split;

        public static GetLibraryResponseBodyDataIndexSettingChunkStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyDataIndexSettingChunkStrategy self = new GetLibraryResponseBodyDataIndexSettingChunkStrategy();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyDataIndexSettingChunkStrategy setDocTreeSplit(Boolean docTreeSplit) {
            this.docTreeSplit = docTreeSplit;
            return this;
        }
        public Boolean getDocTreeSplit() {
            return this.docTreeSplit;
        }

        public GetLibraryResponseBodyDataIndexSettingChunkStrategy setDocTreeSplitSize(Integer docTreeSplitSize) {
            this.docTreeSplitSize = docTreeSplitSize;
            return this;
        }
        public Integer getDocTreeSplitSize() {
            return this.docTreeSplitSize;
        }

        public GetLibraryResponseBodyDataIndexSettingChunkStrategy setEnhanceGraph(Boolean enhanceGraph) {
            this.enhanceGraph = enhanceGraph;
            return this;
        }
        public Boolean getEnhanceGraph() {
            return this.enhanceGraph;
        }

        public GetLibraryResponseBodyDataIndexSettingChunkStrategy setEnhanceTable(Boolean enhanceTable) {
            this.enhanceTable = enhanceTable;
            return this;
        }
        public Boolean getEnhanceTable() {
            return this.enhanceTable;
        }

        public GetLibraryResponseBodyDataIndexSettingChunkStrategy setOverlap(Integer overlap) {
            this.overlap = overlap;
            return this;
        }
        public Integer getOverlap() {
            return this.overlap;
        }

        public GetLibraryResponseBodyDataIndexSettingChunkStrategy setSentenceSplit(Boolean sentenceSplit) {
            this.sentenceSplit = sentenceSplit;
            return this;
        }
        public Boolean getSentenceSplit() {
            return this.sentenceSplit;
        }

        public GetLibraryResponseBodyDataIndexSettingChunkStrategy setSentenceSplitSize(Integer sentenceSplitSize) {
            this.sentenceSplitSize = sentenceSplitSize;
            return this;
        }
        public Integer getSentenceSplitSize() {
            return this.sentenceSplitSize;
        }

        public GetLibraryResponseBodyDataIndexSettingChunkStrategy setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetLibraryResponseBodyDataIndexSettingChunkStrategy setSplit(Boolean split) {
            this.split = split;
            return this;
        }
        public Boolean getSplit() {
            return this.split;
        }

    }

    public static class GetLibraryResponseBodyDataIndexSettingModelConfig extends TeaModel {
        /**
         * <p>temperature</p>
         * 
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

        public static GetLibraryResponseBodyDataIndexSettingModelConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyDataIndexSettingModelConfig self = new GetLibraryResponseBodyDataIndexSettingModelConfig();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyDataIndexSettingModelConfig setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

        public GetLibraryResponseBodyDataIndexSettingModelConfig setTopP(Double topP) {
            this.topP = topP;
            return this;
        }
        public Double getTopP() {
            return this.topP;
        }

    }

    public static class GetLibraryResponseBodyDataIndexSettingQueryEnhancer extends TeaModel {
        /**
         * <p>Enable multi-turn query enhancement.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableFollowUp")
        public Boolean enableFollowUp;

        /**
         * <p>Use Large Language Model (LLM) knowledge to decompose queries.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableMultiQuery")
        public Boolean enableMultiQuery;

        /**
         * <p>Use Large Language Model (LLM) knowledge to answer questions.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableOpenQa")
        public Boolean enableOpenQa;

        /**
         * <p>Rewrite queries using domain-specific knowledge.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableQueryRewrite")
        public Boolean enableQueryRewrite;

        /**
         * <p>Record session history.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableSession")
        public Boolean enableSession;

        /**
         * <p>The document library ID used for knowledge rewriting.</p>
         * 
         * <strong>example:</strong>
         * <p>2836482634</p>
         */
        @NameInMap("localKnowledgeId")
        public String localKnowledgeId;

        /**
         * <p>Include document references in responses.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("withDocumentReference")
        public Boolean withDocumentReference;

        public static GetLibraryResponseBodyDataIndexSettingQueryEnhancer build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyDataIndexSettingQueryEnhancer self = new GetLibraryResponseBodyDataIndexSettingQueryEnhancer();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyDataIndexSettingQueryEnhancer setEnableFollowUp(Boolean enableFollowUp) {
            this.enableFollowUp = enableFollowUp;
            return this;
        }
        public Boolean getEnableFollowUp() {
            return this.enableFollowUp;
        }

        public GetLibraryResponseBodyDataIndexSettingQueryEnhancer setEnableMultiQuery(Boolean enableMultiQuery) {
            this.enableMultiQuery = enableMultiQuery;
            return this;
        }
        public Boolean getEnableMultiQuery() {
            return this.enableMultiQuery;
        }

        public GetLibraryResponseBodyDataIndexSettingQueryEnhancer setEnableOpenQa(Boolean enableOpenQa) {
            this.enableOpenQa = enableOpenQa;
            return this;
        }
        public Boolean getEnableOpenQa() {
            return this.enableOpenQa;
        }

        public GetLibraryResponseBodyDataIndexSettingQueryEnhancer setEnableQueryRewrite(Boolean enableQueryRewrite) {
            this.enableQueryRewrite = enableQueryRewrite;
            return this;
        }
        public Boolean getEnableQueryRewrite() {
            return this.enableQueryRewrite;
        }

        public GetLibraryResponseBodyDataIndexSettingQueryEnhancer setEnableSession(Boolean enableSession) {
            this.enableSession = enableSession;
            return this;
        }
        public Boolean getEnableSession() {
            return this.enableSession;
        }

        public GetLibraryResponseBodyDataIndexSettingQueryEnhancer setLocalKnowledgeId(String localKnowledgeId) {
            this.localKnowledgeId = localKnowledgeId;
            return this;
        }
        public String getLocalKnowledgeId() {
            return this.localKnowledgeId;
        }

        public GetLibraryResponseBodyDataIndexSettingQueryEnhancer setWithDocumentReference(Boolean withDocumentReference) {
            this.withDocumentReference = withDocumentReference;
            return this;
        }
        public Boolean getWithDocumentReference() {
            return this.withDocumentReference;
        }

    }

    public static class GetLibraryResponseBodyDataIndexSettingRecallStrategy extends TeaModel {
        /**
         * <p>The merge and sort policy.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("documentRankType")
        public String documentRankType;

        /**
         * <p>The number of results returned after merging two recall paths.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("limit")
        public Integer limit;

        public static GetLibraryResponseBodyDataIndexSettingRecallStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyDataIndexSettingRecallStrategy self = new GetLibraryResponseBodyDataIndexSettingRecallStrategy();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyDataIndexSettingRecallStrategy setDocumentRankType(String documentRankType) {
            this.documentRankType = documentRankType;
            return this;
        }
        public String getDocumentRankType() {
            return this.documentRankType;
        }

        public GetLibraryResponseBodyDataIndexSettingRecallStrategy setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

    }

    public static class GetLibraryResponseBodyDataIndexSettingTextIndexSetting extends TeaModel {
        /**
         * <p>The text index type.</p>
         * 
         * <strong>example:</strong>
         * <p>ElasticSearch</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Enable text indexing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The text index analyzer: Standard, IkMaxWord, or IkSmart.</p>
         * 
         * <strong>example:</strong>
         * <p>IkMaxWord</p>
         */
        @NameInMap("indexAnalyzer")
        public String indexAnalyzer;

        /**
         * <p>The ranking threshold for text indexing.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("rankThreshold")
        public Double rankThreshold;

        /**
         * <p>The text index search analyzer: Standard, IkMaxWord, or IkSmart.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("searchAnalyzer")
        public String searchAnalyzer;

        /**
         * <p>The number of final summary results from text indexing.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("topK")
        public Integer topK;

        public static GetLibraryResponseBodyDataIndexSettingTextIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyDataIndexSettingTextIndexSetting self = new GetLibraryResponseBodyDataIndexSettingTextIndexSetting();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyDataIndexSettingTextIndexSetting setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetLibraryResponseBodyDataIndexSettingTextIndexSetting setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetLibraryResponseBodyDataIndexSettingTextIndexSetting setIndexAnalyzer(String indexAnalyzer) {
            this.indexAnalyzer = indexAnalyzer;
            return this;
        }
        public String getIndexAnalyzer() {
            return this.indexAnalyzer;
        }

        public GetLibraryResponseBodyDataIndexSettingTextIndexSetting setRankThreshold(Double rankThreshold) {
            this.rankThreshold = rankThreshold;
            return this;
        }
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        public GetLibraryResponseBodyDataIndexSettingTextIndexSetting setSearchAnalyzer(String searchAnalyzer) {
            this.searchAnalyzer = searchAnalyzer;
            return this;
        }
        public String getSearchAnalyzer() {
            return this.searchAnalyzer;
        }

        public GetLibraryResponseBodyDataIndexSettingTextIndexSetting setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class GetLibraryResponseBodyDataIndexSettingVectorIndexSetting extends TeaModel {
        /**
         * <p>The vector index source. We recommend ADB.</p>
         * 
         * <strong>example:</strong>
         * <p>ADB</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The text embedding model for the vector index.</p>
         * 
         * <strong>example:</strong>
         * <p>DashScope</p>
         */
        @NameInMap("embeddingType")
        public String embeddingType;

        /**
         * <p>Enable vector indexing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The ranking threshold for vector indexing.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("rankThreshold")
        public Double rankThreshold;

        /**
         * <p>Number of final results returned by the vector index.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("topK")
        public Integer topK;

        public static GetLibraryResponseBodyDataIndexSettingVectorIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyDataIndexSettingVectorIndexSetting self = new GetLibraryResponseBodyDataIndexSettingVectorIndexSetting();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyDataIndexSettingVectorIndexSetting setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetLibraryResponseBodyDataIndexSettingVectorIndexSetting setEmbeddingType(String embeddingType) {
            this.embeddingType = embeddingType;
            return this;
        }
        public String getEmbeddingType() {
            return this.embeddingType;
        }

        public GetLibraryResponseBodyDataIndexSettingVectorIndexSetting setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetLibraryResponseBodyDataIndexSettingVectorIndexSetting setRankThreshold(Double rankThreshold) {
            this.rankThreshold = rankThreshold;
            return this;
        }
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        public GetLibraryResponseBodyDataIndexSettingVectorIndexSetting setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class GetLibraryResponseBodyDataIndexSetting extends TeaModel {
        /**
         * <p>The chunking strategy.</p>
         */
        @NameInMap("chunkStrategy")
        public GetLibraryResponseBodyDataIndexSettingChunkStrategy chunkStrategy;

        /**
         * <p>Model configuration.</p>
         */
        @NameInMap("modelConfig")
        public GetLibraryResponseBodyDataIndexSettingModelConfig modelConfig;

        /**
         * <p>The prompt role style.</p>
         * 
         * <strong>example:</strong>
         * <p>你是一个信息处理专家。</p>
         */
        @NameInMap("promptRoleStyle")
        public String promptRoleStyle;

        /**
         * <p>Query enhancement settings.</p>
         */
        @NameInMap("queryEnhancer")
        public GetLibraryResponseBodyDataIndexSettingQueryEnhancer queryEnhancer;

        /**
         * <p>The recall strategy.</p>
         */
        @NameInMap("recallStrategy")
        public GetLibraryResponseBodyDataIndexSettingRecallStrategy recallStrategy;

        /**
         * <p>Text index settings.</p>
         */
        @NameInMap("textIndexSetting")
        public GetLibraryResponseBodyDataIndexSettingTextIndexSetting textIndexSetting;

        /**
         * <p>Vector index settings.</p>
         */
        @NameInMap("vectorIndexSetting")
        public GetLibraryResponseBodyDataIndexSettingVectorIndexSetting vectorIndexSetting;

        public static GetLibraryResponseBodyDataIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyDataIndexSetting self = new GetLibraryResponseBodyDataIndexSetting();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyDataIndexSetting setChunkStrategy(GetLibraryResponseBodyDataIndexSettingChunkStrategy chunkStrategy) {
            this.chunkStrategy = chunkStrategy;
            return this;
        }
        public GetLibraryResponseBodyDataIndexSettingChunkStrategy getChunkStrategy() {
            return this.chunkStrategy;
        }

        public GetLibraryResponseBodyDataIndexSetting setModelConfig(GetLibraryResponseBodyDataIndexSettingModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public GetLibraryResponseBodyDataIndexSettingModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public GetLibraryResponseBodyDataIndexSetting setPromptRoleStyle(String promptRoleStyle) {
            this.promptRoleStyle = promptRoleStyle;
            return this;
        }
        public String getPromptRoleStyle() {
            return this.promptRoleStyle;
        }

        public GetLibraryResponseBodyDataIndexSetting setQueryEnhancer(GetLibraryResponseBodyDataIndexSettingQueryEnhancer queryEnhancer) {
            this.queryEnhancer = queryEnhancer;
            return this;
        }
        public GetLibraryResponseBodyDataIndexSettingQueryEnhancer getQueryEnhancer() {
            return this.queryEnhancer;
        }

        public GetLibraryResponseBodyDataIndexSetting setRecallStrategy(GetLibraryResponseBodyDataIndexSettingRecallStrategy recallStrategy) {
            this.recallStrategy = recallStrategy;
            return this;
        }
        public GetLibraryResponseBodyDataIndexSettingRecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        public GetLibraryResponseBodyDataIndexSetting setTextIndexSetting(GetLibraryResponseBodyDataIndexSettingTextIndexSetting textIndexSetting) {
            this.textIndexSetting = textIndexSetting;
            return this;
        }
        public GetLibraryResponseBodyDataIndexSettingTextIndexSetting getTextIndexSetting() {
            return this.textIndexSetting;
        }

        public GetLibraryResponseBodyDataIndexSetting setVectorIndexSetting(GetLibraryResponseBodyDataIndexSettingVectorIndexSetting vectorIndexSetting) {
            this.vectorIndexSetting = vectorIndexSetting;
            return this;
        }
        public GetLibraryResponseBodyDataIndexSettingVectorIndexSetting getVectorIndexSetting() {
            return this.vectorIndexSetting;
        }

    }

    public static class GetLibraryResponseBodyData extends TeaModel {
        /**
         * <p>The document library description.</p>
         * 
         * <strong>example:</strong>
         * <p>文档库的描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The number of documents in the library.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("documentCount")
        public Long documentCount;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time in YYYY-MM-DD HH:MM:SS format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The document library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>19386728376</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The document library index settings.</p>
         */
        @NameInMap("indexSetting")
        public GetLibraryResponseBodyDataIndexSetting indexSetting;

        /**
         * <p>The document library name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试文档库</p>
         */
        @NameInMap("libraryName")
        public String libraryName;

        public static GetLibraryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLibraryResponseBodyData self = new GetLibraryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLibraryResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLibraryResponseBodyData setDocumentCount(Long documentCount) {
            this.documentCount = documentCount;
            return this;
        }
        public Long getDocumentCount() {
            return this.documentCount;
        }

        public GetLibraryResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetLibraryResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetLibraryResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLibraryResponseBodyData setIndexSetting(GetLibraryResponseBodyDataIndexSetting indexSetting) {
            this.indexSetting = indexSetting;
            return this;
        }
        public GetLibraryResponseBodyDataIndexSetting getIndexSetting() {
            return this.indexSetting;
        }

        public GetLibraryResponseBodyData setLibraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }
        public String getLibraryName() {
            return this.libraryName;
        }

    }

}
