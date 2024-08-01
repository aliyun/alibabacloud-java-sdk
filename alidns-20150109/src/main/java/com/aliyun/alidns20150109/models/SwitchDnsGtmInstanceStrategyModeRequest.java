// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SwitchDnsGtmInstanceStrategyModeRequest extends TeaModel {
    /**
     * <p>The ID of the GTM instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The access policy type. Valid values:</p>
     * <ul>
     * <li>GEO: geographical location-based</li>
     * <li>LATENCY: latency-based</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GEO</p>
     */
    @NameInMap("StrategyMode")
    public String strategyMode;

    public static SwitchDnsGtmInstanceStrategyModeRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchDnsGtmInstanceStrategyModeRequest self = new SwitchDnsGtmInstanceStrategyModeRequest();
        return TeaModel.build(map, self);
    }

    public SwitchDnsGtmInstanceStrategyModeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SwitchDnsGtmInstanceStrategyModeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SwitchDnsGtmInstanceStrategyModeRequest setStrategyMode(String strategyMode) {
        this.strategyMode = strategyMode;
        return this;
    }
    public String getStrategyMode() {
        return this.strategyMode;
    }

}
