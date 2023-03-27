// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateShopGroupShrinkRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopGroupList")
    public String shopGroupListShrink;

    public static CreateShopGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShopGroupShrinkRequest self = new CreateShopGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateShopGroupShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateShopGroupShrinkRequest setShopGroupListShrink(String shopGroupListShrink) {
        this.shopGroupListShrink = shopGroupListShrink;
        return this;
    }
    public String getShopGroupListShrink() {
        return this.shopGroupListShrink;
    }

}
