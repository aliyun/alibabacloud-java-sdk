// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class RetrieveRequest extends TeaModel {
    /**
     * <p>The number of top-K similar text chunks to retrieve using vector retrieval. This is achieved by generating a vector representation of the query and searching the knowledge base for the K text chunks with the most similar vectors. The value must be an integer from 0 to 100. The sum of <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> must not exceed 200.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DenseSimilarityTopK")
    public Integer denseSimilarityTopK;

    /**
     * <p>Specifies whether to enable reranking. For more information, see <a href="https://help.aliyun.com/document_detail/2807740.html">Knowledge base</a>. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables reranking.</p>
     * </li>
     * <li><p><code>false</code>: Disables reranking.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableReranking")
    public Boolean enableReranking;

    /**
     * <p>Specifies whether to enable &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/model-studio/use-cases/rag-optimization#b7031e2ad6cji">conversational query rewriting</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/model-studio/use-cases/rag-optimization#b7031e2ad6cji">conversational query rewriting</a>.
     * Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Enables conversational query rewriting.</p>
     * </li>
     * <li><p><code>false</code>: Disables conversational query rewriting.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableRewrite")
    public Boolean enableRewrite;

    @NameInMap("Extra")
    public RetrieveRequestExtra extra;

    /**
     * <p>The URLs of images to include in the query.</p>
     */
    @NameInMap("Images")
    public java.util.List<String> images;

    /**
     * <p>The ID of the knowledge base. This is the <code>Data.Id</code> value returned by the <code>CreateIndex</code> operation.</p>
     * <blockquote>
     * <ul>
     * <li>Ensure the specified knowledge base exists and has not been deleted.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5pwe0mxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The query, which is the original user prompt. There are no limits on the length of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里云百炼平台介绍</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>The conversation history, used for &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/model-studio/use-cases/rag-optimization#b7031e2ad6cji">conversational query rewriting</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/model-studio/use-cases/rag-optimization#b7031e2ad6cji">conversational query rewriting</a>. This parameter is effective only when <code>EnableRewrite</code> is set to <code>true</code>.</p>
     */
    @NameInMap("QueryHistory")
    public java.util.List<RetrieveRequestQueryHistory> queryHistory;

    /**
     * <p>The reranking configurations.</p>
     */
    @NameInMap("Rerank")
    public java.util.List<RetrieveRequestRerank> rerank;

    /**
     * <p>The similarity threshold for reranking. Only text chunks with a similarity score greater than this value are returned. The value must be between 0.01 and 1.00, inclusive. This parameter overrides the similarity threshold setting of the knowledge base.</p>
     * <p>If not specified, the threshold configured for the knowledge base is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0.20</p>
     */
    @NameInMap("RerankMinScore")
    public Float rerankMinScore;

    /**
     * <p>The number of top-ranked text chunks to return after reranking. The value must be an integer from 1 to 20. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RerankTopN")
    public Integer rerankTopN;

    /**
     * <p>Configuration for conversational query rewriting.</p>
     */
    @NameInMap("Rewrite")
    public java.util.List<RetrieveRequestRewrite> rewrite;

    /**
     * <p>Specifies whether to save the retrieval history for testing purposes. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Saves the retrieval history.</p>
     * </li>
     * <li><p><code>false</code>: Does not save the retrieval history.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SaveRetrieverHistory")
    public Boolean saveRetrieverHistory;

    /**
     * <p>Specifies custom retrieval conditions, such as tags, to filter semantic retrieval results and exclude irrelevant information.
     * The filtering logic is applied only when the <code>is_displayed_chunk_content</code> parameter is set to <code>true</code>. For more information, see <a href="https://help.aliyun.com/document_detail/2869641.html">SearchFilters for a knowledge base</a>.</p>
     */
    @NameInMap("SearchFilters")
    public java.util.List<java.util.Map<String, String>> searchFilters;

    /**
     * <p>The number of top-K text chunks to retrieve using keyword retrieval. This feature finds text chunks in the knowledge base that exactly match the keywords in the query. It helps filter out irrelevant text chunks and provide more accurate results.
     * The value must be an integer from 0 to 100.
     * The sum of <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> must not exceed 200.</p>
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

    public RetrieveRequest setExtra(RetrieveRequestExtra extra) {
        this.extra = extra;
        return this;
    }
    public RetrieveRequestExtra getExtra() {
        return this.extra;
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

    public RetrieveRequest setQueryHistory(java.util.List<RetrieveRequestQueryHistory> queryHistory) {
        this.queryHistory = queryHistory;
        return this;
    }
    public java.util.List<RetrieveRequestQueryHistory> getQueryHistory() {
        return this.queryHistory;
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

    public static class RetrieveRequestExtra extends TeaModel {
        @NameInMap("uniqueId")
        public String uniqueId;

        public static RetrieveRequestExtra build(java.util.Map<String, ?> map) throws Exception {
            RetrieveRequestExtra self = new RetrieveRequestExtra();
            return TeaModel.build(map, self);
        }

        public RetrieveRequestExtra setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class RetrieveRequestQueryHistory extends TeaModel {
        /**
         * <p>The content of the message for the specified <code>role</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>代表一段文本。</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The role of the entity that sent the message.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>user</code>: Indicates that the <code>content</code> is from the end user.</p>
         * </li>
         * <li><p><code>assistant</code>: Indicates that the <code>content</code> is a response from the Model Studio application.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static RetrieveRequestQueryHistory build(java.util.Map<String, ?> map) throws Exception {
            RetrieveRequestQueryHistory self = new RetrieveRequestQueryHistory();
            return TeaModel.build(map, self);
        }

        public RetrieveRequestQueryHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RetrieveRequestQueryHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class RetrieveRequestRerank extends TeaModel {
        /**
         * <p>The reranking model to use. Specifying a model here overrides the default model selected when the knowledge base was created. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p><code>qwen3-rerank-hybrid</code>: Performs reranking by using the qwen3-rerank (hybrid) model.</p>
         * </li>
         * <li><p><code>qwen3-rerank</code>: Performs reranking by using the qwen3-rerank model.</p>
         * </li>
         * <li><p><code>gte-rerank-hybrid</code>: Performs reranking by using the gte-rerank (hybrid) model.</p>
         * </li>
         * <li><p><code>gte-rerank</code>: Performs reranking by using the gte-rerank model.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li><p><code>gte-rerank-hybrid</code>: Performs reranking by using the gte-rerank (hybrid) model.</p>
         * </li>
         * <li><p><code>gte-rerank</code>: Performs reranking by using the gte-rerank model.</p>
         * </li>
         * </ul>
         * <p>If you do not specify this parameter, the model configured for the knowledge base is used.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>Use <code>qwen3-rerank</code> for semantic ranking only. We recommend <code>qwen3-rerank-hybrid</code> if you require both semantic ranking and text matching features for higher relevance.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>Use <code>gte-rerank</code> for semantic ranking only. We recommend <code>gte-rerank-hybrid</code> if you require both semantic ranking and text matching features for higher relevance.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>The <code>gte-rerank-hybrid</code> and <code>gte-rerank</code> models are no longer updated and are not recommended for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gte-rerank-hybrid</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>This parameter is not yet available. Do not specify a value for it.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>A natural language instruction to fine-tune the behavior of the reranking model.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter takes effect only when <code>RerankMode</code> is set to <code>custom</code>.</p>
         */
        @NameInMap("RerankInstruct")
        public String rerankInstruct;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Specifies the instruction intervention mode for the reranking model. This mode determines the model\&quot;s scoring preference.</p>
         * <p><strong>Valid values:</strong></p>
         * <ul>
         * <li><p><code>qa</code>: (Default) Q\&amp;A mode. The model assigns higher scores to candidates that directly answer the query. Recommended for Q\&amp;A scenarios.</p>
         * </li>
         * <li><p><code>similar</code>: Similarity mode. The model assigns higher scores to candidates with high content similarity to the query. Recommended for match-based retrieval scenarios.</p>
         * </li>
         * <li><p><code>custom</code>: Custom mode. The model\&quot;s ranking behavior is determined by the instructions in the <code>RerankInstruct</code> parameter.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>This parameter is not yet available. Do not specify a value for it.</p>
         * 
         * <strong>example:</strong>
         * <p>qa</p>
         */
        @NameInMap("RerankMode")
        public String rerankMode;

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

        public RetrieveRequestRerank setRerankInstruct(String rerankInstruct) {
            this.rerankInstruct = rerankInstruct;
            return this;
        }
        public String getRerankInstruct() {
            return this.rerankInstruct;
        }

        public RetrieveRequestRerank setRerankMode(String rerankMode) {
            this.rerankMode = rerankMode;
            return this;
        }
        public String getRerankMode() {
            return this.rerankMode;
        }

    }

    public static class RetrieveRequestRewrite extends TeaModel {
        /**
         * <p>Specifies the model for conversational query rewriting, which automatically rewrites the original query based on the conversation context to improve retrieval results. Valid value:</p>
         * <ul>
         * <li><code>conv-rewrite-qwen-1.8b</code>: The only model currently supported for this feature.</li>
         * </ul>
         * <p>If this parameter is not specified, <code>conv-rewrite-qwen-1.8b</code> is used by default.</p>
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
