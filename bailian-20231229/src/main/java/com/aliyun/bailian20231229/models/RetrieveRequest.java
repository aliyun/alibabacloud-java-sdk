// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class RetrieveRequest extends TeaModel {
    /**
     * <p>The top K value for AISearch. The system generates a vector for the input text and retrieves the top K text chunks in the knowledge base that are most similar to the vector representation. Valid values: 0 to 100.
     * The sum of DenseSimilarityTopK and SparseSimilarityTopK must be less than or equal to 200.</p>
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
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableReranking")
    public Boolean enableReranking;

    /**
     * <p>Specifies whether to enable &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/model-studio/use-cases/rag-optimization#b7031e2ad6cji">multi-turn conversation rewriting</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/model-studio/use-cases/rag-optimization#b7031e2ad6cji">multi-turn conversation rewriting</a>.
     * Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableRewrite")
    public Boolean enableRewrite;

    @NameInMap("Extra")
    public RetrieveRequestExtra extra;

    /**
     * <p>The URLs of the images passed in the query.</p>
     */
    @NameInMap("Images")
    public java.util.List<String> images;

    /**
     * <p>The ID of the knowledge base, which is the Data.Id returned by the CreateIndex operation.</p>
     * <blockquote>
     * <ul>
     * <li>Make sure that the corresponding knowledge base is created and not deleted.</li>
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
     * <p>The input text, which is the original input prompt. The length and characters of Query are not limited.</p>
     * 
     * <strong>example:</strong>
     * <p>Introduction to Alibaba Cloud Model Studio</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/model-studio/use-cases/rag-optimization#b7031e2ad6cji">Multi-turn conversation rewriting</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/model-studio/use-cases/rag-optimization#b7031e2ad6cji">Multi-turn conversation rewriting</a> allows you to pass in your own managed conversation history. This parameter takes effect only when EnableRewrite is set to <strong>true</strong>. Otherwise, it does not take effect even if you specify it.</p>
     */
    @NameInMap("QueryHistory")
    public java.util.List<RetrieveRequestQueryHistory> queryHistory;

    /**
     * <p>The reranking configuration.</p>
     */
    @NameInMap("Rerank")
    public java.util.List<RetrieveRequestRerank> rerank;

    /**
     * <p>The similarity threshold. This threshold specifies the minimum similarity score allowed for recalled text chunks and is used to filter the text chunks returned by the ranking model. Only text chunks with a score greater than this value are recalled. Valid values: 0.01 to 1.00. This parameter has a higher priority than the similarity threshold configured for the knowledge base.</p>
     * <p>If no specific value is specified, the similarity threshold configured for the knowledge base is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>0.20</p>
     */
    @NameInMap("RerankMinScore")
    public Float rerankMinScore;

    /**
     * <p>The top N text chunks to return after reranking. Valid values: 1 to 20. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RerankTopN")
    public Integer rerankTopN;

    /**
     * <p>The multi-turn conversation rewriting configuration.</p>
     */
    @NameInMap("Rewrite")
    public java.util.List<RetrieveRequestRewrite> rewrite;

    /**
     * <p>Specifies whether to save the historical text chunk recall test data. Valid values:</p>
     * <ul>
     * <li>true: Save.</li>
     * <li>false: Do not save.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SaveRetrieverHistory")
    public Boolean saveRetrieverHistory;

    /**
     * <p>The personalized retrieval conditions, such as tags, configured by using SearchFilter to filter semantic retrieval results and exclude information irrelevant to the query.
     * The filtering logic takes effect when the is_displayed_chunk_content parameter is set to true. For more information, see <a href="https://help.aliyun.com/document_detail/2869641.html">Knowledge base SearchFilters</a>.</p>
     */
    @NameInMap("SearchFilters")
    public java.util.List<java.util.Map<String, String>> searchFilters;

    /**
     * <p>The top K value for keyword retrieval. The system retrieves chunks from the knowledge base that are an exact match for the keywords in the input text. This helps you filter out irrelevant text chunks and provides more accurate results.
     * Valid values: 0 to 100.
     * The sum of DenseSimilarityTopK and SparseSimilarityTopK must be less than or equal to 200.</p>
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
         * <p>The question or answer content of the corresponding role.</p>
         * 
         * <strong>example:</strong>
         * <p>A piece of text</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The role.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>user: If this role is passed, content indicates the text that you input to the Alibaba Cloud Model Studio application.</li>
         * <li>assistant: If this role is passed, content indicates the reply from the Alibaba Cloud Model Studio application.</li>
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
         * <p>The specified reranking model. The value specified here overrides the reranking model selected when the knowledge base was created. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>qwen3-rerank-hybrid: qwen3-rerank (hybrid) reranking.</li>
         * <li>qwen3-rerank: qwen3-rerank reranking.</li>
         * <li>gte-rerank-hybrid: gte-rerank (hybrid) reranking.</li>
         * <li>gte-rerank: gte-rerank reranking.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>gte-rerank-hybrid: Official reranking.</li>
         * <li>gte-rerank: gte-rerank reranking.</li>
         * </ul>
         * <p>Default value: null. The reranking model selected when the knowledge base was created is used.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>If you only need semantic reranking, use qwen3-rerank. If you need both semantic reranking and text matching features to ensure relevance, use qwen3-rerank-hybrid.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>If you only need semantic reranking, use gte-rerank. If you need both semantic reranking and text matching features to ensure relevance, use gte-rerank-hybrid.</p>
         * </blockquote>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>gte-rerank-hybrid and gte-rerank will no longer be updated and are not recommended.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gte-rerank-hybrid</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not specify this parameter.</p>
         * <p>&lt;props=&quot;china&quot;&gt;A natural language instruction used to fine-tune the behavior of the reranking model.
         * <notice>This parameter takes effect only when rerank_mode is set to custom.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>Given a web search query, retrieve relevant passages that answer the query.</p>
         */
        @NameInMap("RerankInstruct")
        public String rerankInstruct;

        /**
         * <p>&lt;props=&quot;china&quot;&gt;
         * The instruction intervention mode of the reranking model, which determines its scoring preference.</p>
         * <p><strong>Valid values:</strong></p>
         * <ul>
         * <li><p><strong>qa</strong>: (Default) Q&amp;A mode. The model tends to assign higher scores to candidates that can directly answer the query. Recommended for Q&amp;A scenarios.</p>
         * </li>
         * <li><p><strong>similar</strong>: Similarity mode. The model tends to assign higher scores to candidates that are highly consistent with the query content. Recommended for matching and retrieval scenarios.</p>
         * </li>
         * <li><p><strong>custom</strong>: Custom mode. The reranking behavior of the model is determined by the instruction in the rerank_instruct parameter.</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;This parameter is not available. Do not specify this parameter.</p>
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
         * <p>The name of the multi-turn conversation rewriting model. The model automatically adjusts the original input prompt (user question) based on the conversation context to improve retrieval performance. Valid values:</p>
         * <ul>
         * <li>conv-rewrite-qwen-1.8b: The conv-rewrite-qwen-1.8b model. Currently, only this model is supported.</li>
         * </ul>
         * <p>Default value: null. The conv-rewrite-qwen-1.8b model is used.</p>
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
