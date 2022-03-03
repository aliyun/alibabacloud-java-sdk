// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateJobShrinkRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobDocument")
    public String jobDocument;

    @NameInMap("JobFile")
    public String jobFileShrink;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("RolloutConfig")
    public String rolloutConfigShrink;

    @NameInMap("ScheduledTime")
    public Long scheduledTime;

    @NameInMap("TargetConfig")
    public String targetConfigShrink;

    @NameInMap("TimeoutConfig")
    public String timeoutConfigShrink;

    @NameInMap("Type")
    public String type;

    public static CreateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobShrinkRequest self = new CreateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateJobShrinkRequest setJobDocument(String jobDocument) {
        this.jobDocument = jobDocument;
        return this;
    }
    public String getJobDocument() {
        return this.jobDocument;
    }

    public CreateJobShrinkRequest setJobFileShrink(String jobFileShrink) {
        this.jobFileShrink = jobFileShrink;
        return this;
    }
    public String getJobFileShrink() {
        return this.jobFileShrink;
    }

    public CreateJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateJobShrinkRequest setRolloutConfigShrink(String rolloutConfigShrink) {
        this.rolloutConfigShrink = rolloutConfigShrink;
        return this;
    }
    public String getRolloutConfigShrink() {
        return this.rolloutConfigShrink;
    }

    public CreateJobShrinkRequest setScheduledTime(Long scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }
    public Long getScheduledTime() {
        return this.scheduledTime;
    }

    public CreateJobShrinkRequest setTargetConfigShrink(String targetConfigShrink) {
        this.targetConfigShrink = targetConfigShrink;
        return this;
    }
    public String getTargetConfigShrink() {
        return this.targetConfigShrink;
    }

    public CreateJobShrinkRequest setTimeoutConfigShrink(String timeoutConfigShrink) {
        this.timeoutConfigShrink = timeoutConfigShrink;
        return this;
    }
    public String getTimeoutConfigShrink() {
        return this.timeoutConfigShrink;
    }

    public CreateJobShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
