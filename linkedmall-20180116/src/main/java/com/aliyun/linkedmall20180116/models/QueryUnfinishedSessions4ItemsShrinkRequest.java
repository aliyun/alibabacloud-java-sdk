// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessions4ItemsShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ItemIds")
    public String itemIdsShrink;

    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    @NameInMap("QueryTime")
    public Long queryTime;

    public static QueryUnfinishedSessions4ItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedSessions4ItemsShrinkRequest self = new QueryUnfinishedSessions4ItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedSessions4ItemsShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryUnfinishedSessions4ItemsShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

    public QueryUnfinishedSessions4ItemsShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

    public QueryUnfinishedSessions4ItemsShrinkRequest setQueryTime(Long queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public Long getQueryTime() {
        return this.queryTime;
    }

}
