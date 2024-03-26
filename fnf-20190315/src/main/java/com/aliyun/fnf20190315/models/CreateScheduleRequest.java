// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateScheduleRequest extends TeaModel {
    /**
     * <p>The CRON expression.</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The description of the time-based schedule.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the time-based schedule. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The name of the flow that is bound to the time-based schedule.</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The trigger message of the time-based schedule. Specify the value in the JSON format.</p>
     */
    @NameInMap("Payload")
    public String payload;

    /**
     * <p>The name of the time-based schedule. Configure this parameter based on the following rules:</p>
     * <br>
     * <p>*   The name can contain letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>*   The name must start with a letter or an underscore (\_).</p>
     * <p>*   The name is case-sensitive.</p>
     * <p>*   The name must be 1 to 128 characters in length.</p>
     */
    @NameInMap("ScheduleName")
    public String scheduleName;

    @NameInMap("SignatureVersion")
    public String signatureVersion;

    public static CreateScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleRequest self = new CreateScheduleRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateScheduleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScheduleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateScheduleRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateScheduleRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public CreateScheduleRequest setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

    public CreateScheduleRequest setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
        return this;
    }
    public String getSignatureVersion() {
        return this.signatureVersion;
    }

}
