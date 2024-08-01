// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAccessStrategyAvailableConfigRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the access policy. Valid values:</p>
     * <ul>
     * <li>GEO: geographical location-based</li>
     * <li>LATENCY: latency-based</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>geo</p>
     */
    @NameInMap("StrategyMode")
    public String strategyMode;

    public static DescribeDnsGtmAccessStrategyAvailableConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAccessStrategyAvailableConfigRequest self = new DescribeDnsGtmAccessStrategyAvailableConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsGtmAccessStrategyAvailableConfigRequest setStrategyMode(String strategyMode) {
        this.strategyMode = strategyMode;
        return this;
    }
    public String getStrategyMode() {
        return this.strategyMode;
    }

}
