// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateJobShrinkRequest extends TeaModel {
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
    public String jobFileShrink;

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
    public String rolloutConfigShrink;

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
    public String targetConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;inProgressTimeoutInMinutes&quot;: 60}</p>
     */
    @NameInMap("TimeoutConfig")
    public String timeoutConfigShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INVOKE_SERVICE</p>
     */
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
