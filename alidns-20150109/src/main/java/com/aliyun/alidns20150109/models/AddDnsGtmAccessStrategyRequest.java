// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmAccessStrategyRequest extends TeaModel {
    @NameInMap("DefaultAddrPool")
    public java.util.List<AddDnsGtmAccessStrategyRequestDefaultAddrPool> defaultAddrPool;

    /**
     * <p>The load balancing policy of the primary address pool group. Valid values:</p>
     * <br>
     * <p>*   ALL_RR: returns all addresses.</p>
     * <p>*   RATIO: returns addresses by weight.</p>
     */
    @NameInMap("DefaultAddrPoolType")
    public String defaultAddrPoolType;

    /**
     * <p>The type of the secondary address pool. Valid values:</p>
     * <br>
     * <p>*   IPV4</p>
     * <p>*   IPV6</p>
     * <p>*   DOMAIN</p>
     */
    @NameInMap("DefaultLatencyOptimization")
    public String defaultLatencyOptimization;

    /**
     * <p>The minimum number of available addresses in the primary address pool group.</p>
     */
    @NameInMap("DefaultLbaStrategy")
    public String defaultLbaStrategy;

    /**
     * <p>Specifies whether to enable scheduling optimization for latency resolution for the primary address pool group. Valid values:</p>
     * <br>
     * <p>*   OPEN: enable</p>
     * <p>*   CLOSE: disable</p>
     */
    @NameInMap("DefaultMaxReturnAddrNum")
    public Integer defaultMaxReturnAddrNum;

    /**
     * <p>The maximum number of addresses returned from the primary address pool group.</p>
     */
    @NameInMap("DefaultMinAvailableAddrNum")
    public Integer defaultMinAvailableAddrNum;

    @NameInMap("FailoverAddrPool")
    public java.util.List<AddDnsGtmAccessStrategyRequestFailoverAddrPool> failoverAddrPool;

    /**
     * <p>The load balancing policy of the secondary address pool group. Valid values:</p>
     * <br>
     * <p>*   ALL_RR: returns all addresses.</p>
     * <p>*   RATIO: returns addresses by weight.</p>
     */
    @NameInMap("FailoverAddrPoolType")
    public String failoverAddrPoolType;

    /**
     * <p>The type of the access policy. Valid values:</p>
     * <br>
     * <p>*   GEO: geographical location-based</p>
     * <p>*   LATENCY: latency-based</p>
     */
    @NameInMap("FailoverLatencyOptimization")
    public String failoverLatencyOptimization;

    /**
     * <p>The minimum number of available addresses in the secondary address pool group.</p>
     */
    @NameInMap("FailoverLbaStrategy")
    public String failoverLbaStrategy;

    /**
     * <p>Specifies whether to enable scheduling optimization for latency resolution for the secondary address pool group. Valid values:</p>
     * <br>
     * <p>*   OPEN: enable</p>
     * <p>*   CLOSE: disable</p>
     */
    @NameInMap("FailoverMaxReturnAddrNum")
    public Integer failoverMaxReturnAddrNum;

    /**
     * <p>The maximum number of addresses returned from the secondary address pool group.</p>
     */
    @NameInMap("FailoverMinAvailableAddrNum")
    public Integer failoverMinAvailableAddrNum;

    /**
     * <p>The name of the access policy.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the primary address pool. Valid values:</p>
     * <br>
     * <p>*   IPV4</p>
     * <p>*   IPV6</p>
     * <p>*   DOMAIN</p>
     */
    @NameInMap("Lines")
    public String lines;

    /**
     * <p>The weight of the address pool in the primary address pool group.</p>
     */
    @NameInMap("StrategyMode")
    public String strategyMode;

    /**
     * <p>The line codes of source regions. For example: `["default", "drpeng"]` indicates Global and Dr. Peng Telecom & Media Group.</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    public static AddDnsGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmAccessStrategyRequest self = new AddDnsGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmAccessStrategyRequest setDefaultAddrPool(java.util.List<AddDnsGtmAccessStrategyRequestDefaultAddrPool> defaultAddrPool) {
        this.defaultAddrPool = defaultAddrPool;
        return this;
    }
    public java.util.List<AddDnsGtmAccessStrategyRequestDefaultAddrPool> getDefaultAddrPool() {
        return this.defaultAddrPool;
    }

    public AddDnsGtmAccessStrategyRequest setDefaultAddrPoolType(String defaultAddrPoolType) {
        this.defaultAddrPoolType = defaultAddrPoolType;
        return this;
    }
    public String getDefaultAddrPoolType() {
        return this.defaultAddrPoolType;
    }

    public AddDnsGtmAccessStrategyRequest setDefaultLatencyOptimization(String defaultLatencyOptimization) {
        this.defaultLatencyOptimization = defaultLatencyOptimization;
        return this;
    }
    public String getDefaultLatencyOptimization() {
        return this.defaultLatencyOptimization;
    }

    public AddDnsGtmAccessStrategyRequest setDefaultLbaStrategy(String defaultLbaStrategy) {
        this.defaultLbaStrategy = defaultLbaStrategy;
        return this;
    }
    public String getDefaultLbaStrategy() {
        return this.defaultLbaStrategy;
    }

    public AddDnsGtmAccessStrategyRequest setDefaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
        this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
        return this;
    }
    public Integer getDefaultMaxReturnAddrNum() {
        return this.defaultMaxReturnAddrNum;
    }

    public AddDnsGtmAccessStrategyRequest setDefaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
        this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
        return this;
    }
    public Integer getDefaultMinAvailableAddrNum() {
        return this.defaultMinAvailableAddrNum;
    }

    public AddDnsGtmAccessStrategyRequest setFailoverAddrPool(java.util.List<AddDnsGtmAccessStrategyRequestFailoverAddrPool> failoverAddrPool) {
        this.failoverAddrPool = failoverAddrPool;
        return this;
    }
    public java.util.List<AddDnsGtmAccessStrategyRequestFailoverAddrPool> getFailoverAddrPool() {
        return this.failoverAddrPool;
    }

    public AddDnsGtmAccessStrategyRequest setFailoverAddrPoolType(String failoverAddrPoolType) {
        this.failoverAddrPoolType = failoverAddrPoolType;
        return this;
    }
    public String getFailoverAddrPoolType() {
        return this.failoverAddrPoolType;
    }

    public AddDnsGtmAccessStrategyRequest setFailoverLatencyOptimization(String failoverLatencyOptimization) {
        this.failoverLatencyOptimization = failoverLatencyOptimization;
        return this;
    }
    public String getFailoverLatencyOptimization() {
        return this.failoverLatencyOptimization;
    }

    public AddDnsGtmAccessStrategyRequest setFailoverLbaStrategy(String failoverLbaStrategy) {
        this.failoverLbaStrategy = failoverLbaStrategy;
        return this;
    }
    public String getFailoverLbaStrategy() {
        return this.failoverLbaStrategy;
    }

    public AddDnsGtmAccessStrategyRequest setFailoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
        this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
        return this;
    }
    public Integer getFailoverMaxReturnAddrNum() {
        return this.failoverMaxReturnAddrNum;
    }

    public AddDnsGtmAccessStrategyRequest setFailoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
        this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
        return this;
    }
    public Integer getFailoverMinAvailableAddrNum() {
        return this.failoverMinAvailableAddrNum;
    }

    public AddDnsGtmAccessStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDnsGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddDnsGtmAccessStrategyRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

    public AddDnsGtmAccessStrategyRequest setStrategyMode(String strategyMode) {
        this.strategyMode = strategyMode;
        return this;
    }
    public String getStrategyMode() {
        return this.strategyMode;
    }

    public AddDnsGtmAccessStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public static class AddDnsGtmAccessStrategyRequestDefaultAddrPool extends TeaModel {
        /**
         * <p>The weight of the address pool in the secondary address pool group.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the address pool in the primary address pool group.</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        public static AddDnsGtmAccessStrategyRequestDefaultAddrPool build(java.util.Map<String, ?> map) throws Exception {
            AddDnsGtmAccessStrategyRequestDefaultAddrPool self = new AddDnsGtmAccessStrategyRequestDefaultAddrPool();
            return TeaModel.build(map, self);
        }

        public AddDnsGtmAccessStrategyRequestDefaultAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddDnsGtmAccessStrategyRequestDefaultAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

    }

    public static class AddDnsGtmAccessStrategyRequestFailoverAddrPool extends TeaModel {
        /**
         * <p>The ID of the access policy.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the address pool in the secondary address pool group.</p>
         */
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        public static AddDnsGtmAccessStrategyRequestFailoverAddrPool build(java.util.Map<String, ?> map) throws Exception {
            AddDnsGtmAccessStrategyRequestFailoverAddrPool self = new AddDnsGtmAccessStrategyRequestFailoverAddrPool();
            return TeaModel.build(map, self);
        }

        public AddDnsGtmAccessStrategyRequestFailoverAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddDnsGtmAccessStrategyRequestFailoverAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

    }

}
