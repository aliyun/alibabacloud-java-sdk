// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListItemActivitiesShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ItemIds")
    public String itemIdsShrink;

    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    public static ListItemActivitiesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListItemActivitiesShrinkRequest self = new ListItemActivitiesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListItemActivitiesShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListItemActivitiesShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

    public ListItemActivitiesShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

}
