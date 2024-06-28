// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserQuotaRequest extends TeaModel {
    /**
     * <p>The quota of a quota ledger. Unit: CNY.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>750</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>You do not need to set the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>The ID of the business.</p>
     * 
     * <strong>example:</strong>
     * <p>OD2022040818295234777795624764689</p>
     */
    @NameInMap("OutBizId")
    public String outBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetResellerUserQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserQuotaRequest self = new SetResellerUserQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetResellerUserQuotaRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public SetResellerUserQuotaRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SetResellerUserQuotaRequest setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

    public SetResellerUserQuotaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
