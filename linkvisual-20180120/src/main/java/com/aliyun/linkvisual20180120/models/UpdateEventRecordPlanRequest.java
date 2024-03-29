// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateEventRecordPlanRequest extends TeaModel {
    @NameInMap("EventTypes")
    public String eventTypes;

    @NameInMap("Name")
    public String name;

    @NameInMap("PlanId")
    public String planId;

    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    @NameInMap("RecordDuration")
    public Integer recordDuration;

    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateEventRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventRecordPlanRequest self = new UpdateEventRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEventRecordPlanRequest setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public String getEventTypes() {
        return this.eventTypes;
    }

    public UpdateEventRecordPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEventRecordPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateEventRecordPlanRequest setPreRecordDuration(Integer preRecordDuration) {
        this.preRecordDuration = preRecordDuration;
        return this;
    }
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    public UpdateEventRecordPlanRequest setRecordDuration(Integer recordDuration) {
        this.recordDuration = recordDuration;
        return this;
    }
    public Integer getRecordDuration() {
        return this.recordDuration;
    }

    public UpdateEventRecordPlanRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
