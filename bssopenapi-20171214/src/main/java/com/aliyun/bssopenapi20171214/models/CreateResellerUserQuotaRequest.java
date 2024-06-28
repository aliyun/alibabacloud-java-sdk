// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class CreateResellerUserQuotaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>7ed0bedc-056e-4a71-9249-4581615c028f</p>
     */
    @NameInMap("OutBizId")
    public String outBizId;

    /**
     * <p>This parameter is required.</p>
     */
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
