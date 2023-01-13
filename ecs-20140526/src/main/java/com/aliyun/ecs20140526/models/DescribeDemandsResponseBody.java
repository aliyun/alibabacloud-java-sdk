// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDemandsResponseBody extends TeaModel {
    /**
     * <p>Details about the filing tickets whose regions meet the filter condition.</p>
     */
    @NameInMap("Demands")
    public DescribeDemandsResponseBodyDemands demands;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of queried filing tickets.</p>
     */
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
        /**
         * <p>The number of delivered instances.</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The end time when the filed resources are delivered and available. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("SupplyEndTime")
        public String supplyEndTime;

        /**
         * <p>The start time when the filed resources are delivered and available. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("SupplyStartTime")
        public String supplyStartTime;

        /**
         * <p>The delivery status of the filed resource. Valid values:</p>
         * <br>
         * <p>*   Delivered: The filed resource is delivered.</p>
         * <p>*   Delivering: The filed resource is being delivered.</p>
         */
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
        /**
         * <p>The number of instances available for the filed resources.</p>
         */
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        /**
         * <p>The feedback on the denied request for filing resources.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The number of instances to be delivered in the filed resources.</p>
         */
        @NameInMap("DeliveringAmount")
        public Integer deliveringAmount;

        /**
         * <p>The description of the filing ticket.</p>
         */
        @NameInMap("DemandDescription")
        public String demandDescription;

        /**
         * <p>The ID of the filing ticket.</p>
         */
        @NameInMap("DemandId")
        public String demandId;

        /**
         * <p>The name of the filing ticket.</p>
         */
        @NameInMap("DemandName")
        public String demandName;

        /**
         * <p>The status of the filing ticket or resource usage. Valid values:</p>
         * <br>
         * <p>*   Creating: The filing ticket is being created.</p>
         * <p>*   Active: The filed resources are being supplied.</p>
         * <p>*   Expired: The filing ticket expires.</p>
         * <p>*   Finished: The filed resources are consumed.</p>
         * <p>*   Refused: The filing request is denied. For reasons why the request is denied, see the `Comment` response parameter.</p>
         * <p>*   Cancelled: The filing request is canceled. After the filing request is canceled, the delivery status of the resources becomes invalid.</p>
         */
        @NameInMap("DemandStatus")
        public String demandStatus;

        /**
         * <p>The time when the filing ticket was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("DemandTime")
        public String demandTime;

        /**
         * <p>The expected end time for the purchase of the filed resources. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The billing method of the filed resources. Valid values:</p>
         * <br>
         * <p>*   Prepaid: subscription</p>
         * <p>*   Postpaid: pay-as-you-go</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance type of the filed instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The instance family of the filed instance.</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The usage duration of the filed resource.</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the usage duration of the filed resource. Valid values:</p>
         * <br>
         * <p>*   Hour</p>
         * <p>*   Day</p>
         * <p>*   Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The expected start time for the purchase of the filed resources. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>Details about the delivery status of the filed resources.</p>
         */
        @NameInMap("SupplyInfos")
        public DescribeDemandsResponseBodyDemandsDemandSupplyInfos supplyInfos;

        /**
         * <p>The amount of total instances.</p>
         */
        @NameInMap("TotalAmount")
        public Integer totalAmount;

        /**
         * <p>The amount of instances that have been used.</p>
         */
        @NameInMap("UsedAmount")
        public Integer usedAmount;

        /**
         * <p>The ID of the zone for which to query resources.</p>
         * <br>
         * <p>This parameter is empty by default. When this parameter is empty, the system returns resources that match the other criteria in all zones within the region specified by `RegionId`.</p>
         */
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
