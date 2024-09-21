// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class IsCompletedRequest extends TeaModel {
    /**
     * <p>The enterprise code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>C-20080808-1</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The product id.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("productId")
    public Long productId;

    /**
     * <p>Product type: 1 indicates that the carbon footprint of the product is requested, and 5 indicates that the carbon footprint of the supply chain is requested.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("productType")
    public Long productType;

    public static IsCompletedRequest build(java.util.Map<String, ?> map) throws Exception {
        IsCompletedRequest self = new IsCompletedRequest();
        return TeaModel.build(map, self);
    }

    public IsCompletedRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IsCompletedRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public IsCompletedRequest setProductType(Long productType) {
        this.productType = productType;
        return this;
    }
    public Long getProductType() {
        return this.productType;
    }

}
