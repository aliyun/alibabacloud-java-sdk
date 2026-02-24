// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationStageStruct extends TeaModel {
    /**
     * <p>Contact list.</p>
     */
    @NameInMap("contact")
    public java.util.List<IncidentContactStruct> contact;

    /**
     * <p>Number of recurring notification attempts.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("cycleNotifyCount")
    public Integer cycleNotifyCount;

    /**
     * <p>Recurring notification interval.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("cycleNotifyTime")
    public Integer cycleNotifyTime;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>Primary owner responsible for handling production environment alerts.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Effective time period.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-05T00:00:00Z</p>
     */
    @NameInMap("effectTime")
    public String effectTime;

    /**
     * <p>Name.</p>
     * 
     * <strong>example:</strong>
     * <p>Operations team.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Phase index.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("stageIndex")
    public Integer stageIndex;

    /**
     * <p>Time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    /**
     * <p>Time to wait before proceeding to the next phase.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
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
