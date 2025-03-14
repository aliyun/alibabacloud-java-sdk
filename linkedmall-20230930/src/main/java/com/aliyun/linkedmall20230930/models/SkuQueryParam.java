// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class SkuQueryParam extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("buyAmount")
    public Integer buyAmount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>660460842235822080</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>660460842235822081</p>
     */
    @NameInMap("skuId")
    public String skuId;

    public static SkuQueryParam build(java.util.Map<String, ?> map) throws Exception {
        SkuQueryParam self = new SkuQueryParam();
        return TeaModel.build(map, self);
    }

    public SkuQueryParam setBuyAmount(Integer buyAmount) {
        this.buyAmount = buyAmount;
        return this;
    }
    public Integer getBuyAmount() {
        return this.buyAmount;
    }

    public SkuQueryParam setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SkuQueryParam setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

}
