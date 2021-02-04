// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResellerUserQuotaRequest extends TeaModel {
    @NameInMap("OwnerId")
    @Validation(required = true)
    public Long ownerId;

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

    public CreateResellerUserQuotaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateResellerUserQuotaRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CreateResellerUserQuotaRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateResellerUserQuotaRequest setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

}
