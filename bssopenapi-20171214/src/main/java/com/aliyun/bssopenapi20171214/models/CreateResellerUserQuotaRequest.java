// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResellerUserQuotaRequest extends TeaModel {
    /**
     * <p>The amount. Unit: CNY. This parameter is required if you create a quota account.</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>The name of the currency.</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>The ID of business in an external system.</p>
     */
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
