// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartBack2BackCallRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("Callee")
    public String callee;

    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    @NameInMap("Broker")
    public String broker;

    @NameInMap("AdditionalBroker")
    public String additionalBroker;

    @NameInMap("Tags")
    public String tags;

    public static StartBack2BackCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBack2BackCallRequest self = new StartBack2BackCallRequest();
        return TeaModel.build(map, self);
    }

    public StartBack2BackCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartBack2BackCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartBack2BackCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartBack2BackCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public StartBack2BackCallRequest setBroker(String broker) {
        this.broker = broker;
        return this;
    }
    public String getBroker() {
        return this.broker;
    }

    public StartBack2BackCallRequest setAdditionalBroker(String additionalBroker) {
        this.additionalBroker = additionalBroker;
        return this;
    }
    public String getAdditionalBroker() {
        return this.additionalBroker;
    }

    public StartBack2BackCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
