// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SuspendOutboundTaskRequest extends TeaModel {
    /**
     * <p>Instance ID of the Artificial Intelligence Cloud Call Service (AICCS) instance. You can obtain instance ID from the AICCS console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the outbound call task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120001</p>
     */
    @NameInMap("OutboundTaskId")
    public Long outboundTaskId;

    public static SuspendOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendOutboundTaskRequest self = new SuspendOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public SuspendOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SuspendOutboundTaskRequest setOutboundTaskId(Long outboundTaskId) {
        this.outboundTaskId = outboundTaskId;
        return this;
    }
    public Long getOutboundTaskId() {
        return this.outboundTaskId;
    }

}
