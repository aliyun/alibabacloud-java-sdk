// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmAccessStrategyRequest extends TeaModel {
    @NameInMap("AccessLines")
    public String accessLines;

    @NameInMap("DefaultAddrPoolId")
    public String defaultAddrPoolId;

    @NameInMap("FailoverAddrPoolId")
    public String failoverAddrPoolId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StrategyId")
    public String strategyId;

    @NameInMap("StrategyName")
    public String strategyName;

    public static UpdateGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmAccessStrategyRequest self = new UpdateGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmAccessStrategyRequest setAccessLines(String accessLines) {
        this.accessLines = accessLines;
        return this;
    }
    public String getAccessLines() {
        return this.accessLines;
    }

    public UpdateGtmAccessStrategyRequest setDefaultAddrPoolId(String defaultAddrPoolId) {
        this.defaultAddrPoolId = defaultAddrPoolId;
        return this;
    }
    public String getDefaultAddrPoolId() {
        return this.defaultAddrPoolId;
    }

    public UpdateGtmAccessStrategyRequest setFailoverAddrPoolId(String failoverAddrPoolId) {
        this.failoverAddrPoolId = failoverAddrPoolId;
        return this;
    }
    public String getFailoverAddrPoolId() {
        return this.failoverAddrPoolId;
    }

    public UpdateGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmAccessStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public UpdateGtmAccessStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

}
