// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryInventoryOfItemsInBizItemGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>510132</p>
     */
    @NameInMap("DivisionCode")
    public String divisionCode;

    @NameInMap("ItemIds")
    public java.util.List<Long> itemIds;

    @NameInMap("LmItemIds")
    public java.util.List<String> lmItemIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>52847******1a58205d3ce5e9328</p>
     */
    @NameInMap("SubBizId")
    public String subBizId;

    public static QueryInventoryOfItemsInBizItemGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInventoryOfItemsInBizItemGroupRequest self = new QueryInventoryOfItemsInBizItemGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryInventoryOfItemsInBizItemGroupRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryInventoryOfItemsInBizItemGroupRequest setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }
    public String getDivisionCode() {
        return this.divisionCode;
    }

    public QueryInventoryOfItemsInBizItemGroupRequest setItemIds(java.util.List<Long> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.List<Long> getItemIds() {
        return this.itemIds;
    }

    public QueryInventoryOfItemsInBizItemGroupRequest setLmItemIds(java.util.List<String> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.List<String> getLmItemIds() {
        return this.lmItemIds;
    }

    public QueryInventoryOfItemsInBizItemGroupRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

}
