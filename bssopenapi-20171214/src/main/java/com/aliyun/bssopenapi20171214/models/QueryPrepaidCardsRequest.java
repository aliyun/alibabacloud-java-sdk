// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPrepaidCardsRequest extends TeaModel {
    @NameInMap("EffectiveOrNot")
    public Boolean effectiveOrNot;

    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    public static QueryPrepaidCardsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPrepaidCardsRequest self = new QueryPrepaidCardsRequest();
        return TeaModel.build(map, self);
    }

    public QueryPrepaidCardsRequest setEffectiveOrNot(Boolean effectiveOrNot) {
        this.effectiveOrNot = effectiveOrNot;
        return this;
    }
    public Boolean getEffectiveOrNot() {
        return this.effectiveOrNot;
    }

    public QueryPrepaidCardsRequest setExpiryTimeEnd(String expiryTimeEnd) {
        this.expiryTimeEnd = expiryTimeEnd;
        return this;
    }
    public String getExpiryTimeEnd() {
        return this.expiryTimeEnd;
    }

    public QueryPrepaidCardsRequest setExpiryTimeStart(String expiryTimeStart) {
        this.expiryTimeStart = expiryTimeStart;
        return this;
    }
    public String getExpiryTimeStart() {
        return this.expiryTimeStart;
    }

}
