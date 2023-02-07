// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskProgressRequest extends TeaModel {
    @NameInMap("BatchVersion")
    public Integer batchVersion;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TaskId")
    public Long taskId;

    public static GetAiOutboundTaskProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskProgressRequest self = new GetAiOutboundTaskProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskProgressRequest setBatchVersion(Integer batchVersion) {
        this.batchVersion = batchVersion;
        return this;
    }
    public Integer getBatchVersion() {
        return this.batchVersion;
    }

    public GetAiOutboundTaskProgressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAiOutboundTaskProgressRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
