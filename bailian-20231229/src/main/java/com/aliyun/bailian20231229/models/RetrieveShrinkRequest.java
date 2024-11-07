// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class RetrieveShrinkRequest extends TeaModel {
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
    public String imagesShrink;

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
    public String rerankShrink;

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
    public String rewriteShrink;

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
    public String searchFiltersShrink;

    /**
     * <p>The top K of keyword retrieval. Chunks that exactly match the keywords of the input text are retrieved from the knowledge base. This filters out irrelevant chunks and boosts accuracy. Valid values: 0 to 100. The sum of the <code>DenseSimilarityTopK</code> and <code>SparseSimilarityTopK</code> parameters must be less than or equal to 200.</p>
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
