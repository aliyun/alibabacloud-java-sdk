// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentEscalationStageStruct extends TeaModel {
    /**
     * <p>联系人列表</p>
     */
    @NameInMap("contact")
    public java.util.List<IncidentContactStruct> contact;

    /**
     * <p>周期通知统计次数</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("cycleNotifyCount")
    public Integer cycleNotifyCount;

    /**
     * <p>周期通知时间</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("cycleNotifyTime")
    public Integer cycleNotifyTime;

    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>负责处理生产环境告警的主负责人</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>有效时间</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-05T00:00:00Z</p>
     */
    @NameInMap("effectTime")
    public String effectTime;

    /**
     * <p>名称</p>
     * 
     * <strong>example:</strong>
     * <p>运维团队</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>阶段指数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("stageIndex")
    public Integer stageIndex;

    /**
     * <p>时区</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("timeZone")
    public String timeZone;

    /**
     * <p>等待进入下一阶段的时间</p>
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
