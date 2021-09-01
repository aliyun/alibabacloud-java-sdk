// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class AddItemToSubBizsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("SubBizIds")
    public java.util.Map<String, ?> subBizIds;

    public static AddItemToSubBizsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddItemToSubBizsRequest self = new AddItemToSubBizsRequest();
        return TeaModel.build(map, self);
    }

    public AddItemToSubBizsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public AddItemToSubBizsRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public AddItemToSubBizsRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public AddItemToSubBizsRequest setSubBizIds(java.util.Map<String, ?> subBizIds) {
        this.subBizIds = subBizIds;
        return this;
    }
    public java.util.Map<String, ?> getSubBizIds() {
        return this.subBizIds;
    }

}
