// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSaleInfoListQuery extends TeaModel {
    @NameInMap("divisionCode")
    public String divisionCode;

    @NameInMap("productIds")
    public java.util.List<String> productIds;

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
