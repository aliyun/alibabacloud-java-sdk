// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class CreateScheduleRequest extends TeaModel {
    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("Description")
    public String description;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("Payload")
    public String payload;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScheduleName")
    public String scheduleName;

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

    public CreateScheduleRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScheduleRequest setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
        return this;
    }
    public String getScheduleName() {
        return this.scheduleName;
    }

}
