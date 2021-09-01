// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemInSubBizsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("SubBizIds")
    public java.util.Map<String, ?> subBizIds;

    public static QueryItemInSubBizsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemInSubBizsRequest self = new QueryItemInSubBizsRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemInSubBizsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryItemInSubBizsRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public QueryItemInSubBizsRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public QueryItemInSubBizsRequest setSubBizIds(java.util.Map<String, ?> subBizIds) {
        this.subBizIds = subBizIds;
        return this;
    }
    public java.util.Map<String, ?> getSubBizIds() {
        return this.subBizIds;
    }

}
