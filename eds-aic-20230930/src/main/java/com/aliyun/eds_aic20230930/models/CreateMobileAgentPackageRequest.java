// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateMobileAgentPackageRequest extends TeaModel {
    /**
     * <p>The number of packages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>Specifies whether to enable auto-payment. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables auto-payment. You must ensure that your account balance is sufficient.</p>
     * </li>
     * <li><p><strong>false</strong> (default): An unpaid order is generated. Your account is not charged.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If your account balance is insufficient, you can set this parameter to <code>false</code> to generate an unpaid order. Then, you can log in to the Wuying Cloud Phone management console to pay for the order.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Disables auto-renewal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The region where the instance is located. Currently, only <code>cn-hangzhou</code> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The credit amount.</p>
     * 
     * <strong>example:</strong>
     * <p>10000.0</p>
     */
    @NameInMap("CreditAmount")
    public String creditAmount;

    /**
     * <p>The credit limit configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CreditConfig")
    public String creditConfig;

    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudPhone</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The package specification.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("MobileAgentPackageSpec")
    public String mobileAgentPackageSpec;

    @NameInMap("PackageSpecId")
    public Long packageSpecId;

    /**
     * <p>The callback URL to which the user is redirected after a successful payment.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aim.wuying.aliyun.com/nodes">https://aim.wuying.aliyun.com/nodes</a></p>
     */
    @NameInMap("PaidCallbackUrl")
    public String paidCallbackUrl;

    /**
     * <p>The subscription period. The unit of the period is specified by the <code>PeriodUnit</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription period.
     * Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong></p>
     * </li>
     * <li><p><strong>Year</strong></p>
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

    public static CreateMobileAgentPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMobileAgentPackageRequest self = new CreateMobileAgentPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateMobileAgentPackageRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CreateMobileAgentPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateMobileAgentPackageRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateMobileAgentPackageRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateMobileAgentPackageRequest setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public CreateMobileAgentPackageRequest setCreditConfig(String creditConfig) {
        this.creditConfig = creditConfig;
        return this;
    }
    public String getCreditConfig() {
        return this.creditConfig;
    }

    public CreateMobileAgentPackageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateMobileAgentPackageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateMobileAgentPackageRequest setMobileAgentPackageSpec(String mobileAgentPackageSpec) {
        this.mobileAgentPackageSpec = mobileAgentPackageSpec;
        return this;
    }
    public String getMobileAgentPackageSpec() {
        return this.mobileAgentPackageSpec;
    }

    public CreateMobileAgentPackageRequest setPackageSpecId(Long packageSpecId) {
        this.packageSpecId = packageSpecId;
        return this;
    }
    public Long getPackageSpecId() {
        return this.packageSpecId;
    }

    public CreateMobileAgentPackageRequest setPaidCallbackUrl(String paidCallbackUrl) {
        this.paidCallbackUrl = paidCallbackUrl;
        return this;
    }
    public String getPaidCallbackUrl() {
        return this.paidCallbackUrl;
    }

    public CreateMobileAgentPackageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateMobileAgentPackageRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateMobileAgentPackageRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
