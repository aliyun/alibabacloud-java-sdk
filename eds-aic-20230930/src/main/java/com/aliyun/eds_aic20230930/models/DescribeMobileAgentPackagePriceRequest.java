// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackagePriceRequest extends TeaModel {
    /**
     * <p>The number of MobileAgent packages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>The region ID for the purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The number of credits.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CreditAmount")
    public Integer creditAmount;

    /**
     * <p>The specifications of the MobileAgent package.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("MobileAgentPackageSpec")
    public String mobileAgentPackageSpec;

    /**
     * <p>The subscription duration of the purchased resource. The unit is specified by PeriodUnit. Valid value: 1 month.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The duration unit of the subscription billing method. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: Year.</li>
     * <li><strong>Month</strong> (default): Month.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the promotion.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    public static DescribeMobileAgentPackagePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileAgentPackagePriceRequest self = new DescribeMobileAgentPackagePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMobileAgentPackagePriceRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public DescribeMobileAgentPackagePriceRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public DescribeMobileAgentPackagePriceRequest setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public Integer getCreditAmount() {
        return this.creditAmount;
    }

    public DescribeMobileAgentPackagePriceRequest setMobileAgentPackageSpec(String mobileAgentPackageSpec) {
        this.mobileAgentPackageSpec = mobileAgentPackageSpec;
        return this;
    }
    public String getMobileAgentPackageSpec() {
        return this.mobileAgentPackageSpec;
    }

    public DescribeMobileAgentPackagePriceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMobileAgentPackagePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeMobileAgentPackagePriceRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
