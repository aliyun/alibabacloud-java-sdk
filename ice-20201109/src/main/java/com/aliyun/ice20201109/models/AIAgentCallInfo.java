// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentCallInfo extends TeaModel {
    /**
     * <p>The duration of the call, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("CallDuration")
    public Integer callDuration;

    /**
     * <p>The time the call ended, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-01T16:53:58.875932+00:00</p>
     */
    @NameInMap("CallEndTime")
    public String callEndTime;

    /**
     * <p>The time the call started, in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-01T16:53:53.184797+00:00</p>
     */
    @NameInMap("CallStartTime")
    public String callStartTime;

    /**
     * <p>The number of the called party.</p>
     * 
     * <strong>example:</strong>
     * <p>136******794</p>
     */
    @NameInMap("CalleeNumber")
    public String calleeNumber;

    /**
     * <p>The number of the calling party.</p>
     * 
     * <strong>example:</strong>
     * <p>183*****333</p>
     */
    @NameInMap("CallerNumber")
    public String callerNumber;

    /**
     * <p>Indicates which party ended the call.
     * 0: The agent ended the call.
     * 1: The user ended the call.
     * 2: The system ended the call for a transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HangupRole")
    public Integer hangupRole;

    /**
     * <p>The status of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Status")
    public String status;

    public static AIAgentCallInfo build(java.util.Map<String, ?> map) throws Exception {
        AIAgentCallInfo self = new AIAgentCallInfo();
        return TeaModel.build(map, self);
    }

    public AIAgentCallInfo setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
        return this;
    }
    public Integer getCallDuration() {
        return this.callDuration;
    }

    public AIAgentCallInfo setCallEndTime(String callEndTime) {
        this.callEndTime = callEndTime;
        return this;
    }
    public String getCallEndTime() {
        return this.callEndTime;
    }

    public AIAgentCallInfo setCallStartTime(String callStartTime) {
        this.callStartTime = callStartTime;
        return this;
    }
    public String getCallStartTime() {
        return this.callStartTime;
    }

    public AIAgentCallInfo setCalleeNumber(String calleeNumber) {
        this.calleeNumber = calleeNumber;
        return this;
    }
    public String getCalleeNumber() {
        return this.calleeNumber;
    }

    public AIAgentCallInfo setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
        return this;
    }
    public String getCallerNumber() {
        return this.callerNumber;
    }

    public AIAgentCallInfo setHangupRole(Integer hangupRole) {
        this.hangupRole = hangupRole;
        return this;
    }
    public Integer getHangupRole() {
        return this.hangupRole;
    }

    public AIAgentCallInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
