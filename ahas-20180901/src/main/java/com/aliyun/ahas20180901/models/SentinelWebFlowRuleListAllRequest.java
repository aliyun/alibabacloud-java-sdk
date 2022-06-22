// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelWebFlowRuleListAllRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelWebFlowRuleListAllRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelWebFlowRuleListAllRequest self = new SentinelWebFlowRuleListAllRequest();
        return TeaModel.build(map, self);
    }

    public SentinelWebFlowRuleListAllRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelWebFlowRuleListAllRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelWebFlowRuleListAllRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public SentinelWebFlowRuleListAllRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
