// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryShopIndexShrinkRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ShopIdList")
    public String shopIdListShrink;

    public static QueryShopIndexShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShopIndexShrinkRequest self = new QueryShopIndexShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryShopIndexShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public QueryShopIndexShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

}
