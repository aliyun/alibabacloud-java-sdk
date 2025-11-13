// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ForwardAIAgentCallRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13**********</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("ErrorPrompt")
    public String errorPrompt;

    /**
     * <strong>example:</strong>
     * <p>call_instance_202******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TransferPrompt")
    public String transferPrompt;

    public static ForwardAIAgentCallRequest build(java.util.Map<String, ?> map) throws Exception {
        ForwardAIAgentCallRequest self = new ForwardAIAgentCallRequest();
        return TeaModel.build(map, self);
    }

    public ForwardAIAgentCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public ForwardAIAgentCallRequest setErrorPrompt(String errorPrompt) {
        this.errorPrompt = errorPrompt;
        return this;
    }
    public String getErrorPrompt() {
        return this.errorPrompt;
    }

    public ForwardAIAgentCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ForwardAIAgentCallRequest setTransferPrompt(String transferPrompt) {
        this.transferPrompt = transferPrompt;
        return this;
    }
    public String getTransferPrompt() {
        return this.transferPrompt;
    }

}
