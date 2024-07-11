// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListTaskFlowsByPageResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6CB28697-BFE2-5739-9228-3971990E982C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the returned task flows.</p>
     */
    @NameInMap("TaskFlowList")
    public ListTaskFlowsByPageResponseBodyTaskFlowList taskFlowList;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTaskFlowsByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskFlowsByPageResponseBody self = new ListTaskFlowsByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskFlowsByPageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTaskFlowsByPageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskFlowsByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskFlowsByPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskFlowsByPageResponseBody setTaskFlowList(ListTaskFlowsByPageResponseBodyTaskFlowList taskFlowList) {
        this.taskFlowList = taskFlowList;
        return this;
    }
    public ListTaskFlowsByPageResponseBodyTaskFlowList getTaskFlowList() {
        return this.taskFlowList;
    }

    public ListTaskFlowsByPageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow extends TeaModel {
        /**
         * <p>The ID of the user who created the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The username of the user who created the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>Creator_NickName</p>
         */
        @NameInMap("CreatorNickName")
        public String creatorNickName;

        /**
         * <p>The start time of scheduled scheduling. The task flow is not scheduled before this point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01</p>
         */
        @NameInMap("CronBeginDate")
        public String cronBeginDate;

        /**
         * <p>The end time of scheduled scheduling. The task flow is not scheduled after this point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01</p>
         */
        @NameInMap("CronEndDate")
        public String cronEndDate;

        /**
         * <p>Scheduled Cron.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 1 * * ? *</p>
         */
        @NameInMap("CronStr")
        public String cronStr;

        /**
         * <p>Whether to enable scheduled scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CronSwitch")
        public Boolean cronSwitch;

        /**
         * <p>Scheduling cycle type. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Hourly scheduling</li>
         * <li><strong>3</strong>: Daily scheduling</li>
         * <li><strong>4</strong>: Weekly scheduling</li>
         * <li><strong>5</strong>: Monthly scheduling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CronType")
        public Integer cronType;

        /**
         * <p>The name of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>poc_task_test</p>
         */
        @NameInMap("DagName")
        public String dagName;

        /**
         * <p>The user ID of the task flow owner.</p>
         * 
         * <strong>example:</strong>
         * <p>12***89</p>
         */
        @NameInMap("DagOwnerId")
        public String dagOwnerId;

        /**
         * <p>The username of the owner of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>Owner_NickName</p>
         */
        @NameInMap("DagOwnerNickName")
        public String dagOwnerNickName;

        /**
         * <p>The ID of the last deployment record of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>65***</p>
         */
        @NameInMap("DeployId")
        public Long deployId;

        /**
         * <p>The description of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>7***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The status of the last execution of the task flow. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: invalid</li>
         * <li><strong>1</strong>: scheduling disabled</li>
         * <li><strong>2</strong>: waiting to be scheduled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LatestInstanceStatus")
        public Integer latestInstanceStatus;

        /**
         * <p>The time when the last execution record was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-13</p>
         */
        @NameInMap("LatestInstanceTime")
        public String latestInstanceTime;

        /**
         * <p>The ID of the application scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1245</p>
         */
        @NameInMap("ScenarioId")
        public String scenarioId;

        /**
         * <p>Event scheduling configuration, JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;triggerType\&quot;:\&quot;1\&quot;,\&quot;specificTime\&quot;:\&quot;2022-11-15 11:59\&quot;}</p>
         */
        @NameInMap("ScheduleParam")
        public String scheduleParam;

        /**
         * <p>The status of the task flow. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: invalid</li>
         * <li><strong>1</strong>: scheduling disabled</li>
         * <li><strong>2</strong>: waiting to be scheduled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Time zone setting. Default value: East 8(Asia/Shanghai).</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("TimeZoneId")
        public String timeZoneId;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Periodic scheduling</li>
         * <li><strong>1</strong>: Run manually</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TriggerType")
        public Integer triggerType;

        public static ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow self = new ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setCreatorNickName(String creatorNickName) {
            this.creatorNickName = creatorNickName;
            return this;
        }
        public String getCreatorNickName() {
            return this.creatorNickName;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setCronBeginDate(String cronBeginDate) {
            this.cronBeginDate = cronBeginDate;
            return this;
        }
        public String getCronBeginDate() {
            return this.cronBeginDate;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setCronEndDate(String cronEndDate) {
            this.cronEndDate = cronEndDate;
            return this;
        }
        public String getCronEndDate() {
            return this.cronEndDate;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setCronStr(String cronStr) {
            this.cronStr = cronStr;
            return this;
        }
        public String getCronStr() {
            return this.cronStr;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setCronSwitch(Boolean cronSwitch) {
            this.cronSwitch = cronSwitch;
            return this;
        }
        public Boolean getCronSwitch() {
            return this.cronSwitch;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setCronType(Integer cronType) {
            this.cronType = cronType;
            return this;
        }
        public Integer getCronType() {
            return this.cronType;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setDagName(String dagName) {
            this.dagName = dagName;
            return this;
        }
        public String getDagName() {
            return this.dagName;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setDagOwnerId(String dagOwnerId) {
            this.dagOwnerId = dagOwnerId;
            return this;
        }
        public String getDagOwnerId() {
            return this.dagOwnerId;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setDagOwnerNickName(String dagOwnerNickName) {
            this.dagOwnerNickName = dagOwnerNickName;
            return this;
        }
        public String getDagOwnerNickName() {
            return this.dagOwnerNickName;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setDeployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }
        public Long getDeployId() {
            return this.deployId;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setLatestInstanceStatus(Integer latestInstanceStatus) {
            this.latestInstanceStatus = latestInstanceStatus;
            return this;
        }
        public Integer getLatestInstanceStatus() {
            return this.latestInstanceStatus;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setLatestInstanceTime(String latestInstanceTime) {
            this.latestInstanceTime = latestInstanceTime;
            return this;
        }
        public String getLatestInstanceTime() {
            return this.latestInstanceTime;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setScheduleParam(String scheduleParam) {
            this.scheduleParam = scheduleParam;
            return this;
        }
        public String getScheduleParam() {
            return this.scheduleParam;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setTimeZoneId(String timeZoneId) {
            this.timeZoneId = timeZoneId;
            return this;
        }
        public String getTimeZoneId() {
            return this.timeZoneId;
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow setTriggerType(Integer triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Integer getTriggerType() {
            return this.triggerType;
        }

    }

    public static class ListTaskFlowsByPageResponseBodyTaskFlowList extends TeaModel {
        @NameInMap("TaskFlow")
        public java.util.List<ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow> taskFlow;

        public static ListTaskFlowsByPageResponseBodyTaskFlowList build(java.util.Map<String, ?> map) throws Exception {
            ListTaskFlowsByPageResponseBodyTaskFlowList self = new ListTaskFlowsByPageResponseBodyTaskFlowList();
            return TeaModel.build(map, self);
        }

        public ListTaskFlowsByPageResponseBodyTaskFlowList setTaskFlow(java.util.List<ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow> taskFlow) {
            this.taskFlow = taskFlow;
            return this;
        }
        public java.util.List<ListTaskFlowsByPageResponseBodyTaskFlowListTaskFlow> getTaskFlow() {
            return this.taskFlow;
        }

    }

}
