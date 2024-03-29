// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobDocument")
    public String jobDocument;

    @NameInMap("JobFile")
    public java.util.Map<String, ?> jobFile;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("RolloutConfig")
    public java.util.Map<String, ?> rolloutConfig;

    @NameInMap("ScheduledTime")
    public Long scheduledTime;

    @NameInMap("TargetConfig")
    public java.util.Map<String, ?> targetConfig;

    @NameInMap("TimeoutConfig")
    public java.util.Map<String, ?> timeoutConfig;

    @NameInMap("Type")
    public String type;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateJobRequest setJobDocument(String jobDocument) {
        this.jobDocument = jobDocument;
        return this;
    }
    public String getJobDocument() {
        return this.jobDocument;
    }

    public CreateJobRequest setJobFile(java.util.Map<String, ?> jobFile) {
        this.jobFile = jobFile;
        return this;
    }
    public java.util.Map<String, ?> getJobFile() {
        return this.jobFile;
    }

    public CreateJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateJobRequest setRolloutConfig(java.util.Map<String, ?> rolloutConfig) {
        this.rolloutConfig = rolloutConfig;
        return this;
    }
    public java.util.Map<String, ?> getRolloutConfig() {
        return this.rolloutConfig;
    }

    public CreateJobRequest setScheduledTime(Long scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }
    public Long getScheduledTime() {
        return this.scheduledTime;
    }

    public CreateJobRequest setTargetConfig(java.util.Map<String, ?> targetConfig) {
        this.targetConfig = targetConfig;
        return this;
    }
    public java.util.Map<String, ?> getTargetConfig() {
        return this.targetConfig;
    }

    public CreateJobRequest setTimeoutConfig(java.util.Map<String, ?> timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }
    public java.util.Map<String, ?> getTimeoutConfig() {
        return this.timeoutConfig;
    }

    public CreateJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
