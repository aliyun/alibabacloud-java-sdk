// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateJobShrinkRequest extends TeaModel {
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
    public String rolloutConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;inProgressTimeoutInMinutes&quot;: 60}</p>
     */
    @NameInMap("TimeoutConfig")
    public String timeoutConfigShrink;

    public static UpdateJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobShrinkRequest self = new UpdateJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateJobShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateJobShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateJobShrinkRequest setRolloutConfigShrink(String rolloutConfigShrink) {
        this.rolloutConfigShrink = rolloutConfigShrink;
        return this;
    }
    public String getRolloutConfigShrink() {
        return this.rolloutConfigShrink;
    }

    public UpdateJobShrinkRequest setTimeoutConfigShrink(String timeoutConfigShrink) {
        this.timeoutConfigShrink = timeoutConfigShrink;
        return this;
    }
    public String getTimeoutConfigShrink() {
        return this.timeoutConfigShrink;
    }

}
