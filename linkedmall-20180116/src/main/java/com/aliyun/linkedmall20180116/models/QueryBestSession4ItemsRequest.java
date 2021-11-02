// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBestSession4ItemsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ItemIds")
    public java.util.Map<String, ?> itemIds;

    @NameInMap("LmItemIds")
    public java.util.Map<String, ?> lmItemIds;

    public static QueryBestSession4ItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBestSession4ItemsRequest self = new QueryBestSession4ItemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryBestSession4ItemsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBestSession4ItemsRequest setItemIds(java.util.Map<String, ?> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.Map<String, ?> getItemIds() {
        return this.itemIds;
    }

    public QueryBestSession4ItemsRequest setLmItemIds(java.util.Map<String, ?> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.Map<String, ?> getLmItemIds() {
        return this.lmItemIds;
    }

}
