// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBizItemsWithActivityShrinkRequest extends TeaModel {
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
    public String itemIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;10000230-60716881****\&quot;,\&quot;10000021-59183191****\&quot;]</p>
     */
    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    public static QueryBizItemsWithActivityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBizItemsWithActivityShrinkRequest self = new QueryBizItemsWithActivityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBizItemsWithActivityShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBizItemsWithActivityShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

    public QueryBizItemsWithActivityShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

}
