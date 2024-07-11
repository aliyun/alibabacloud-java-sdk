// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskFlowScheduleRequest extends TeaModel {
    /**
     * <p>The start of the time range for scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>CronBeginDate_test</p>
     */
    @NameInMap("CronBeginDate")
    public String cronBeginDate;

    /**
     * <p>The end of the time range for scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>CronEndDate_test</p>
     */
    @NameInMap("CronEndDate")
    public String cronEndDate;

    /**
     * <p>The cron expression for timed scheduling.</p>
     * 
     * <strong>example:</strong>
     * <p>CronStr_test</p>
     */
    @NameInMap("CronStr")
    public String cronStr;

    /**
     * <p>The type of the scheduling cycle. Valid values:</p>
     * <ul>
     * <li><strong>MINUTE</strong>: scheduling by minute</li>
     * <li><strong>HOUR</strong>: scheduling by hour</li>
     * <li><strong>DAY</strong>: scheduling by day</li>
     * <li><strong>WEEK</strong>: scheduling by week</li>
     * <li><strong>MONTH</strong>: scheduling by month</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
     */
    @NameInMap("CronType")
    public String cronType;

    /**
     * <p>The ID of the task flow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7***</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The event scheduling configuration. The value of this parameter is a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ScheduleParam_test</p>
     */
    @NameInMap("ScheduleParam")
    public String scheduleParam;

    /**
     * <p>Specifies whether to enable scheduling. Valid values:</p>
     * <ul>
     * <li><strong>Enable</strong></li>
     * <li><strong>Disable</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Disable</p>
     */
    @NameInMap("ScheduleSwitch")
    public Boolean scheduleSwitch;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The time zone. The default time zone is UTC+8 (Asia/Shanghai).</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZoneId")
    public String timeZoneId;

    /**
     * <p>The mode in which the task flow is triggered. Valid values:</p>
     * <ul>
     * <li><strong>Cron</strong>: The task flow is triggered based on timed scheduling.</li>
     * <li><strong>Event</strong>: The task flow is triggered by events.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Event</p>
     */
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
