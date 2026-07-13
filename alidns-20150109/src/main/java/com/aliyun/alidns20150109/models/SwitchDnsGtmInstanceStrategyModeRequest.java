// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SwitchDnsGtmInstanceStrategyModeRequest extends TeaModel {
    /**
     * <p>The ID of the instance. To obtain the ID, call <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describednsgtminstances?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDnsGtmInstances</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-cs02xyk4a**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of some returned parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The access strategy mode. Valid values:</p>
     * <ul>
     * <li><p>GEO: Geolocation-based</p>
     * </li>
     * <li><p>LATENCY: Latency-based</p>
     * </li>
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
