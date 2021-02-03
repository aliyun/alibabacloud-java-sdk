// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsGtmAccessStrategyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("StrategyId")
    public String strategyId;

    @NameInMap("StrategyName")
    public String strategyName;

    @NameInMap("Lines")
    public String lines;

    @NameInMap("DefaultAddrPoolType")
    public String defaultAddrPoolType;

    @NameInMap("DefaultLbaStrategy")
    public String defaultLbaStrategy;

    @NameInMap("DefaultMinAvailableAddrNum")
    public Integer defaultMinAvailableAddrNum;

    @NameInMap("DefaultMaxReturnAddrNum")
    public Integer defaultMaxReturnAddrNum;

    @NameInMap("DefaultLatencyOptimization")
    public String defaultLatencyOptimization;

    @NameInMap("FailoverAddrPoolType")
    public String failoverAddrPoolType;

    @NameInMap("FailoverLbaStrategy")
    public String failoverLbaStrategy;

    @NameInMap("FailoverMinAvailableAddrNum")
    public Integer failoverMinAvailableAddrNum;

    @NameInMap("FailoverMaxReturnAddrNum")
    public Integer failoverMaxReturnAddrNum;

    @NameInMap("FailoverLatencyOptimization")
    public String failoverLatencyOptimization;

    @NameInMap("DefaultAddrPool")
    public java.util.List<UpdateDnsGtmAccessStrategyRequestDefaultAddrPool> defaultAddrPool;

    @NameInMap("FailoverAddrPool")
    public java.util.List<UpdateDnsGtmAccessStrategyRequestFailoverAddrPool> failoverAddrPool;

    public static UpdateDnsGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsGtmAccessStrategyRequest self = new UpdateDnsGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsGtmAccessStrategyRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
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

    public UpdateDnsGtmAccessStrategyRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultAddrPoolType(String defaultAddrPoolType) {
        this.defaultAddrPoolType = defaultAddrPoolType;
        return this;
    }
    public String getDefaultAddrPoolType() {
        return this.defaultAddrPoolType;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultLbaStrategy(String defaultLbaStrategy) {
        this.defaultLbaStrategy = defaultLbaStrategy;
        return this;
    }
    public String getDefaultLbaStrategy() {
        return this.defaultLbaStrategy;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
        this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
        return this;
    }
    public Integer getDefaultMinAvailableAddrNum() {
        return this.defaultMinAvailableAddrNum;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
        this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
        return this;
    }
    public Integer getDefaultMaxReturnAddrNum() {
        return this.defaultMaxReturnAddrNum;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultLatencyOptimization(String defaultLatencyOptimization) {
        this.defaultLatencyOptimization = defaultLatencyOptimization;
        return this;
    }
    public String getDefaultLatencyOptimization() {
        return this.defaultLatencyOptimization;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverAddrPoolType(String failoverAddrPoolType) {
        this.failoverAddrPoolType = failoverAddrPoolType;
        return this;
    }
    public String getFailoverAddrPoolType() {
        return this.failoverAddrPoolType;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverLbaStrategy(String failoverLbaStrategy) {
        this.failoverLbaStrategy = failoverLbaStrategy;
        return this;
    }
    public String getFailoverLbaStrategy() {
        return this.failoverLbaStrategy;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
        this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
        return this;
    }
    public Integer getFailoverMinAvailableAddrNum() {
        return this.failoverMinAvailableAddrNum;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
        this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
        return this;
    }
    public Integer getFailoverMaxReturnAddrNum() {
        return this.failoverMaxReturnAddrNum;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverLatencyOptimization(String failoverLatencyOptimization) {
        this.failoverLatencyOptimization = failoverLatencyOptimization;
        return this;
    }
    public String getFailoverLatencyOptimization() {
        return this.failoverLatencyOptimization;
    }

    public UpdateDnsGtmAccessStrategyRequest setDefaultAddrPool(java.util.List<UpdateDnsGtmAccessStrategyRequestDefaultAddrPool> defaultAddrPool) {
        this.defaultAddrPool = defaultAddrPool;
        return this;
    }
    public java.util.List<UpdateDnsGtmAccessStrategyRequestDefaultAddrPool> getDefaultAddrPool() {
        return this.defaultAddrPool;
    }

    public UpdateDnsGtmAccessStrategyRequest setFailoverAddrPool(java.util.List<UpdateDnsGtmAccessStrategyRequestFailoverAddrPool> failoverAddrPool) {
        this.failoverAddrPool = failoverAddrPool;
        return this;
    }
    public java.util.List<UpdateDnsGtmAccessStrategyRequestFailoverAddrPool> getFailoverAddrPool() {
        return this.failoverAddrPool;
    }

    public static class UpdateDnsGtmAccessStrategyRequestDefaultAddrPool extends TeaModel {
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Id")
        public String id;

        public static UpdateDnsGtmAccessStrategyRequestDefaultAddrPool build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmAccessStrategyRequestDefaultAddrPool self = new UpdateDnsGtmAccessStrategyRequestDefaultAddrPool();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmAccessStrategyRequestDefaultAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public UpdateDnsGtmAccessStrategyRequestDefaultAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class UpdateDnsGtmAccessStrategyRequestFailoverAddrPool extends TeaModel {
        @NameInMap("LbaWeight")
        public Integer lbaWeight;

        @NameInMap("Id")
        public String id;

        public static UpdateDnsGtmAccessStrategyRequestFailoverAddrPool build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsGtmAccessStrategyRequestFailoverAddrPool self = new UpdateDnsGtmAccessStrategyRequestFailoverAddrPool();
            return TeaModel.build(map, self);
        }

        public UpdateDnsGtmAccessStrategyRequestFailoverAddrPool setLbaWeight(Integer lbaWeight) {
            this.lbaWeight = lbaWeight;
            return this;
        }
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        public UpdateDnsGtmAccessStrategyRequestFailoverAddrPool setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
