// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessions4ItemsShrinkRequest extends TeaModel {
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
     * <p>[\&quot;60716881****\&quot;,\&quot;59183191****\&quot;]</p>
     */
    @NameInMap("ItemIds")
    public String itemIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;10000230-60716881****\&quot;,\&quot;10000021-59183191****\&quot;]</p>
     */
    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>1637294220</p>
     */
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
