// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
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
     * <p>{ &quot;serviceIdentifier&quot;: &quot;test_service&quot;, &quot;params&quot;: { &quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot; } }</p>
     */
    @NameInMap("JobDocument")
    public String jobDocument;

    /**
     * <strong>example:</strong>
     * <p>{   &quot;fileKey&quot;:&quot;5cc34<em><strong>f9/tazJ</strong></em>s&quot;,   &quot;signMethod&quot;:&quot;Sha256&quot;,   &quot;sign&quot;:&quot;***&quot; }</p>
     */
    @NameInMap("JobFile")
    public java.util.Map<String, ?> jobFile;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oneJob</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <strong>example:</strong>
     * <p>{&quot;maximumPerMinute&quot;: 1000}</p>
     */
    @NameInMap("RolloutConfig")
    public java.util.Map<String, ?> rolloutConfig;

    /**
     * <strong>example:</strong>
     * <p>1557062301656</p>
     */
    @NameInMap("ScheduledTime")
    public Long scheduledTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;targetType&quot;:&quot;PRODUCT_KEY&quot;,&quot;targetProduct&quot;:&quot;a1j***3d&quot;}</p>
     */
    @NameInMap("TargetConfig")
    public java.util.Map<String, ?> targetConfig;

    /**
     * <strong>example:</strong>
     * <p>{&quot;inProgressTimeoutInMinutes&quot;: 60}</p>
     */
    @NameInMap("TimeoutConfig")
    public java.util.Map<String, ?> timeoutConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INVOKE_SERVICE</p>
     */
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
