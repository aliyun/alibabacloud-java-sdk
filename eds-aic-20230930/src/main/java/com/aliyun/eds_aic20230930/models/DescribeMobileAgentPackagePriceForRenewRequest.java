// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMobileAgentPackagePriceForRenewRequest extends TeaModel {
    /**
     * <p>The IDs of the MobileAgent resource plans.</p>
     */
    @NameInMap("MobileAgentPackageIds")
    public java.util.List<String> mobileAgentPackageIds;

    /**
     * <p>The subscription period of the resource. The unit is specified by PeriodUnit. Valid values: 1 month, 2 months, 3 months, 6 months, and 1 year.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: Month.</li>
     * <li><strong>Year</strong>: Year.</li>
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

    public static DescribeMobileAgentPackagePriceForRenewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileAgentPackagePriceForRenewRequest self = new DescribeMobileAgentPackagePriceForRenewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMobileAgentPackagePriceForRenewRequest setMobileAgentPackageIds(java.util.List<String> mobileAgentPackageIds) {
        this.mobileAgentPackageIds = mobileAgentPackageIds;
        return this;
    }
    public java.util.List<String> getMobileAgentPackageIds() {
        return this.mobileAgentPackageIds;
    }

    public DescribeMobileAgentPackagePriceForRenewRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMobileAgentPackagePriceForRenewRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeMobileAgentPackagePriceForRenewRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
