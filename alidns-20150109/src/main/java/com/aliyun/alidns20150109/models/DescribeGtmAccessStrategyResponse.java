// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    @NameInMap("StrategyName")
    @Validation(required = true)
    public String strategyName;

    @NameInMap("DefultAddrPoolId")
    @Validation(required = true)
    public String defultAddrPoolId;

    @NameInMap("DefaultAddrPoolName")
    @Validation(required = true)
    public String defaultAddrPoolName;

    @NameInMap("FailoverAddrPoolId")
    @Validation(required = true)
    public String failoverAddrPoolId;

    @NameInMap("FailoverAddrPoolName")
    @Validation(required = true)
    public String failoverAddrPoolName;

    @NameInMap("StrategyMode")
    @Validation(required = true)
    public String strategyMode;

    @NameInMap("AccessMode")
    @Validation(required = true)
    public String accessMode;

    @NameInMap("AccessStatus")
    @Validation(required = true)
    public String accessStatus;

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
    public DescribeGtmAccessStrategyResponseLines lines;

    public static DescribeGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmAccessStrategyResponse self = new DescribeGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmAccessStrategyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmAccessStrategyResponse setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public DescribeGtmAccessStrategyResponse setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public DescribeGtmAccessStrategyResponse setDefultAddrPoolId(String defultAddrPoolId) {
        this.defultAddrPoolId = defultAddrPoolId;
        return this;
    }
    public String getDefultAddrPoolId() {
        return this.defultAddrPoolId;
    }

    public DescribeGtmAccessStrategyResponse setDefaultAddrPoolName(String defaultAddrPoolName) {
        this.defaultAddrPoolName = defaultAddrPoolName;
        return this;
    }
    public String getDefaultAddrPoolName() {
        return this.defaultAddrPoolName;
    }

    public DescribeGtmAccessStrategyResponse setFailoverAddrPoolId(String failoverAddrPoolId) {
        this.failoverAddrPoolId = failoverAddrPoolId;
        return this;
    }
    public String getFailoverAddrPoolId() {
        return this.failoverAddrPoolId;
    }

    public DescribeGtmAccessStrategyResponse setFailoverAddrPoolName(String failoverAddrPoolName) {
        this.failoverAddrPoolName = failoverAddrPoolName;
        return this;
    }
    public String getFailoverAddrPoolName() {
        return this.failoverAddrPoolName;
    }

    public DescribeGtmAccessStrategyResponse setStrategyMode(String strategyMode) {
        this.strategyMode = strategyMode;
        return this;
    }
    public String getStrategyMode() {
        return this.strategyMode;
    }

    public DescribeGtmAccessStrategyResponse setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public DescribeGtmAccessStrategyResponse setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }
    public String getAccessStatus() {
        return this.accessStatus;
    }

    public DescribeGtmAccessStrategyResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGtmAccessStrategyResponse setDefaultAddrPoolStatus(String defaultAddrPoolStatus) {
        this.defaultAddrPoolStatus = defaultAddrPoolStatus;
        return this;
    }
    public String getDefaultAddrPoolStatus() {
        return this.defaultAddrPoolStatus;
    }

    public DescribeGtmAccessStrategyResponse setFailoverAddrPoolStatus(String failoverAddrPoolStatus) {
        this.failoverAddrPoolStatus = failoverAddrPoolStatus;
        return this;
    }
    public String getFailoverAddrPoolStatus() {
        return this.failoverAddrPoolStatus;
    }

    public DescribeGtmAccessStrategyResponse setDefaultAddrPoolMonitorStatus(String defaultAddrPoolMonitorStatus) {
        this.defaultAddrPoolMonitorStatus = defaultAddrPoolMonitorStatus;
        return this;
    }
    public String getDefaultAddrPoolMonitorStatus() {
        return this.defaultAddrPoolMonitorStatus;
    }

    public DescribeGtmAccessStrategyResponse setFailoverAddrPoolMonitorStatus(String failoverAddrPoolMonitorStatus) {
        this.failoverAddrPoolMonitorStatus = failoverAddrPoolMonitorStatus;
        return this;
    }
    public String getFailoverAddrPoolMonitorStatus() {
        return this.failoverAddrPoolMonitorStatus;
    }

    public DescribeGtmAccessStrategyResponse setLines(DescribeGtmAccessStrategyResponseLines lines) {
        this.lines = lines;
        return this;
    }
    public DescribeGtmAccessStrategyResponseLines getLines() {
        return this.lines;
    }

    public static class DescribeGtmAccessStrategyResponseLinesLine extends TeaModel {
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

        public static DescribeGtmAccessStrategyResponseLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyResponseLinesLine self = new DescribeGtmAccessStrategyResponseLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyResponseLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeGtmAccessStrategyResponseLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeGtmAccessStrategyResponseLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeGtmAccessStrategyResponseLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeGtmAccessStrategyResponseLines extends TeaModel {
        @NameInMap("Line")
        @Validation(required = true)
        public java.util.List<DescribeGtmAccessStrategyResponseLinesLine> line;

        public static DescribeGtmAccessStrategyResponseLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeGtmAccessStrategyResponseLines self = new DescribeGtmAccessStrategyResponseLines();
            return TeaModel.build(map, self);
        }

        public DescribeGtmAccessStrategyResponseLines setLine(java.util.List<DescribeGtmAccessStrategyResponseLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeGtmAccessStrategyResponseLinesLine> getLine() {
            return this.line;
        }

    }

}
