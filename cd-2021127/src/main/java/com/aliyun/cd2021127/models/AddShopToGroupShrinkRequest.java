// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddShopToGroupShrinkRequest extends TeaModel {
    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopIdList")
    public String shopIdListShrink;

    public static AddShopToGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShopToGroupShrinkRequest self = new AddShopToGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddShopToGroupShrinkRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public AddShopToGroupShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

}
