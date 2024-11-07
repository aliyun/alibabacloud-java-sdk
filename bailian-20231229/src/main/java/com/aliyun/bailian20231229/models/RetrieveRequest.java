// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class RetrieveRequest extends TeaModel {
    /**
     * <p>Vector retrieval top K. After generating vectors based on input text, the top K chunks in the knowledge base that are most similar to the vector representation of the input text are retrieved. Valid values: 0 to 100. The sum of the <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> parameters must be less than or equal to 200.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DenseSimilarityTopK")
    public Integer denseSimilarityTopK;

    /**
     * <p>Specifies whether to enable reranking. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableReranking")
    public Boolean enableReranking;

    /**
     * <p>Specifies whether to enable multi-round conversation rewriting. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableRewrite")
    public Boolean enableRewrite;

    @NameInMap("Images")
    public java.util.List<String> images;

    /**
     * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5pwe0m2g6t</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The input query prompt. The length and characters of the query are not limited.</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Ranking configurations.</p>
     */
    @NameInMap("Rerank")
    public java.util.List<RetrieveRequestRerank> rerank;

    /**
     * <p>Similarity Threshold The lowest similarity score of chunks that can be returned. This parameter is used to filter text chunks returned by the rank model. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values: [0.01-1.00]. The priority of this parameter is greater than the similarity threshold configured for the knowledge base.</p>
     * <p>By default, this parameter is left empty. In this case, the similarity threshold of the knowledge base is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0.20</p>
     */
    @NameInMap("RerankMinScore")
    public Float rerankMinScore;

    /**
     * <p>The top N return data after reranking. Valid values: 1 to 20. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RerankTopN")
    public Integer rerankTopN;

    /**
     * <p>Conversation rewriting configurations.</p>
     */
    @NameInMap("Rewrite")
    public java.util.List<RetrieveRequestRewrite> rewrite;

    /**
     * <p>Specifies whether to save the retrieve test history. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SaveRetrieverHistory")
    public Boolean saveRetrieverHistory;

    /**
     * <p>Specifies complex filter conditions. For more information about the syntax of SearchFilters, see the SearchFilter syntax section of this topic.</p>
     */
    @NameInMap("SearchFilters")
    public java.util.List<java.util.Map<String, String>> searchFilters;

    /**
     * <p>The top K of keyword retrieval. Chunks that exactly match the keywords of the input text are retrieved from the knowledge base. This filters out irrelevant chunks and boosts accuracy. Valid values: 0 to 100. The sum of the <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> parameters must be less than or equal to 200.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("SparseSimilarityTopK")
    public Integer sparseSimilarityTopK;

    public static RetrieveRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveRequest self = new RetrieveRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveRequest setDenseSimilarityTopK(Integer denseSimilarityTopK) {
        this.denseSimilarityTopK = denseSimilarityTopK;
        return this;
    }
    public Integer getDenseSimilarityTopK() {
        return this.denseSimilarityTopK;
    }

    public RetrieveRequest setEnableReranking(Boolean enableReranking) {
        this.enableReranking = enableReranking;
        return this;
    }
    public Boolean getEnableReranking() {
        return this.enableReranking;
    }

    public RetrieveRequest setEnableRewrite(Boolean enableRewrite) {
        this.enableRewrite = enableRewrite;
        return this;
    }
    public Boolean getEnableRewrite() {
        return this.enableRewrite;
    }

    public RetrieveRequest setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public RetrieveRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public RetrieveRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RetrieveRequest setRerank(java.util.List<RetrieveRequestRerank> rerank) {
        this.rerank = rerank;
        return this;
    }
    public java.util.List<RetrieveRequestRerank> getRerank() {
        return this.rerank;
    }

    public RetrieveRequest setRerankMinScore(Float rerankMinScore) {
        this.rerankMinScore = rerankMinScore;
        return this;
    }
    public Float getRerankMinScore() {
        return this.rerankMinScore;
    }

    public RetrieveRequest setRerankTopN(Integer rerankTopN) {
        this.rerankTopN = rerankTopN;
        return this;
    }
    public Integer getRerankTopN() {
        return this.rerankTopN;
    }

    public RetrieveRequest setRewrite(java.util.List<RetrieveRequestRewrite> rewrite) {
        this.rewrite = rewrite;
        return this;
    }
    public java.util.List<RetrieveRequestRewrite> getRewrite() {
        return this.rewrite;
    }

    public RetrieveRequest setSaveRetrieverHistory(Boolean saveRetrieverHistory) {
        this.saveRetrieverHistory = saveRetrieverHistory;
        return this;
    }
    public Boolean getSaveRetrieverHistory() {
        return this.saveRetrieverHistory;
    }

    public RetrieveRequest setSearchFilters(java.util.List<java.util.Map<String, String>> searchFilters) {
        this.searchFilters = searchFilters;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getSearchFilters() {
        return this.searchFilters;
    }

    public RetrieveRequest setSparseSimilarityTopK(Integer sparseSimilarityTopK) {
        this.sparseSimilarityTopK = sparseSimilarityTopK;
        return this;
    }
    public Integer getSparseSimilarityTopK() {
        return this.sparseSimilarityTopK;
    }

    public static class RetrieveRequestRerank extends TeaModel {
        /**
         * <p>The name of the rank model. For more information, see <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/rag-knowledge-base">Create a knowledge base</a>. Valid values:</p>
         * <ul>
         * <li>gte-rerank-hybrid: Recommended official model.</li>
         * <li>gte-rerank</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>gte-rerank-hybrid</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        public static RetrieveRequestRerank build(java.util.Map<String, ?> map) throws Exception {
            RetrieveRequestRerank self = new RetrieveRequestRerank();
            return TeaModel.build(map, self);
        }

        public RetrieveRequestRerank setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class RetrieveRequestRewrite extends TeaModel {
        /**
         * <p>Conversation rewriting model name. The query rewriting model automatically adjusts the original prompt based on the context to improve retrieval performance. Valid value:</p>
         * <ul>
         * <li>conv-rewrite-qwen-1.8b</li>
         * </ul>
         * <p>By default, this parameter is left empty, which means conv-rewrite-qwen-1.8b is used.</p>
         * 
         * <strong>example:</strong>
         * <p>conv-rewrite-qwen-1.8b</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        public static RetrieveRequestRewrite build(java.util.Map<String, ?> map) throws Exception {
            RetrieveRequestRewrite self = new RetrieveRequestRewrite();
            return TeaModel.build(map, self);
        }

        public RetrieveRequestRewrite setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

}
