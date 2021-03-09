// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class RestartOutboundTaskRequest extends TeaModel {
    @NameInMap("OutboundTaskId")
    public Long outboundTaskId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static RestartOutboundTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartOutboundTaskRequest self = new RestartOutboundTaskRequest();
        return TeaModel.build(map, self);
    }

    public RestartOutboundTaskRequest setOutboundTaskId(Long outboundTaskId) {
        this.outboundTaskId = outboundTaskId;
        return this;
    }
    public Long getOutboundTaskId() {
        return this.outboundTaskId;
    }

    public RestartOutboundTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
