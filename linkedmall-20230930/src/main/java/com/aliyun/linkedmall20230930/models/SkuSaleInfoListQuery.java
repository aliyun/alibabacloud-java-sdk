// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSaleInfoListQuery extends TeaModel {
    @NameInMap("distributorShopId")
    public String distributorShopId;

    @NameInMap("divisionCode")
    public String divisionCode;

    @NameInMap("skuQueryParams")
    public java.util.List<SkuQueryParam> skuQueryParams;

    public static SkuSaleInfoListQuery build(java.util.Map<String, ?> map) throws Exception {
        SkuSaleInfoListQuery self = new SkuSaleInfoListQuery();
        return TeaModel.build(map, self);
    }

    public SkuSaleInfoListQuery setDistributorShopId(String distributorShopId) {
        this.distributorShopId = distributorShopId;
        return this;
    }
    public String getDistributorShopId() {
        return this.distributorShopId;
    }

    public SkuSaleInfoListQuery setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public SkuSaleInfoListQuery setSkuQueryParams(java.util.List<SkuQueryParam> skuQueryParams) {
        this.skuQueryParams = skuQueryParams;
        return this;
    }
    public java.util.List<SkuQueryParam> getSkuQueryParams() {
        return this.skuQueryParams;
    }

}
