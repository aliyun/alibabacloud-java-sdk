// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuSaleInfoListQuery extends TeaModel {
    /**
     * <p>Region code. Use a five-level administrative division code, such as a town or subdistrict code.</p>
     * 
     * <strong>example:</strong>
     * <p>330106109</p>
     */
    @NameInMap("divisionCode")
    public String divisionCode;

    /**
     * <p>Purchaser ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21000017</p>
     */
    @NameInMap("purchaserId")
    public String purchaserId;

    /**
     * <p>Product query parameters</p>
     * <blockquote>
     * <p>You can query up to 20 SKUs per request.</p>
     * </blockquote>
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
