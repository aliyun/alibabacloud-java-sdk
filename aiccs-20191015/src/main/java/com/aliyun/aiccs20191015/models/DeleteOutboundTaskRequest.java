// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class DeleteOutboundTaskRequest extends TeaModel {
    @NameInMap("OutboundTaskId")
    public Long outboundTaskId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOutboundTaskRequest self = new DeleteOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOutboundTaskRequest setOutboundTaskId(Long outboundTaskId) {
        this.outboundTaskId = outboundTaskId;
        return this;
    }
    public Long getOutboundTaskId() {
        return this.outboundTaskId;
    }

    public DeleteOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
