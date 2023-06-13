// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateFlowRuleRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("ControlBehavior")
    public Integer controlBehavior;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("MaxQueueingTimeMs")
    public Integer maxQueueingTimeMs;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("Threshold")
    public Integer threshold;

    public static CreateFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowRuleRequest self = new CreateFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowRuleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateFlowRuleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateFlowRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateFlowRuleRequest setControlBehavior(Integer controlBehavior) {
        this.controlBehavior = controlBehavior;
        return this;
    }
    public Integer getControlBehavior() {
        return this.controlBehavior;
    }

    public CreateFlowRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateFlowRuleRequest setMaxQueueingTimeMs(Integer maxQueueingTimeMs) {
        this.maxQueueingTimeMs = maxQueueingTimeMs;
        return this;
    }
    public Integer getMaxQueueingTimeMs() {
        return this.maxQueueingTimeMs;
    }

    public CreateFlowRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateFlowRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateFlowRuleRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

}
