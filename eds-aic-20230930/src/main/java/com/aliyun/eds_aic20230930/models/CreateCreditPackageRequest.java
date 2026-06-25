// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCreditPackageRequest extends TeaModel {
    /**
     * <p>Whether to enable auto-payment. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables auto-payment. Make sure that your account has a sufficient balance.</p>
     * </li>
     * <li><p><strong>false</strong> (Default): Creates an unpaid order.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If your account has an insufficient balance, you can set this parameter to false. This generates an unpaid order. You can then pay for the order in the Wuying Cloud Phone management console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The number of credits.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CreditAmount")
    public String creditAmount;

    /**
     * <p>The subscription duration. The PeriodUnit parameter specifies the unit for the duration.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.
     * Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong>: The period is measured in months.</p>
     * </li>
     * <li><p><strong>Year</strong>: The period is measured in years.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    public static CreateCreditPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCreditPackageRequest self = new CreateCreditPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateCreditPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateCreditPackageRequest setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public CreateCreditPackageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCreditPackageRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCreditPackageRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
