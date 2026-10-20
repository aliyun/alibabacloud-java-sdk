// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class RetrieveShrinkRequest extends TeaModel {
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
    public String extraShrink;

    /**
     * <p>The URLs of the images passed in the query.</p>
     */
    @NameInMap("Images")
    public String imagesShrink;

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
    public String queryHistoryShrink;

    /**
     * <p>The reranking configuration.</p>
     */
    @NameInMap("Rerank")
    public String rerankShrink;

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
    public String rewriteShrink;

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
    public String searchFiltersShrink;

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
