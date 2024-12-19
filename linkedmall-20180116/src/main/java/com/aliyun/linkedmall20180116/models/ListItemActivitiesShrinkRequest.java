// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListItemActivitiesShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******002</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>[664148141***,663735776***]</p>
     */
    @NameInMap("ItemIds")
    public String itemIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;10000230-60716881****\&quot;,\&quot;10000021-59183191****\&quot;]</p>
     */
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
