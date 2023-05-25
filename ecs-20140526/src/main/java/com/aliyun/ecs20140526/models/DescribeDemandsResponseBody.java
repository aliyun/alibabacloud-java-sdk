// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDemandsResponseBody extends TeaModel {
    @NameInMap("Demands")
    public DescribeDemandsResponseBodyDemands demands;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDemandsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDemandsResponseBody self = new DescribeDemandsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDemandsResponseBody setDemands(DescribeDemandsResponseBodyDemands demands) {
        this.demands = demands;
        return this;
    }
    public DescribeDemandsResponseBodyDemands getDemands() {
        return this.demands;
    }

    public DescribeDemandsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDemandsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDemandsResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDemandsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDemandsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("PrivatePoolId")
        public String privatePoolId;

        @NameInMap("SupplyEndTime")
        public String supplyEndTime;

        @NameInMap("SupplyStartTime")
        public String supplyStartTime;

        @NameInMap("SupplyStatus")
        public String supplyStatus;

        public static DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo self = new DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo setPrivatePoolId(String privatePoolId) {
            this.privatePoolId = privatePoolId;
            return this;
        }
        public String getPrivatePoolId() {
            return this.privatePoolId;
        }

        public DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo setSupplyEndTime(String supplyEndTime) {
            this.supplyEndTime = supplyEndTime;
            return this;
        }
        public String getSupplyEndTime() {
            return this.supplyEndTime;
        }

        public DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo setSupplyStartTime(String supplyStartTime) {
            this.supplyStartTime = supplyStartTime;
            return this;
        }
        public String getSupplyStartTime() {
            return this.supplyStartTime;
        }

        public DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo setSupplyStatus(String supplyStatus) {
            this.supplyStatus = supplyStatus;
            return this;
        }
        public String getSupplyStatus() {
            return this.supplyStatus;
        }

    }

    public static class DescribeDemandsResponseBodyDemandsDemandSupplyInfos extends TeaModel {
        @NameInMap("SupplyInfo")
        public java.util.List<DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo> supplyInfo;

        public static DescribeDemandsResponseBodyDemandsDemandSupplyInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseBodyDemandsDemandSupplyInfos self = new DescribeDemandsResponseBodyDemandsDemandSupplyInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDemandsResponseBodyDemandsDemandSupplyInfos setSupplyInfo(java.util.List<DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo> supplyInfo) {
            this.supplyInfo = supplyInfo;
            return this;
        }
        public java.util.List<DescribeDemandsResponseBodyDemandsDemandSupplyInfosSupplyInfo> getSupplyInfo() {
            return this.supplyInfo;
        }

    }

    public static class DescribeDemandsResponseBodyDemandsDemand extends TeaModel {
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("DeliveringAmount")
        public Integer deliveringAmount;

        @NameInMap("DemandDescription")
        public String demandDescription;

        @NameInMap("DemandId")
        public String demandId;

        @NameInMap("DemandName")
        public String demandName;

        @NameInMap("DemandStatus")
        public String demandStatus;

        @NameInMap("DemandTime")
        public String demandTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SupplyInfos")
        public DescribeDemandsResponseBodyDemandsDemandSupplyInfos supplyInfos;

        @NameInMap("TotalAmount")
        public Integer totalAmount;

        @NameInMap("UsedAmount")
        public Integer usedAmount;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDemandsResponseBodyDemandsDemand build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseBodyDemandsDemand self = new DescribeDemandsResponseBodyDemandsDemand();
            return TeaModel.build(map, self);
        }

        public DescribeDemandsResponseBodyDemandsDemand setAvailableAmount(Integer availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        public DescribeDemandsResponseBodyDemandsDemand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeDemandsResponseBodyDemandsDemand setDeliveringAmount(Integer deliveringAmount) {
            this.deliveringAmount = deliveringAmount;
            return this;
        }
        public Integer getDeliveringAmount() {
            return this.deliveringAmount;
        }

        public DescribeDemandsResponseBodyDemandsDemand setDemandDescription(String demandDescription) {
            this.demandDescription = demandDescription;
            return this;
        }
        public String getDemandDescription() {
            return this.demandDescription;
        }

        public DescribeDemandsResponseBodyDemandsDemand setDemandId(String demandId) {
            this.demandId = demandId;
            return this;
        }
        public String getDemandId() {
            return this.demandId;
        }

        public DescribeDemandsResponseBodyDemandsDemand setDemandName(String demandName) {
            this.demandName = demandName;
            return this;
        }
        public String getDemandName() {
            return this.demandName;
        }

        public DescribeDemandsResponseBodyDemandsDemand setDemandStatus(String demandStatus) {
            this.demandStatus = demandStatus;
            return this;
        }
        public String getDemandStatus() {
            return this.demandStatus;
        }

        public DescribeDemandsResponseBodyDemandsDemand setDemandTime(String demandTime) {
            this.demandTime = demandTime;
            return this;
        }
        public String getDemandTime() {
            return this.demandTime;
        }

        public DescribeDemandsResponseBodyDemandsDemand setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDemandsResponseBodyDemandsDemand setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeDemandsResponseBodyDemandsDemand setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDemandsResponseBodyDemandsDemand setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeDemandsResponseBodyDemandsDemand setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeDemandsResponseBodyDemandsDemand setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeDemandsResponseBodyDemandsDemand setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDemandsResponseBodyDemandsDemand setSupplyInfos(DescribeDemandsResponseBodyDemandsDemandSupplyInfos supplyInfos) {
            this.supplyInfos = supplyInfos;
            return this;
        }
        public DescribeDemandsResponseBodyDemandsDemandSupplyInfos getSupplyInfos() {
            return this.supplyInfos;
        }

        public DescribeDemandsResponseBodyDemandsDemand setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        public DescribeDemandsResponseBodyDemandsDemand setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public DescribeDemandsResponseBodyDemandsDemand setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDemandsResponseBodyDemands extends TeaModel {
        @NameInMap("Demand")
        public java.util.List<DescribeDemandsResponseBodyDemandsDemand> demand;

        public static DescribeDemandsResponseBodyDemands build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseBodyDemands self = new DescribeDemandsResponseBodyDemands();
            return TeaModel.build(map, self);
        }

        public DescribeDemandsResponseBodyDemands setDemand(java.util.List<DescribeDemandsResponseBodyDemandsDemand> demand) {
            this.demand = demand;
            return this;
        }
        public java.util.List<DescribeDemandsResponseBodyDemandsDemand> getDemand() {
            return this.demand;
        }

    }

}
