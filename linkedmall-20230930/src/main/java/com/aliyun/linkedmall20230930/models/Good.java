// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class Good extends TeaModel {
    @NameInMap("goodName")
    public String goodName;

    @NameInMap("productId")
    public String productId;

    @NameInMap("quantity")
    public Integer quantity;

    public static Good build(java.util.Map<String, ?> map) throws Exception {
        Good self = new Good();
        return TeaModel.build(map, self);
    }

    public Good setGoodName(String goodName) {
        this.goodName = goodName;
        return this;
    }
    public String getGoodName() {
        return this.goodName;
    }

    public Good setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public Good setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    public Integer getQuantity() {
        return this.quantity;
    }

}
