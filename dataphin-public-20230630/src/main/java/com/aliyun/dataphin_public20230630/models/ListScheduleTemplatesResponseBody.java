// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListScheduleTemplatesResponseBody extends TeaModel {
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

    @NameInMap("ListScheduleTemplatesResponse")
    public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponse listScheduleTemplatesResponse;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListScheduleTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleTemplatesResponseBody self = new ListScheduleTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduleTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScheduleTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScheduleTemplatesResponseBody setListScheduleTemplatesResponse(ListScheduleTemplatesResponseBodyListScheduleTemplatesResponse listScheduleTemplatesResponse) {
        this.listScheduleTemplatesResponse = listScheduleTemplatesResponse;
        return this;
    }
    public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponse getListScheduleTemplatesResponse() {
        return this.listScheduleTemplatesResponse;
    }

    public ListScheduleTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScheduleTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduleTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>失败重跑条件</p>
         */
        @NameInMap("ConditionName")
        public String conditionName;

        /**
         * <strong>example:</strong>
         * <p>0 30 * * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FollowScheduleParam")
        public Boolean followScheduleParam;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NodeStatus")
        public Integer nodeStatus;

        /**
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;EXPRESSION_GROUP&quot;,&quot;operator&quot;:&quot;or&quot;}</p>
         */
        @NameInMap("ScheduleConditionJson")
        public String scheduleConditionJson;

        /**
         * <strong>example:</strong>
         * <p>00:30</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        public static ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList self = new ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList();
            return TeaModel.build(map, self);
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList setConditionName(String conditionName) {
            this.conditionName = conditionName;
            return this;
        }
        public String getConditionName() {
            return this.conditionName;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList setFollowScheduleParam(Boolean followScheduleParam) {
            this.followScheduleParam = followScheduleParam;
            return this;
        }
        public Boolean getFollowScheduleParam() {
            return this.followScheduleParam;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList setNodeStatus(Integer nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public Integer getNodeStatus() {
            return this.nodeStatus;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList setScheduleConditionJson(String scheduleConditionJson) {
            this.scheduleConditionJson = scheduleConditionJson;
            return this;
        }
        public String getScheduleConditionJson() {
            return this.scheduleConditionJson;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

    }

    public static class ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>23:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>MINUTE</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <strong>example:</strong>
         * <p>DAY_INTERVAL</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig self = new ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig();
            return TeaModel.build(map, self);
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>23:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>MINUTE</p>
         */
        @NameInMap("IntervalUnit")
        public String intervalUnit;

        /**
         * <strong>example:</strong>
         * <p>DAY_INTERVAL</p>
         */
        @NameInMap("SchedulePeriod")
        public String schedulePeriod;

        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs self = new ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs();
            return TeaModel.build(map, self);
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs setIntervalUnit(String intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public String getIntervalUnit() {
            return this.intervalUnit;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs setSchedulePeriod(String schedulePeriod) {
            this.schedulePeriod = schedulePeriod;
            return this;
        }
        public String getSchedulePeriod() {
            return this.schedulePeriod;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData extends TeaModel {
        @NameInMap("ConditionScheduleParamList")
        public java.util.List<ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList> conditionScheduleParamList;

        /**
         * <strong>example:</strong>
         * <p>0 0 1 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CustomCronExpression")
        public Boolean customCronExpression;

        @NameInMap("CustomIntervalConfig")
        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig customIntervalConfig;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM_TIME_PERIOD</p>
         */
        @NameInMap("CustomIntervalConfigType")
        public String customIntervalConfigType;

        @NameInMap("CustomIntervalConfigs")
        public java.util.List<ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs> customIntervalConfigs;

        /**
         * <strong>example:</strong>
         * <p>1704153600000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1709516800000</p>
         */
        @NameInMap("GmtModify")
        public Long gmtModify;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasReference")
        public Boolean hasReference;

        /**
         * <strong>example:</strong>
         * <p>30001012</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("ModifierName")
        public String modifierName;

        /**
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("ScheduleIntervalType")
        public String scheduleIntervalType;

        /**
         * <strong>example:</strong>
         * <p>工作日每天凌晨1点调度</p>
         */
        @NameInMap("ScheduleTemplateDesc")
        public String scheduleTemplateDesc;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ScheduleTemplateId")
        public Long scheduleTemplateId;

        /**
         * <strong>example:</strong>
         * <p>每天凌晨1点</p>
         */
        @NameInMap("ScheduleTemplateName")
        public String scheduleTemplateName;

        /**
         * <strong>example:</strong>
         * <p>BASE_SCHEDULE_TEMPLATE</p>
         */
        @NameInMap("ScheduleTemplateType")
        public String scheduleTemplateType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScheduleType")
        public Integer scheduleType;

        /**
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>9999-01-01</p>
         */
        @NameInMap("ValidEndDate")
        public String validEndDate;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        @NameInMap("ValidStartDate")
        public String validStartDate;

        public static ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData self = new ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData();
            return TeaModel.build(map, self);
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setConditionScheduleParamList(java.util.List<ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList> conditionScheduleParamList) {
            this.conditionScheduleParamList = conditionScheduleParamList;
            return this;
        }
        public java.util.List<ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataConditionScheduleParamList> getConditionScheduleParamList() {
            return this.conditionScheduleParamList;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setCustomCronExpression(Boolean customCronExpression) {
            this.customCronExpression = customCronExpression;
            return this;
        }
        public Boolean getCustomCronExpression() {
            return this.customCronExpression;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setCustomIntervalConfig(ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig customIntervalConfig) {
            this.customIntervalConfig = customIntervalConfig;
            return this;
        }
        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfig getCustomIntervalConfig() {
            return this.customIntervalConfig;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setCustomIntervalConfigType(String customIntervalConfigType) {
            this.customIntervalConfigType = customIntervalConfigType;
            return this;
        }
        public String getCustomIntervalConfigType() {
            return this.customIntervalConfigType;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setCustomIntervalConfigs(java.util.List<ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs> customIntervalConfigs) {
            this.customIntervalConfigs = customIntervalConfigs;
            return this;
        }
        public java.util.List<ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultDataCustomIntervalConfigs> getCustomIntervalConfigs() {
            return this.customIntervalConfigs;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setGmtModify(Long gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public Long getGmtModify() {
            return this.gmtModify;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setHasReference(Boolean hasReference) {
            this.hasReference = hasReference;
            return this;
        }
        public Boolean getHasReference() {
            return this.hasReference;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setScheduleIntervalType(String scheduleIntervalType) {
            this.scheduleIntervalType = scheduleIntervalType;
            return this;
        }
        public String getScheduleIntervalType() {
            return this.scheduleIntervalType;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setScheduleTemplateDesc(String scheduleTemplateDesc) {
            this.scheduleTemplateDesc = scheduleTemplateDesc;
            return this;
        }
        public String getScheduleTemplateDesc() {
            return this.scheduleTemplateDesc;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setScheduleTemplateId(Long scheduleTemplateId) {
            this.scheduleTemplateId = scheduleTemplateId;
            return this;
        }
        public Long getScheduleTemplateId() {
            return this.scheduleTemplateId;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setScheduleTemplateName(String scheduleTemplateName) {
            this.scheduleTemplateName = scheduleTemplateName;
            return this;
        }
        public String getScheduleTemplateName() {
            return this.scheduleTemplateName;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setScheduleTemplateType(String scheduleTemplateType) {
            this.scheduleTemplateType = scheduleTemplateType;
            return this;
        }
        public String getScheduleTemplateType() {
            return this.scheduleTemplateType;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setValidEndDate(String validEndDate) {
            this.validEndDate = validEndDate;
            return this;
        }
        public String getValidEndDate() {
            return this.validEndDate;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData setValidStartDate(String validStartDate) {
            this.validStartDate = validStartDate;
            return this;
        }
        public String getValidStartDate() {
            return this.validStartDate;
        }

    }

    public static class ListScheduleTemplatesResponseBodyListScheduleTemplatesResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        @NameInMap("ResultData")
        public java.util.List<ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData> resultData;

        public static ListScheduleTemplatesResponseBodyListScheduleTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
            ListScheduleTemplatesResponseBodyListScheduleTemplatesResponse self = new ListScheduleTemplatesResponseBodyListScheduleTemplatesResponse();
            return TeaModel.build(map, self);
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponse setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListScheduleTemplatesResponseBodyListScheduleTemplatesResponse setResultData(java.util.List<ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData> resultData) {
            this.resultData = resultData;
            return this;
        }
        public java.util.List<ListScheduleTemplatesResponseBodyListScheduleTemplatesResponseResultData> getResultData() {
            return this.resultData;
        }

    }

}
