// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class PurchaseSavingPlanOfferingRequest extends TeaModel {
    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CommittedAmount")
    public String committedAmount;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceFamily")
    public String instanceFamily;

    @NameInMap("InstanceFamilySet")
    public String instanceFamilySet;

    @NameInMap("Name")
    public String name;

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

    @NameInMap("PurchaseMethod")
    public String purchaseMethod;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("StartTime")
    public String startTime;

    public static PurchaseSavingPlanOfferingRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseSavingPlanOfferingRequest self = new PurchaseSavingPlanOfferingRequest();
        return TeaModel.build(map, self);
    }

    public PurchaseSavingPlanOfferingRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public PurchaseSavingPlanOfferingRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PurchaseSavingPlanOfferingRequest setCommittedAmount(String committedAmount) {
        this.committedAmount = committedAmount;
        return this;
    }
    public String getCommittedAmount() {
        return this.committedAmount;
    }

    public PurchaseSavingPlanOfferingRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PurchaseSavingPlanOfferingRequest setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
        return this;
    }
    public String getInstanceFamily() {
        return this.instanceFamily;
    }

    public PurchaseSavingPlanOfferingRequest setInstanceFamilySet(String instanceFamilySet) {
        this.instanceFamilySet = instanceFamilySet;
        return this;
    }
    public String getInstanceFamilySet() {
        return this.instanceFamilySet;
    }

    public PurchaseSavingPlanOfferingRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PurchaseSavingPlanOfferingRequest setOfferingType(String offeringType) {
        this.offeringType = offeringType;
        return this;
    }
    public String getOfferingType() {
        return this.offeringType;
    }

    public PurchaseSavingPlanOfferingRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public PurchaseSavingPlanOfferingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PurchaseSavingPlanOfferingRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public PurchaseSavingPlanOfferingRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public PurchaseSavingPlanOfferingRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public PurchaseSavingPlanOfferingRequest setPurchaseMethod(String purchaseMethod) {
        this.purchaseMethod = purchaseMethod;
        return this;
    }
    public String getPurchaseMethod() {
        return this.purchaseMethod;
    }

    public PurchaseSavingPlanOfferingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PurchaseSavingPlanOfferingRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PurchaseSavingPlanOfferingRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
