// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyAvailableConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("StrategyMode")
    @Validation(required = true)
    public String strategyMode;

    public static DescribeDnsGtmAccessStrategyAvailableConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyAvailableConfigRequest self = new DescribeDnsGtmAccessStrategyAvailableConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigRequest setStrategyMode(String strategyMode) {
        this.strategyMode = strategyMode;
        return this;
    }
    public String getStrategyMode() {
        return this.strategyMode;
    }

}
