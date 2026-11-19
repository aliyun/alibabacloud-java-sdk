// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityScheduleResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The schedule object details.</p>
     */
    @NameInMap("QualityScheduleInfo")
    public GetQualityScheduleResponseBodyQualityScheduleInfo qualityScheduleInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQualityScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityScheduleResponseBody self = new GetQualityScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityScheduleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityScheduleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityScheduleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityScheduleResponseBody setQualityScheduleInfo(GetQualityScheduleResponseBodyQualityScheduleInfo qualityScheduleInfo) {
        this.qualityScheduleInfo = qualityScheduleInfo;
        return this;
    }
    public GetQualityScheduleResponseBodyQualityScheduleInfo getQualityScheduleInfo() {
        return this.qualityScheduleInfo;
    }

    public GetQualityScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityScheduleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityScheduleResponseBodyQualityScheduleInfo extends TeaModel {
        /**
         * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The user ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The cron expression for timed scheduling.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li><ul>
         * <li>1/* * * *</li>
         * </ul>
         * </li>
         * </ul>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The ID of the schedule object.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the object is referenced by a rule.</p>
         */
        @NameInMap("IsRefByRule")
        public Boolean isRefByRule;

        /**
         * <p>The user ID of the last modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The update time. The format is YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The name of the schedule object.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The custom partition expression.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=${yyyyMMdd}</p>
         */
        @NameInMap("PartitionExpression")
        public String partitionExpression;

        /**
         * <p>The partition type. Valid values: EVERY_DAY for daily, PRE_DAY for previous day, TODAY for current day, FIRST_DAY_OF_WEEK for first day of the week (Sunday), and CUSTOM for custom.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("PartitionType")
        public String partitionType;

        /**
         * <p>The schedule cycle type for timed scheduling. Valid values: DAILY for day, WEEKLY for week, MONTHLY for month, HOURLY for hour, and MINUTELY for minute.</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("PeriodScheduleIntervalType")
        public String periodScheduleIntervalType;

        /**
         * <p>The schedule cycle values for timed scheduling.</p>
         */
        @NameInMap("PeriodScheduleParamList")
        public java.util.List<String> periodScheduleParamList;

        /**
         * <p>The trigger method for static task trigger. Valid values: ALL_TASKS_FINISHED, ONE_TASKS_FINISHED, and PRE_ONE_TASKS_START.</p>
         * 
         * <strong>example:</strong>
         * <p>ONE_TASKS_FINISHED</p>
         */
        @NameInMap("StaticTaskTriggerType")
        public String staticTaskTriggerType;

        /**
         * <p>The list of trigger tasks for trigger scheduling.</p>
         */
        @NameInMap("TriggerNodeList")
        public java.util.List<String> triggerNodeList;

        /**
         * <p>The trigger method for trigger scheduling. Valid values: STATIC_TASK_TRIGGER for static task trigger and CODE_CHECK_TRIGGER for code check trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>STATIC_TASK_TRIGGER</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The schedule type. Valid values: PERIOD_SCHEDULE for timed scheduling, MANUAL_SCHEDULE for manual trigger, CODE_CHECK_TRIGGER for code check trigger, STATIC_TASK_TRIGGER for static task trigger, and DEPENDENCY_SCHEDULE for dependency scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>PERIOD_SCHEDULE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The validation scope. Valid values: TASK_REFERRED_PARTITION for task updated partition and USER_DEFINED_PARTITION for custom partition.</p>
         * 
         * <strong>example:</strong>
         * <p>TASK_REFERRED_PARTITION</p>
         */
        @NameInMap("ValidatePartitionType")
        public String validatePartitionType;

        /**
         * <p>The ID of the monitored object.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static GetQualityScheduleResponseBodyQualityScheduleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityScheduleResponseBodyQualityScheduleInfo self = new GetQualityScheduleResponseBodyQualityScheduleInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setIsRefByRule(Boolean isRefByRule) {
            this.isRefByRule = isRefByRule;
            return this;
        }
        public Boolean getIsRefByRule() {
            return this.isRefByRule;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setPartitionExpression(String partitionExpression) {
            this.partitionExpression = partitionExpression;
            return this;
        }
        public String getPartitionExpression() {
            return this.partitionExpression;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setPeriodScheduleIntervalType(String periodScheduleIntervalType) {
            this.periodScheduleIntervalType = periodScheduleIntervalType;
            return this;
        }
        public String getPeriodScheduleIntervalType() {
            return this.periodScheduleIntervalType;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setPeriodScheduleParamList(java.util.List<String> periodScheduleParamList) {
            this.periodScheduleParamList = periodScheduleParamList;
            return this;
        }
        public java.util.List<String> getPeriodScheduleParamList() {
            return this.periodScheduleParamList;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setStaticTaskTriggerType(String staticTaskTriggerType) {
            this.staticTaskTriggerType = staticTaskTriggerType;
            return this;
        }
        public String getStaticTaskTriggerType() {
            return this.staticTaskTriggerType;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setTriggerNodeList(java.util.List<String> triggerNodeList) {
            this.triggerNodeList = triggerNodeList;
            return this;
        }
        public java.util.List<String> getTriggerNodeList() {
            return this.triggerNodeList;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setValidatePartitionType(String validatePartitionType) {
            this.validatePartitionType = validatePartitionType;
            return this;
        }
        public String getValidatePartitionType() {
            return this.validatePartitionType;
        }

        public GetQualityScheduleResponseBodyQualityScheduleInfo setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
