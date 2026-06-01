// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateMobileAgentPackageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <strong>example:</strong>
     * <p>10000.0</p>
     */
    @NameInMap("CreditAmount")
    public String creditAmount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CreditConfig")
    public String creditConfig;

    /**
     * <strong>example:</strong>
     * <p>CloudPhone</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("MobileAgentPackageSpec")
    public String mobileAgentPackageSpec;

    /**
     * <strong>example:</strong>
     * <p><a href="https://aim.wuying.aliyun.com/nodes">https://aim.wuying.aliyun.com/nodes</a></p>
     */
    @NameInMap("PaidCallbackUrl")
    public String paidCallbackUrl;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
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
