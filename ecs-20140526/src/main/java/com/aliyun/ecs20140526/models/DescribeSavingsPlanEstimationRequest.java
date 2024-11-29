// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlanEstimationRequest extends TeaModel {
    @NameInMap("EstimationResource")
    public String estimationResource;

    @NameInMap("InstanceTypeScope")
    public String instanceTypeScope;

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
    public String resourceId;

    public static DescribeSavingsPlanEstimationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlanEstimationRequest self = new DescribeSavingsPlanEstimationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlanEstimationRequest setEstimationResource(String estimationResource) {
        this.estimationResource = estimationResource;
        return this;
    }
    public String getEstimationResource() {
        return this.estimationResource;
    }

    public DescribeSavingsPlanEstimationRequest setInstanceTypeScope(String instanceTypeScope) {
        this.instanceTypeScope = instanceTypeScope;
        return this;
    }
    public String getInstanceTypeScope() {
        return this.instanceTypeScope;
    }

    public DescribeSavingsPlanEstimationRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public DescribeSavingsPlanEstimationRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeSavingsPlanEstimationRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeSavingsPlanEstimationRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public DescribeSavingsPlanEstimationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSavingsPlanEstimationRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
