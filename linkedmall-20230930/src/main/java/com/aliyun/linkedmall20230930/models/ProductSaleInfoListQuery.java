// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ProductSaleInfoListQuery extends TeaModel {
    @NameInMap("distributorShopId")
    public String distributorShopId;

    @NameInMap("divisionCode")
    public String divisionCode;

    @NameInMap("productIds")
    public java.util.List<String> productIds;

    public static ProductSaleInfoListQuery build(java.util.Map<String, ?> map) throws Exception {
        ProductSaleInfoListQuery self = new ProductSaleInfoListQuery();
        return TeaModel.build(map, self);
    }

    public ProductSaleInfoListQuery setDistributorShopId(String distributorShopId) {
        this.distributorShopId = distributorShopId;
        return this;
    }
    public String getDistributorShopId() {
        return this.distributorShopId;
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

}
