// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListItemActivitiesRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LmItemIds")
    public java.util.Map<String, ?> lmItemIds;

    @NameInMap("ItemIds")
    public java.util.Map<String, ?> itemIds;

    public static ListItemActivitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListItemActivitiesRequest self = new ListItemActivitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListItemActivitiesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListItemActivitiesRequest setLmItemIds(java.util.Map<String, ?> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.Map<String, ?> getLmItemIds() {
        return this.lmItemIds;
    }

    public ListItemActivitiesRequest setItemIds(java.util.Map<String, ?> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.Map<String, ?> getItemIds() {
        return this.itemIds;
    }

}
