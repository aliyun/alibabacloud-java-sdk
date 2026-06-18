// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListHotlineRecordRequest extends TeaModel {
    /**
     * <p>Session ID. This corresponds to the acid in WebSocket after an inbound call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100365558</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>Unique customer request ID. Used for idempotency validation. You can generate it using UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>AICCS instance ID. You can obtain it from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListHotlineRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordRequest self = new ListHotlineRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public ListHotlineRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListHotlineRecordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
