// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class MemberAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("shopId")
    public String shopId;

    public static MemberAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        MemberAccountRequest self = new MemberAccountRequest();
        return TeaModel.build(map, self);
    }

    public MemberAccountRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
