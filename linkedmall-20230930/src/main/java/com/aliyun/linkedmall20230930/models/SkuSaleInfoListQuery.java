// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSaleInfoListQuery extends TeaModel {
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("skuQueryParams")
    public java.util.List<SkuQueryParam> skuQueryParams;

    public static SkuSaleInfoListQuery build(java.util.Map<String, ?> map) throws Exception {
        SkuSaleInfoListQuery self = new SkuSaleInfoListQuery();
        return TeaModel.build(map, self);
    }

    public SkuSaleInfoListQuery setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public SkuSaleInfoListQuery setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId;
        return this;
    }
    public String getPurchaserId() {
        return this.purchaserId;
    }

    public SkuSaleInfoListQuery setSkuQueryParams(java.util.List<SkuQueryParam> skuQueryParams) {
        this.skuQueryParams = skuQueryParams;
        return this;
    }
    public java.util.List<SkuQueryParam> getSkuQueryParams() {
        return this.skuQueryParams;
    }

}
