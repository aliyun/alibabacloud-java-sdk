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
    public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategies> strategies;

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

    public DescribeDnsGtmAccessStrategiesResponseBody setStrategies(java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategies> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategies> getStrategies() {
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

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools extends TeaModel {
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Name")
        public String name;

        @NameInMap("AddrCount")
        public Integer addrCount;

        @NameInMap("Id")
        public String id;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools setAddrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }
        public Integer getAddrCount() {
            return this.addrCount;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineName")
        public String lineName;

        @NameInMap("GroupCode")
        public String groupCode;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines setLineName(String lineName) {
            this.lineName = lineName;
            return this;
        }
        public String getLineName() {
            return this.lineName;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
        }

    }

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategies extends TeaModel {
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
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools> effectiveAddrPools;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("EffectiveAddrPoolType")
        public String effectiveAddrPoolType;

        @NameInMap("Lines")
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines> lines;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategies build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategies self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategies();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setEffectiveLbaStrategy(String effectiveLbaStrategy) {
            this.effectiveLbaStrategy = effectiveLbaStrategy;
            return this;
        }
        public String getEffectiveLbaStrategy() {
            return this.effectiveLbaStrategy;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setStrategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }
        public String getStrategyId() {
            return this.strategyId;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setStrategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }
        public String getStrategyName() {
            return this.strategyName;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setEffectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
            this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
            return this;
        }
        public String getEffectiveAddrPoolGroupType() {
            return this.effectiveAddrPoolGroupType;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setEffectiveAddrPools(java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools> effectiveAddrPools) {
            this.effectiveAddrPools = effectiveAddrPools;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesEffectiveAddrPools> getEffectiveAddrPools() {
            return this.effectiveAddrPools;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setEffectiveAddrPoolType(String effectiveAddrPoolType) {
            this.effectiveAddrPoolType = effectiveAddrPoolType;
            return this;
        }
        public String getEffectiveAddrPoolType() {
            return this.effectiveAddrPoolType;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategies setLines(java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines> lines) {
            this.lines = lines;
            return this;
        }
        public java.util.List<DescribeDnsGtmAccessStrategiesResponseBodyStrategiesLines> getLines() {
            return this.lines;
        }

    }

}
