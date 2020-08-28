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

    }

    public static class DescribeDemandsResponseDemandsDemandSupplyInfos extends TeaModel {
        @NameInMap("SupplyInfo")
        @Validation(required = true)
        public java.util.List<DescribeDemandsResponseDemandsDemandSupplyInfosSupplyInfo> supplyInfo;

        public static DescribeDemandsResponseDemandsDemandSupplyInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseDemandsDemandSupplyInfos self = new DescribeDemandsResponseDemandsDemandSupplyInfos();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeDemandsResponseDemands extends TeaModel {
        @NameInMap("Demand")
        @Validation(required = true)
        public java.util.List<DescribeDemandsResponseDemandsDemand> demand;

        public static DescribeDemandsResponseDemands build(java.util.Map<String, ?> map) throws Exception {
            DescribeDemandsResponseDemands self = new DescribeDemandsResponseDemands();
            return TeaModel.build(map, self);
        }

    }

}
