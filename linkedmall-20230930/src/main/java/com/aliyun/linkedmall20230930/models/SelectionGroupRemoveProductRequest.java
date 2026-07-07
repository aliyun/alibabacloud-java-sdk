// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SelectionGroupRemoveProductRequest extends TeaModel {
    /**
     * <p>A list of IDs for the products to be removed from stock.</p>
     * <blockquote>
     * <ul>
     * <li>A single call supports a maximum of 30 products.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("productIds")
    public java.util.List<String> productIds;

    /**
     * <p>The ID of the purchaser.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PIDxxxxx</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    public static SelectionGroupRemoveProductRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectionGroupRemoveProductRequest self = new SelectionGroupRemoveProductRequest();
        return TeaModel.build(map, self);
    }

    public SelectionGroupRemoveProductRequest setProductIds(java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    public SelectionGroupRemoveProductRequest setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

}
