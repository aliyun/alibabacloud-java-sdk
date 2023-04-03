// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategiesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
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
     * <p>The access policies.</p>
     */
    @NameInMap("Strategies")
    public DescribeDnsGtmAccessStrategiesResponseBodyStrategies strategies;

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

    public static DescribeDnsGtmAccessStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategiesResponseBody self = new DescribeDnsGtmAccessStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public DescribeDnsGtmAccessStrategiesResponseBody setStrategies(DescribeDnsGtmAccessStrategiesResponseBodyStrategies strategies) {
        this.strategies = strategies;
        return this;
    }
    public DescribeDnsGtmAccessStrategiesResponseBodyStrategies getStrategies() {
        return this.strategies;
    }

    public DescribeDnsGtmAccessStrategiesResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeDnsGtmAccessStrategiesResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool extends TeaModel {
        /**
         * <p>The number of addresses in the address pool.</p>
         */
        @NameInMap("AddrCount")
        public Integer addrCount;

        /**
         * <p>The ID of the address pool.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The weight of the address pool.</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        /**
         * <p>The name of the address pool.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPoolsEffectiveAddrPool();
            return TeaModel.build(map, self);
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
        /**
         * <p>The code of the source region group.</p>
         */
        @NameInMap("GroupCode")
        public String groupCode;

        /**
         * <p>The name of the source region group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The line code of the source region.</p>
         */
        @NameInMap("LineCode")
        public String lineCode;

        /**
         * <p>The line name of the source region.</p>
         */
        @NameInMap("LineName")
        public String lineName;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLinesLine setGroupCode(String groupCode) {
            this.groupCode = groupCode;
            return this;
        }
        public String getGroupCode() {
            return this.groupCode;
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
        /**
         * <p>The time when the access policy was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp that indicates when the access policy was created.</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The type of the active address pool group. Valid values:</p>
         * <br>
         * <p>*   DEFAULT: the primary address pool group</p>
         * <p>*   FAILOVER: the secondary address pool group</p>
         */
        @NameInMap("EffectiveAddrPoolGroupType")
        public String effectiveAddrPoolGroupType;

        /**
         * <p>The type of the active address pools. Valid values:</p>
         * <br>
         * <p>*   IPV4</p>
         * <p>*   IPV6</p>
         * <p>*   DOMAIN</p>
         */
        @NameInMap("EffectiveAddrPoolType")
        public String effectiveAddrPoolType;

        /**
         * <p>The active address pool groups.</p>
         */
        @NameInMap("EffectiveAddrPools")
        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools effectiveAddrPools;

        /**
         * <p>The load balancing policy of the active address pool group. Data is returned when StrategyMode is set to GEO. Valid values: </p>
         * <br>
         * <p>- ALL_RR: returns all addresses.</p>
         * <p>- RATIO: returns addresses by weight.</p>
         */
        @NameInMap("EffectiveLbaStrategy")
        public String effectiveLbaStrategy;

        /**
         * <p>The source regions. Data is returned when StrategyMode is set to GEO. Valid values:</p>
         */
        @NameInMap("Lines")
        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines lines;

        /**
         * <p>The ID of the access policy.</p>
         */
        @NameInMap("StrategyId")
        public String strategyId;

        /**
         * <p>The name of the access policy.</p>
         */
        @NameInMap("StrategyName")
        public String strategyName;

        public static DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy self = new DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setEffectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
            this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
            return this;
        }
        public String getEffectiveAddrPoolGroupType() {
            return this.effectiveAddrPoolGroupType;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setEffectiveAddrPoolType(String effectiveAddrPoolType) {
            this.effectiveAddrPoolType = effectiveAddrPoolType;
            return this;
        }
        public String getEffectiveAddrPoolType() {
            return this.effectiveAddrPoolType;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setEffectiveAddrPools(DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools effectiveAddrPools) {
            this.effectiveAddrPools = effectiveAddrPools;
            return this;
        }
        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyEffectiveAddrPools getEffectiveAddrPools() {
            return this.effectiveAddrPools;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setEffectiveLbaStrategy(String effectiveLbaStrategy) {
            this.effectiveLbaStrategy = effectiveLbaStrategy;
            return this;
        }
        public String getEffectiveLbaStrategy() {
            return this.effectiveLbaStrategy;
        }

        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategy setLines(DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines lines) {
            this.lines = lines;
            return this;
        }
        public DescribeDnsGtmAccessStrategiesResponseBodyStrategiesStrategyLines getLines() {
            return this.lines;
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
