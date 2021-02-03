// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyResponseBody extends TeaModel {
    @NameInMap("FailoverMinAvailableAddrNum")
    public Integer failoverMinAvailableAddrNum;

    @NameInMap("DefaultAddrPoolType")
    public String defaultAddrPoolType;

    @NameInMap("DefaultAvailableAddrNum")
    public Integer defaultAvailableAddrNum;

    @NameInMap("StrategyId")
    public String strategyId;

    @NameInMap("FailoverAddrPoolGroupStatus")
    public String failoverAddrPoolGroupStatus;

    @NameInMap("FailoverAvailableAddrNum")
    public Integer failoverAvailableAddrNum;

    @NameInMap("FailoverLbaStrategy")
    public String failoverLbaStrategy;

    @NameInMap("DefaultMaxReturnAddrNum")
    public Integer defaultMaxReturnAddrNum;

    @NameInMap("StrategyMode")
    public String strategyMode;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("DefaultLbaStrategy")
    public String defaultLbaStrategy;

    @NameInMap("DefaultAddrPoolGroupStatus")
    public String defaultAddrPoolGroupStatus;

    @NameInMap("FailoverAddrPoolType")
    public String failoverAddrPoolType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("FailoverAddrPools")
    public DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPools failoverAddrPools;

    @NameInMap("DefaultLatencyOptimization")
    public String defaultLatencyOptimization;

    @NameInMap("EffectiveAddrPoolGroupType")
    public String effectiveAddrPoolGroupType;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DefaultAddrPools")
    public DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPools defaultAddrPools;

    @NameInMap("DefaultMinAvailableAddrNum")
    public Integer defaultMinAvailableAddrNum;

    @NameInMap("FailoverLatencyOptimization")
    public String failoverLatencyOptimization;

    @NameInMap("StrategyName")
    public String strategyName;

    @NameInMap("FailoverMaxReturnAddrNum")
    public Integer failoverMaxReturnAddrNum;

    @NameInMap("AccessMode")
    public String accessMode;

    @NameInMap("Lines")
    public DescribeDnsGtmAccessStrategyResponseBodyLines lines;

    public static DescribeDnsGtmAccessStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyResponseBody self = new DescribeDnsGtmAccessStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyResponseBody setFailoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
        this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
        return this;
    }
    public Integer getFailoverMinAvailableAddrNum() {
        return this.failoverMinAvailableAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setDefaultAddrPoolType(String defaultAddrPoolType) {
        this.defaultAddrPoolType = defaultAddrPoolType;
        return this;
    }
    public String getDefaultAddrPoolType() {
        return this.defaultAddrPoolType;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setDefaultAvailableAddrNum(Integer defaultAvailableAddrNum) {
        this.defaultAvailableAddrNum = defaultAvailableAddrNum;
        return this;
    }
    public Integer getDefaultAvailableAddrNum() {
        return this.defaultAvailableAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setFailoverAddrPoolGroupStatus(String failoverAddrPoolGroupStatus) {
        this.failoverAddrPoolGroupStatus = failoverAddrPoolGroupStatus;
        return this;
    }
    public String getFailoverAddrPoolGroupStatus() {
        return this.failoverAddrPoolGroupStatus;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setFailoverAvailableAddrNum(Integer failoverAvailableAddrNum) {
        this.failoverAvailableAddrNum = failoverAvailableAddrNum;
        return this;
    }
    public Integer getFailoverAvailableAddrNum() {
        return this.failoverAvailableAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setFailoverLbaStrategy(String failoverLbaStrategy) {
        this.failoverLbaStrategy = failoverLbaStrategy;
        return this;
    }
    public String getFailoverLbaStrategy() {
        return this.failoverLbaStrategy;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setDefaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
        this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
        return this;
    }
    public Integer getDefaultMaxReturnAddrNum() {
        return this.defaultMaxReturnAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setStrategyMode(String strategyMode) {
        this.strategyMode = strategyMode;
        return this;
    }
    public String getStrategyMode() {
        return this.strategyMode;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setDefaultLbaStrategy(String defaultLbaStrategy) {
        this.defaultLbaStrategy = defaultLbaStrategy;
        return this;
    }
    public String getDefaultLbaStrategy() {
        return this.defaultLbaStrategy;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setDefaultAddrPoolGroupStatus(String defaultAddrPoolGroupStatus) {
        this.defaultAddrPoolGroupStatus = defaultAddrPoolGroupStatus;
        return this;
    }
    public String getDefaultAddrPoolGroupStatus() {
        return this.defaultAddrPoolGroupStatus;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setFailoverAddrPoolType(String failoverAddrPoolType) {
        this.failoverAddrPoolType = failoverAddrPoolType;
        return this;
    }
    public String getFailoverAddrPoolType() {
        return this.failoverAddrPoolType;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setFailoverAddrPools(DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPools failoverAddrPools) {
        this.failoverAddrPools = failoverAddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPools getFailoverAddrPools() {
        return this.failoverAddrPools;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setDefaultLatencyOptimization(String defaultLatencyOptimization) {
        this.defaultLatencyOptimization = defaultLatencyOptimization;
        return this;
    }
    public String getDefaultLatencyOptimization() {
        return this.defaultLatencyOptimization;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setEffectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
        this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
        return this;
    }
    public String getEffectiveAddrPoolGroupType() {
        return this.effectiveAddrPoolGroupType;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setDefaultAddrPools(DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPools defaultAddrPools) {
        this.defaultAddrPools = defaultAddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPools getDefaultAddrPools() {
        return this.defaultAddrPools;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setDefaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
        this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
        return this;
    }
    public Integer getDefaultMinAvailableAddrNum() {
        return this.defaultMinAvailableAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setFailoverLatencyOptimization(String failoverLatencyOptimization) {
        this.failoverLatencyOptimization = failoverLatencyOptimization;
        return this;
    }
    public String getFailoverLatencyOptimization() {
        return this.failoverLatencyOptimization;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setFailoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
        this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
        return this;
    }
    public Integer getFailoverMaxReturnAddrNum() {
        return this.failoverMaxReturnAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public DescribeDnsGtmAccessStrategyResponseBody setLines(DescribeDnsGtmAccessStrategyResponseBodyLines lines) {
        this.lines = lines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyResponseBodyLines getLines() {
        return this.lines;
    }

    public static class DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool extends TeaModel {
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool self = new DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPools extends TeaModel {
        @NameInMap("FailoverAddrPool")
        public java.util.List<DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool> failoverAddrPool;

        public static DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPools self = new DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPools setFailoverAddrPool(java.util.List<DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool> failoverAddrPool) {
            this.failoverAddrPool = failoverAddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyResponseBodyFailoverAddrPoolsFailoverAddrPool> getFailoverAddrPool() {
            return this.failoverAddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool extends TeaModel {
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool self = new DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPools extends TeaModel {
        @NameInMap("DefaultAddrPool")
        public java.util.List<DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool> defaultAddrPool;

        public static DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPools self = new DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPools setDefaultAddrPool(java.util.List<DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool> defaultAddrPool) {
            this.defaultAddrPool = defaultAddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyResponseBodyDefaultAddrPoolsDefaultAddrPool> getDefaultAddrPool() {
            return this.defaultAddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseBodyLinesLine extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineName")
        public String lineName;

        @NameInMap("GroupCode")
        public String groupCode;

        public static DescribeDnsGtmAccessStrategyResponseBodyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseBodyLinesLine self = new DescribeDnsGtmAccessStrategyResponseBodyLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseBodyLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAccessStrategyResponseBodyLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAccessStrategyResponseBodyLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAccessStrategyResponseBodyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseBodyLines extends TeaModel {
        @NameInMap("Line")
        public java.util.List<DescribeDnsGtmAccessStrategyResponseBodyLinesLine> line;

        public static DescribeDnsGtmAccessStrategyResponseBodyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseBodyLines self = new DescribeDnsGtmAccessStrategyResponseBodyLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseBodyLines setLine(java.util.List<DescribeDnsGtmAccessStrategyResponseBodyLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyResponseBodyLinesLine> getLine() {
            return this.line;
        }

    }

}
