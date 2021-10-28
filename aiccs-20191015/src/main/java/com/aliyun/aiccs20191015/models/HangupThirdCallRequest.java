// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class HangupThirdCallRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ConnectionId")
    public String connectionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    public static HangupThirdCallRequest build(java.util.Map<String, ?> map) throws Exception {
        HangupThirdCallRequest self = new HangupThirdCallRequest();
        return TeaModel.build(map, self);
    }

    public HangupThirdCallRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public HangupThirdCallRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public HangupThirdCallRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public HangupThirdCallRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public HangupThirdCallRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public HangupThirdCallRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
