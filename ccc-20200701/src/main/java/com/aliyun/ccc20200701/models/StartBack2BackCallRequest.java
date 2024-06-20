// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class StartBack2BackCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0102156****</p>
     */
    @NameInMap("AdditionalBroker")
    public String additionalBroker;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0102157****</p>
     */
    @NameInMap("Broker")
    public String broker;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1372168****</p>
     */
    @NameInMap("Callee")
    public String callee;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1391814****</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static StartBack2BackCallRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBack2BackCallRequest self = new StartBack2BackCallRequest();
        return TeaModel.build(map, self);
    }

    public StartBack2BackCallRequest setAdditionalBroker(String additionalBroker) {
        this.additionalBroker = additionalBroker;
        return this;
    }
    public String getAdditionalBroker() {
        return this.additionalBroker;
    }

    public StartBack2BackCallRequest setBroker(String broker) {
        this.broker = broker;
        return this;
    }
    public String getBroker() {
        return this.broker;
    }

    public StartBack2BackCallRequest setCallee(String callee) {
        this.callee = callee;
        return this;
    }
    public String getCallee() {
        return this.callee;
    }

    public StartBack2BackCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public StartBack2BackCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartBack2BackCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public StartBack2BackCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
