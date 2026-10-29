// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCreditPackagePriceRequest extends TeaModel {
    /**
     * <p>The number of credits.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CreditAmount")
    public Integer creditAmount;

    /**
     * <p>The number of credit boost packages to purchase. Valid values: 1 to 99.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PackageAmount")
    public String packageAmount;

    /**
     * <p>The subscription period of the resource. The unit is specified by PeriodUnit. Valid values: 3 months, 6 months, and 1 year.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The billing time unit of the subscription Billable methods. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: year</li>
     * <li><strong>Month</strong> (default): month</li>
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

    public static DescribeCreditPackagePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditPackagePriceRequest self = new DescribeCreditPackagePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCreditPackagePriceRequest setCreditAmount(Integer creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public Integer getCreditAmount() {
        return this.creditAmount;
    }

    public DescribeCreditPackagePriceRequest setPackageAmount(String packageAmount) {
        this.packageAmount = packageAmount;
        return this;
    }
    public String getPackageAmount() {
        return this.packageAmount;
    }

    public DescribeCreditPackagePriceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeCreditPackagePriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeCreditPackagePriceRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
