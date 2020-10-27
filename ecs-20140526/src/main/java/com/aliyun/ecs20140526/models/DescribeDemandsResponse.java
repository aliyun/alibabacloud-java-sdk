// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDemandsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Demands")
    @Validation(required = true)
    public DescribeDemandsResponseDemands demands;

    public static DescribeDemandsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDemandsResponse self = new DescribeDemandsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDemandsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDemandsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDemandsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDemandsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDemandsResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDemandsResponse setDemands(DescribeDemandsResponseDemands demands) {
        this.demands = demands;
        return this;
    }
    public DescribeDemandsResponseDemands getDemands() {
        return this.demands;
    }

    public static class DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo extends TeaModel {
        @NameInMap("Amount")
        @Validation(required = true)
        public Integer amount;

        @NameInMap("SupplyStatus")
        @Validation(required = true)
        public String supplyStatus;

        @NameInMap("SupplyStartTime")
        @Validation(required = true)
        public String supplyStartTime;

        @NameInMap("SupplyEndTime")
        @Validation(required = true)
        public String supplyEndTime;

        public static DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo self = new DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo setSupplyStatus(String supplyStatus) {
            this.supplyStatus = supplyStatus;
            return this;
        }
        public String getSupplyStatus() {
            return this.supplyStatus;
        }

        public DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo setSupplyStartTime(String supplyStartTime) {
            this.supplyStartTime = supplyStartTime;
            return this;
        }
        public String getSupplyStartTime() {
            return this.supplyStartTime;
        }

        public DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo setSupplyEndTime(String supplyEndTime) {
            this.supplyEndTime = supplyEndTime;
            return this;
        }
        public String getSupplyEndTime() {
            return this.supplyEndTime;
        }

    }

    public static class DescribeDemandsResponseDemandsDemandSupplyInfos extends TeaModel {
        @NameInMap("SupplyInfo")
        @Validation(required = true)
        public java.util.List<DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo> supplyInfo;

        public static DescribeDemandsResponseDemandsDemandSupplyInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseDemandsDemandSupplyInfos self = new DescribeDemandsResponseDemandsDemandSupplyInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDemandsResponseDemandsDemandSupplyInfos setSupplyInfo(java.util.List<DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo> supplyInfo) {
            this.supplyInfo = supplyInfo;
            return this;
        }
        public java.util.List<DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo> getSupplyInfo() {
            return this.supplyInfo;
        }

    }

    public static class DescribeDemandsResponseDemandsDemand extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("DemandTime")
        @Validation(required = true)
        public String demandTime;

        @NameInMap("InstanceTypeFamily")
        @Validation(required = true)
        public String instanceTypeFamily;

        @NameInMap("DemandId")
        @Validation(required = true)
        public String demandId;

        @NameInMap("DemandName")
        @Validation(required = true)
        public String demandName;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("DemandDescription")
        @Validation(required = true)
        public String demandDescription;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("Period")
        @Validation(required = true)
        public Integer period;

        @NameInMap("PeriodUnit")
        @Validation(required = true)
        public String periodUnit;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("DemandStatus")
        @Validation(required = true)
        public String demandStatus;

        @NameInMap("TotalAmount")
        @Validation(required = true)
        public Integer totalAmount;

        @NameInMap("AvailableAmount")
        @Validation(required = true)
        public Integer availableAmount;

        @NameInMap("UsedAmount")
        @Validation(required = true)
        public Integer usedAmount;

        @NameInMap("DeliveringAmount")
        @Validation(required = true)
        public Integer deliveringAmount;

        @NameInMap("SupplyInfos")
        @Validation(required = true)
        public DescribeDemandsResponseDemandsDemandSupplyInfos supplyInfos;

        public static DescribeDemandsResponseDemandsDemand build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseDemandsDemand self = new DescribeDemandsResponseDemandsDemand();
            return TeaModel.build(map, self);
        }

        public DescribeDemandsResponseDemandsDemand setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDemandsResponseDemandsDemand setDemandTime(String demandTime) {
            this.demandTime = demandTime;
            return this;
        }
        public String getDemandTime() {
            return this.demandTime;
        }

        public DescribeDemandsResponseDemandsDemand setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeDemandsResponseDemandsDemand setDemandId(String demandId) {
            this.demandId = demandId;
            return this;
        }
        public String getDemandId() {
            return this.demandId;
        }

        public DescribeDemandsResponseDemandsDemand setDemandName(String demandName) {
            this.demandName = demandName;
            return this;
        }
        public String getDemandName() {
            return this.demandName;
        }

        public DescribeDemandsResponseDemandsDemand setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeDemandsResponseDemandsDemand setDemandDescription(String demandDescription) {
            this.demandDescription = demandDescription;
            return this;
        }
        public String getDemandDescription() {
            return this.demandDescription;
        }

        public DescribeDemandsResponseDemandsDemand setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeDemandsResponseDemandsDemand setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeDemandsResponseDemandsDemand setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeDemandsResponseDemandsDemand setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DescribeDemandsResponseDemandsDemand setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDemandsResponseDemandsDemand setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDemandsResponseDemandsDemand setDemandStatus(String demandStatus) {
            this.demandStatus = demandStatus;
            return this;
        }
        public String getDemandStatus() {
            return this.demandStatus;
        }

        public DescribeDemandsResponseDemandsDemand setTotalAmount(Integer totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public Integer getTotalAmount() {
            return this.totalAmount;
        }

        public DescribeDemandsResponseDemandsDemand setAvailableAmount(Integer availableAmount) {
            this.availableAmount = availableAmount;
            return this;
        }
        public Integer getAvailableAmount() {
            return this.availableAmount;
        }

        public DescribeDemandsResponseDemandsDemand setUsedAmount(Integer usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Integer getUsedAmount() {
            return this.usedAmount;
        }

        public DescribeDemandsResponseDemandsDemand setDeliveringAmount(Integer deliveringAmount) {
            this.deliveringAmount = deliveringAmount;
            return this;
        }
        public Integer getDeliveringAmount() {
            return this.deliveringAmount;
        }

        public DescribeDemandsResponseDemandsDemand setSupplyInfos(DescribeDemandsResponseDemandsDemandSupplyInfos supplyInfos) {
            this.supplyInfos = supplyInfos;
            return this;
        }
        public DescribeDemandsResponseDemandsDemandSupplyInfos getSupplyInfos() {
            return this.supplyInfos;
        }

    }

    public static class DescribeDemandsResponseDemands extends TeaModel {
        @NameInMap("Demand")
        @Validation(required = true)
        public java.util.List<DescribeDemandsResponseDemandsDemand> demand;

        public static DescribeDemandsResponseDemands build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseDemands self = new DescribeDemandsResponseDemands();
            return TeaModel.build(map, self);
        }

        public DescribeDemandsResponseDemands setDemand(java.util.List<DescribeDemandsResponseDemandsDemand> demand) {
            this.demand = demand;
            return this;
        }
        public java.util.List<DescribeDemandsResponseDemandsDemand> getDemand() {
            return this.demand;
        }

    }

}
