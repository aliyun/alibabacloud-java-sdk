// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResellerUserQuotaRequest extends TeaModel {
    @NameInMap("Amount")
    @Validation(required = true)
    public String amount;

    @NameInMap("Currency")
    @Validation(required = true)
    public String currency;

    @NameInMap("OutBizId")
    public String outBizId;

    public static CreateResellerUserQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResellerUserQuotaRequest self = new CreateResellerUserQuotaRequest();
        return TeaModel.build(map, self);
    }

}
