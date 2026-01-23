// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualitySchedulesByWatchIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("QualityScheduleList")
    public java.util.List<GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList> qualityScheduleList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetQualitySchedulesByWatchIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualitySchedulesByWatchIdResponseBody self = new GetQualitySchedulesByWatchIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualitySchedulesByWatchIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualitySchedulesByWatchIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualitySchedulesByWatchIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualitySchedulesByWatchIdResponseBody setQualityScheduleList(java.util.List<GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList> qualityScheduleList) {
        this.qualityScheduleList = qualityScheduleList;
        return this;
    }
    public java.util.List<GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList> getQualityScheduleList() {
        return this.qualityScheduleList;
    }

    public GetQualitySchedulesByWatchIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualitySchedulesByWatchIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IsRefByRule")
        public Boolean isRefByRule;

        /**
         * <strong>example:</strong>
         * <p>30012011</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ds=${yyyyMMdd}</p>
         */
        @NameInMap("PartitionExpression")
        public String partitionExpression;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("PartitionType")
        public String partitionType;

        /**
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("PeriodScheduleIntervalType")
        public String periodScheduleIntervalType;

        @NameInMap("PeriodScheduleParamList")
        public java.util.List<String> periodScheduleParamList;

        /**
         * <strong>example:</strong>
         * <p>ONE_TASKS_FINISHED</p>
         */
        @NameInMap("StaticTaskTriggerType")
        public String staticTaskTriggerType;

        @NameInMap("TriggerNodeList")
        public java.util.List<String> triggerNodeList;

        /**
         * <strong>example:</strong>
         * <p>STATIC_TASK_TRIGGER</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <strong>example:</strong>
         * <p>PERIOD_SCHEDULE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>TASK_REFERRED_PARTITION</p>
         */
        @NameInMap("ValidatePartitionType")
        public String validatePartitionType;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList build(java.util.Map<String, ?> map) throws Exception {
            GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList self = new GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList();
            return TeaModel.build(map, self);
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setIsRefByRule(Boolean isRefByRule) {
            this.isRefByRule = isRefByRule;
            return this;
        }
        public Boolean getIsRefByRule() {
            return this.isRefByRule;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setPartitionExpression(String partitionExpression) {
            this.partitionExpression = partitionExpression;
            return this;
        }
        public String getPartitionExpression() {
            return this.partitionExpression;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setPeriodScheduleIntervalType(String periodScheduleIntervalType) {
            this.periodScheduleIntervalType = periodScheduleIntervalType;
            return this;
        }
        public String getPeriodScheduleIntervalType() {
            return this.periodScheduleIntervalType;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setPeriodScheduleParamList(java.util.List<String> periodScheduleParamList) {
            this.periodScheduleParamList = periodScheduleParamList;
            return this;
        }
        public java.util.List<String> getPeriodScheduleParamList() {
            return this.periodScheduleParamList;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setStaticTaskTriggerType(String staticTaskTriggerType) {
            this.staticTaskTriggerType = staticTaskTriggerType;
            return this;
        }
        public String getStaticTaskTriggerType() {
            return this.staticTaskTriggerType;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setTriggerNodeList(java.util.List<String> triggerNodeList) {
            this.triggerNodeList = triggerNodeList;
            return this;
        }
        public java.util.List<String> getTriggerNodeList() {
            return this.triggerNodeList;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setValidatePartitionType(String validatePartitionType) {
            this.validatePartitionType = validatePartitionType;
            return this;
        }
        public String getValidatePartitionType() {
            return this.validatePartitionType;
        }

        public GetQualitySchedulesByWatchIdResponseBodyQualityScheduleList setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
