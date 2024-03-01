// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAccessStrategyRequest extends TeaModel {
    /**
     * <p>The primary/secondary switchover policy for address pool sets. Valid values:</p>
     * <br>
     * <p>*   AUTO: performs automatic switchover between the primary and secondary address pool sets upon failures.</p>
     * <p>*   DEFAULT: the primary address pool set</p>
     * <p>*   FAILOVER: the secondary address pool set</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>The address pools in the primary address pool set.</p>
     */
    @NameInMap("DefaultAddrPool")
    public java.util.List<UpdateDnsGtmAccessStrategyRequestDefaultAddrPool> defaultAddrPool;

    /**
     * <p>The type of the primary address pool. Valid values:</p>
     * <br>
     * <p>*   IPV4</p>
     * <p>*   IPV6</p>
     * <p>*   DOMAIN</p>
     */
    @NameInMap("DefaultAddrPoolType")
    public String defaultAddrPoolType;

    /**
     * <p>Specifies whether to enable Domain Name System (DNS) resolution with optimal latency for the primary address pool set. Valid values:</p>
     * <br>
     * <p>*   OPEN</p>
     * <p>*   CLOSE</p>
     */
    @NameInMap("DefaultLatencyOptimization")
    public String defaultLatencyOptimization;

    /**
     * <p>The load balancing policy of the primary address pool set. Valid values:</p>
     * <br>
     * <p>*   ALL_RR: returns all addresses.</p>
     * <p>*   RATIO: returns addresses by weight.</p>
     */
    @NameInMap("DefaultLbaStrategy")
    public String defaultLbaStrategy;

    /**
     * <p>The maximum number of addresses returned from the primary address pool set.</p>
     */
    @NameInMap("DefaultMaxReturnAddrNum")
    public Integer defaultMaxReturnAddrNum;

    /**
     * <p>The minimum number of available addresses in the primary address pool set.</p>
     */
    @NameInMap("DefaultMinAvailableAddrNum")
    public Integer defaultMinAvailableAddrNum;

    /**
     * <p>The address pools in the secondary address pool set. If no address pool exists in the secondary address pool set, set this parameter to EMPTY.</p>
     */
    @NameInMap("FailoverAddrPool")
    public java.util.List<UpdateDnsGtmAccessStrategyRequestFailoverAddrPool> failoverAddrPool;

    /**
     * <p>The type of the secondary address pool. Valid values:</p>
     * <br>
     * <p>*   IPV4</p>
     * <p>*   IPV6</p>
     * <p>*   DOMAIN</p>
     */
    @NameInMap("FailoverAddrPoolType")
    public String failoverAddrPoolType;

    /**
     * <p>Specifies whether to enable DNS resolution with optimal latency for the secondary address pool set. Valid values:</p>
     * <br>
     * <p>*   OPEN</p>
     * <p>*   CLOSE</p>
     */
    @NameInMap("FailoverLatencyOptimization")
    public String failoverLatencyOptimization;

    /**
     * <p>The load balancing policy of the secondary address pool set. Valid values:</p>
     * <br>
     * <p>*   ALL_RR: returns all addresses.</p>
     * <p>*   RATIO: returns addresses by weight.</p>
     */
    @NameInMap("FailoverLbaStrategy")
    public String failoverLbaStrategy;

    /**
     * <p>The maximum number of addresses returned from the secondary address pool set.</p>
     */
    @NameInMap("FailoverMaxReturnAddrNum")
    public Integer failoverMaxReturnAddrNum;

    /**
     * <p>The minimum number of available addresses in the secondary address pool set.</p>
     */
    @NameInMap("FailoverMinAvailableAddrNum")
    public Integer failoverMinAvailableAddrNum;

    /**
     * <p>The language of the values for specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The line codes of the source regions. Example: `["default", "drpeng"]`, which indicates the global line and Dr. Peng Group line.</p>
     */
    @NameInMap("Lines")
    public String lines;

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

    public static UpdateDnsGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAccessStrategyRequest self = new UpdateDnsGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAccessStrategyRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultAddrPool(java.util.List<UpdateDnsGtmAccessStrategyRequestDefaultAddrPool> defaultAddrPool) {
        this.defaultAddrPool = defaultAddrPool;
        return this;
    }
    public java.util.List<UpdateDnsGtmAccessStrategyRequestDefaultAddrPool> getDefaultAddrPool() {
        return this.defaultAddrPool;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultAddrPoolType(String defaultAddrPoolType) {
        this.defaultAddrPoolType = defaultAddrPoolType;
        return this;
    }
    public String getDefaultAddrPoolType() {
        return this.defaultAddrPoolType;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultLatencyOptimization(String defaultLatencyOptimization) {
        this.defaultLatencyOptimization = defaultLatencyOptimization;
        return this;
    }
    public String getDefaultLatencyOptimization() {
        return this.defaultLatencyOptimization;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultLbaStrategy(String defaultLbaStrategy) {
        this.defaultLbaStrategy = defaultLbaStrategy;
        return this;
    }
    public String getDefaultLbaStrategy() {
        return this.defaultLbaStrategy;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
        this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
        return this;
    }
    public Integer getDefaultMaxReturnAddrNum() {
        return this.defaultMaxReturnAddrNum;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
        this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
        return this;
    }
    public Integer getDefaultMinAvailableAddrNum() {
        return this.defaultMinAvailableAddrNum;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverAddrPool(java.util.List<UpdateDnsGtmAccessStrategyRequestFailoverAddrPool> failoverAddrPool) {
        this.failoverAddrPool = failoverAddrPool;
        return this;
    }
    public java.util.List<UpdateDnsGtmAccessStrategyRequestFailoverAddrPool> getFailoverAddrPool() {
        return this.failoverAddrPool;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverAddrPoolType(String failoverAddrPoolType) {
        this.failoverAddrPoolType = failoverAddrPoolType;
        return this;
    }
    public String getFailoverAddrPoolType() {
        return this.failoverAddrPoolType;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverLatencyOptimization(String failoverLatencyOptimization) {
        this.failoverLatencyOptimization = failoverLatencyOptimization;
        return this;
    }
    public String getFailoverLatencyOptimization() {
        return this.failoverLatencyOptimization;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverLbaStrategy(String failoverLbaStrategy) {
        this.failoverLbaStrategy = failoverLbaStrategy;
        return this;
    }
    public String getFailoverLbaStrategy() {
        return this.failoverLbaStrategy;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
        this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
        return this;
    }
    public Integer getFailoverMaxReturnAddrNum() {
        return this.failoverMaxReturnAddrNum;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
        this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
        return this;
    }
    public Integer getFailoverMinAvailableAddrNum() {
        return this.failoverMinAvailableAddrNum;
    }

    public UpdateDnsGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsGtmAccessStrategyRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

    public UpdateDnsGtmAccessStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public UpdateDnsGtmAccessStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public static class UpdateDnsGtmAccessStrategyRequestDefaultAddrPool extends TeaModel {
        /**
         * <p>The ID of the address pool in the primary address pool set.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The weight of the address pool in the primary address pool set.</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        public static UpdateDnsGtmAccessStrategyRequestDefaultAddrPool build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmAccessStrategyRequestDefaultAddrPool self = new UpdateDnsGtmAccessStrategyRequestDefaultAddrPool();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmAccessStrategyRequestDefaultAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateDnsGtmAccessStrategyRequestDefaultAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

    }

    public static class UpdateDnsGtmAccessStrategyRequestFailoverAddrPool extends TeaModel {
        /**
         * <p>The ID of the address pool in the secondary address pool set.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The weight of the address pool in the secondary address pool set.</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        public static UpdateDnsGtmAccessStrategyRequestFailoverAddrPool build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmAccessStrategyRequestFailoverAddrPool self = new UpdateDnsGtmAccessStrategyRequestFailoverAddrPool();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmAccessStrategyRequestFailoverAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateDnsGtmAccessStrategyRequestFailoverAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

    }

}
