// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategiesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalItems")
    @Validation(required = true)
    public Integer totalItems;

    @NameInMap("TotalPages")
    @Validation(required = true)
    public Integer totalPages;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Strategies")
    @Validation(required = true)
    public DescribeGtmAccessStrategiesResponseStrategies strategies;

    public static DescribeGtmAccessStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategiesResponse self = new DescribeGtmAccessStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine extends TeaModel {
        @NameInMap("LineCode")
        @Validation(required = true)
        public String lineCode;

        @NameInMap("LineName")
        @Validation(required = true)
        public String lineName;

        @NameInMap("GroupCode")
        @Validation(required = true)
        public String groupCode;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        public static DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine self = new DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmAccessStrategiesResponseStrategiesStrategyLines extends TeaModel {
        @NameInMap("Line")
        @Validation(required = true)
        public java.util.List<DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine> line;

        public static DescribeGtmAccessStrategiesResponseStrategiesStrategyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategiesResponseStrategiesStrategyLines self = new DescribeGtmAccessStrategiesResponseStrategiesStrategyLines();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmAccessStrategiesResponseStrategiesStrategy extends TeaModel {
        @NameInMap("StrategyId")
        @Validation(required = true)
        public String strategyId;

        @NameInMap("StrategyName")
        @Validation(required = true)
        public String strategyName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimestamp")
        @Validation(required = true)
        public Long createTimestamp;

        @NameInMap("DefaultAddrPoolId")
        @Validation(required = true)
        public String defaultAddrPoolId;

        @NameInMap("DefaultAddrPoolName")
        @Validation(required = true)
        public String defaultAddrPoolName;

        @NameInMap("FailoverAddrPoolId")
        @Validation(required = true)
        public String failoverAddrPoolId;

        @NameInMap("FailoverAddrPoolName")
        @Validation(required = true)
        public String failoverAddrPoolName;

        @NameInMap("AccessMode")
        @Validation(required = true)
        public String accessMode;

        @NameInMap("AccessStatus")
        @Validation(required = true)
        public String accessStatus;

        @NameInMap("StrategyMode")
        @Validation(required = true)
        public String strategyMode;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("DefaultAddrPoolStatus")
        @Validation(required = true)
        public String defaultAddrPoolStatus;

        @NameInMap("FailoverAddrPoolStatus")
        @Validation(required = true)
        public String failoverAddrPoolStatus;

        @NameInMap("DefaultAddrPoolMonitorStatus")
        @Validation(required = true)
        public String defaultAddrPoolMonitorStatus;

        @NameInMap("FailoverAddrPoolMonitorStatus")
        @Validation(required = true)
        public String failoverAddrPoolMonitorStatus;

        @NameInMap("Lines")
        @Validation(required = true)
        public DescribeGtmAccessStrategiesResponseStrategiesStrategyLines lines;

        public static DescribeGtmAccessStrategiesResponseStrategiesStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategiesResponseStrategiesStrategy self = new DescribeGtmAccessStrategiesResponseStrategiesStrategy();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeGtmAccessStrategiesResponseStrategies extends TeaModel {
        @NameInMap("Strategy")
        @Validation(required = true)
        public java.util.List<DescribeGtmAccessStrategiesResponseStrategiesStrategy> strategy;

        public static DescribeGtmAccessStrategiesResponseStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategiesResponseStrategies self = new DescribeGtmAccessStrategiesResponseStrategies();
            return TeaModel.build(map, self);
        }

    }

}
