// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class TaskPreparingRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    @NameInMap("JobId")
    public String jobId;

    public static TaskPreparingRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskPreparingRequest self = new TaskPreparingRequest();
        return TeaModel.build(map, self);
    }

    public TaskPreparingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TaskPreparingRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public TaskPreparingRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
