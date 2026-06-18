// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class JoinThirdCallRequest extends TeaModel {
    /**
     * <p>Agent account name (agent logon name)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:123@123.com">123@123.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>acid from WebSocket after an inbound call</p>
     * 
     * <strong>example:</strong>
     * <p>7719786</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>Unique customer request ID used for idempotency validation; can be generated using UUID</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>connId from WebSocket after an inbound call</p>
     * 
     * <strong>example:</strong>
     * <p>7719788</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>holdConnId from WebSocket after an inbound call (only provided during two-step transfer)</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HoldConnectionId")
    public String holdConnectionId;

    /**
     * <p>AICCS instance ID, visible in the Artificial Intelligence Cloud Call Service console</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>jobId from WebSocket after an inbound call</p>
     * 
     * <strong>example:</strong>
     * <p>7719787</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static JoinThirdCallRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinThirdCallRequest self = new JoinThirdCallRequest();
        return TeaModel.build(map, self);
    }

    public JoinThirdCallRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public JoinThirdCallRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public JoinThirdCallRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public JoinThirdCallRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public JoinThirdCallRequest setHoldConnectionId(String holdConnectionId) {
        this.holdConnectionId = holdConnectionId;
        return this;
    }
    public String getHoldConnectionId() {
        return this.holdConnectionId;
    }

    public JoinThirdCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public JoinThirdCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
