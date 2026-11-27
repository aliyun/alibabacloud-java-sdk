// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HoldCallRequest extends TeaModel {
    /**
     * <p>The agent account name, which is the agent logon name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:123@123.com">123@123.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The ACID in the WebSocket connection after an inbound call.</p>
     * 
     * <strong>example:</strong>
     * <p>7719786</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The unique client request ID used for idempotency checks. You can use a UUID to generate this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The connection ID in the WebSocket connection after an inbound call.</p>
     * 
     * <strong>example:</strong>
     * <p>7719788</p>
     */
    @NameInMap("ConnectionId")
    public String connectionId;

    /**
     * <p>The AICCS instance ID. You can view it in the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The job ID in the WebSocket connection after an inbound call.</p>
     * 
     * <strong>example:</strong>
     * <p>7719787</p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static HoldCallRequest build(java.util.Map<String, ?> map) throws Exception {
        HoldCallRequest self = new HoldCallRequest();
        return TeaModel.build(map, self);
    }

    public HoldCallRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public HoldCallRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public HoldCallRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public HoldCallRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public HoldCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public HoldCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
