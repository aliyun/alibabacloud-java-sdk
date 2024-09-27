// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmAccessModeRequest extends TeaModel {
    /**
     * <p>The switchover policy for primary and secondary address pool sets. Valid values:</p>
     * <ul>
     * <li>AUTO: performs automatic switchover between the primary and secondary address pool sets upon failures.</li>
     * <li>DEFAULT: the primary address pool set</li>
     * <li>FAILOVER: the secondary address pool set</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>The language of the values for specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>strategyId</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static SetDnsGtmAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDnsGtmAccessModeRequest self = new SetDnsGtmAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public SetDnsGtmAccessModeRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public SetDnsGtmAccessModeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetDnsGtmAccessModeRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
