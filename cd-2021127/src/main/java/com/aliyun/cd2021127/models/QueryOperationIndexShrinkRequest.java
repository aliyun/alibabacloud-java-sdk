// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryOperationIndexShrinkRequest extends TeaModel {
    @NameInMap("ShopIdList")
    public String shopIdListShrink;

    public static QueryOperationIndexShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationIndexShrinkRequest self = new QueryOperationIndexShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperationIndexShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

}
