// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemNextCycleRestrictionShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LmItemId")
    public String lmItemIdShrink;

    @NameInMap("SubBizId")
    public String subBizId;

    public static QueryItemNextCycleRestrictionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemNextCycleRestrictionShrinkRequest self = new QueryItemNextCycleRestrictionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemNextCycleRestrictionShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryItemNextCycleRestrictionShrinkRequest setLmItemIdShrink(String lmItemIdShrink) {
        this.lmItemIdShrink = lmItemIdShrink;
        return this;
    }
    public String getLmItemIdShrink() {
        return this.lmItemIdShrink;
    }

    public QueryItemNextCycleRestrictionShrinkRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

}
