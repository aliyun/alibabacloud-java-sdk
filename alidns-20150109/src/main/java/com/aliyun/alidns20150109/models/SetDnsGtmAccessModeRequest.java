// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmAccessModeRequest extends TeaModel {
    /**
     * <p>The primary/secondary switchover policy for address pool groups. Valid values:</p>
     * <br>
     * <p>*   AUTO: performs automatic switchover between the primary and secondary address pool groups upon failures.</p>
     * <p>*   DEFAULT: uses the primary address pool group.</p>
     * <p>*   FAILOVER: uses the secondary address pool group.</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the policy.</p>
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
