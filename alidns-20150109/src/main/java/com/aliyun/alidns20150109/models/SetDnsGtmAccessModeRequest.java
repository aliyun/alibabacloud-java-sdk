// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmAccessModeRequest extends TeaModel {
    /**
     * <p>The switchover policy for the address pool collection:</p>
     * <ul>
     * <li><p>AUTO: Automatic switchover</p>
     * </li>
     * <li><p>DEFAULT: The primary address pool collection</p>
     * </li>
     * <li><p>FAILOVER: The secondary address pool collection</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>The language of certain response parameters. Default: en. Valid values: en, zh, and ja.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the access policy. Call <a href="https://help.aliyun.com/document_detail/2357191.html">DescribeDnsGtmAccessStrategies</a> to obtain the policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hr**zb</p>
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
