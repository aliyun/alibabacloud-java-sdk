// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateEventRecordPlanRequest extends TeaModel {
    @NameInMap("EventTypes")
    public String eventTypes;

    @NameInMap("Name")
    public String name;

    @NameInMap("PreRecordDuration")
    public Integer preRecordDuration;

    @NameInMap("RecordDuration")
    public Integer recordDuration;

    @NameInMap("TemplateId")
    public String templateId;

    public static CreateEventRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventRecordPlanRequest self = new CreateEventRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventRecordPlanRequest setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public String getEventTypes() {
        return this.eventTypes;
    }

    public CreateEventRecordPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEventRecordPlanRequest setPreRecordDuration(Integer preRecordDuration) {
        this.preRecordDuration = preRecordDuration;
        return this;
    }
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    public CreateEventRecordPlanRequest setRecordDuration(Integer recordDuration) {
        this.recordDuration = recordDuration;
        return this;
    }
    public Integer getRecordDuration() {
        return this.recordDuration;
    }

    public CreateEventRecordPlanRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
