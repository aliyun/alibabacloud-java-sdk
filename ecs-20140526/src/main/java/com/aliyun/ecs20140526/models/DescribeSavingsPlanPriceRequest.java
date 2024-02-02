// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlanPriceRequest extends TeaModel {
    @NameInMap("CommittedAmount")
    public String committedAmount;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PlanType")
    public String planType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    public static DescribeSavingsPlanPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlanPriceRequest self = new DescribeSavingsPlanPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlanPriceRequest setCommittedAmount(String committedAmount) {
        this.committedAmount = committedAmount;
        return this;
    }
    public String getCommittedAmount() {
        return this.committedAmount;
    }

    public DescribeSavingsPlanPriceRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeSavingsPlanPriceRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public DescribeSavingsPlanPriceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeSavingsPlanPriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeSavingsPlanPriceRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public DescribeSavingsPlanPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSavingsPlanPriceRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

}
