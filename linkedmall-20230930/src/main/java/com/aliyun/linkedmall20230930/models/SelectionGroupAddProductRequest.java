// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SelectionGroupAddProductRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("productIds")
    public java.util.List<String> productIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PIDxxxxx</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    public static SelectionGroupAddProductRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectionGroupAddProductRequest self = new SelectionGroupAddProductRequest();
        return TeaModel.build(map, self);
    }

    public SelectionGroupAddProductRequest setProductIds(java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    public SelectionGroupAddProductRequest setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

}
