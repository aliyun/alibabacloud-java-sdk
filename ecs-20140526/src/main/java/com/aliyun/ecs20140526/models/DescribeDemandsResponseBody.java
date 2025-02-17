// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeDemandsResponseBody extends TeaModel {
    /**
     * <p>The demands in the region.</p>
     */
    @NameInMap("Demands")
    public DescribeDemandsResponseBodyDemands demands;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of queried demands.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
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
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The ID of the private pool that corresponds to the demand.</p>
         * 
         * <strong>example:</strong>
         * <p>crp-bp1fv8sbhelbzjwx****</p>
         */
        @NameInMap("PrivatePoolId")
        public String privatePoolId;

        /**
         * <p>The end of the time range during which the filed resources are delivered and available. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-03T15:00:00Z</p>
         */
        @NameInMap("SupplyEndTime")
        public String supplyEndTime;

        /**
         * <p>The beginning of the time range during which the filed resources are delivered and available. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-01T14:00:00Z</p>
         */
        @NameInMap("SupplyStartTime")
        public String supplyStartTime;

        /**
         * <p>The delivery status of the filed resource. Valid values:</p>
         * <ul>
         * <li>Delivered: The filed resource is delivered.</li>
         * <li>Delivering: The filed resource is being delivered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Delivering</p>
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
        /**
         * <p>The number of available instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvailableAmount")
        public Integer availableAmount;

        /**
         * <p>The feedback on the rejected demands.</p>
         * 
         * <strong>example:</strong>
         * <p>test-for-comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The number of instances to be delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DeliveringAmount")
        public Integer deliveringAmount;

        /**
         * <p>The description of the demand.</p>
         * 
         * <strong>example:</strong>
         * <p>test-DemandDescription</p>
         */
        @NameInMap("DemandDescription")
        public String demandDescription;

        /**
         * <p>The ID of the demand.</p>
         * 
         * <strong>example:</strong>
         * <p>ed-bp11n21kq00sl71p****</p>
         */
        @NameInMap("DemandId")
        public String demandId;

        /**
         * <p>The name of the demand.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-demand</p>
         */
        @NameInMap("DemandName")
        public String demandName;

        /**
         * <p>The status of the demand or filed resources. Valid values:</p>
         * <ul>
         * <li>Creating: The demand is being created.</li>
         * <li>Active: The filed resources are being supplied.</li>
         * <li>Expired: The demand has expired.</li>
         * <li>Finished: The filed resources are consumed.</li>
         * <li>Refused: The demand is rejected. To view the reason for rejection, see the <code>Comment</code> parameter.</li>
         * <li>Cancelled: The demand is canceled. After the demand is canceled, the delivery status of the resources becomes invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("DemandStatus")
        public String demandStatus;

        /**
         * <p>The time when the demand was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-26T12:00:00Z</p>
         */
        @NameInMap("DemandTime")
        public String demandTime;

        /**
         * <p>The expected end time for the purchase of the filed resources. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-03T15:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The billing method of the filed resources. Valid values:</p>
         * <ul>
         * <li>Prepaid: subscription.</li>
         * <li>Postpaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance type of the filed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The instance family of the filed instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The usage duration of the filed resources.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Period")
        public Integer period;

        /**
         * <p>The unit of the usage duration of the filed resources. Valid values:</p>
         * <ul>
         * <li>Hour</li>
         * <li>Day</li>
         * <li></li>
         * <li>Month</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PeriodUnit")
        public String periodUnit;

        /**
         * <p>The expected start time for the purchase of the filed resources. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-27T12:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The delivery status of the filed resources.</p>
         */
        @NameInMap("SupplyInfos")
        public DescribeDemandsResponseBodyDemandsDemandSupplyInfos supplyInfos;

        /**
         * <p>The number of filed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalAmount")
        public Integer totalAmount;

        /**
         * <p>The number of consumed instances.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("UsedAmount")
        public Integer usedAmount;

        /**
         * <p>The ID of the zone where the filed resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
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
