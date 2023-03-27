// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class CreateShopShrinkRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopList")
    public String shopListShrink;

    public static CreateShopShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShopShrinkRequest self = new CreateShopShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateShopShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public CreateShopShrinkRequest setShopListShrink(String shopListShrink) {
        this.shopListShrink = shopListShrink;
        return this;
    }
    public String getShopListShrink() {
        return this.shopListShrink;
    }

}
