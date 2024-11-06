// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RerankShrinkRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>List of documents to be re-ordered.</p>
     */
    @NameInMap("Documents")
    public String documentsShrink;

    /**
     * <p>Maximum number of chunks allowed when the text exceeds the model window:</p>
     * <ul>
     * <li>bge-reranker-v2-m3: default value is 10.</li>
     * <li>bge-reranker-v2-minicpm-layerwise: default value is 5:</li>
     * </ul>
     * <blockquote>
     * <p>Example of splitting</p>
     * <ul>
     * <li>If using the bge-reranker-v2-minicpm-layerwise model, the maximum single inference window is 2048 tokens. If the query is 48 tokens and the content of a single document parameter is 9000 tokens, it will be divided as follows: 1-2000 for the first, 2001-4000 for the second, and so on. If the number of splits exceeds MaxChunksPerDoc, the remaining sentences will be discarded.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxChunksPerDoc")
    public Integer maxChunksPerDoc;

    /**
     * <p>Rerank model, currently supports:</p>
     * <ul>
     * <li>bge-reranker-v2-m3: (default), better performance, supports 8192 tokens per inference, if exceeded, it will be split, which may reduce the effect.</li>
     * <li>bge-reranker-v2-minicpm-layerwise: better performance than v2-m3, supports 2048 tokens per inference, if exceeded, it will be split, which may reduce the effect.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bge-reranker-v2-m3</p>
     */
    @NameInMap("Model")
    public String model;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Query statement for Rerank.</p>
     * 
     * <strong>example:</strong>
     * <p>What is ADBPG?</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Region ID where the instance is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>If set to false, does not return the Documents text, only returns the index of the document order and the rerank score.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ReturnDocuments")
    public Boolean returnDocuments;

    /**
     * <p>Number of most relevant documents to return.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TopK")
    public Integer topK;

    public static RerankShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RerankShrinkRequest self = new RerankShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RerankShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RerankShrinkRequest setDocumentsShrink(String documentsShrink) {
        this.documentsShrink = documentsShrink;
        return this;
    }
    public String getDocumentsShrink() {
        return this.documentsShrink;
    }

    public RerankShrinkRequest setMaxChunksPerDoc(Integer maxChunksPerDoc) {
        this.maxChunksPerDoc = maxChunksPerDoc;
        return this;
    }
    public Integer getMaxChunksPerDoc() {
        return this.maxChunksPerDoc;
    }

    public RerankShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public RerankShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RerankShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public RerankShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RerankShrinkRequest setReturnDocuments(Boolean returnDocuments) {
        this.returnDocuments = returnDocuments;
        return this;
    }
    public Boolean getReturnDocuments() {
        return this.returnDocuments;
    }

    public RerankShrinkRequest setTopK(Integer topK) {
        this.topK = topK;
        return this;
    }
    public Integer getTopK() {
        return this.topK;
    }

}
