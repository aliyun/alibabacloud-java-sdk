// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPrepaidCardsRequest extends TeaModel {
    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    @NameInMap("EffectiveOrNot")
    public Boolean effectiveOrNot;

    public static QueryPrepaidCardsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPrepaidCardsRequest self = new QueryPrepaidCardsRequest();
        return TeaModel.build(map, self);
    }

}
