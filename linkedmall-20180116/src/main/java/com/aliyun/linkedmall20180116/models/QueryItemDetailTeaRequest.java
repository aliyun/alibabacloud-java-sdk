// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemDetailTeaRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("LmItemId")
    public String lmItemId;

    public static QueryItemDetailTeaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemDetailTeaRequest self = new QueryItemDetailTeaRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemDetailTeaRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryItemDetailTeaRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public QueryItemDetailTeaRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

}
