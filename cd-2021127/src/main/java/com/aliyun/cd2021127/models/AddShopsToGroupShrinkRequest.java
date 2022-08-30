// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddShopsToGroupShrinkRequest extends TeaModel {
    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopIdList")
    public String shopIdListShrink;

    public static AddShopsToGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShopsToGroupShrinkRequest self = new AddShopsToGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddShopsToGroupShrinkRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public AddShopsToGroupShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

}
