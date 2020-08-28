// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCashCouponsRequest extends TeaModel {
    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    @NameInMap("EffectiveOrNot")
    public Boolean effectiveOrNot;

    public static QueryCashCouponsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCashCouponsRequest self = new QueryCashCouponsRequest();
        return TeaModel.build(map, self);
    }

}
