// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateSavingsPlanRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("CommittedAmount")
    public String committedAmount;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("Period")
    public String period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PlanType")
    public String planType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    public static CreateSavingsPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSavingsPlanRequest self = new CreateSavingsPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateSavingsPlanRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateSavingsPlanRequest setCommittedAmount(String committedAmount) {
        this.committedAmount = committedAmount;
        return this;
    }
    public String getCommittedAmount() {
        return this.committedAmount;
    }

    public CreateSavingsPlanRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public CreateSavingsPlanRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public CreateSavingsPlanRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateSavingsPlanRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateSavingsPlanRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public CreateSavingsPlanRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSavingsPlanRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

}
