// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemsWithActivityRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL201903220001</p>
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

    public static QueryBizItemsWithActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemsWithActivityRequest self = new QueryBizItemsWithActivityRequest();
        return TeaModel.build(map, self);
    }

    public QueryBizItemsWithActivityRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBizItemsWithActivityRequest setItemIds(java.util.Map<String, ?> itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public java.util.Map<String, ?> getItemIds() {
        return this.itemIds;
    }

    public QueryBizItemsWithActivityRequest setLmItemIds(java.util.Map<String, ?> lmItemIds) {
        this.lmItemIds = lmItemIds;
        return this;
    }
    public java.util.Map<String, ?> getLmItemIds() {
        return this.lmItemIds;
    }

}
