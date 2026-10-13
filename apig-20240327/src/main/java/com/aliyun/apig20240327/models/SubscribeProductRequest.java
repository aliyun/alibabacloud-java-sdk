// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SubscribeProductRequest extends TeaModel {
    /**
     * <p>The ID of the API product to subscribe to. This is the primary ID of the API product resource. You can obtain this ID from the productId field in the response of the ListProducts operation.</p>
     * 
     * <strong>example:</strong>
     * <p>product-xxxxxxxx</p>
     */
    @NameInMap("productId")
    public String productId;

    public static SubscribeProductRequest build(java.util.Map<String, ?> map) throws Exception {
        SubscribeProductRequest self = new SubscribeProductRequest();
        return TeaModel.build(map, self);
    }

    public SubscribeProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
