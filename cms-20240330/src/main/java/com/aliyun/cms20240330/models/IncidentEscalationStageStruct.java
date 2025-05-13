// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationStageStruct extends TeaModel {
    @NameInMap("contact")
    public java.util.List<IncidentContactStruct> contact;

    @NameInMap("cycleNotifyCount")
    public Integer cycleNotifyCount;

    @NameInMap("cycleNotifyTime")
    public Integer cycleNotifyTime;

    @NameInMap("description")
    public String description;

    @NameInMap("effectTime")
    public String effectTime;

    @NameInMap("name")
    public String name;

    @NameInMap("stageIndex")
    public Integer stageIndex;

    @NameInMap("timeZone")
    public String timeZone;

    @NameInMap("waitToNextStageTime")
    public Integer waitToNextStageTime;

    public static IncidentEscalationStageStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentEscalationStageStruct self = new IncidentEscalationStageStruct();
        return TeaModel.build(map, self);
    }

    public IncidentEscalationStageStruct setContact(java.util.List<IncidentContactStruct> contact) {
        this.contact = contact;
        return this;
    }
    public java.util.List<IncidentContactStruct> getContact() {
        return this.contact;
    }

    public IncidentEscalationStageStruct setCycleNotifyCount(Integer cycleNotifyCount) {
        this.cycleNotifyCount = cycleNotifyCount;
        return this;
    }
    public Integer getCycleNotifyCount() {
        return this.cycleNotifyCount;
    }

    public IncidentEscalationStageStruct setCycleNotifyTime(Integer cycleNotifyTime) {
        this.cycleNotifyTime = cycleNotifyTime;
        return this;
    }
    public Integer getCycleNotifyTime() {
        return this.cycleNotifyTime;
    }

    public IncidentEscalationStageStruct setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IncidentEscalationStageStruct setEffectTime(String effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public String getEffectTime() {
        return this.effectTime;
    }

    public IncidentEscalationStageStruct setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IncidentEscalationStageStruct setStageIndex(Integer stageIndex) {
        this.stageIndex = stageIndex;
        return this;
    }
    public Integer getStageIndex() {
        return this.stageIndex;
    }

    public IncidentEscalationStageStruct setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public IncidentEscalationStageStruct setWaitToNextStageTime(Integer waitToNextStageTime) {
        this.waitToNextStageTime = waitToNextStageTime;
        return this;
    }
    public Integer getWaitToNextStageTime() {
        return this.waitToNextStageTime;
    }

}
