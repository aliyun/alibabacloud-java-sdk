// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("JobDocument")
    public String jobDocument;

    @NameInMap("Type")
    public String type;

    @NameInMap("JobFile")
    public String jobFile;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("TimeoutConfig")
    public String timeoutConfig;

    @NameInMap("RolloutConfig")
    public String rolloutConfig;

    @NameInMap("TargetConfig")
    public String targetConfig;

    @NameInMap("ScheduledTime")
    public Long scheduledTime;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateJobRequest setJobDocument(String jobDocument) {
        this.jobDocument = jobDocument;
        return this;
    }
    public String getJobDocument() {
        return this.jobDocument;
    }

    public CreateJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateJobRequest setJobFile(String jobFile) {
        this.jobFile = jobFile;
        return this;
    }
    public String getJobFile() {
        return this.jobFile;
    }

    public CreateJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateJobRequest setTimeoutConfig(String timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }
    public String getTimeoutConfig() {
        return this.timeoutConfig;
    }

    public CreateJobRequest setRolloutConfig(String rolloutConfig) {
        this.rolloutConfig = rolloutConfig;
        return this;
    }
    public String getRolloutConfig() {
        return this.rolloutConfig;
    }

    public CreateJobRequest setTargetConfig(String targetConfig) {
        this.targetConfig = targetConfig;
        return this;
    }
    public String getTargetConfig() {
        return this.targetConfig;
    }

    public CreateJobRequest setScheduledTime(Long scheduledTime) {
        this.scheduledTime = scheduledTime;
        return this;
    }
    public Long getScheduledTime() {
        return this.scheduledTime;
    }

}
