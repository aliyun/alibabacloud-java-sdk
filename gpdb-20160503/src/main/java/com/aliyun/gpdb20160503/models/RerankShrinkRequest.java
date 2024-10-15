// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RerankShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("Documents")
    public String documentsShrink;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxChunksPerDoc")
    public Integer maxChunksPerDoc;

    /**
     * <strong>example:</strong>
     * <p>bge-reranker-v2-m3</p>
     */
    @NameInMap("Model")
    public String model;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Query")
    public String query;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ReturnDocuments")
    public Boolean returnDocuments;

    /**
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
