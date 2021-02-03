// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StrategyId")
    @Validation(required = true)
    public String strategyId;

    @NameInMap("StrategyName")
    @Validation(required = true)
    public String strategyName;

    @NameInMap("StrategyMode")
    @Validation(required = true)
    public String strategyMode;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("DefaultAddrPoolType")
    @Validation(required = true)
    public String defaultAddrPoolType;

    @NameInMap("DefaultLbaStrategy")
    @Validation(required = true)
    public String defaultLbaStrategy;

    @NameInMap("DefaultMinAvailableAddrNum")
    @Validation(required = true)
    public Integer defaultMinAvailableAddrNum;

    @NameInMap("DefaultMaxReturnAddrNum")
    @Validation(required = true)
    public Integer defaultMaxReturnAddrNum;

    @NameInMap("DefaultLatencyOptimization")
    @Validation(required = true)
    public String defaultLatencyOptimization;

    @NameInMap("DefaultAddrPoolGroupStatus")
    @Validation(required = true)
    public String defaultAddrPoolGroupStatus;

    @NameInMap("FailoverAddrPoolType")
    @Validation(required = true)
    public String failoverAddrPoolType;

    @NameInMap("FailoverLbaStrategy")
    @Validation(required = true)
    public String failoverLbaStrategy;

    @NameInMap("FailoverMinAvailableAddrNum")
    @Validation(required = true)
    public Integer failoverMinAvailableAddrNum;

    @NameInMap("FailoverMaxReturnAddrNum")
    @Validation(required = true)
    public Integer failoverMaxReturnAddrNum;

    @NameInMap("FailoverLatencyOptimization")
    @Validation(required = true)
    public String failoverLatencyOptimization;

    @NameInMap("FailoverAddrPoolGroupStatus")
    @Validation(required = true)
    public String failoverAddrPoolGroupStatus;

    @NameInMap("AccessMode")
    @Validation(required = true)
    public String accessMode;

    @NameInMap("EffectiveAddrPoolGroupType")
    @Validation(required = true)
    public String effectiveAddrPoolGroupType;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("CreateTimestamp")
    @Validation(required = true)
    public Long createTimestamp;

    @NameInMap("DefaultAvailableAddrNum")
    @Validation(required = true)
    public Integer defaultAvailableAddrNum;

    @NameInMap("FailoverAvailableAddrNum")
    @Validation(required = true)
    public Integer failoverAvailableAddrNum;

    @NameInMap("Lines")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyResponseLines lines;

    @NameInMap("DefaultAddrPools")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyResponseDefaultAddrPools defaultAddrPools;

    @NameInMap("FailoverAddrPools")
    @Validation(required = true)
    public DescribeDnsGtmAccessStrategyResponseFailoverAddrPools failoverAddrPools;

    public static DescribeDnsGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyResponse self = new DescribeDnsGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAccessStrategyResponse setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public DescribeDnsGtmAccessStrategyResponse setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public DescribeDnsGtmAccessStrategyResponse setStrategyMode(String strategyMode) {
        this.strategyMode = strategyMode;
        return this;
    }
    public String getStrategyMode() {
        return this.strategyMode;
    }

    public DescribeDnsGtmAccessStrategyResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsGtmAccessStrategyResponse setDefaultAddrPoolType(String defaultAddrPoolType) {
        this.defaultAddrPoolType = defaultAddrPoolType;
        return this;
    }
    public String getDefaultAddrPoolType() {
        return this.defaultAddrPoolType;
    }

    public DescribeDnsGtmAccessStrategyResponse setDefaultLbaStrategy(String defaultLbaStrategy) {
        this.defaultLbaStrategy = defaultLbaStrategy;
        return this;
    }
    public String getDefaultLbaStrategy() {
        return this.defaultLbaStrategy;
    }

    public DescribeDnsGtmAccessStrategyResponse setDefaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
        this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
        return this;
    }
    public Integer getDefaultMinAvailableAddrNum() {
        return this.defaultMinAvailableAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponse setDefaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
        this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
        return this;
    }
    public Integer getDefaultMaxReturnAddrNum() {
        return this.defaultMaxReturnAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponse setDefaultLatencyOptimization(String defaultLatencyOptimization) {
        this.defaultLatencyOptimization = defaultLatencyOptimization;
        return this;
    }
    public String getDefaultLatencyOptimization() {
        return this.defaultLatencyOptimization;
    }

    public DescribeDnsGtmAccessStrategyResponse setDefaultAddrPoolGroupStatus(String defaultAddrPoolGroupStatus) {
        this.defaultAddrPoolGroupStatus = defaultAddrPoolGroupStatus;
        return this;
    }
    public String getDefaultAddrPoolGroupStatus() {
        return this.defaultAddrPoolGroupStatus;
    }

    public DescribeDnsGtmAccessStrategyResponse setFailoverAddrPoolType(String failoverAddrPoolType) {
        this.failoverAddrPoolType = failoverAddrPoolType;
        return this;
    }
    public String getFailoverAddrPoolType() {
        return this.failoverAddrPoolType;
    }

    public DescribeDnsGtmAccessStrategyResponse setFailoverLbaStrategy(String failoverLbaStrategy) {
        this.failoverLbaStrategy = failoverLbaStrategy;
        return this;
    }
    public String getFailoverLbaStrategy() {
        return this.failoverLbaStrategy;
    }

    public DescribeDnsGtmAccessStrategyResponse setFailoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
        this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
        return this;
    }
    public Integer getFailoverMinAvailableAddrNum() {
        return this.failoverMinAvailableAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponse setFailoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
        this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
        return this;
    }
    public Integer getFailoverMaxReturnAddrNum() {
        return this.failoverMaxReturnAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponse setFailoverLatencyOptimization(String failoverLatencyOptimization) {
        this.failoverLatencyOptimization = failoverLatencyOptimization;
        return this;
    }
    public String getFailoverLatencyOptimization() {
        return this.failoverLatencyOptimization;
    }

    public DescribeDnsGtmAccessStrategyResponse setFailoverAddrPoolGroupStatus(String failoverAddrPoolGroupStatus) {
        this.failoverAddrPoolGroupStatus = failoverAddrPoolGroupStatus;
        return this;
    }
    public String getFailoverAddrPoolGroupStatus() {
        return this.failoverAddrPoolGroupStatus;
    }

    public DescribeDnsGtmAccessStrategyResponse setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public DescribeDnsGtmAccessStrategyResponse setEffectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
        this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
        return this;
    }
    public String getEffectiveAddrPoolGroupType() {
        return this.effectiveAddrPoolGroupType;
    }

    public DescribeDnsGtmAccessStrategyResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDnsGtmAccessStrategyResponse setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeDnsGtmAccessStrategyResponse setDefaultAvailableAddrNum(Integer defaultAvailableAddrNum) {
        this.defaultAvailableAddrNum = defaultAvailableAddrNum;
        return this;
    }
    public Integer getDefaultAvailableAddrNum() {
        return this.defaultAvailableAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponse setFailoverAvailableAddrNum(Integer failoverAvailableAddrNum) {
        this.failoverAvailableAddrNum = failoverAvailableAddrNum;
        return this;
    }
    public Integer getFailoverAvailableAddrNum() {
        return this.failoverAvailableAddrNum;
    }

    public DescribeDnsGtmAccessStrategyResponse setLines(DescribeDnsGtmAccessStrategyResponseLines lines) {
        this.lines = lines;
        return this;
    }
    public DescribeDnsGtmAccessStrategyResponseLines getLines() {
        return this.lines;
    }

    public DescribeDnsGtmAccessStrategyResponse setDefaultAddrPools(DescribeDnsGtmAccessStrategyResponseDefaultAddrPools defaultAddrPools) {
        this.defaultAddrPools = defaultAddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyResponseDefaultAddrPools getDefaultAddrPools() {
        return this.defaultAddrPools;
    }

    public DescribeDnsGtmAccessStrategyResponse setFailoverAddrPools(DescribeDnsGtmAccessStrategyResponseFailoverAddrPools failoverAddrPools) {
        this.failoverAddrPools = failoverAddrPools;
        return this;
    }
    public DescribeDnsGtmAccessStrategyResponseFailoverAddrPools getFailoverAddrPools() {
        return this.failoverAddrPools;
    }

    public static class DescribeDnsGtmAccessStrategyResponseLinesLine extends TeaModel {
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

        public static DescribeDnsGtmAccessStrategyResponseLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseLinesLine self = new DescribeDnsGtmAccessStrategyResponseLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAccessStrategyResponseLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAccessStrategyResponseLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeDnsGtmAccessStrategyResponseLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseLines extends TeaModel {
        @NameInMap("Line")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategyResponseLinesLine> line;

        public static DescribeDnsGtmAccessStrategyResponseLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseLines self = new DescribeDnsGtmAccessStrategyResponseLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseLines setLine(java.util.List<DescribeDnsGtmAccessStrategyResponseLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyResponseLinesLine> getLine() {
            return this.line;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("AddrCount")
        @Validation(required = true)
        public Integer addrCount;

        @NameInMap("LbaWeight")
        @Validation(required = true)
        public Integer lbaWeight;

        public static DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool self = new DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseDefaultAddrPools extends TeaModel {
        @NameInMap("DefaultAddrPool")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool> defaultAddrPool;

        public static DescribeDnsGtmAccessStrategyResponseDefaultAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseDefaultAddrPools self = new DescribeDnsGtmAccessStrategyResponseDefaultAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseDefaultAddrPools setDefaultAddrPool(java.util.List<DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool> defaultAddrPool) {
            this.defaultAddrPool = defaultAddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyResponseDefaultAddrPoolsDefaultAddrPool> getDefaultAddrPool() {
            return this.defaultAddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("AddrCount")
        @Validation(required = true)
        public Integer addrCount;

        @NameInMap("LbaWeight")
        @Validation(required = true)
        public Integer lbaWeight;

        public static DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool self = new DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

    }

    public static class DescribeDnsGtmAccessStrategyResponseFailoverAddrPools extends TeaModel {
        @NameInMap("FailoverAddrPool")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool> failoverAddrPool;

        public static DescribeDnsGtmAccessStrategyResponseFailoverAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategyResponseFailoverAddrPools self = new DescribeDnsGtmAccessStrategyResponseFailoverAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategyResponseFailoverAddrPools setFailoverAddrPool(java.util.List<DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool> failoverAddrPool) {
            this.failoverAddrPool = failoverAddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategyResponseFailoverAddrPoolsFailoverAddrPool> getFailoverAddrPool() {
            return this.failoverAddrPool;
        }

    }

}
