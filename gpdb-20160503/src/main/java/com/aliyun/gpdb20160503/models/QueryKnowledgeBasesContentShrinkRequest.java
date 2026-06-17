// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryKnowledgeBasesContentShrinkRequest extends TeaModel {
    /**
     * <p>The text content to search for.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>What is ADBPG?</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to view the details of all AnalyticDB for PostgreSQL instances in a specific region, including their instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The method for merging results from multiple knowledge bases. The default value is <code>RRF</code>. Valid values:</p>
     * <ul>
     * <li><p>RRF</p>
     * </li>
     * <li><p>Weight</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("MergeMethod")
    public String mergeMethod;

    /**
     * <p>The arguments for the specified <code>MergeMethod</code>.</p>
     */
    @NameInMap("MergeMethodArgs")
    public String mergeMethodArgsShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The reranking factor. If specified, the system reranks the final merged results. Valid values: 1 &lt; RerankFactor &lt;= 5.</p>
     * <blockquote>
     * <ul>
     * <li><p>Sparse document chunking reduces reranking efficiency.</p>
     * </li>
     * <li><p>We recommend that the number of items to rerank (TopK × Factor, rounded up) does not exceed 50.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RerankFactor")
    public Double rerankFactor;

    /**
     * <p>Parameters for the rerank model applied to the final merged results.</p>
     */
    @NameInMap("RerankModel")
    public String rerankModelShrink;

    /**
     * <p>The source collections to search.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceCollection")
    public String sourceCollectionShrink;

    /**
     * <p>The number of top results to return after the results from all recall paths are merged.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopK")
    public Long topK;

    public static QueryKnowledgeBasesContentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryKnowledgeBasesContentShrinkRequest self = new QueryKnowledgeBasesContentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryKnowledgeBasesContentShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryKnowledgeBasesContentShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public QueryKnowledgeBasesContentShrinkRequest setMergeMethod(String mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }
    public String getMergeMethod() {
        return this.mergeMethod;
    }

    public QueryKnowledgeBasesContentShrinkRequest setMergeMethodArgsShrink(String mergeMethodArgsShrink) {
        this.mergeMethodArgsShrink = mergeMethodArgsShrink;
        return this;
    }
    public String getMergeMethodArgsShrink() {
        return this.mergeMethodArgsShrink;
    }

    public QueryKnowledgeBasesContentShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryKnowledgeBasesContentShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryKnowledgeBasesContentShrinkRequest setRerankFactor(Double rerankFactor) {
        this.rerankFactor = rerankFactor;
        return this;
    }
    public Double getRerankFactor() {
        return this.rerankFactor;
    }

    public QueryKnowledgeBasesContentShrinkRequest setRerankModelShrink(String rerankModelShrink) {
        this.rerankModelShrink = rerankModelShrink;
        return this;
    }
    public String getRerankModelShrink() {
        return this.rerankModelShrink;
    }

    public QueryKnowledgeBasesContentShrinkRequest setSourceCollectionShrink(String sourceCollectionShrink) {
        this.sourceCollectionShrink = sourceCollectionShrink;
        return this;
    }
    public String getSourceCollectionShrink() {
        return this.sourceCollectionShrink;
    }

    public QueryKnowledgeBasesContentShrinkRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

}
