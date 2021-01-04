// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateScheduleRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("ScheduleName")
    public String scheduleName;

    @NameInMap("Description")
    public String description;

    @NameInMap("Payload")
    public String payload;

    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("Enable")
    public Boolean enable;

    public static CreateScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleRequest self = new CreateScheduleRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduleRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateScheduleRequest setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

    public CreateScheduleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateScheduleRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public CreateScheduleRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public CreateScheduleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
