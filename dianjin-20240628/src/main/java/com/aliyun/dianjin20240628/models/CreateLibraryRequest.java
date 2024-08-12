// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateLibraryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("indexSetting")
    public CreateLibraryRequestIndexSetting indexSetting;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("libraryName")
    public String libraryName;

    public static CreateLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryRequest self = new CreateLibraryRequest();
        return TeaModel.build(map, self);
    }

    public CreateLibraryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLibraryRequest setIndexSetting(CreateLibraryRequestIndexSetting indexSetting) {
        this.indexSetting = indexSetting;
        return this;
    }
    public CreateLibraryRequestIndexSetting getIndexSetting() {
        return this.indexSetting;
    }

    public CreateLibraryRequest setLibraryName(String libraryName) {
        this.libraryName = libraryName;
        return this;
    }
    public String getLibraryName() {
        return this.libraryName;
    }

    public static class CreateLibraryRequestIndexSettingChunkStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("docTreeSplit")
        public Boolean docTreeSplit;

        /**
         * <strong>example:</strong>
         * <p>300</p>
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
         * <p>300</p>
         */
        @NameInMap("sentenceSplitSize")
        public Integer sentenceSplitSize;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("split")
        public Boolean split;

        public static CreateLibraryRequestIndexSettingChunkStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateLibraryRequestIndexSettingChunkStrategy self = new CreateLibraryRequestIndexSettingChunkStrategy();
            return TeaModel.build(map, self);
        }

        public CreateLibraryRequestIndexSettingChunkStrategy setDocTreeSplit(Boolean docTreeSplit) {
            this.docTreeSplit = docTreeSplit;
            return this;
        }
        public Boolean getDocTreeSplit() {
            return this.docTreeSplit;
        }

        public CreateLibraryRequestIndexSettingChunkStrategy setDocTreeSplitSize(Integer docTreeSplitSize) {
            this.docTreeSplitSize = docTreeSplitSize;
            return this;
        }
        public Integer getDocTreeSplitSize() {
            return this.docTreeSplitSize;
        }

        public CreateLibraryRequestIndexSettingChunkStrategy setEnhanceGraph(Boolean enhanceGraph) {
            this.enhanceGraph = enhanceGraph;
            return this;
        }
        public Boolean getEnhanceGraph() {
            return this.enhanceGraph;
        }

        public CreateLibraryRequestIndexSettingChunkStrategy setEnhanceTable(Boolean enhanceTable) {
            this.enhanceTable = enhanceTable;
            return this;
        }
        public Boolean getEnhanceTable() {
            return this.enhanceTable;
        }

        public CreateLibraryRequestIndexSettingChunkStrategy setOverlap(Integer overlap) {
            this.overlap = overlap;
            return this;
        }
        public Integer getOverlap() {
            return this.overlap;
        }

        public CreateLibraryRequestIndexSettingChunkStrategy setSentenceSplit(Boolean sentenceSplit) {
            this.sentenceSplit = sentenceSplit;
            return this;
        }
        public Boolean getSentenceSplit() {
            return this.sentenceSplit;
        }

        public CreateLibraryRequestIndexSettingChunkStrategy setSentenceSplitSize(Integer sentenceSplitSize) {
            this.sentenceSplitSize = sentenceSplitSize;
            return this;
        }
        public Integer getSentenceSplitSize() {
            return this.sentenceSplitSize;
        }

        public CreateLibraryRequestIndexSettingChunkStrategy setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateLibraryRequestIndexSettingChunkStrategy setSplit(Boolean split) {
            this.split = split;
            return this;
        }
        public Boolean getSplit() {
            return this.split;
        }

    }

    public static class CreateLibraryRequestIndexSettingModelConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("temperature")
        public Double temperature;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("topP")
        public Double topP;

        public static CreateLibraryRequestIndexSettingModelConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLibraryRequestIndexSettingModelConfig self = new CreateLibraryRequestIndexSettingModelConfig();
            return TeaModel.build(map, self);
        }

        public CreateLibraryRequestIndexSettingModelConfig setTemperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }
        public Double getTemperature() {
            return this.temperature;
        }

        public CreateLibraryRequestIndexSettingModelConfig setTopP(Double topP) {
            this.topP = topP;
            return this;
        }
        public Double getTopP() {
            return this.topP;
        }

    }

    public static class CreateLibraryRequestIndexSettingQueryEnhancer extends TeaModel {
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
         * <p>xxxx</p>
         */
        @NameInMap("localKnowledgeId")
        public String localKnowledgeId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("withDocumentReference")
        public Boolean withDocumentReference;

        public static CreateLibraryRequestIndexSettingQueryEnhancer build(java.util.Map<String, ?> map) throws Exception {
            CreateLibraryRequestIndexSettingQueryEnhancer self = new CreateLibraryRequestIndexSettingQueryEnhancer();
            return TeaModel.build(map, self);
        }

        public CreateLibraryRequestIndexSettingQueryEnhancer setEnableFollowUp(Boolean enableFollowUp) {
            this.enableFollowUp = enableFollowUp;
            return this;
        }
        public Boolean getEnableFollowUp() {
            return this.enableFollowUp;
        }

        public CreateLibraryRequestIndexSettingQueryEnhancer setEnableMultiQuery(Boolean enableMultiQuery) {
            this.enableMultiQuery = enableMultiQuery;
            return this;
        }
        public Boolean getEnableMultiQuery() {
            return this.enableMultiQuery;
        }

        public CreateLibraryRequestIndexSettingQueryEnhancer setEnableOpenQa(Boolean enableOpenQa) {
            this.enableOpenQa = enableOpenQa;
            return this;
        }
        public Boolean getEnableOpenQa() {
            return this.enableOpenQa;
        }

        public CreateLibraryRequestIndexSettingQueryEnhancer setEnableQueryRewrite(Boolean enableQueryRewrite) {
            this.enableQueryRewrite = enableQueryRewrite;
            return this;
        }
        public Boolean getEnableQueryRewrite() {
            return this.enableQueryRewrite;
        }

        public CreateLibraryRequestIndexSettingQueryEnhancer setEnableSession(Boolean enableSession) {
            this.enableSession = enableSession;
            return this;
        }
        public Boolean getEnableSession() {
            return this.enableSession;
        }

        public CreateLibraryRequestIndexSettingQueryEnhancer setLocalKnowledgeId(String localKnowledgeId) {
            this.localKnowledgeId = localKnowledgeId;
            return this;
        }
        public String getLocalKnowledgeId() {
            return this.localKnowledgeId;
        }

        public CreateLibraryRequestIndexSettingQueryEnhancer setWithDocumentReference(Boolean withDocumentReference) {
            this.withDocumentReference = withDocumentReference;
            return this;
        }
        public Boolean getWithDocumentReference() {
            return this.withDocumentReference;
        }

    }

    public static class CreateLibraryRequestIndexSettingRecallStrategy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("documentRankType")
        public String documentRankType;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("limit")
        public Integer limit;

        public static CreateLibraryRequestIndexSettingRecallStrategy build(java.util.Map<String, ?> map) throws Exception {
            CreateLibraryRequestIndexSettingRecallStrategy self = new CreateLibraryRequestIndexSettingRecallStrategy();
            return TeaModel.build(map, self);
        }

        public CreateLibraryRequestIndexSettingRecallStrategy setDocumentRankType(String documentRankType) {
            this.documentRankType = documentRankType;
            return this;
        }
        public String getDocumentRankType() {
            return this.documentRankType;
        }

        public CreateLibraryRequestIndexSettingRecallStrategy setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

    }

    public static class CreateLibraryRequestIndexSettingTextIndexSetting extends TeaModel {
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

        public static CreateLibraryRequestIndexSettingTextIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateLibraryRequestIndexSettingTextIndexSetting self = new CreateLibraryRequestIndexSettingTextIndexSetting();
            return TeaModel.build(map, self);
        }

        public CreateLibraryRequestIndexSettingTextIndexSetting setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLibraryRequestIndexSettingTextIndexSetting setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateLibraryRequestIndexSettingTextIndexSetting setIndexAnalyzer(String indexAnalyzer) {
            this.indexAnalyzer = indexAnalyzer;
            return this;
        }
        public String getIndexAnalyzer() {
            return this.indexAnalyzer;
        }

        public CreateLibraryRequestIndexSettingTextIndexSetting setRankThreshold(Double rankThreshold) {
            this.rankThreshold = rankThreshold;
            return this;
        }
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        public CreateLibraryRequestIndexSettingTextIndexSetting setSearchAnalyzer(String searchAnalyzer) {
            this.searchAnalyzer = searchAnalyzer;
            return this;
        }
        public String getSearchAnalyzer() {
            return this.searchAnalyzer;
        }

        public CreateLibraryRequestIndexSettingTextIndexSetting setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class CreateLibraryRequestIndexSettingVectorIndexSetting extends TeaModel {
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
         * <p>50</p>
         */
        @NameInMap("topK")
        public Integer topK;

        public static CreateLibraryRequestIndexSettingVectorIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateLibraryRequestIndexSettingVectorIndexSetting self = new CreateLibraryRequestIndexSettingVectorIndexSetting();
            return TeaModel.build(map, self);
        }

        public CreateLibraryRequestIndexSettingVectorIndexSetting setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateLibraryRequestIndexSettingVectorIndexSetting setEmbeddingType(String embeddingType) {
            this.embeddingType = embeddingType;
            return this;
        }
        public String getEmbeddingType() {
            return this.embeddingType;
        }

        public CreateLibraryRequestIndexSettingVectorIndexSetting setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateLibraryRequestIndexSettingVectorIndexSetting setRankThreshold(Double rankThreshold) {
            this.rankThreshold = rankThreshold;
            return this;
        }
        public Double getRankThreshold() {
            return this.rankThreshold;
        }

        public CreateLibraryRequestIndexSettingVectorIndexSetting setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

    public static class CreateLibraryRequestIndexSetting extends TeaModel {
        @NameInMap("chunkStrategy")
        public CreateLibraryRequestIndexSettingChunkStrategy chunkStrategy;

        @NameInMap("modelConfig")
        public CreateLibraryRequestIndexSettingModelConfig modelConfig;

        @NameInMap("promptRoleStyle")
        public String promptRoleStyle;

        @NameInMap("queryEnhancer")
        public CreateLibraryRequestIndexSettingQueryEnhancer queryEnhancer;

        @NameInMap("recallStrategy")
        public CreateLibraryRequestIndexSettingRecallStrategy recallStrategy;

        @NameInMap("textIndexSetting")
        public CreateLibraryRequestIndexSettingTextIndexSetting textIndexSetting;

        @NameInMap("vectorIndexSetting")
        public CreateLibraryRequestIndexSettingVectorIndexSetting vectorIndexSetting;

        public static CreateLibraryRequestIndexSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateLibraryRequestIndexSetting self = new CreateLibraryRequestIndexSetting();
            return TeaModel.build(map, self);
        }

        public CreateLibraryRequestIndexSetting setChunkStrategy(CreateLibraryRequestIndexSettingChunkStrategy chunkStrategy) {
            this.chunkStrategy = chunkStrategy;
            return this;
        }
        public CreateLibraryRequestIndexSettingChunkStrategy getChunkStrategy() {
            return this.chunkStrategy;
        }

        public CreateLibraryRequestIndexSetting setModelConfig(CreateLibraryRequestIndexSettingModelConfig modelConfig) {
            this.modelConfig = modelConfig;
            return this;
        }
        public CreateLibraryRequestIndexSettingModelConfig getModelConfig() {
            return this.modelConfig;
        }

        public CreateLibraryRequestIndexSetting setPromptRoleStyle(String promptRoleStyle) {
            this.promptRoleStyle = promptRoleStyle;
            return this;
        }
        public String getPromptRoleStyle() {
            return this.promptRoleStyle;
        }

        public CreateLibraryRequestIndexSetting setQueryEnhancer(CreateLibraryRequestIndexSettingQueryEnhancer queryEnhancer) {
            this.queryEnhancer = queryEnhancer;
            return this;
        }
        public CreateLibraryRequestIndexSettingQueryEnhancer getQueryEnhancer() {
            return this.queryEnhancer;
        }

        public CreateLibraryRequestIndexSetting setRecallStrategy(CreateLibraryRequestIndexSettingRecallStrategy recallStrategy) {
            this.recallStrategy = recallStrategy;
            return this;
        }
        public CreateLibraryRequestIndexSettingRecallStrategy getRecallStrategy() {
            return this.recallStrategy;
        }

        public CreateLibraryRequestIndexSetting setTextIndexSetting(CreateLibraryRequestIndexSettingTextIndexSetting textIndexSetting) {
            this.textIndexSetting = textIndexSetting;
            return this;
        }
        public CreateLibraryRequestIndexSettingTextIndexSetting getTextIndexSetting() {
            return this.textIndexSetting;
        }

        public CreateLibraryRequestIndexSetting setVectorIndexSetting(CreateLibraryRequestIndexSettingVectorIndexSetting vectorIndexSetting) {
            this.vectorIndexSetting = vectorIndexSetting;
            return this;
        }
        public CreateLibraryRequestIndexSettingVectorIndexSetting getVectorIndexSetting() {
            return this.vectorIndexSetting;
        }

    }

}
