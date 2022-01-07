// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RolloutConfig")
    public String rolloutConfig;

    @NameInMap("TimeoutConfig")
    public String timeoutConfig;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateJobRequest setRolloutConfig(String rolloutConfig) {
        this.rolloutConfig = rolloutConfig;
        return this;
    }
    public String getRolloutConfig() {
        return this.rolloutConfig;
    }

    public UpdateJobRequest setTimeoutConfig(String timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }
    public String getTimeoutConfig() {
        return this.timeoutConfig;
    }

}
