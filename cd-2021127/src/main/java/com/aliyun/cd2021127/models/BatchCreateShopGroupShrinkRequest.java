// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchCreateShopGroupShrinkRequest extends TeaModel {
    // 门店组列表
    @NameInMap("ShopGroupList")
    public String shopGroupListShrink;

    public static BatchCreateShopGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateShopGroupShrinkRequest self = new BatchCreateShopGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateShopGroupShrinkRequest setShopGroupListShrink(String shopGroupListShrink) {
        this.shopGroupListShrink = shopGroupListShrink;
        return this;
    }
    public String getShopGroupListShrink() {
        return this.shopGroupListShrink;
    }

}
