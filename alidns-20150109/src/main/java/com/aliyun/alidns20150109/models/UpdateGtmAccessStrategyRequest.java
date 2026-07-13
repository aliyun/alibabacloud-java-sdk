// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateGtmAccessStrategyRequest extends TeaModel {
    /**
     * <p>The source of the DNS requests.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;default&quot;, &quot;mobile&quot;]</p>
     */
    @NameInMap("AccessLines")
    public String accessLines;

    /**
     * <p>The ID of the primary address pool collection.</p>
     * 
     * <strong>example:</strong>
     * <p>hrsix</p>
     */
    @NameInMap("DefaultAddrPoolId")
    public String defaultAddrPoolId;

    /**
     * <p>The ID of the failover address pool collection.</p>
     * 
     * <strong>example:</strong>
     * <p>hrsyw</p>
     */
    @NameInMap("FailoverAddrPoolId")
    public String failoverAddrPoolId;

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
     * <p>hrmxc</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    /**
     * <p>The name of the access policy.</p>
     * 
     * <strong>example:</strong>
     * <p>访问策略测试</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    public static UpdateGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGtmAccessStrategyRequest self = new UpdateGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGtmAccessStrategyRequest setAccessLines(String accessLines) {
        this.accessLines = accessLines;
        return this;
    }
    public String getAccessLines() {
        return this.accessLines;
    }

    public UpdateGtmAccessStrategyRequest setDefaultAddrPoolId(String defaultAddrPoolId) {
        this.defaultAddrPoolId = defaultAddrPoolId;
        return this;
    }
    public String getDefaultAddrPoolId() {
        return this.defaultAddrPoolId;
    }

    public UpdateGtmAccessStrategyRequest setFailoverAddrPoolId(String failoverAddrPoolId) {
        this.failoverAddrPoolId = failoverAddrPoolId;
        return this;
    }
    public String getFailoverAddrPoolId() {
        return this.failoverAddrPoolId;
    }

    public UpdateGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateGtmAccessStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

    public UpdateGtmAccessStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

}
