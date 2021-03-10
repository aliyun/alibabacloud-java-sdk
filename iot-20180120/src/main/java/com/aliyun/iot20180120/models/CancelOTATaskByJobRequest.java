// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTATaskByJobRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    @NameInMap("CancelScheduledTask")
    public Boolean cancelScheduledTask;

    @NameInMap("CancelQueuedTask")
    public Boolean cancelQueuedTask;

    @NameInMap("CancelInProgressTask")
    public Boolean cancelInProgressTask;

    @NameInMap("CancelNotifiedTask")
    public Boolean cancelNotifiedTask;

    public static CancelOTATaskByJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOTATaskByJobRequest self = new CancelOTATaskByJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelOTATaskByJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CancelOTATaskByJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelOTATaskByJobRequest setCancelScheduledTask(Boolean cancelScheduledTask) {
        this.cancelScheduledTask = cancelScheduledTask;
        return this;
    }
    public Boolean getCancelScheduledTask() {
        return this.cancelScheduledTask;
    }

    public CancelOTATaskByJobRequest setCancelQueuedTask(Boolean cancelQueuedTask) {
        this.cancelQueuedTask = cancelQueuedTask;
        return this;
    }
    public Boolean getCancelQueuedTask() {
        return this.cancelQueuedTask;
    }

    public CancelOTATaskByJobRequest setCancelInProgressTask(Boolean cancelInProgressTask) {
        this.cancelInProgressTask = cancelInProgressTask;
        return this;
    }
    public Boolean getCancelInProgressTask() {
        return this.cancelInProgressTask;
    }

    public CancelOTATaskByJobRequest setCancelNotifiedTask(Boolean cancelNotifiedTask) {
        this.cancelNotifiedTask = cancelNotifiedTask;
        return this;
    }
    public Boolean getCancelNotifiedTask() {
        return this.cancelNotifiedTask;
    }

}
