// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ForwardAIAgentCallRequest extends TeaModel {
    /**
     * <p>The target phone number for call transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>13**********</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The caller phone number for the transferred call. Optional.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>By default, the CallerNumber is the agent\&quot;s phone number after the call starts:
     * 1\. For inbound lines, the agent number is the agent’s seat number.
     * 2\. For outbound lines, the agent number is the original caller number.</p>
     * <blockquote>
     * <p>Warning: </p>
     * </blockquote>
     * <p>Alibaba Cloud lines do not support this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>13**********</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p>Abnormal prompt text played when the transfer fails. Default is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>We’re sorry, we’re unable to transfer your call at the moment. Please try again later.</p>
     */
    @NameInMap("ErrorPrompt")
    public String errorPrompt;

    /**
     * <p>Current call instance ID, used only in inbound call transfer scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>call_instance_202******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Prompt message played before initiating the transfer. If empty, the system skips the prompt and plays the ringing tone directly. Default is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>Please hold while I transfer your call.</p>
     */
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

    public ForwardAIAgentCallRequest setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
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
