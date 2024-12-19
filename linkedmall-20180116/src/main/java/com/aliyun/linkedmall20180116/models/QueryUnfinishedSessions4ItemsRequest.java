// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedSessions4ItemsRequest extends TeaModel {
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
    public java.util.Map<String, ?> itemIds;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;10000230-60716881****\&quot;,\&quot;10000021-59183191****\&quot;]</p>
     */
    @NameInMap("LmItemIds")
    public java.util.Map<String, ?> lmItemIds;

    /**
     * <strong>example:</strong>
     * <p>1637294220</p>
     */
    @NameInMap("QueryTime")
    public Long queryTime;

    public static QueryUnfinishedSessions4ItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedSessions4ItemsRequest self = new QueryUnfinishedSessions4ItemsRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedSessions4ItemsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryUnfinishedSessions4ItemsRequest setItemIds(java.util.Map<String, ?> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.Map<String, ?> getItemIds() {
        return this.itemIds;
    }

    public QueryUnfinishedSessions4ItemsRequest setLmItemIds(java.util.Map<String, ?> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.Map<String, ?> getLmItemIds() {
        return this.lmItemIds;
    }

    public QueryUnfinishedSessions4ItemsRequest setQueryTime(Long queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public Long getQueryTime() {
        return this.queryTime;
    }

}
