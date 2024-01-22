// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryItemNextCycleRestrictionRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LmItemId")
    public java.util.List<String> lmItemId;

    @NameInMap("SubBizId")
    public String subBizId;

    public static QueryItemNextCycleRestrictionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryItemNextCycleRestrictionRequest self = new QueryItemNextCycleRestrictionRequest();
        return TeaModel.build(map, self);
    }

    public QueryItemNextCycleRestrictionRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryItemNextCycleRestrictionRequest setLmItemId(java.util.List<String> lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public java.util.List<String> getLmItemId() {
        return this.lmItemId;
    }

    public QueryItemNextCycleRestrictionRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

}
