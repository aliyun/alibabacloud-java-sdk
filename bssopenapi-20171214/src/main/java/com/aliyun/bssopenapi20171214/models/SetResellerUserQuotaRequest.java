// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserQuotaRequest extends TeaModel {
    @NameInMap("Amount")
    @Validation(required = true)
    public String amount;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("OutBizId")
    public String outBizId;

    public static SetResellerUserQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserQuotaRequest self = new SetResellerUserQuotaRequest();
        return TeaModel.build(map, self);
    }

}
