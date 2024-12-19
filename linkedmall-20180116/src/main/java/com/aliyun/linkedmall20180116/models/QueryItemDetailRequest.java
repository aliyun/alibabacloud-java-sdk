// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL20201228****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>62501739****</p>
     */
    @NameInMap("ItemId")
    public Long itemId;

    /**
     * <strong>example:</strong>
     * <p>10000035-61936646****</p>
     */
    @NameInMap("LmItemId")
    public String lmItemId;

    public static QueryItemDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailRequest self = new QueryItemDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryItemDetailRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public QueryItemDetailRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

}
