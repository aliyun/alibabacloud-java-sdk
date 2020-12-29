// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SwitchDnsGtmInstanceStrategyModeRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StrategyMode")
    public String strategyMode;

    public static SwitchDnsGtmInstanceStrategyModeRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDnsGtmInstanceStrategyModeRequest self = new SwitchDnsGtmInstanceStrategyModeRequest();
        return TeaModel.build(map, self);
    }

    public SwitchDnsGtmInstanceStrategyModeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SwitchDnsGtmInstanceStrategyModeRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SwitchDnsGtmInstanceStrategyModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SwitchDnsGtmInstanceStrategyModeRequest setStrategyMode(String strategyMode) {
        this.strategyMode = strategyMode;
        return this;
    }
    public String getStrategyMode() {
        return this.strategyMode;
    }

}
