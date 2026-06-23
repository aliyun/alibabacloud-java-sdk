// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateLibraryRequest extends TeaModel {
    /**
     * <p>Document library description</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>描述文档库的具体作用</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Index settings for the document library</p>
     */
    @NameInMap("indexSetting")
    public CreateLibraryRequestIndexSetting indexSetting;

    /**
     * <p>Document library name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>金融知识文档库</p>
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
         * <p>Layout-based chunking</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("docTreeSplit")
        public Boolean docTreeSplit;

        /**
         * <p>Layout-based chunk size</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("docTreeSplitSize")
        public Integer docTreeSplitSize;

        /**
         * <p>Parse images in documents</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enhanceGraph")
        public Boolean enhanceGraph;

        /**
         * <p>Parse tables in documents</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enhanceTable")
        public Boolean enhanceTable;

        /**
         * <p>Chunk overlap length</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("overlap")
        public Integer overlap;

        /**
         * <p>Split by sentence</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("sentenceSplit")
        public Boolean sentenceSplit;

        /**
         * <p>Sentence-based chunk size</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("sentenceSplitSize")
        public Integer sentenceSplitSize;

        /**
         * <p>Chunk size</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <p>Enable chunking</p>
         * 
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
         * <p>Control the randomness and diversity of model responses. Higher values flatten the probability distribution over candidate tokens, increasing diversity. Lower values sharpen the distribution, increasing determinism.</p>
         * <p>Valid range: [0, 2). Avoid 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("temperature")
        public Double temperature;

        /**
         * <p>Probability threshold for nucleus sampling. For example, with a value of 0.8, only the smallest set of most likely tokens whose cumulative probability is at least 0.8 is used. Higher values increase randomness. Lower values increase determinism.</p>
         * 
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
         * <p>Rewrite queries using history</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableFollowUp")
        public Boolean enableFollowUp;

        /**
         * <p>Use Large Language Models (LLMs) to decompose queries</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableMultiQuery")
        public Boolean enableMultiQuery;

        /**
         * <p>Use LLMs to answer queries</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableOpenQa")
        public Boolean enableOpenQa;

        /**
         * <p>Enable query rewriting</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableQueryRewrite")
        public Boolean enableQueryRewrite;

        /**
         * <p>Enable multi-turn conversations</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableSession")
        public Boolean enableSession;

        /**
         * <p>Document library ID for knowledge rewriting</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("localKnowledgeId")
        public String localKnowledgeId;

        /**
         * <p>Include document references in responses</p>
         * 
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
         * <p>Merge and sort policy</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("documentRankType")
        public String documentRankType;

        /**
         * <p>Number of results from two-way merge and summarization</p>
         * 
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
         * <p>Text index type. Only ElasticSearch is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ElasticSearch</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Enable text indexing</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Text index analyzer: Standard, IkMaxWord, or IkSmart</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("indexAnalyzer")
        public String indexAnalyzer;

        /**
         * <p>Text index ranking threshold</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("rankThreshold")
        public Double rankThreshold;

        /**
         * <p>Text index search analyzer: Standard, IkMaxWord, or IkSmart</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("searchAnalyzer")
        public String searchAnalyzer;

        /**
         * <p>Number of final text index results</p>
         * 
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
         * <p>Vector index source. Only ADB is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ADB</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>Text embedding type for vector indexing</p>
         * 
         * <strong>example:</strong>
         * <p>DashScope</p>
         */
        @NameInMap("embeddingType")
        public String embeddingType;

        /**
         * <p>Enable vector indexing</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Vector index ranking threshold</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("rankThreshold")
        public Double rankThreshold;

        /**
         * <p>Number of final vector index results</p>
         * 
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
        /**
         * <p>Chunking strategy</p>
         */
        @NameInMap("chunkStrategy")
        public CreateLibraryRequestIndexSettingChunkStrategy chunkStrategy;

        /**
         * <p>Model configuration</p>
         */
        @NameInMap("modelConfig")
        public CreateLibraryRequestIndexSettingModelConfig modelConfig;

        /**
         * <p>Prompt role style. Specify a role and tone to guide response quality. Examples: Document analysis expert, friendly customer service agent, professional financial analyst.</p>
         * 
         * <strong>example:</strong>
         * <p>你是一位信息处理专家，耐心、友好、逻辑清晰。</p>
         */
        @NameInMap("promptRoleStyle")
        public String promptRoleStyle;

        /**
         * <p>Query enhancement configuration</p>
         */
        @NameInMap("queryEnhancer")
        public CreateLibraryRequestIndexSettingQueryEnhancer queryEnhancer;

        /**
         * <p>Retrieval strategy</p>
         */
        @NameInMap("recallStrategy")
        public CreateLibraryRequestIndexSettingRecallStrategy recallStrategy;

        /**
         * <p>Text index configuration</p>
         */
        @NameInMap("textIndexSetting")
        public CreateLibraryRequestIndexSettingTextIndexSetting textIndexSetting;

        /**
         * <p>Vector index settings</p>
         */
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
