// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelAllDefaultCircuitBreakerRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    public static ListSentinelAllDefaultCircuitBreakerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelAllDefaultCircuitBreakerRuleRequest self = new ListSentinelAllDefaultCircuitBreakerRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListSentinelAllDefaultCircuitBreakerRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListSentinelAllDefaultCircuitBreakerRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSentinelAllDefaultCircuitBreakerRuleRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public ListSentinelAllDefaultCircuitBreakerRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
