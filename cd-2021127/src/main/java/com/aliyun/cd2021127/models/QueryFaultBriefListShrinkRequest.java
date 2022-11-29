// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryFaultBriefListShrinkRequest extends TeaModel {
    @NameInMap("ShopIdList")
    public String shopIdListShrink;

    public static QueryFaultBriefListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaultBriefListShrinkRequest self = new QueryFaultBriefListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaultBriefListShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

}
