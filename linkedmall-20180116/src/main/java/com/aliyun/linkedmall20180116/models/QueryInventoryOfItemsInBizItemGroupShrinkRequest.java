// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryInventoryOfItemsInBizItemGroupShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DivisionCode")
    public String divisionCode;

    @NameInMap("ItemIds")
    public String itemIdsShrink;

    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    @NameInMap("SubBizId")
    public String subBizId;

    public static QueryInventoryOfItemsInBizItemGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInventoryOfItemsInBizItemGroupShrinkRequest self = new QueryInventoryOfItemsInBizItemGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryInventoryOfItemsInBizItemGroupShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryInventoryOfItemsInBizItemGroupShrinkRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public QueryInventoryOfItemsInBizItemGroupShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

    public QueryInventoryOfItemsInBizItemGroupShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

    public QueryInventoryOfItemsInBizItemGroupShrinkRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

}
