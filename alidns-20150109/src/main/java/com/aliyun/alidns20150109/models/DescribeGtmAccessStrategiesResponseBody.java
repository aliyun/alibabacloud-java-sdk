// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategiesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Strategies")
    public DescribeGtmAccessStrategiesResponseBodyStrategies strategies;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static DescribeGtmAccessStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategiesResponseBody self = new DescribeGtmAccessStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmAccessStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmAccessStrategiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmAccessStrategiesResponseBody setStrategies(DescribeGtmAccessStrategiesResponseBodyStrategies strategies) {
        this.strategies = strategies;
        return this;
    }
    public DescribeGtmAccessStrategiesResponseBodyStrategies getStrategies() {
        return this.strategies;
    }

    public DescribeGtmAccessStrategiesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmAccessStrategiesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineName")
        public String lineName;

        @NameInMap("GroupCode")
        public String groupCode;

        public static DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine self = new DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

    public static class DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLines extends TeaModel {
        @NameInMap("Line")
        public java.util.List<DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine> line;

        public static DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLines self = new DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLines();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLines setLine(java.util.List<DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine> getLine() {
            return this.line;
        }

    }

    public static class DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy extends TeaModel {
        @NameInMap("AccessMode")
        public String accessMode;

        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("DefaultAddrPoolMonitorStatus")
        public String defaultAddrPoolMonitorStatus;

        @NameInMap("StrategyMode")
        public String strategyMode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DefaultAddrPoolStatus")
        public String defaultAddrPoolStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Lines")
        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLines lines;

        @NameInMap("FailoverAddrPoolId")
        public String failoverAddrPoolId;

        @NameInMap("DefaultAddrPoolId")
        public String defaultAddrPoolId;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("FailoverAddrPoolStatus")
        public String failoverAddrPoolStatus;

        @NameInMap("AccessStatus")
        public String accessStatus;

        @NameInMap("FailoverAddrPoolMonitorStatus")
        public String failoverAddrPoolMonitorStatus;

        @NameInMap("DefaultAddrPoolName")
        public String defaultAddrPoolName;

        @NameInMap("FailoverAddrPoolName")
        public String failoverAddrPoolName;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy self = new DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setDefaultAddrPoolMonitorStatus(String defaultAddrPoolMonitorStatus) {
            this.defaultAddrPoolMonitorStatus = defaultAddrPoolMonitorStatus;
            return this;
        }
        public String getDefaultAddrPoolMonitorStatus() {
            return this.defaultAddrPoolMonitorStatus;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setStrategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }
        public String getStrategyMode() {
            return this.strategyMode;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setDefaultAddrPoolStatus(String defaultAddrPoolStatus) {
            this.defaultAddrPoolStatus = defaultAddrPoolStatus;
            return this;
        }
        public String getDefaultAddrPoolStatus() {
            return this.defaultAddrPoolStatus;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setLines(DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLines lines) {
            this.lines = lines;
            return this;
        }
        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLines getLines() {
            return this.lines;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setFailoverAddrPoolId(String failoverAddrPoolId) {
            this.failoverAddrPoolId = failoverAddrPoolId;
            return this;
        }
        public String getFailoverAddrPoolId() {
            return this.failoverAddrPoolId;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setDefaultAddrPoolId(String defaultAddrPoolId) {
            this.defaultAddrPoolId = defaultAddrPoolId;
            return this;
        }
        public String getDefaultAddrPoolId() {
            return this.defaultAddrPoolId;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setFailoverAddrPoolStatus(String failoverAddrPoolStatus) {
            this.failoverAddrPoolStatus = failoverAddrPoolStatus;
            return this;
        }
        public String getFailoverAddrPoolStatus() {
            return this.failoverAddrPoolStatus;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setFailoverAddrPoolMonitorStatus(String failoverAddrPoolMonitorStatus) {
            this.failoverAddrPoolMonitorStatus = failoverAddrPoolMonitorStatus;
            return this;
        }
        public String getFailoverAddrPoolMonitorStatus() {
            return this.failoverAddrPoolMonitorStatus;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setDefaultAddrPoolName(String defaultAddrPoolName) {
            this.defaultAddrPoolName = defaultAddrPoolName;
            return this;
        }
        public String getDefaultAddrPoolName() {
            return this.defaultAddrPoolName;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setFailoverAddrPoolName(String failoverAddrPoolName) {
            this.failoverAddrPoolName = failoverAddrPoolName;
            return this;
        }
        public String getFailoverAddrPoolName() {
            return this.failoverAddrPoolName;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

    public static class DescribeGtmAccessStrategiesResponseBodyStrategies extends TeaModel {
        @NameInMap("Strategy")
        public java.util.List<DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy> strategy;

        public static DescribeGtmAccessStrategiesResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategiesResponseBodyStrategies self = new DescribeGtmAccessStrategiesResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategies setStrategy(java.util.List<DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy> strategy) {
            this.strategy = strategy;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy> getStrategy() {
            return this.strategy;
        }

    }

}
