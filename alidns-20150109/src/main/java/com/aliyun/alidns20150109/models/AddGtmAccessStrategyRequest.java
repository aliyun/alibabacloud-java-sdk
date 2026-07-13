// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmAccessStrategyRequest extends TeaModel {
    /**
     * <p>The source of the DNS requests.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;default&quot;, &quot;drpeng&quot;]</p>
     */
    @NameInMap("AccessLines")
    public String accessLines;

    /**
     * <p>The ID of the primary address pool collection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hrsix</p>
     */
    @NameInMap("DefaultAddrPoolId")
    public String defaultAddrPoolId;

    /**
     * <p>The ID of the failover address pool collection.</p>
     * <p>If a failover address pool collection is not configured, set this parameter to <strong>EMPTY</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hrsyw</p>
     */
    @NameInMap("FailoverAddrPoolId")
    public String failoverAddrPoolId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The policy name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>访问策略测试</p>
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
