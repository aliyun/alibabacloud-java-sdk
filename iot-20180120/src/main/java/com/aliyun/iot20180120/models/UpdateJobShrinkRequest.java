// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateJobShrinkRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("TimeoutConfig")
    public String timeoutConfigShrink;

    @NameInMap("RolloutConfig")
    public String rolloutConfigShrink;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static UpdateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobShrinkRequest self = new UpdateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobShrinkRequest setTimeoutConfigShrink(String timeoutConfigShrink) {
        this.timeoutConfigShrink = timeoutConfigShrink;
        return this;
    }
    public String getTimeoutConfigShrink() {
        return this.timeoutConfigShrink;
    }

    public UpdateJobShrinkRequest setRolloutConfigShrink(String rolloutConfigShrink) {
        this.rolloutConfigShrink = rolloutConfigShrink;
        return this;
    }
    public String getRolloutConfigShrink() {
        return this.rolloutConfigShrink;
    }

    public UpdateJobShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
