// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class RetrieveShrinkRequest extends TeaModel {
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
    public String extraShrink;

    /**
     * <p>The URLs of images to include in the query.</p>
     */
    @NameInMap("Images")
    public String imagesShrink;

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
    public String queryHistoryShrink;

    /**
     * <p>The reranking configurations.</p>
     */
    @NameInMap("Rerank")
    public String rerankShrink;

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
    public String rewriteShrink;

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
    public String searchFiltersShrink;

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

    public static RetrieveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveShrinkRequest self = new RetrieveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveShrinkRequest setDenseSimilarityTopK(Integer denseSimilarityTopK) {
        this.denseSimilarityTopK = denseSimilarityTopK;
        return this;
    }
    public Integer getDenseSimilarityTopK() {
        return this.denseSimilarityTopK;
    }

    public RetrieveShrinkRequest setEnableReranking(Boolean enableReranking) {
        this.enableReranking = enableReranking;
        return this;
    }
    public Boolean getEnableReranking() {
        return this.enableReranking;
    }

    public RetrieveShrinkRequest setEnableRewrite(Boolean enableRewrite) {
        this.enableRewrite = enableRewrite;
        return this;
    }
    public Boolean getEnableRewrite() {
        return this.enableRewrite;
    }

    public RetrieveShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public RetrieveShrinkRequest setImagesShrink(String imagesShrink) {
        this.imagesShrink = imagesShrink;
        return this;
    }
    public String getImagesShrink() {
        return this.imagesShrink;
    }

    public RetrieveShrinkRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public RetrieveShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RetrieveShrinkRequest setQueryHistoryShrink(String queryHistoryShrink) {
        this.queryHistoryShrink = queryHistoryShrink;
        return this;
    }
    public String getQueryHistoryShrink() {
        return this.queryHistoryShrink;
    }

    public RetrieveShrinkRequest setRerankShrink(String rerankShrink) {
        this.rerankShrink = rerankShrink;
        return this;
    }
    public String getRerankShrink() {
        return this.rerankShrink;
    }

    public RetrieveShrinkRequest setRerankMinScore(Float rerankMinScore) {
        this.rerankMinScore = rerankMinScore;
        return this;
    }
    public Float getRerankMinScore() {
        return this.rerankMinScore;
    }

    public RetrieveShrinkRequest setRerankTopN(Integer rerankTopN) {
        this.rerankTopN = rerankTopN;
        return this;
    }
    public Integer getRerankTopN() {
        return this.rerankTopN;
    }

    public RetrieveShrinkRequest setRewriteShrink(String rewriteShrink) {
        this.rewriteShrink = rewriteShrink;
        return this;
    }
    public String getRewriteShrink() {
        return this.rewriteShrink;
    }

    public RetrieveShrinkRequest setSaveRetrieverHistory(Boolean saveRetrieverHistory) {
        this.saveRetrieverHistory = saveRetrieverHistory;
        return this;
    }
    public Boolean getSaveRetrieverHistory() {
        return this.saveRetrieverHistory;
    }

    public RetrieveShrinkRequest setSearchFiltersShrink(String searchFiltersShrink) {
        this.searchFiltersShrink = searchFiltersShrink;
        return this;
    }
    public String getSearchFiltersShrink() {
        return this.searchFiltersShrink;
    }

    public RetrieveShrinkRequest setSparseSimilarityTopK(Integer sparseSimilarityTopK) {
        this.sparseSimilarityTopK = sparseSimilarityTopK;
        return this;
    }
    public Integer getSparseSimilarityTopK() {
        return this.sparseSimilarityTopK;
    }

}
