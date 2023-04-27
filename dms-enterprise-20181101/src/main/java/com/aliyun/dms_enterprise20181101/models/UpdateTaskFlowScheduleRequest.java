// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowScheduleRequest extends TeaModel {
    @NameInMap("CronBeginDate")
    public String cronBeginDate;

    @NameInMap("CronEndDate")
    public String cronEndDate;

    @NameInMap("CronStr")
    public String cronStr;

    @NameInMap("CronType")
    public String cronType;

    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("ScheduleParam")
    public String scheduleParam;

    @NameInMap("ScheduleSwitch")
    public Boolean scheduleSwitch;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("TimeZoneId")
    public String timeZoneId;

    @NameInMap("TriggerType")
    public String triggerType;

    public static UpdateTaskFlowScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskFlowScheduleRequest self = new UpdateTaskFlowScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskFlowScheduleRequest setCronBeginDate(String cronBeginDate) {
        this.cronBeginDate = cronBeginDate;
        return this;
    }
    public String getCronBeginDate() {
        return this.cronBeginDate;
    }

    public UpdateTaskFlowScheduleRequest setCronEndDate(String cronEndDate) {
        this.cronEndDate = cronEndDate;
        return this;
    }
    public String getCronEndDate() {
        return this.cronEndDate;
    }

    public UpdateTaskFlowScheduleRequest setCronStr(String cronStr) {
        this.cronStr = cronStr;
        return this;
    }
    public String getCronStr() {
        return this.cronStr;
    }

    public UpdateTaskFlowScheduleRequest setCronType(String cronType) {
        this.cronType = cronType;
        return this;
    }
    public String getCronType() {
        return this.cronType;
    }

    public UpdateTaskFlowScheduleRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public UpdateTaskFlowScheduleRequest setScheduleParam(String scheduleParam) {
        this.scheduleParam = scheduleParam;
        return this;
    }
    public String getScheduleParam() {
        return this.scheduleParam;
    }

    public UpdateTaskFlowScheduleRequest setScheduleSwitch(Boolean scheduleSwitch) {
        this.scheduleSwitch = scheduleSwitch;
        return this;
    }
    public Boolean getScheduleSwitch() {
        return this.scheduleSwitch;
    }

    public UpdateTaskFlowScheduleRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public UpdateTaskFlowScheduleRequest setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }
    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    public UpdateTaskFlowScheduleRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
