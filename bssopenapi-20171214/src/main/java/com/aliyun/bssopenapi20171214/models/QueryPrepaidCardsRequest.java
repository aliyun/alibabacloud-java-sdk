// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPrepaidCardsRequest extends TeaModel {
    /**
     * <p>Specifies whether the prepaid card takes effect. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("EffectiveOrNot")
    public Boolean effectiveOrNot;

    /**
     * <p>The end of the expiration time of prepaid cards to query. The value must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     */
    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    /**
     * <p>The start of the expiration time of prepaid cards to query. The value must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     */
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
