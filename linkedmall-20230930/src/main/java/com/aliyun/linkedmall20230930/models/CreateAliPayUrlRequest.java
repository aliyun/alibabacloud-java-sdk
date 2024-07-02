// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class CreateAliPayUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("shopId")
    public String shopId;

    public static CreateAliPayUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliPayUrlRequest self = new CreateAliPayUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliPayUrlRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
