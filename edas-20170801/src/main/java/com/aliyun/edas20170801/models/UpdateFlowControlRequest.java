// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateFlowControlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("ConsumerAppId")
    public String consumerAppId;

    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Strategy")
    public String strategy;

    @NameInMap("Threshold")
    public Integer threshold;

    @NameInMap("UrlVar")
    public String urlVar;

    public static UpdateFlowControlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowControlRequest self = new UpdateFlowControlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowControlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateFlowControlRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public UpdateFlowControlRequest setConsumerAppId(String consumerAppId) {
        this.consumerAppId = consumerAppId;
        return this;
    }
    public String getConsumerAppId() {
        return this.consumerAppId;
    }

    public UpdateFlowControlRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public UpdateFlowControlRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public UpdateFlowControlRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public UpdateFlowControlRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateFlowControlRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public UpdateFlowControlRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

    public UpdateFlowControlRequest setUrlVar(String urlVar) {
        this.urlVar = urlVar;
        return this;
    }
    public String getUrlVar() {
        return this.urlVar;
    }

}
