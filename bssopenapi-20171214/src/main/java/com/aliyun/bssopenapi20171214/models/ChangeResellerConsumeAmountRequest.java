// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ChangeResellerConsumeAmountRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("AdjustType")
    public String adjustType;

    @NameInMap("Amount")
    public String amount;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("Source")
    public String source;

    @NameInMap("OutBizId")
    public String outBizId;

    @NameInMap("ExtendMap")
    public String extendMap;

    public static ChangeResellerConsumeAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResellerConsumeAmountRequest self = new ChangeResellerConsumeAmountRequest();
        return TeaModel.build(map, self);
    }

    public ChangeResellerConsumeAmountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChangeResellerConsumeAmountRequest setAdjustType(String adjustType) {
        this.adjustType = adjustType;
        return this;
    }
    public String getAdjustType() {
        return this.adjustType;
    }

    public ChangeResellerConsumeAmountRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public ChangeResellerConsumeAmountRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ChangeResellerConsumeAmountRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ChangeResellerConsumeAmountRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ChangeResellerConsumeAmountRequest setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

    public ChangeResellerConsumeAmountRequest setExtendMap(String extendMap) {
        this.extendMap = extendMap;
        return this;
    }
    public String getExtendMap() {
        return this.extendMap;
    }

}
