// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>jobDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>XUbmsMHmkqv0PiAG****010001</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;maximumPerMinute&quot;: 1000}</p>
     */
    @NameInMap("RolloutConfig")
    public java.util.Map<String, ?> rolloutConfig;

    /**
     * <strong>example:</strong>
     * <p>{&quot;inProgressTimeoutInMinutes&quot;: 60}</p>
     */
    @NameInMap("TimeoutConfig")
    public java.util.Map<String, ?> timeoutConfig;

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

    public UpdateJobRequest setRolloutConfig(java.util.Map<String, ?> rolloutConfig) {
        this.rolloutConfig = rolloutConfig;
        return this;
    }
    public java.util.Map<String, ?> getRolloutConfig() {
        return this.rolloutConfig;
    }

    public UpdateJobRequest setTimeoutConfig(java.util.Map<String, ?> timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }
    public java.util.Map<String, ?> getTimeoutConfig() {
        return this.timeoutConfig;
    }

}
