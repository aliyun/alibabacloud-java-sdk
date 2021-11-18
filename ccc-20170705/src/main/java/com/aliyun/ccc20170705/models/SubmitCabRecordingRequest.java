// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class SubmitCabRecordingRequest extends TeaModel {
    @NameInMap("EarlyMediaRecording")
    public String earlyMediaRecording;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    @NameInMap("MergedRecording")
    public String mergedRecording;

    @NameInMap("ResourceRecording")
    public String resourceRecording;

    @NameInMap("TaskId")
    public String taskId;

    public static SubmitCabRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCabRecordingRequest self = new SubmitCabRecordingRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCabRecordingRequest setEarlyMediaRecording(String earlyMediaRecording) {
        this.earlyMediaRecording = earlyMediaRecording;
        return this;
    }
    public String getEarlyMediaRecording() {
        return this.earlyMediaRecording;
    }

    public SubmitCabRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SubmitCabRecordingRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public SubmitCabRecordingRequest setMergedRecording(String mergedRecording) {
        this.mergedRecording = mergedRecording;
        return this;
    }
    public String getMergedRecording() {
        return this.mergedRecording;
    }

    public SubmitCabRecordingRequest setResourceRecording(String resourceRecording) {
        this.resourceRecording = resourceRecording;
        return this;
    }
    public String getResourceRecording() {
        return this.resourceRecording;
    }

    public SubmitCabRecordingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
