// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAccessStrategyRequest extends TeaModel {
    /**
     * <p>The switchover policy for the address pool collection:</p>
     * <ul>
     * <li><p>AUTO: Automatic switchover</p>
     * </li>
     * <li><p>DEFAULT: Primary address pool collection</p>
     * </li>
     * <li><p>FAILOVER: Failover address pool collection</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>The primary address pool collection.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DefaultAddrPool")
    public java.util.List<UpdateDnsGtmAccessStrategyRequestDefaultAddrPool> defaultAddrPool;

    /**
     * <p>The type of the primary address pool:</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
     * <li><p>DOMAIN</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPV4</p>
     */
    @NameInMap("DefaultAddrPoolType")
    public String defaultAddrPoolType;

    /**
     * <p>Specifies whether to enable latency-based scheduling for the primary address pool collection:</p>
     * <ul>
     * <li><p>OPEN: Enabled</p>
     * </li>
     * <li><p>CLOSE: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("DefaultLatencyOptimization")
    public String defaultLatencyOptimization;

    /**
     * <p>The load balancing policy for the primary address pool collection:</p>
     * <ul>
     * <li><p>ALL_RR: Returns all addresses.</p>
     * </li>
     * <li><p>RATIO: Returns addresses by weight.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL_RR</p>
     */
    @NameInMap("DefaultLbaStrategy")
    public String defaultLbaStrategy;

    /**
     * <p>The maximum number of addresses returned from the primary address pool collection.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultMaxReturnAddrNum")
    public Integer defaultMaxReturnAddrNum;

    /**
     * <p>The minimum number of available addresses in the primary address pool collection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultMinAvailableAddrNum")
    public Integer defaultMinAvailableAddrNum;

    /**
     * <p>The failover address pool collection. If no failover address pool collection is configured, enter &quot;EMPTY&quot;.</p>
     */
    @NameInMap("FailoverAddrPool")
    public java.util.List<UpdateDnsGtmAccessStrategyRequestFailoverAddrPool> failoverAddrPool;

    /**
     * <p>The type of the failover address pool:</p>
     * <ul>
     * <li><p>IPV4</p>
     * </li>
     * <li><p>IPV6</p>
     * </li>
     * <li><p>DOMAIN</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IPV4</p>
     */
    @NameInMap("FailoverAddrPoolType")
    public String failoverAddrPoolType;

    /**
     * <p>Specifies whether to enable latency-based scheduling for the failover address pool collection:</p>
     * <ul>
     * <li><p>OPEN: Enabled</p>
     * </li>
     * <li><p>CLOSE: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("FailoverLatencyOptimization")
    public String failoverLatencyOptimization;

    /**
     * <p>The load balancing policy for the failover address pool collection:</p>
     * <ul>
     * <li><p>ALL_RR: Returns all addresses.</p>
     * </li>
     * <li><p>RATIO: Returns addresses by weight.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALL_RR</p>
     */
    @NameInMap("FailoverLbaStrategy")
    public String failoverLbaStrategy;

    /**
     * <p>The maximum number of addresses returned from the failover address pool collection.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailoverMaxReturnAddrNum")
    public Integer failoverMaxReturnAddrNum;

    /**
     * <p>The minimum number of available addresses in the failover address pool collection.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FailoverMinAvailableAddrNum")
    public Integer failoverMinAvailableAddrNum;

    /**
     * <p>The language of the response. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The line codes of the access regions. For example, <code>[&quot;default&quot;, &quot;drpeng&quot;]</code> specifies the global line and the Dr. Peng line.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;default&quot;, &quot;drpeng&quot;]</p>
     */
    @NameInMap("Lines")
    public String lines;

    /**
     * <p>The ID of the policy. To obtain the policy ID, call <a href="https://help.aliyun.com/document_detail/2357191.html">DescribeDnsGtmAccessStrategies</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hrb**</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    /**
     * <p>The name of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
         * <p>The ID of the address pool in the primary address pool collection.</p>
         * 
         * <strong>example:</strong>
         * <p>po***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The weight of the address pool in the primary address pool collection.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The ID of the address pool in the failover address pool collection.</p>
         * 
         * <strong>example:</strong>
         * <p>po**</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The weight of the address pool in the failover address pool collection.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
