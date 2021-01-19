// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListItemActivitiesShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    @NameInMap("ItemIds")
    public String itemIdsShrink;

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

    public ListItemActivitiesShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

    public ListItemActivitiesShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

}
