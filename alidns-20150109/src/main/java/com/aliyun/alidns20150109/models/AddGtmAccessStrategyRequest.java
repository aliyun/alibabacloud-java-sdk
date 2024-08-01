// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAccessStrategyRequest extends TeaModel {
    /**
     * <p>The line codes of access regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;default&quot;, &quot;drpeng&quot;]</p>
     */
    @NameInMap("AccessLines")
    public String accessLines;

    /**
     * <p>The ID of the default address pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hrsix</p>
     */
    @NameInMap("DefaultAddrPoolId")
    public String defaultAddrPoolId;

    /**
     * <p>The ID of the failover address pool.</p>
     * <p>If the failover address pool is not set, pass the <strong>Empty</strong> value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hrsyw</p>
     */
    @NameInMap("FailoverAddrPoolId")
    public String failoverAddrPoolId;

    /**
     * <p>The ID of the GTM instance for which you want to create an access policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language used by the user.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the access policy.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    public static AddGtmAccessStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGtmAccessStrategyRequest self = new AddGtmAccessStrategyRequest();
        return TeaModel.build(map, self);
    }

    public AddGtmAccessStrategyRequest setAccessLines(String accessLines) {
        this.accessLines = accessLines;
        return this;
    }
    public String getAccessLines() {
        return this.accessLines;
    }

    public AddGtmAccessStrategyRequest setDefaultAddrPoolId(String defaultAddrPoolId) {
        this.defaultAddrPoolId = defaultAddrPoolId;
        return this;
    }
    public String getDefaultAddrPoolId() {
        return this.defaultAddrPoolId;
    }

    public AddGtmAccessStrategyRequest setFailoverAddrPoolId(String failoverAddrPoolId) {
        this.failoverAddrPoolId = failoverAddrPoolId;
        return this;
    }
    public String getFailoverAddrPoolId() {
        return this.failoverAddrPoolId;
    }

    public AddGtmAccessStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddGtmAccessStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddGtmAccessStrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

}
