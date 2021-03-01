// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertFlowControlRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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

    public static InsertFlowControlRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertFlowControlRequest self = new InsertFlowControlRequest();
        return TeaModel.build(map, self);
    }

    public InsertFlowControlRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InsertFlowControlRequest setConsumerAppId(String consumerAppId) {
        this.consumerAppId = consumerAppId;
        return this;
    }
    public String getConsumerAppId() {
        return this.consumerAppId;
    }

    public InsertFlowControlRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public InsertFlowControlRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public InsertFlowControlRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public InsertFlowControlRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public InsertFlowControlRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public InsertFlowControlRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

    public InsertFlowControlRequest setUrlVar(String urlVar) {
        this.urlVar = urlVar;
        return this;
    }
    public String getUrlVar() {
        return this.urlVar;
    }

}
