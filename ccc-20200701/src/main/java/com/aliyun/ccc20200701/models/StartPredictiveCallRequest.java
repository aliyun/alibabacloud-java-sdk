// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartPredictiveCallRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("Callee")
    public String callee;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("ContactFlowVariables")
    public String contactFlowVariables;

    public static StartPredictiveCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartPredictiveCallRequest self = new StartPredictiveCallRequest();
        return TeaModel.build(map, self);
    }

    public StartPredictiveCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartPredictiveCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartPredictiveCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartPredictiveCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public StartPredictiveCallRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public StartPredictiveCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public StartPredictiveCallRequest setContactFlowVariables(String contactFlowVariables) {
        this.contactFlowVariables = contactFlowVariables;
        return this;
    }
    public String getContactFlowVariables() {
        return this.contactFlowVariables;
    }

}
