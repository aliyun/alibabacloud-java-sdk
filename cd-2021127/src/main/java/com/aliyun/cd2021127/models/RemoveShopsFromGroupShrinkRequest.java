// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class RemoveShopsFromGroupShrinkRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopGroupId")
    public String shopGroupId;

    @NameInMap("ShopIdList")
    public String shopIdListShrink;

    public static RemoveShopsFromGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveShopsFromGroupShrinkRequest self = new RemoveShopsFromGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveShopsFromGroupShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public RemoveShopsFromGroupShrinkRequest setShopGroupId(String shopGroupId) {
        this.shopGroupId = shopGroupId;
        return this;
    }
    public String getShopGroupId() {
        return this.shopGroupId;
    }

    public RemoveShopsFromGroupShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

}
