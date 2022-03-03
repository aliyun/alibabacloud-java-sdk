// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReupgradeOTATaskRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("TaskId")
    public java.util.List<String> taskId;

    public static ReupgradeOTATaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReupgradeOTATaskRequest self = new ReupgradeOTATaskRequest();
        return TeaModel.build(map, self);
    }

    public ReupgradeOTATaskRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ReupgradeOTATaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReupgradeOTATaskRequest setTaskId(java.util.List<String> taskId) {
        this.taskId = taskId;
        return this;
    }
    public java.util.List<String> getTaskId() {
        return this.taskId;
    }

}
