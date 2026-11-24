// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class QueryDisplayKnowledgeShrinkRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rag_xxx</p>
     */
    @NameInMap("RagId")
    public String ragId;

    /**
     * <p>The SKU ID for exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>sku-001</p>
     */
    @NameInMap("SkuId")
    public String skuId;

    /**
     * <p>The keyword in the SKU name.</p>
     * 
     * <strong>example:</strong>
     * <p>Product front image</p>
     */
    @NameInMap("SkuName")
    public String skuName;

    /**
     * <p>The list of record statuses. Valid values: UPDATING, EMBEDDED, and FAILED.</p>
     */
    @NameInMap("Statuses")
    public String statusesShrink;

    public static QueryDisplayKnowledgeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDisplayKnowledgeShrinkRequest self = new QueryDisplayKnowledgeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryDisplayKnowledgeShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryDisplayKnowledgeShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDisplayKnowledgeShrinkRequest setRagId(String ragId) {
        this.ragId = ragId;
        return this;
    }
    public String getRagId() {
        return this.ragId;
    }

    public QueryDisplayKnowledgeShrinkRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public QueryDisplayKnowledgeShrinkRequest setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public QueryDisplayKnowledgeShrinkRequest setStatusesShrink(String statusesShrink) {
        this.statusesShrink = statusesShrink;
        return this;
    }
    public String getStatusesShrink() {
        return this.statusesShrink;
    }

}
