// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertDegradeControlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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

    public static InsertDegradeControlRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertDegradeControlRequest self = new InsertDegradeControlRequest();
        return TeaModel.build(map, self);
    }

    public InsertDegradeControlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InsertDegradeControlRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public InsertDegradeControlRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public InsertDegradeControlRequest setRtThreshold(Integer rtThreshold) {
        this.rtThreshold = rtThreshold;
        return this;
    }
    public Integer getRtThreshold() {
        return this.rtThreshold;
    }

    public InsertDegradeControlRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public InsertDegradeControlRequest setUrlVar(String urlVar) {
        this.urlVar = urlVar;
        return this;
    }
    public String getUrlVar() {
        return this.urlVar;
    }

    public InsertDegradeControlRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
