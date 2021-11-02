// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddItemToSubBizsShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("SubBizIds")
    public String subBizIdsShrink;

    public static AddItemToSubBizsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddItemToSubBizsShrinkRequest self = new AddItemToSubBizsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddItemToSubBizsShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddItemToSubBizsShrinkRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public AddItemToSubBizsShrinkRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public AddItemToSubBizsShrinkRequest setSubBizIdsShrink(String subBizIdsShrink) {
        this.subBizIdsShrink = subBizIdsShrink;
        return this;
    }
    public String getSubBizIdsShrink() {
        return this.subBizIdsShrink;
    }

}
