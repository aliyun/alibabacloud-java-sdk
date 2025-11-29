// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class QueryKnowledgeBasesContentShrinkRequest extends TeaModel {
    /**
     * <p>The text content for retrieval.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The method used to merge multiple knowledge bases. Default value: RRF. Valid values:</p>
     * <ul>
     * <li>RRF</li>
     * <li>Weight</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RRF</p>
     */
    @NameInMap("MergeMethod")
    public String mergeMethod;

    /**
     * <p>The parameters of the merge method for each SourceCollection.</p>
     */
    @NameInMap("MergeMethodArgs")
    public String mergeMethodArgsShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The rerank factor. If you specify this parameter, the vector retrieval results are reranked once more. Valid values: 1\&lt;RerankFactor&lt;=5.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the document is segmented into sparse parts, reranking is inefficient.</p>
     * </li>
     * <li><p>We recommend that the number of reranked results (the ceiling of TopK × RerankFactor) not exceed 50.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RerankFactor")
    public Double rerankFactor;

    /**
     * <p>The information about collections to retrieve from.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceCollection")
    public String sourceCollectionShrink;

    /**
     * <p>Set the number of top results to be returned after merging results from multiple path retrieval.</p>
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
