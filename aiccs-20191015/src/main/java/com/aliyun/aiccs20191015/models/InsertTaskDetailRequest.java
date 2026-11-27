// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertTaskDetailRequest extends TeaModel {
    /**
     * <p>The outbound call information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;dnis&quot;:&quot;1&quot;,&quot;memberId&quot;:1133,&quot;memberName&quot;:&quot;Test member&quot;,&quot;priority&quot;:10}]</p>
     */
    @NameInMap("CallInfos")
    public String callInfos;

    /**
     * <p>Instance ID of the AICCS instance. You can obtain instance ID from the Artificial Intelligence Cloud Call Service console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the outbound task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>120001</p>
     */
    @NameInMap("OutboundTaskId")
    public Long outboundTaskId;

    public static InsertTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertTaskDetailRequest self = new InsertTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public InsertTaskDetailRequest setCallInfos(String callInfos) {
        this.callInfos = callInfos;
        return this;
    }
    public String getCallInfos() {
        return this.callInfos;
    }

    public InsertTaskDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InsertTaskDetailRequest setOutboundTaskId(Long outboundTaskId) {
        this.outboundTaskId = outboundTaskId;
        return this;
    }
    public Long getOutboundTaskId() {
        return this.outboundTaskId;
    }

}
