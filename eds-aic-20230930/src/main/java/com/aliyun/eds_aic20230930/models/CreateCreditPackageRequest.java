// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCreditPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payment. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong> (default): generates an order without charging your account.</li>
     * </ul>
     * <blockquote>
     * <p>If your payment method has an insufficient balance, set this parameter to false. An unpaid order is generated, and you can log on to the Elastic Cloud Phone console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ChannelCookie")
    public String channelCookie;

    /**
     * <p>The number of credits.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CreditAmount")
    public String creditAmount;

    @NameInMap("PackageAmount")
    public String packageAmount;

    /**
     * <p>The duration for which you want to purchase the resource. The unit is specified by PeriodUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the duration for which you want to purchase the resource.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: month.</li>
     * <li><strong>Year</strong>: year.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the promotional campaign.</p>
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

    public CreateCreditPackageRequest setChannelCookie(String channelCookie) {
        this.channelCookie = channelCookie;
        return this;
    }
    public String getChannelCookie() {
        return this.channelCookie;
    }

    public CreateCreditPackageRequest setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public CreateCreditPackageRequest setPackageAmount(String packageAmount) {
        this.packageAmount = packageAmount;
        return this;
    }
    public String getPackageAmount() {
        return this.packageAmount;
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
