// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategiesResponse extends TeaModel {
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
    public DescribeDnsGtmAccessStrategiesResponseStrategies strategies;

    public static DescribeDnsGtmAccessStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategiesResponse self = new DescribeDnsGtmAccessStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategiesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsGtmAccessStrategiesResponse setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDnsGtmAccessStrategiesResponse setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeDnsGtmAccessStrategiesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsGtmAccessStrategiesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsGtmAccessStrategiesResponse setStrategies(DescribeDnsGtmAccessStrategiesResponseStrategies strategies) {
        this.strategies = strategies;
        return this;
    }
    public DescribeDnsGtmAccessStrategiesResponseStrategies getStrategies() {
        return this.strategies;
    }

    public static class DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine extends TeaModel {
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

        public static DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine self = new DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLines extends TeaModel {
        @NameInMap("Line")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine> line;

        public static DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLines self = new DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLines setLine(java.util.List<DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine> line) {
            this.line = line;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLinesLine> getLine() {
            return this.line;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool extends TeaModel {
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

        public static DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool self = new DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPools extends TeaModel {
        @NameInMap("EffectiveAddrPool")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool> effectiveAddrPool;

        public static DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPools self = new DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPools setEffectiveAddrPool(java.util.List<DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool> effectiveAddrPool) {
            this.effectiveAddrPool = effectiveAddrPool;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool> getEffectiveAddrPool() {
            return this.effectiveAddrPool;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy extends TeaModel {
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

        @NameInMap("EffectiveAddrPoolGroupType")
        @Validation(required = true)
        public String effectiveAddrPoolGroupType;

        @NameInMap("EffectiveAddrPoolType")
        @Validation(required = true)
        public String effectiveAddrPoolType;

        @NameInMap("EffectiveLbaStrategy")
        @Validation(required = true)
        public String effectiveLbaStrategy;

        @NameInMap("Lines")
        @Validation(required = true)
        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLines lines;

        @NameInMap("EffectiveAddrPools")
        @Validation(required = true)
        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPools effectiveAddrPools;

        public static DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy self = new DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy setEffectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
            this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
            return this;
        }
        public String getEffectiveAddrPoolGroupType() {
            return this.effectiveAddrPoolGroupType;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy setEffectiveAddrPoolType(String effectiveAddrPoolType) {
            this.effectiveAddrPoolType = effectiveAddrPoolType;
            return this;
        }
        public String getEffectiveAddrPoolType() {
            return this.effectiveAddrPoolType;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy setEffectiveLbaStrategy(String effectiveLbaStrategy) {
            this.effectiveLbaStrategy = effectiveLbaStrategy;
            return this;
        }
        public String getEffectiveLbaStrategy() {
            return this.effectiveLbaStrategy;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy setLines(DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLines lines) {
            this.lines = lines;
            return this;
        }
        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyLines getLines() {
            return this.lines;
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy setEffectiveAddrPools(DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPools effectiveAddrPools) {
            this.effectiveAddrPools = effectiveAddrPools;
            return this;
        }
        public DescribeDnsGtmAccessStrategiesResponseStrategiesStrategyEffectiveAddrPools getEffectiveAddrPools() {
            return this.effectiveAddrPools;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseStrategies extends TeaModel {
        @NameInMap("Strategy")
        @Validation(required = true)
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy> strategy;

        public static DescribeDnsGtmAccessStrategiesResponseStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseStrategies self = new DescribeDnsGtmAccessStrategiesResponseStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseStrategies setStrategy(java.util.List<DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy> strategy) {
            this.strategy = strategy;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseStrategiesStrategy> getStrategy() {
            return this.strategy;
        }

    }

}
