// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UpdateLibraryRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("indexSetting")
    public UpdateLibraryRequestIndexSetting indexSetting;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dsfbashdbb</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    @NameInMap("libraryName")
    public String libraryName;

    public static UpdateLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibraryRequest self = new UpdateLibraryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLibraryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLibraryRequest setIndexSetting(UpdateLibraryRequestIndexSetting indexSetting) {
        this.indexSetting = indexSetting;
        return this;
    }
    public UpdateLibraryRequestIndexSetting getIndexSetting() {
        return this.indexSetting;
    }

    public UpdateLibraryRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public UpdateLibraryRequest setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public static class UpdateLibraryRequestIndexSettingChunkStrategy extends TeaModel {
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
         * <p>20</p>
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

        public static UpdateLibraryRequestIndexSettingChunkStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateLibraryRequestIndexSettingChunkStrategy self = new UpdateLibraryRequestIndexSettingChunkStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateLibraryRequestIndexSettingChunkStrategy setDocTreeSplit(Boolean docTreeSplit) {
            this.docTreeSplit = docTreeSplit;
            return this;
        }
        public Boolean getDocTreeSplit() {
            return this.docTreeSplit;
        }

        public UpdateLibraryRequestIndexSettingChunkStrategy setDocTreeSplitSize(Integer docTreeSplitSize) {
            this.docTreeSplitSize = docTreeSplitSize;
            return this;
        }
        public Integer getDocTreeSplitSize() {
            return this.docTreeSplitSize;
        }

        public UpdateLibraryRequestIndexSettingChunkStrategy setEnhanceGraph(Boolean enhanceGraph) {
            this.enhanceGraph = enhanceGraph;
            return this;
        }
        public Boolean getEnhanceGraph() {
            return this.enhanceGraph;
        }

        public UpdateLibraryRequestIndexSettingChunkStrategy setEnhanceTable(Boolean enhanceTable) {
            this.enhanceTable = enhanceTable;
            return this;
        }
        public Boolean getEnhanceTable() {
            return this.enhanceTable;
        }

        public UpdateLibraryRequestIndexSettingChunkStrategy setOverlap(Integer overlap) {
            this.overlap = overlap;
            return this;
        }
        public Integer getOverlap() {
            return this.overlap;
        }

        public UpdateLibraryRequestIndexSettingChunkStrategy setSentenceSplit(Boolean sentenceSplit) {
            this.sentenceSplit = sentenceSplit;
            return this;
        }
        public Boolean getSentenceSplit() {
            return this.sentenceSplit;
        }

        public UpdateLibraryRequestIndexSettingChunkStrategy setSentenceSplitSize(Integer sentenceSplitSize) {
            this.sentenceSplitSize = sentenceSplitSize;
            return this;
        }
        public Integer getSentenceSplitSize() {
            return this.sentenceSplitSize;
        }

        public UpdateLibraryRequestIndexSettingChunkStrategy setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public UpdateLibraryRequestIndexSettingChunkStrategy setSplit(Boolean split) {
            this.split = split;
            return this;
        }
        public Boolean getSplit() {
            return this.split;
        }

    }

    public static class UpdateLibraryRequestIndexSettingModelConfig extends TeaModel {
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

        public static UpdateLibraryRequestIndexSettingModelConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateLibraryRequestIndexSettingModelConfig self = new UpdateLibraryRequestIndexSettingModelConfig();
            return TeaModel.build(map, self);
        }

        public UpdateLibraryRequestIndexSettingModelConfig setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

        public UpdateLibraryRequestIndexSettingModelConfig setTopP(Double topP) {
            this.topP = topP;
            return this;
        }
        public Double getTopP() {
            return this.topP;
        }

    }

    public static class UpdateLibraryRequestIndexSettingQueryEnhancer extends TeaModel {
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
         * <p>sjdhgfc</p>
         */
        @NameInMap("localKnowledgeId")
        public String localKnowledgeId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("withDocumentReference")
        public Boolean withDocumentReference;

        public static UpdateLibraryRequestIndexSettingQueryEnhancer build(java.util.Map<String, ?> map) throws Exception {
            UpdateLibraryRequestIndexSettingQueryEnhancer self = new UpdateLibraryRequestIndexSettingQueryEnhancer();
            return TeaModel.build(map, self);
        }

        public UpdateLibraryRequestIndexSettingQueryEnhancer setEnableFollowUp(Boolean enableFollowUp) {
            this.enableFollowUp = enableFollowUp;
            return this;
        }
        public Boolean getEnableFollowUp() {
            return this.enableFollowUp;
        }

        public UpdateLibraryRequestIndexSettingQueryEnhancer setEnableMultiQuery(Boolean enableMultiQuery) {
            this.enableMultiQuery = enableMultiQuery;
            return this;
        }
        public Boolean getEnableMultiQuery() {
            return this.enableMultiQuery;
        }

        public UpdateLibraryRequestIndexSettingQueryEnhancer setEnableOpenQa(Boolean enableOpenQa) {
            this.enableOpenQa = enableOpenQa;
            return this;
        }
        public Boolean getEnableOpenQa() {
            return this.enableOpenQa;
        }

        public UpdateLibraryRequestIndexSettingQueryEnhancer setEnableQueryRewrite(Boolean enableQueryRewrite) {
            this.enableQueryRewrite = enableQueryRewrite;
            return this;
        }
        public Boolean getEnableQueryRewrite() {
            return this.enableQueryRewrite;
        }

        public UpdateLibraryRequestIndexSettingQueryEnhancer setEnableSession(Boolean enableSession) {
            this.enableSession = enableSession;
            return this;
        }
        public Boolean getEnableSession() {
            return this.enableSession;
        }

        public UpdateLibraryRequestIndexSettingQueryEnhancer setLocalKnowledgeId(String localKnowledgeId) {
            this.localKnowledgeId = localKnowledgeId;
            return this;
        }
        public String getLocalKnowledgeId() {
            return this.localKnowledgeId;
        }

        public UpdateLibraryRequestIndexSettingQueryEnhancer setWithDocumentReference(Boolean withDocumentReference) {
            this.withDocumentReference = withDocumentReference;
            return this;
        }
        public Boolean getWithDocumentReference() {
            return this.withDocumentReference;
        }

    }

    public static class UpdateLibraryRequestIndexSettingRecallStrategy extends TeaModel {
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

        public static UpdateLibraryRequestIndexSettingRecallStrategy build(java.util.Map<String, ?> map) throws Exception {
            UpdateLibraryRequestIndexSettingRecallStrategy self = new UpdateLibraryRequestIndexSettingRecallStrategy();
            return TeaModel.build(map, self);
        }

        public UpdateLibraryRequestIndexSettingRecallStrategy setDocumentRankType(String documentRankType) {
            this.documentRankType = documentRankType;
            return this;
        }
        public String getDocumentRankType() {
            return this.documentRankType;
        }

        public UpdateLibraryRequestIndexSettingRecallStrategy setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

    }

    public static class UpdateLibraryRequestIndexSettingTextIndexSetting extends TeaModel {
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
         * <p>0.5</p>
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
         * <p>50</p>
         */
        @NameInMap("topK")
        public Integer topK;

        public static UpdateLibraryRequestIndexSettingTextIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateLibraryRequestIndexSettingTextIndexSetting self = new UpdateLibraryRequestIndexSettingTextIndexSetting();
            return TeaModel.build(map, self);
        }

        public UpdateLibraryRequestIndexSettingTextIndexSetting setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public UpdateLibraryRequestIndexSettingTextIndexSetting setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateLibraryRequestIndexSettingTextIndexSetting setIndexAnalyzer(String indexAnalyzer) {
            this.indexAnalyzer = indexAnalyzer;
            return this;
        }
        public String getIndexAnalyzer() {
            return this.indexAnalyzer;
        }

        public UpdateLibraryRequestIndexSettingTextIndexSetting setRankThreshold(Double rankThreshold) {
            this.rankThreshold = rankThreshold;
            return this;
        }
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        public UpdateLibraryRequestIndexSettingTextIndexSetting setSearchAnalyzer(String searchAnalyzer) {
            this.searchAnalyzer = searchAnalyzer;
            return this;
        }
        public String getSearchAnalyzer() {
            return this.searchAnalyzer;
        }

        public UpdateLibraryRequestIndexSettingTextIndexSetting setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class UpdateLibraryRequestIndexSettingVectorIndexSetting extends TeaModel {
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
         * <p>0.5</p>
         */
        @NameInMap("rankThreshold")
        public Double rankThreshold;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("topK")
        public Integer topK;

        public static UpdateLibraryRequestIndexSettingVectorIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateLibraryRequestIndexSettingVectorIndexSetting self = new UpdateLibraryRequestIndexSettingVectorIndexSetting();
            return TeaModel.build(map, self);
        }

        public UpdateLibraryRequestIndexSettingVectorIndexSetting setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public UpdateLibraryRequestIndexSettingVectorIndexSetting setEmbeddingType(String embeddingType) {
            this.embeddingType = embeddingType;
            return this;
        }
        public String getEmbeddingType() {
            return this.embeddingType;
        }

        public UpdateLibraryRequestIndexSettingVectorIndexSetting setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateLibraryRequestIndexSettingVectorIndexSetting setRankThreshold(Double rankThreshold) {
            this.rankThreshold = rankThreshold;
            return this;
        }
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        public UpdateLibraryRequestIndexSettingVectorIndexSetting setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class UpdateLibraryRequestIndexSetting extends TeaModel {
        @NameInMap("chunkStrategy")
        public UpdateLibraryRequestIndexSettingChunkStrategy chunkStrategy;

        @NameInMap("modelConfig")
        public UpdateLibraryRequestIndexSettingModelConfig modelConfig;

        @NameInMap("promptRoleStyle")
        public String promptRoleStyle;

        @NameInMap("queryEnhancer")
        public UpdateLibraryRequestIndexSettingQueryEnhancer queryEnhancer;

        @NameInMap("recallStrategy")
        public UpdateLibraryRequestIndexSettingRecallStrategy recallStrategy;

        @NameInMap("textIndexSetting")
        public UpdateLibraryRequestIndexSettingTextIndexSetting textIndexSetting;

        @NameInMap("vectorIndexSetting")
        public UpdateLibraryRequestIndexSettingVectorIndexSetting vectorIndexSetting;

        public static UpdateLibraryRequestIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateLibraryRequestIndexSetting self = new UpdateLibraryRequestIndexSetting();
            return TeaModel.build(map, self);
        }

        public UpdateLibraryRequestIndexSetting setChunkStrategy(UpdateLibraryRequestIndexSettingChunkStrategy chunkStrategy) {
            this.chunkStrategy = chunkStrategy;
            return this;
        }
        public UpdateLibraryRequestIndexSettingChunkStrategy getChunkStrategy() {
            return this.chunkStrategy;
        }

        public UpdateLibraryRequestIndexSetting setModelConfig(UpdateLibraryRequestIndexSettingModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public UpdateLibraryRequestIndexSettingModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public UpdateLibraryRequestIndexSetting setPromptRoleStyle(String promptRoleStyle) {
            this.promptRoleStyle = promptRoleStyle;
            return this;
        }
        public String getPromptRoleStyle() {
            return this.promptRoleStyle;
        }

        public UpdateLibraryRequestIndexSetting setQueryEnhancer(UpdateLibraryRequestIndexSettingQueryEnhancer queryEnhancer) {
            this.queryEnhancer = queryEnhancer;
            return this;
        }
        public UpdateLibraryRequestIndexSettingQueryEnhancer getQueryEnhancer() {
            return this.queryEnhancer;
        }

        public UpdateLibraryRequestIndexSetting setRecallStrategy(UpdateLibraryRequestIndexSettingRecallStrategy recallStrategy) {
            this.recallStrategy = recallStrategy;
            return this;
        }
        public UpdateLibraryRequestIndexSettingRecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        public UpdateLibraryRequestIndexSetting setTextIndexSetting(UpdateLibraryRequestIndexSettingTextIndexSetting textIndexSetting) {
            this.textIndexSetting = textIndexSetting;
            return this;
        }
        public UpdateLibraryRequestIndexSettingTextIndexSetting getTextIndexSetting() {
            return this.textIndexSetting;
        }

        public UpdateLibraryRequestIndexSetting setVectorIndexSetting(UpdateLibraryRequestIndexSettingVectorIndexSetting vectorIndexSetting) {
            this.vectorIndexSetting = vectorIndexSetting;
            return this;
        }
        public UpdateLibraryRequestIndexSettingVectorIndexSetting getVectorIndexSetting() {
            return this.vectorIndexSetting;
        }

    }

}
