// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ChangeResellerConsumeAmountRequest extends TeaModel {
    /**
     * <p>The type of the consumption amount adjustment. Valid values: increase: The consumption amount increases because new consumption occurs. decrease: The consumption amount decreases because funds are added to the account. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>increase/decrease</p>
     */
    @NameInMap("AdjustType")
    public String adjustType;

    /**
     * <p>The amount to be adjusted. Unit: CNY</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.00</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>The type of the business.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>quota_amount_adjust</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The type of the currency.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <p>The extended field of a message.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtendMap")
    public String extendMap;

    /**
     * <p>The ID of the primary key for external business. The ID is used for idempotence verification.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1647396865</p>
     */
    @NameInMap("OutBizId")
    public String outBizId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The source of the request. Specify the system name for the parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("Source")
    public String source;

    public static ChangeResellerConsumeAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResellerConsumeAmountRequest self = new ChangeResellerConsumeAmountRequest();
        return TeaModel.build(map, self);
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

    public ChangeResellerConsumeAmountRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ChangeResellerConsumeAmountRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ChangeResellerConsumeAmountRequest setExtendMap(String extendMap) {
        this.extendMap = extendMap;
        return this;
    }
    public String getExtendMap() {
        return this.extendMap;
    }

    public ChangeResellerConsumeAmountRequest setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

    public ChangeResellerConsumeAmountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChangeResellerConsumeAmountRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
