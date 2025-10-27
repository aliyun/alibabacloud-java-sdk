// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateScheduleRequest extends TeaModel {
    /**
     * <p>The CRON expression.</p>
     * 
     * <strong>example:</strong>
     * <p>0 * * * * *</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The description of the time-based schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the time-based schedule. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The name of the flow that is associated with the time-based schedule. The name must be unique within the region and cannot be modified after the time-based schedule is created. The name must meet the following conventions:</p>
     * <ul>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name must start with a letter or an underscore (_).</li>
     * <li>The name is case-sensitive.</li>
     * <li>The name must be 1 to 128 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testFlowName</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>The trigger message of the time-based schedule. It must be in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("Payload")
    public String payload;

    /**
     * <p>The name of the time-based schedule. The name must meet the following conventions:</p>
     * <ul>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The name must start with a letter or an underscore (_).</li>
     * <li>The name is case-sensitive.</li>
     * <li>The name must be 1 to 128 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testScheduleName</p>
     */
    @NameInMap("ScheduleName")
    public String scheduleName;

    public static UpdateScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduleRequest self = new UpdateScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduleRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public UpdateScheduleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateScheduleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateScheduleRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public UpdateScheduleRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public UpdateScheduleRequest setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

}
