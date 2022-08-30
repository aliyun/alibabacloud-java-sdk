// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddShopsToGroupRequest extends TeaModel {
    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    public static AddShopsToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShopsToGroupRequest self = new AddShopsToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddShopsToGroupRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public AddShopsToGroupRequest setShopIdList(java.util.List<String> shopIdList) {
        this.shopIdList = shopIdList;
        return this;
    }
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

}
