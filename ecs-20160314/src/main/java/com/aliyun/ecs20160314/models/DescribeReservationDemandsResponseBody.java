// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservationDemandsResponseBody extends TeaModel {
    @NameInMap("Data")
    public Data data;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeReservationDemandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservationDemandsResponseBody self = new DescribeReservationDemandsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservationDemandsResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public DescribeReservationDemandsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeReservationDemandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReservationDemandsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class CapacityReservations extends TeaModel {
        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MatchCriteria")
        public String matchCriteria;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CapacityReservations build(java.util.Map<String, ?> map) throws Exception {
            CapacityReservations self = new CapacityReservations();
            return TeaModel.build(map, self);
        }

        public CapacityReservations setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public CapacityReservations setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CapacityReservations setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public CapacityReservations setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public CapacityReservations setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public CapacityReservations setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CapacityReservations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CapacityReservations setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class RecommendResource extends TeaModel {
        @NameInMap("CapacityReservations")
        public java.util.List<CapacityReservations> capacityReservations;

        public static RecommendResource build(java.util.Map<String, ?> map) throws Exception {
            RecommendResource self = new RecommendResource();
            return TeaModel.build(map, self);
        }

        public RecommendResource setCapacityReservations(java.util.List<CapacityReservations> capacityReservations) {
            this.capacityReservations = capacityReservations;
            return this;
        }
        public java.util.List<CapacityReservations> getCapacityReservations() {
            return this.capacityReservations;
        }

    }

    public static class ReservationResourceCapacityReservations extends TeaModel {
        @NameInMap("ApproveCode")
        public String approveCode;

        @NameInMap("ApproveNotes")
        public String approveNotes;

        @NameInMap("InstanceAmount")
        public Integer instanceAmount;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("MatchCriteria")
        public String matchCriteria;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("PrivatePoolOptionsId")
        public String privatePoolOptionsId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ReservationResourceCapacityReservations build(java.util.Map<String, ?> map) throws Exception {
            ReservationResourceCapacityReservations self = new ReservationResourceCapacityReservations();
            return TeaModel.build(map, self);
        }

        public ReservationResourceCapacityReservations setApproveCode(String approveCode) {
            this.approveCode = approveCode;
            return this;
        }
        public String getApproveCode() {
            return this.approveCode;
        }

        public ReservationResourceCapacityReservations setApproveNotes(String approveNotes) {
            this.approveNotes = approveNotes;
            return this;
        }
        public String getApproveNotes() {
            return this.approveNotes;
        }

        public ReservationResourceCapacityReservations setInstanceAmount(Integer instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Integer getInstanceAmount() {
            return this.instanceAmount;
        }

        public ReservationResourceCapacityReservations setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ReservationResourceCapacityReservations setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public ReservationResourceCapacityReservations setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ReservationResourceCapacityReservations setPrivatePoolOptionsId(String privatePoolOptionsId) {
            this.privatePoolOptionsId = privatePoolOptionsId;
            return this;
        }
        public String getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public ReservationResourceCapacityReservations setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ReservationResourceCapacityReservations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ReservationResourceCapacityReservations setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ReservationResource extends TeaModel {
        @NameInMap("CapacityReservations")
        public java.util.List<ReservationResourceCapacityReservations> capacityReservations;

        public static ReservationResource build(java.util.Map<String, ?> map) throws Exception {
            ReservationResource self = new ReservationResource();
            return TeaModel.build(map, self);
        }

        public ReservationResource setCapacityReservations(java.util.List<ReservationResourceCapacityReservations> capacityReservations) {
            this.capacityReservations = capacityReservations;
            return this;
        }
        public java.util.List<ReservationResourceCapacityReservations> getCapacityReservations() {
            return this.capacityReservations;
        }

    }

    public static class DemandOrders extends TeaModel {
        @NameInMap("ConfirmType")
        public String confirmType;

        @NameInMap("CouponAuto")
        public String couponAuto;

        @NameInMap("CouponType")
        public String couponType;

        @NameInMap("DemandId")
        public String demandId;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceCpuCoreCount")
        public Integer instanceCpuCoreCount;

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

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("RecommendResource")
        public RecommendResource recommendResource;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ReservationResource")
        public ReservationResource reservationResource;

        @NameInMap("ReservedInstanceDescription")
        public String reservedInstanceDescription;

        @NameInMap("ReservedInstanceId")
        public String reservedInstanceId;

        @NameInMap("ReservedInstanceName")
        public String reservedInstanceName;

        @NameInMap("ReservedInstanceOfferingType")
        public String reservedInstanceOfferingType;

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

        @NameInMap("SavingPlanSpecType")
        public String savingPlanSpecType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneIds")
        public String zoneIds;

        public static DemandOrders build(java.util.Map<String, ?> map) throws Exception {
            DemandOrders self = new DemandOrders();
            return TeaModel.build(map, self);
        }

        public DemandOrders setConfirmType(String confirmType) {
            this.confirmType = confirmType;
            return this;
        }
        public String getConfirmType() {
            return this.confirmType;
        }

        public DemandOrders setCouponAuto(String couponAuto) {
            this.couponAuto = couponAuto;
            return this;
        }
        public String getCouponAuto() {
            return this.couponAuto;
        }

        public DemandOrders setCouponType(String couponType) {
            this.couponType = couponType;
            return this;
        }
        public String getCouponType() {
            return this.couponType;
        }

        public DemandOrders setDemandId(String demandId) {
            this.demandId = demandId;
            return this;
        }
        public String getDemandId() {
            return this.demandId;
        }

        public DemandOrders setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DemandOrders setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DemandOrders setInstanceCpuCoreCount(Integer instanceCpuCoreCount) {
            this.instanceCpuCoreCount = instanceCpuCoreCount;
            return this;
        }
        public Integer getInstanceCpuCoreCount() {
            return this.instanceCpuCoreCount;
        }

        public DemandOrders setInstanceTypes(String instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public String getInstanceTypes() {
            return this.instanceTypes;
        }

        public DemandOrders setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public DemandOrders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DemandOrders setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DemandOrders setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DemandOrders setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public DemandOrders setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DemandOrders setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DemandOrders setRecommendResource(RecommendResource recommendResource) {
            this.recommendResource = recommendResource;
            return this;
        }
        public RecommendResource getRecommendResource() {
            return this.recommendResource;
        }

        public DemandOrders setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DemandOrders setReservationResource(ReservationResource reservationResource) {
            this.reservationResource = reservationResource;
            return this;
        }
        public ReservationResource getReservationResource() {
            return this.reservationResource;
        }

        public DemandOrders setReservedInstanceDescription(String reservedInstanceDescription) {
            this.reservedInstanceDescription = reservedInstanceDescription;
            return this;
        }
        public String getReservedInstanceDescription() {
            return this.reservedInstanceDescription;
        }

        public DemandOrders setReservedInstanceId(String reservedInstanceId) {
            this.reservedInstanceId = reservedInstanceId;
            return this;
        }
        public String getReservedInstanceId() {
            return this.reservedInstanceId;
        }

        public DemandOrders setReservedInstanceName(String reservedInstanceName) {
            this.reservedInstanceName = reservedInstanceName;
            return this;
        }
        public String getReservedInstanceName() {
            return this.reservedInstanceName;
        }

        public DemandOrders setReservedInstanceOfferingType(String reservedInstanceOfferingType) {
            this.reservedInstanceOfferingType = reservedInstanceOfferingType;
            return this;
        }
        public String getReservedInstanceOfferingType() {
            return this.reservedInstanceOfferingType;
        }

        public DemandOrders setResourceSupplyType(String resourceSupplyType) {
            this.resourceSupplyType = resourceSupplyType;
            return this;
        }
        public String getResourceSupplyType() {
            return this.resourceSupplyType;
        }

        public DemandOrders setSavingPlanDescription(String savingPlanDescription) {
            this.savingPlanDescription = savingPlanDescription;
            return this;
        }
        public String getSavingPlanDescription() {
            return this.savingPlanDescription;
        }

        public DemandOrders setSavingPlanHourFee(Float savingPlanHourFee) {
            this.savingPlanHourFee = savingPlanHourFee;
            return this;
        }
        public Float getSavingPlanHourFee() {
            return this.savingPlanHourFee;
        }

        public DemandOrders setSavingPlanId(String savingPlanId) {
            this.savingPlanId = savingPlanId;
            return this;
        }
        public String getSavingPlanId() {
            return this.savingPlanId;
        }

        public DemandOrders setSavingPlanInstanceTypeFamilyGroup(String savingPlanInstanceTypeFamilyGroup) {
            this.savingPlanInstanceTypeFamilyGroup = savingPlanInstanceTypeFamilyGroup;
            return this;
        }
        public String getSavingPlanInstanceTypeFamilyGroup() {
            return this.savingPlanInstanceTypeFamilyGroup;
        }

        public DemandOrders setSavingPlanName(String savingPlanName) {
            this.savingPlanName = savingPlanName;
            return this;
        }
        public String getSavingPlanName() {
            return this.savingPlanName;
        }

        public DemandOrders setSavingPlanPayMode(String savingPlanPayMode) {
            this.savingPlanPayMode = savingPlanPayMode;
            return this;
        }
        public String getSavingPlanPayMode() {
            return this.savingPlanPayMode;
        }

        public DemandOrders setSavingPlanSavingType(String savingPlanSavingType) {
            this.savingPlanSavingType = savingPlanSavingType;
            return this;
        }
        public String getSavingPlanSavingType() {
            return this.savingPlanSavingType;
        }

        public DemandOrders setSavingPlanSpecType(String savingPlanSpecType) {
            this.savingPlanSpecType = savingPlanSpecType;
            return this;
        }
        public String getSavingPlanSpecType() {
            return this.savingPlanSpecType;
        }

        public DemandOrders setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DemandOrders setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DemandOrders setZoneIds(String zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }
        public String getZoneIds() {
            return this.zoneIds;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("DemandOrders")
        public java.util.List<DemandOrders> demandOrders;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setDemandOrders(java.util.List<DemandOrders> demandOrders) {
            this.demandOrders = demandOrders;
            return this;
        }
        public java.util.List<DemandOrders> getDemandOrders() {
            return this.demandOrders;
        }

    }

}
