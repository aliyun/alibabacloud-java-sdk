// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchCreateShopShrinkRequest extends TeaModel {
    @NameInMap("ShopList")
    public String shopListShrink;

    public static BatchCreateShopShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateShopShrinkRequest self = new BatchCreateShopShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateShopShrinkRequest setShopListShrink(String shopListShrink) {
        this.shopListShrink = shopListShrink;
        return this;
    }
    public String getShopListShrink() {
        return this.shopListShrink;
    }

}
