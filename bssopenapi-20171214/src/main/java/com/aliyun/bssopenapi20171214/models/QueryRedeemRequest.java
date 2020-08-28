// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRedeemRequest extends TeaModel {
    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    @NameInMap("EffectiveOrNot")
    public Boolean effectiveOrNot;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryRedeemRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRedeemRequest self = new QueryRedeemRequest();
        return TeaModel.build(map, self);
    }

}
