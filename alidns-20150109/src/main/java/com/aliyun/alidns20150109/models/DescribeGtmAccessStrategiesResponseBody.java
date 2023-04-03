// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategiesResponseBody extends TeaModel {
    /**
     * <p>The number of the page returned.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned list of access policies of the GTM instance.</p>
     */
    @NameInMap("Strategies")
    public DescribeGtmAccessStrategiesResponseBodyStrategies strategies;

    /**
     * <p>The total number of entries returned on all pages.</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeGtmAccessStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategiesResponseBody self = new DescribeGtmAccessStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeGtmAccessStrategiesResponseBody setStrategies(DescribeGtmAccessStrategiesResponseBodyStrategies strategies) {
        this.strategies = strategies;
        return this;
    }
    public DescribeGtmAccessStrategiesResponseBodyStrategies getStrategies() {
        return this.strategies;
    }

    public DescribeGtmAccessStrategiesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeGtmAccessStrategiesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine extends TeaModel {
        /**
         * <p>The code of the access region group.</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <p>The name of the access region group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The code for the line of the access region.</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>The name for the line of the access region.</p>
         */
        @NameInMap("LineName")
        public String lineName;

        public static DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine self = new DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
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
        /**
         * <p>The access policy. Valid values:</p>
         * <br>
         * <p>*   **AUTO**: Automatic switch</p>
         * <p>*   **DEFAULT**: Default address pool</p>
         * <p>*   **FAILOVER**: Failover address pool</p>
         */
        @NameInMap("AccessMode")
        public String accessMode;

        /**
         * <p>The access status. Valid values:</p>
         * <br>
         * <p>*   **DEFAULT**: The default address pool is currently accessed.</p>
         * <p>*   **FAILOVER**: The failover address pool is currently accessed.</p>
         */
        @NameInMap("AccessStatus")
        public String accessStatus;

        /**
         * <p>The time when the access policy was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The ID of the default address pool.</p>
         */
        @NameInMap("DefaultAddrPoolId")
        public String defaultAddrPoolId;

        /**
         * <p>Indicates whether health check was enabled for the default address pool. Valid values:</p>
         * <br>
         * <p>*   **OPEN**: Enabled</p>
         * <p>*   **CLOSE**: Disabled</p>
         * <p>*   **UNCONFIGURED**: Not configured</p>
         */
        @NameInMap("DefaultAddrPoolMonitorStatus")
        public String defaultAddrPoolMonitorStatus;

        /**
         * <p>The name of the default address pool.</p>
         */
        @NameInMap("DefaultAddrPoolName")
        public String defaultAddrPoolName;

        /**
         * <p>The availability status of the default address pool. Valid values:</p>
         * <br>
         * <p>*   **AVAILABLE**: Available</p>
         * <p>*   **NOT_AVAILABLE**: Unavailable</p>
         */
        @NameInMap("DefaultAddrPoolStatus")
        public String defaultAddrPoolStatus;

        /**
         * <p>The ID of the failover address pool.</p>
         */
        @NameInMap("FailoverAddrPoolId")
        public String failoverAddrPoolId;

        /**
         * <p>Indicates whether health check was enabled for the failover address pool.</p>
         */
        @NameInMap("FailoverAddrPoolMonitorStatus")
        public String failoverAddrPoolMonitorStatus;

        /**
         * <p>The name of the failover address pool.</p>
         */
        @NameInMap("FailoverAddrPoolName")
        public String failoverAddrPoolName;

        /**
         * <p>The availability status of the failover address pool.</p>
         */
        @NameInMap("FailoverAddrPoolStatus")
        public String failoverAddrPoolStatus;

        /**
         * <p>The ID of the GTM instance whose access policies you want to query.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The returned lines of access regions.</p>
         */
        @NameInMap("Lines")
        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategyLines lines;

        /**
         * <p>The ID of the access policy.</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <p>The mode of the access policy. **SELF_DEFINED** indicates that the access policy is user-defined.</p>
         */
        @NameInMap("StrategyMode")
        public String strategyMode;

        /**
         * <p>The name of the access policy.</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

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

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setAccessStatus(String accessStatus) {
            this.accessStatus = accessStatus;
            return this;
        }
        public String getAccessStatus() {
            return this.accessStatus;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setDefaultAddrPoolId(String defaultAddrPoolId) {
            this.defaultAddrPoolId = defaultAddrPoolId;
            return this;
        }
        public String getDefaultAddrPoolId() {
            return this.defaultAddrPoolId;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setDefaultAddrPoolMonitorStatus(String defaultAddrPoolMonitorStatus) {
            this.defaultAddrPoolMonitorStatus = defaultAddrPoolMonitorStatus;
            return this;
        }
        public String getDefaultAddrPoolMonitorStatus() {
            return this.defaultAddrPoolMonitorStatus;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setDefaultAddrPoolName(String defaultAddrPoolName) {
            this.defaultAddrPoolName = defaultAddrPoolName;
            return this;
        }
        public String getDefaultAddrPoolName() {
            return this.defaultAddrPoolName;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setDefaultAddrPoolStatus(String defaultAddrPoolStatus) {
            this.defaultAddrPoolStatus = defaultAddrPoolStatus;
            return this;
        }
        public String getDefaultAddrPoolStatus() {
            return this.defaultAddrPoolStatus;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setFailoverAddrPoolId(String failoverAddrPoolId) {
            this.failoverAddrPoolId = failoverAddrPoolId;
            return this;
        }
        public String getFailoverAddrPoolId() {
            return this.failoverAddrPoolId;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setFailoverAddrPoolMonitorStatus(String failoverAddrPoolMonitorStatus) {
            this.failoverAddrPoolMonitorStatus = failoverAddrPoolMonitorStatus;
            return this;
        }
        public String getFailoverAddrPoolMonitorStatus() {
            return this.failoverAddrPoolMonitorStatus;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setFailoverAddrPoolName(String failoverAddrPoolName) {
            this.failoverAddrPoolName = failoverAddrPoolName;
            return this;
        }
        public String getFailoverAddrPoolName() {
            return this.failoverAddrPoolName;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setFailoverAddrPoolStatus(String failoverAddrPoolStatus) {
            this.failoverAddrPoolStatus = failoverAddrPoolStatus;
            return this;
        }
        public String getFailoverAddrPoolStatus() {
            return this.failoverAddrPoolStatus;
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

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setStrategyMode(String strategyMode) {
            this.strategyMode = strategyMode;
            return this;
        }
        public String getStrategyMode() {
            return this.strategyMode;
        }

        public DescribeGtmAccessStrategiesResponseBodyStrategiesStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
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
