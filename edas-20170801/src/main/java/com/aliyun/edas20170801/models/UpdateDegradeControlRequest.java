// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateDegradeControlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("RtThreshold")
    public Integer rtThreshold;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("UrlVar")
    public String urlVar;

    @NameInMap("RuleType")
    public String ruleType;

    public static UpdateDegradeControlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDegradeControlRequest self = new UpdateDegradeControlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDegradeControlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateDegradeControlRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateDegradeControlRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public UpdateDegradeControlRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public UpdateDegradeControlRequest setRtThreshold(Integer rtThreshold) {
        this.rtThreshold = rtThreshold;
        return this;
    }
    public Integer getRtThreshold() {
        return this.rtThreshold;
    }

    public UpdateDegradeControlRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateDegradeControlRequest setUrlVar(String urlVar) {
        this.urlVar = urlVar;
        return this;
    }
    public String getUrlVar() {
        return this.urlVar;
    }

    public UpdateDegradeControlRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
