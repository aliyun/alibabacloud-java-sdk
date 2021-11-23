// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCashCouponsRequest extends TeaModel {
    @NameInMap("EffectiveOrNot")
    public Boolean effectiveOrNot;

    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    public static QueryCashCouponsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCashCouponsRequest self = new QueryCashCouponsRequest();
        return TeaModel.build(map, self);
    }

    public QueryCashCouponsRequest setEffectiveOrNot(Boolean effectiveOrNot) {
        this.effectiveOrNot = effectiveOrNot;
        return this;
    }
    public Boolean getEffectiveOrNot() {
        return this.effectiveOrNot;
    }

    public QueryCashCouponsRequest setExpiryTimeEnd(String expiryTimeEnd) {
        this.expiryTimeEnd = expiryTimeEnd;
        return this;
    }
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    public QueryCashCouponsRequest setExpiryTimeStart(String expiryTimeStart) {
        this.expiryTimeStart = expiryTimeStart;
        return this;
    }
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
    }

}
