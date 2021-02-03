// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategiesResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Strategies")
    public DescribeDnsGtmAccessStrategiesResponseBodyStrategies strategies;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("TotalItems")
    public Integer totalItems;

    public static DescribeDnsGtmAccessStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategiesResponseBody self = new DescribeDnsGtmAccessStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsGtmAccessStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAccessStrategiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmAccessStrategiesResponseBody setStrategies(DescribeDnsGtmAccessStrategiesResponseBodyStrategies strategies) {
        this.strategies = strategies;
        return this;
    }
    public DescribeDnsGtmAccessStrategiesResponseBodyStrategies getStrategies() {
        return this.strategies;
    }

    public DescribeDnsGtmAccessStrategiesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDnsGtmAccessStrategiesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool extends TeaModel {
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools extends TeaModel {
        @NameInMap("EffectiveAddrPool")
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool> effectiveAddrPool;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools setEffectiveAddrPool(java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool> effectiveAddrPool) {
            this.effectiveAddrPool = effectiveAddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool> getEffectiveAddrPool() {
            return this.effectiveAddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineName")
        public String lineName;

        @NameInMap("GroupCode")
        public String groupCode;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines extends TeaModel {
        @NameInMap("Line")
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine> line;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines setLine(java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine> getLine() {
            return this.line;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy extends TeaModel {
        @NameInMap("EffectiveLbaStrategy")
        public String effectiveLbaStrategy;

        @NameInMap("StrategyId")
        public String strategyId;

        @NameInMap("StrategyName")
        public String strategyName;

        @NameInMap("EffectiveAddrPoolGroupType")
        public String effectiveAddrPoolGroupType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EffectiveAddrPools")
        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools effectiveAddrPools;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("EffectiveAddrPoolType")
        public String effectiveAddrPoolType;

        @NameInMap("Lines")
        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines lines;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setEffectiveLbaStrategy(String effectiveLbaStrategy) {
            this.effectiveLbaStrategy = effectiveLbaStrategy;
            return this;
        }
        public String getEffectiveLbaStrategy() {
            return this.effectiveLbaStrategy;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setEffectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
            this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
            return this;
        }
        public String getEffectiveAddrPoolGroupType() {
            return this.effectiveAddrPoolGroupType;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setEffectiveAddrPools(DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools effectiveAddrPools) {
            this.effectiveAddrPools = effectiveAddrPools;
            return this;
        }
        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools getEffectiveAddrPools() {
            return this.effectiveAddrPools;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setEffectiveAddrPoolType(String effectiveAddrPoolType) {
            this.effectiveAddrPoolType = effectiveAddrPoolType;
            return this;
        }
        public String getEffectiveAddrPoolType() {
            return this.effectiveAddrPoolType;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setLines(DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines lines) {
            this.lines = lines;
            return this;
        }
        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines getLines() {
            return this.lines;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategies extends TeaModel {
        @NameInMap("Strategy")
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy> strategy;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategies self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setStrategy(java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy> strategy) {
            this.strategy = strategy;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy> getStrategy() {
            return this.strategy;
        }

    }

}
