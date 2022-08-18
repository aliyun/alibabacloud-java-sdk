// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyResponseBody extends TeaModel {
    @NameInMap("AccessMode")
    public String accessMode;

    @NameInMap("AccessStatus")
    public String accessStatus;

    @NameInMap("DefaultAddrPoolMonitorStatus")
    public String defaultAddrPoolMonitorStatus;

    @NameInMap("DefaultAddrPoolName")
    public String defaultAddrPoolName;

    @NameInMap("DefaultAddrPoolStatus")
    public String defaultAddrPoolStatus;

    @NameInMap("DefultAddrPoolId")
    public String defultAddrPoolId;

    @NameInMap("FailoverAddrPoolId")
    public String failoverAddrPoolId;

    @NameInMap("FailoverAddrPoolMonitorStatus")
    public String failoverAddrPoolMonitorStatus;

    @NameInMap("FailoverAddrPoolName")
    public String failoverAddrPoolName;

    @NameInMap("FailoverAddrPoolStatus")
    public String failoverAddrPoolStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lines")
    public DescribeGtmAccessStrategyResponseBodyLines lines;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StrategyId")
    public String strategyId;

    @NameInMap("StrategyMode")
    public String strategyMode;

    @NameInMap("StrategyName")
    public String strategyName;

    public static DescribeGtmAccessStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyResponseBody self = new DescribeGtmAccessStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategyResponseBody setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public DescribeGtmAccessStrategyResponseBody setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }
    public String getAccessStatus() {
        return this.accessStatus;
    }

    public DescribeGtmAccessStrategyResponseBody setDefaultAddrPoolMonitorStatus(String defaultAddrPoolMonitorStatus) {
        this.defaultAddrPoolMonitorStatus = defaultAddrPoolMonitorStatus;
        return this;
    }
    public String getDefaultAddrPoolMonitorStatus() {
        return this.defaultAddrPoolMonitorStatus;
    }

    public DescribeGtmAccessStrategyResponseBody setDefaultAddrPoolName(String defaultAddrPoolName) {
        this.defaultAddrPoolName = defaultAddrPoolName;
        return this;
    }
    public String getDefaultAddrPoolName() {
        return this.defaultAddrPoolName;
    }

    public DescribeGtmAccessStrategyResponseBody setDefaultAddrPoolStatus(String defaultAddrPoolStatus) {
        this.defaultAddrPoolStatus = defaultAddrPoolStatus;
        return this;
    }
    public String getDefaultAddrPoolStatus() {
        return this.defaultAddrPoolStatus;
    }

    public DescribeGtmAccessStrategyResponseBody setDefultAddrPoolId(String defultAddrPoolId) {
        this.defultAddrPoolId = defultAddrPoolId;
        return this;
    }
    public String getDefultAddrPoolId() {
        return this.defultAddrPoolId;
    }

    public DescribeGtmAccessStrategyResponseBody setFailoverAddrPoolId(String failoverAddrPoolId) {
        this.failoverAddrPoolId = failoverAddrPoolId;
        return this;
    }
    public String getFailoverAddrPoolId() {
        return this.failoverAddrPoolId;
    }

    public DescribeGtmAccessStrategyResponseBody setFailoverAddrPoolMonitorStatus(String failoverAddrPoolMonitorStatus) {
        this.failoverAddrPoolMonitorStatus = failoverAddrPoolMonitorStatus;
        return this;
    }
    public String getFailoverAddrPoolMonitorStatus() {
        return this.failoverAddrPoolMonitorStatus;
    }

    public DescribeGtmAccessStrategyResponseBody setFailoverAddrPoolName(String failoverAddrPoolName) {
        this.failoverAddrPoolName = failoverAddrPoolName;
        return this;
    }
    public String getFailoverAddrPoolName() {
        return this.failoverAddrPoolName;
    }

    public DescribeGtmAccessStrategyResponseBody setFailoverAddrPoolStatus(String failoverAddrPoolStatus) {
        this.failoverAddrPoolStatus = failoverAddrPoolStatus;
        return this;
    }
    public String getFailoverAddrPoolStatus() {
        return this.failoverAddrPoolStatus;
    }

    public DescribeGtmAccessStrategyResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGtmAccessStrategyResponseBody setLines(DescribeGtmAccessStrategyResponseBodyLines lines) {
        this.lines = lines;
        return this;
    }
    public DescribeGtmAccessStrategyResponseBodyLines getLines() {
        return this.lines;
    }

    public DescribeGtmAccessStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmAccessStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public DescribeGtmAccessStrategyResponseBody setStrategyMode(String strategyMode) {
        this.strategyMode = strategyMode;
        return this;
    }
    public String getStrategyMode() {
        return this.strategyMode;
    }

    public DescribeGtmAccessStrategyResponseBody setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public static class DescribeGtmAccessStrategyResponseBodyLinesLine extends TeaModel {
        @NameInMap("GroupCode")
        public String groupCode;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineName")
        public String lineName;

        public static DescribeGtmAccessStrategyResponseBodyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyResponseBodyLinesLine self = new DescribeGtmAccessStrategyResponseBodyLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyResponseBodyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeGtmAccessStrategyResponseBodyLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGtmAccessStrategyResponseBodyLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeGtmAccessStrategyResponseBodyLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

    }

    public static class DescribeGtmAccessStrategyResponseBodyLines extends TeaModel {
        @NameInMap("Line")
        public java.util.List<DescribeGtmAccessStrategyResponseBodyLinesLine> line;

        public static DescribeGtmAccessStrategyResponseBodyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyResponseBodyLines self = new DescribeGtmAccessStrategyResponseBodyLines();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyResponseBodyLines setLine(java.util.List<DescribeGtmAccessStrategyResponseBodyLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategyResponseBodyLinesLine> getLine() {
            return this.line;
        }

    }

}
