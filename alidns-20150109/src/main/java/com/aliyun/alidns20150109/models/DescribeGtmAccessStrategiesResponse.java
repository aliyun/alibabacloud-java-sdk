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

    public DescribeGtmAccessStrategiesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmAccessStrategiesResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmAccessStrategiesResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeGtmAccessStrategiesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGtmAccessStrategiesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGtmAccessStrategiesResponse setStrategies(DescribeGtmAccessStrategiesResponseStrategies strategies) {
        this.strategies = strategies;
        return this;
    }
    public DescribeGtmAccessStrategiesResponseStrategies getStrategies() {
        return this.strategies;
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

        public DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
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

        public DescribeGtmAccessStrategiesResponseStrategiesStrategyLines setLine(java.util.List<DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategiesResponseStrategiesStrategyLinesLine> getLine() {
            return this.line;
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

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setDefaultAddrPoolId(String defaultAddrPoolId) {
            this.defaultAddrPoolId = defaultAddrPoolId;
            return this;
        }
        public String getDefaultAddrPoolId() {
            return this.defaultAddrPoolId;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setDefaultAddrPoolName(String defaultAddrPoolName) {
            this.defaultAddrPoolName = defaultAddrPoolName;
            return this;
        }
        public String getDefaultAddrPoolName() {
            return this.defaultAddrPoolName;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setFailoverAddrPoolId(String failoverAddrPoolId) {
            this.failoverAddrPoolId = failoverAddrPoolId;
            return this;
        }
        public String getFailoverAddrPoolId() {
            return this.failoverAddrPoolId;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setFailoverAddrPoolName(String failoverAddrPoolName) {
            this.failoverAddrPoolName = failoverAddrPoolName;
            return this;
        }
        public String getFailoverAddrPoolName() {
            return this.failoverAddrPoolName;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setStrategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }
        public String getStrategyMode() {
            return this.strategyMode;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setDefaultAddrPoolStatus(String defaultAddrPoolStatus) {
            this.defaultAddrPoolStatus = defaultAddrPoolStatus;
            return this;
        }
        public String getDefaultAddrPoolStatus() {
            return this.defaultAddrPoolStatus;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setFailoverAddrPoolStatus(String failoverAddrPoolStatus) {
            this.failoverAddrPoolStatus = failoverAddrPoolStatus;
            return this;
        }
        public String getFailoverAddrPoolStatus() {
            return this.failoverAddrPoolStatus;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setDefaultAddrPoolMonitorStatus(String defaultAddrPoolMonitorStatus) {
            this.defaultAddrPoolMonitorStatus = defaultAddrPoolMonitorStatus;
            return this;
        }
        public String getDefaultAddrPoolMonitorStatus() {
            return this.defaultAddrPoolMonitorStatus;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setFailoverAddrPoolMonitorStatus(String failoverAddrPoolMonitorStatus) {
            this.failoverAddrPoolMonitorStatus = failoverAddrPoolMonitorStatus;
            return this;
        }
        public String getFailoverAddrPoolMonitorStatus() {
            return this.failoverAddrPoolMonitorStatus;
        }

        public DescribeGtmAccessStrategiesResponseStrategiesStrategy setLines(DescribeGtmAccessStrategiesResponseStrategiesStrategyLines lines) {
            this.lines = lines;
            return this;
        }
        public DescribeGtmAccessStrategiesResponseStrategiesStrategyLines getLines() {
            return this.lines;
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

        public DescribeGtmAccessStrategiesResponseStrategies setStrategy(java.util.List<DescribeGtmAccessStrategiesResponseStrategiesStrategy> strategy) {
            this.strategy = strategy;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategiesResponseStrategiesStrategy> getStrategy() {
            return this.strategy;
        }

    }

}
