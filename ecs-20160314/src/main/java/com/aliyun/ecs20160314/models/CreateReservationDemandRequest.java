// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateReservationDemandRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConfirmType")
    public String confirmType;

    @NameInMap("CouponAuto")
    public Boolean couponAuto;

    @NameInMap("CouponType")
    public String couponType;

    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InstanceCpuCoreCount")
    public Integer instanceCpuCoreCount;

    @NameInMap("InstanceTypeFamily")
    public String instanceTypeFamily;

    @NameInMap("InstanceTypes")
    public String instanceTypes;

    @NameInMap("MatchCriteria")
    public String matchCriteria;

    @NameInMap("Name")
    public String name;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("PrivatePoolOptions")
    public java.util.List<PrivatePoolOptions> privatePoolOptions;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ReservedInstanceDescription")
    public String reservedInstanceDescription;

    @NameInMap("ReservedInstanceName")
    public String reservedInstanceName;

    @NameInMap("ReservedInstanceOfferingType")
    public String reservedInstanceOfferingType;

    @NameInMap("ReservedInstanceScope")
    public String reservedInstanceScope;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceSupplyType")
    public String resourceSupplyType;

    @NameInMap("SavingPlanDescription")
    public String savingPlanDescription;

    @NameInMap("SavingPlanHourFee")
    public Float savingPlanHourFee;

    @NameInMap("SavingPlanId")
    public String savingPlanId;

    @NameInMap("SavingPlanInstanceTypeFamilyGroup")
    public String savingPlanInstanceTypeFamilyGroup;

    @NameInMap("SavingPlanName")
    public String savingPlanName;

    @NameInMap("SavingPlanPayMode")
    public String savingPlanPayMode;

    @NameInMap("SavingPlanSavingType")
    public String savingPlanSavingType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    @NameInMap("ZoneIds")
    public String zoneIds;

    public static CreateReservationDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReservationDemandRequest self = new CreateReservationDemandRequest();
        return TeaModel.build(map, self);
    }

    public CreateReservationDemandRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateReservationDemandRequest setConfirmType(String confirmType) {
        this.confirmType = confirmType;
        return this;
    }
    public String getConfirmType() {
        return this.confirmType;
    }

    public CreateReservationDemandRequest setCouponAuto(Boolean couponAuto) {
        this.couponAuto = couponAuto;
        return this;
    }
    public Boolean getCouponAuto() {
        return this.couponAuto;
    }

    public CreateReservationDemandRequest setCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }
    public String getCouponType() {
        return this.couponType;
    }

    public CreateReservationDemandRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateReservationDemandRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateReservationDemandRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public CreateReservationDemandRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateReservationDemandRequest setInstanceCpuCoreCount(Integer instanceCpuCoreCount) {
        this.instanceCpuCoreCount = instanceCpuCoreCount;
        return this;
    }
    public Integer getInstanceCpuCoreCount() {
        return this.instanceCpuCoreCount;
    }

    public CreateReservationDemandRequest setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public CreateReservationDemandRequest setInstanceTypes(String instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public String getInstanceTypes() {
        return this.instanceTypes;
    }

    public CreateReservationDemandRequest setMatchCriteria(String matchCriteria) {
        this.matchCriteria = matchCriteria;
        return this;
    }
    public String getMatchCriteria() {
        return this.matchCriteria;
    }

    public CreateReservationDemandRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateReservationDemandRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateReservationDemandRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateReservationDemandRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreateReservationDemandRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateReservationDemandRequest setPrivatePoolOptions(java.util.List<PrivatePoolOptions> privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public java.util.List<PrivatePoolOptions> getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateReservationDemandRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public CreateReservationDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateReservationDemandRequest setReservedInstanceDescription(String reservedInstanceDescription) {
        this.reservedInstanceDescription = reservedInstanceDescription;
        return this;
    }
    public String getReservedInstanceDescription() {
        return this.reservedInstanceDescription;
    }

    public CreateReservationDemandRequest setReservedInstanceName(String reservedInstanceName) {
        this.reservedInstanceName = reservedInstanceName;
        return this;
    }
    public String getReservedInstanceName() {
        return this.reservedInstanceName;
    }

    public CreateReservationDemandRequest setReservedInstanceOfferingType(String reservedInstanceOfferingType) {
        this.reservedInstanceOfferingType = reservedInstanceOfferingType;
        return this;
    }
    public String getReservedInstanceOfferingType() {
        return this.reservedInstanceOfferingType;
    }

    public CreateReservationDemandRequest setReservedInstanceScope(String reservedInstanceScope) {
        this.reservedInstanceScope = reservedInstanceScope;
        return this;
    }
    public String getReservedInstanceScope() {
        return this.reservedInstanceScope;
    }

    public CreateReservationDemandRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateReservationDemandRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateReservationDemandRequest setResourceSupplyType(String resourceSupplyType) {
        this.resourceSupplyType = resourceSupplyType;
        return this;
    }
    public String getResourceSupplyType() {
        return this.resourceSupplyType;
    }

    public CreateReservationDemandRequest setSavingPlanDescription(String savingPlanDescription) {
        this.savingPlanDescription = savingPlanDescription;
        return this;
    }
    public String getSavingPlanDescription() {
        return this.savingPlanDescription;
    }

    public CreateReservationDemandRequest setSavingPlanHourFee(Float savingPlanHourFee) {
        this.savingPlanHourFee = savingPlanHourFee;
        return this;
    }
    public Float getSavingPlanHourFee() {
        return this.savingPlanHourFee;
    }

    public CreateReservationDemandRequest setSavingPlanId(String savingPlanId) {
        this.savingPlanId = savingPlanId;
        return this;
    }
    public String getSavingPlanId() {
        return this.savingPlanId;
    }

    public CreateReservationDemandRequest setSavingPlanInstanceTypeFamilyGroup(String savingPlanInstanceTypeFamilyGroup) {
        this.savingPlanInstanceTypeFamilyGroup = savingPlanInstanceTypeFamilyGroup;
        return this;
    }
    public String getSavingPlanInstanceTypeFamilyGroup() {
        return this.savingPlanInstanceTypeFamilyGroup;
    }

    public CreateReservationDemandRequest setSavingPlanName(String savingPlanName) {
        this.savingPlanName = savingPlanName;
        return this;
    }
    public String getSavingPlanName() {
        return this.savingPlanName;
    }

    public CreateReservationDemandRequest setSavingPlanPayMode(String savingPlanPayMode) {
        this.savingPlanPayMode = savingPlanPayMode;
        return this;
    }
    public String getSavingPlanPayMode() {
        return this.savingPlanPayMode;
    }

    public CreateReservationDemandRequest setSavingPlanSavingType(String savingPlanSavingType) {
        this.savingPlanSavingType = savingPlanSavingType;
        return this;
    }
    public String getSavingPlanSavingType() {
        return this.savingPlanSavingType;
    }

    public CreateReservationDemandRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateReservationDemandRequest setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public CreateReservationDemandRequest setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MatchCriteria")
        public String matchCriteria;

        @NameInMap("ZoneId")
        public String zoneId;

        public static PrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            PrivatePoolOptions self = new PrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public PrivatePoolOptions setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public PrivatePoolOptions setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public PrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public PrivatePoolOptions setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
