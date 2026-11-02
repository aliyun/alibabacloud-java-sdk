// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ForwardAIAgentCallRequest extends TeaModel {
    /**
     * <p>The destination phone number to which the call is transferred.</p>
     * 
     * <strong>example:</strong>
     * <p>13**********</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>The caller phone number for the transferred call. This parameter is optional.</p>
     * <notice>
     * By default, CallerNumber is the phone number of the agent after the call is started: 1. For inbound lines, the agent number is the agent seat number. 2. For outbound lines, the agent number is the caller number.</notice>
     * <warning>Alibaba Cloud lines do not support this parameter.</warning>
     * 
     * <strong>example:</strong>
     * <p>13**********</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p>The error prompt text to play when the transfer fails. Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>We’re sorry, we’re unable to transfer your call at the moment. Please try again later.</p>
     */
    @NameInMap("ErrorPrompt")
    public String errorPrompt;

    /**
     * <p>The current call instance ID. This parameter is used only in inbound call transfer scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>call_instance_202******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The prompt text to play before the transfer begins. If this parameter is left empty, the prompt is skipped and the ringtone is played directly. Default value: empty.</p>
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
