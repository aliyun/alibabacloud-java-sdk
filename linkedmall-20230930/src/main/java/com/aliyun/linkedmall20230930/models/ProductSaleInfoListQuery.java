// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSaleInfoListQuery extends TeaModel {
    /**
     * <p>Area code (recommended to use a five-level township/street-level address code)</p>
     * 
     * <strong>example:</strong>
     * <p>330106109</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>Collection of product IDs to query, supporting batch queries of 1 to 10 items</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("productIds")
    public java.util.List<String> productIds;

    /**
     * <p>Purchaser ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22000009</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    public static ProductSaleInfoListQuery build(java.util.Map<String, ?> map) throws Exception {
        ProductSaleInfoListQuery self = new ProductSaleInfoListQuery();
        return TeaModel.build(map, self);
    }

    public ProductSaleInfoListQuery setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public ProductSaleInfoListQuery setProductIds(java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    public ProductSaleInfoListQuery setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

}
