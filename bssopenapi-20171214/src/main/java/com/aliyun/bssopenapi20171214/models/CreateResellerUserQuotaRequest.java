// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResellerUserQuotaRequest extends TeaModel {
    @NameInMap("Amount")
    public String amount;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("OutBizId")
    public String outBizId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static CreateResellerUserQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResellerUserQuotaRequest self = new CreateResellerUserQuotaRequest();
        return TeaModel.build(map, self);
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

    public CreateResellerUserQuotaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
