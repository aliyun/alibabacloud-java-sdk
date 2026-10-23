// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackagePriceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CreditAmount")
    public Integer creditAmount;

    /**
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("MobileAgentPackageSpec")
    public String mobileAgentPackageSpec;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public String period;

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
