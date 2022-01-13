// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class GetShopGroupRequest extends TeaModel {
    @NameInMap("ShopGroupId")
    public String shopGroupId;

    public static GetShopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShopGroupRequest self = new GetShopGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetShopGroupRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

}
