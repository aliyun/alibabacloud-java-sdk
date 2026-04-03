// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentCallInfo extends TeaModel {
    @NameInMap("CallDuration")
    public Integer callDuration;

    @NameInMap("CallEndTime")
    public String callEndTime;

    @NameInMap("CallStartTime")
    public String callStartTime;

    @NameInMap("CalleeNumber")
    public String calleeNumber;

    @NameInMap("CallerNumber")
    public String callerNumber;

    @NameInMap("HangupRole")
    public Integer hangupRole;

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
