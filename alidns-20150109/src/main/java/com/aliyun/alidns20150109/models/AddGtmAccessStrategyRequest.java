// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAccessStrategyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("StrategyName")
    @Validation(required = true)
    public String strategyName;

    @NameInMap("DefaultAddrPoolId")
    @Validation(required = true)
    public String defaultAddrPoolId;

    @NameInMap("FailoverAddrPoolId")
    @Validation(required = true)
    public String failoverAddrPoolId;

    @NameInMap("AccessLines")
    @Validation(required = true)
    public String accessLines;

    public static AddGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAccessStrategyRequest self = new AddGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public AddGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddGtmAccessStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddGtmAccessStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public AddGtmAccessStrategyRequest setDefaultAddrPoolId(String defaultAddrPoolId) {
        this.defaultAddrPoolId = defaultAddrPoolId;
        return this;
    }
    public String getDefaultAddrPoolId() {
        return this.defaultAddrPoolId;
    }

    public AddGtmAccessStrategyRequest setFailoverAddrPoolId(String failoverAddrPoolId) {
        this.failoverAddrPoolId = failoverAddrPoolId;
        return this;
    }
    public String getFailoverAddrPoolId() {
        return this.failoverAddrPoolId;
    }

    public AddGtmAccessStrategyRequest setAccessLines(String accessLines) {
        this.accessLines = accessLines;
        return this;
    }
    public String getAccessLines() {
        return this.accessLines;
    }

}
