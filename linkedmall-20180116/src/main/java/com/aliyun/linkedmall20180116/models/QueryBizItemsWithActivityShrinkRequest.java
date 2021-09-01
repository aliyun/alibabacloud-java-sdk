// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemsWithActivityShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    @NameInMap("ItemIds")
    public String itemIdsShrink;

    public static QueryBizItemsWithActivityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemsWithActivityShrinkRequest self = new QueryBizItemsWithActivityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBizItemsWithActivityShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBizItemsWithActivityShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

    public QueryBizItemsWithActivityShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

}
