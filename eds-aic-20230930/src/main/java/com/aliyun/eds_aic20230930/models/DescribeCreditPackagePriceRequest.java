// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCreditPackagePriceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("CreditAmount")
    public Integer creditAmount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PackageAmount")
    public String packageAmount;

    /**
     * <strong>example:</strong>
     * <p>3</p>
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
