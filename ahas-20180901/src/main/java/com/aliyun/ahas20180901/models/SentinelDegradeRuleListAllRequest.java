// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelDegradeRuleListAllRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    public static SentinelDegradeRuleListAllRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelDegradeRuleListAllRequest self = new SentinelDegradeRuleListAllRequest();
        return TeaModel.build(map, self);
    }

    public SentinelDegradeRuleListAllRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelDegradeRuleListAllRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelDegradeRuleListAllRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public SentinelDegradeRuleListAllRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
