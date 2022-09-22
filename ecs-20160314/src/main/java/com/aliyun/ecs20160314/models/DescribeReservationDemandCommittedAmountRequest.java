// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservationDemandCommittedAmountRequest extends TeaModel {
    @NameInMap("DemandPlan")
    public java.util.List<DemandPlan> demandPlan;

    @NameInMap("InstanceFamily")
    public String instanceFamily;

    @NameInMap("InstanceFamilySet")
    public String instanceFamilySet;

    @NameInMap("OfferingType")
    public String offeringType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PlanType")
    public String planType;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("PurchaseMethod")
    public String purchaseMethod;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static DescribeReservationDemandCommittedAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservationDemandCommittedAmountRequest self = new DescribeReservationDemandCommittedAmountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReservationDemandCommittedAmountRequest setDemandPlan(java.util.List<DemandPlan> demandPlan) {
        this.demandPlan = demandPlan;
        return this;
    }
    public java.util.List<DemandPlan> getDemandPlan() {
        return this.demandPlan;
    }

    public DescribeReservationDemandCommittedAmountRequest setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
        return this;
    }
    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    public DescribeReservationDemandCommittedAmountRequest setInstanceFamilySet(String instanceFamilySet) {
        this.instanceFamilySet = instanceFamilySet;
        return this;
    }
    public String getInstanceFamilySet() {
        return this.instanceFamilySet;
    }

    public DescribeReservationDemandCommittedAmountRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public DescribeReservationDemandCommittedAmountRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeReservationDemandCommittedAmountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeReservationDemandCommittedAmountRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeReservationDemandCommittedAmountRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeReservationDemandCommittedAmountRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public DescribeReservationDemandCommittedAmountRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DescribeReservationDemandCommittedAmountRequest setPurchaseMethod(String purchaseMethod) {
        this.purchaseMethod = purchaseMethod;
        return this;
    }
    public String getPurchaseMethod() {
        return this.purchaseMethod;
    }

    public DescribeReservationDemandCommittedAmountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeReservationDemandCommittedAmountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static class DemandPlan extends TeaModel {
        @NameInMap("Amount")
        public Long amount;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DemandPlan build(java.util.Map<String, ?> map) throws Exception {
            DemandPlan self = new DemandPlan();
            return TeaModel.build(map, self);
        }

        public DemandPlan setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public DemandPlan setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
