// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateJobShrinkRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("JobDocument")
    @Validation(required = true)
    public String jobDocument;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("JobFile")
    public String jobFileShrink;

    @NameInMap("JobName")
    @Validation(required = true)
    public String jobName;

    @NameInMap("TimeoutConfig")
    public String timeoutConfigShrink;

    @NameInMap("RolloutConfig")
    public String rolloutConfigShrink;

    @NameInMap("TargetConfig")
    @Validation(required = true)
    public String targetConfigShrink;

    @NameInMap("ScheduledTime")
    public Long scheduledTime;

    public static CreateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobShrinkRequest self = new CreateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobShrinkRequest setJobDocument(String jobDocument) {
        this.jobDocument = jobDocument;
        return this;
    }
    public String getJobDocument() {
        return this.jobDocument;
    }

    public CreateJobShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
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

    public CreateJobShrinkRequest setTimeoutConfigShrink(String timeoutConfigShrink) {
        this.timeoutConfigShrink = timeoutConfigShrink;
        return this;
    }
    public String getTimeoutConfigShrink() {
        return this.timeoutConfigShrink;
    }

    public CreateJobShrinkRequest setRolloutConfigShrink(String rolloutConfigShrink) {
        this.rolloutConfigShrink = rolloutConfigShrink;
        return this;
    }
    public String getRolloutConfigShrink() {
        return this.rolloutConfigShrink;
    }

    public CreateJobShrinkRequest setTargetConfigShrink(String targetConfigShrink) {
        this.targetConfigShrink = targetConfigShrink;
        return this;
    }
    public String getTargetConfigShrink() {
        return this.targetConfigShrink;
    }

    public CreateJobShrinkRequest setScheduledTime(Long scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }
    public Long getScheduledTime() {
        return this.scheduledTime;
    }

}
