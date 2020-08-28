// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ChangeResellerConsumeAmountRequest extends TeaModel {
    @NameInMap("AdjustType")
    @Validation(required = true)
    public String adjustType;

    @NameInMap("Amount")
    @Validation(required = true)
    public String amount;

    @NameInMap("Currency")
    @Validation(required = true)
    public String currency;

    @NameInMap("BusinessType")
    @Validation(required = true)
    public String businessType;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    @NameInMap("OutBizId")
    @Validation(required = true)
    public String outBizId;

    @NameInMap("ExtendMap")
    public String extendMap;

    public static ChangeResellerConsumeAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResellerConsumeAmountRequest self = new ChangeResellerConsumeAmountRequest();
        return TeaModel.build(map, self);
    }

}
