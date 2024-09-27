// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmAccessModeRequest extends TeaModel {
    /**
     * <p>The desired access policy. Valid values:</p>
     * <ul>
     * <li><strong>AUTO: performs automatic switchover between the primary and secondary address pool sets upon failures.</strong></li>
     * <li><strong>DEFAULT: specifies the primary address pool set.</strong></li>
     * <li>**FAILOVER: specifies the secondary address pool set.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the access policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0hx</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static SetGtmAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGtmAccessModeRequest self = new SetGtmAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public SetGtmAccessModeRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public SetGtmAccessModeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetGtmAccessModeRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
