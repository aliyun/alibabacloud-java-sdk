// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlanEstimationResponseBody extends TeaModel {
    @NameInMap("CommittedAmount")
    public String committedAmount;

    @NameInMap("Currency")
    public String currency;

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

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceId")
    public String resourceId;

    public static DescribeSavingsPlanEstimationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlanEstimationResponseBody self = new DescribeSavingsPlanEstimationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlanEstimationResponseBody setCommittedAmount(String committedAmount) {
        this.committedAmount = committedAmount;
        return this;
    }
    public String getCommittedAmount() {
        return this.committedAmount;
    }

    public DescribeSavingsPlanEstimationResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public DescribeSavingsPlanEstimationResponseBody setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public DescribeSavingsPlanEstimationResponseBody setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public DescribeSavingsPlanEstimationResponseBody setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeSavingsPlanEstimationResponseBody setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeSavingsPlanEstimationResponseBody setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public DescribeSavingsPlanEstimationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSavingsPlanEstimationResponseBody setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
