// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBestSession4ItemsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20211118****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>[63928655****,65314637****,65771454****]</p>
     */
    @NameInMap("ItemIds")
    public String itemIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;10000791-65975997****\&quot;]</p>
     */
    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    public static QueryBestSession4ItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBestSession4ItemsShrinkRequest self = new QueryBestSession4ItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBestSession4ItemsShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBestSession4ItemsShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

    public QueryBestSession4ItemsShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

}
