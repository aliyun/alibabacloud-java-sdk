// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityRuleTaskResponseBody extends TeaModel {
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

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleTaskInfo")
    public GetQualityRuleTaskResponseBodyRuleTaskInfo ruleTaskInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetQualityRuleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleTaskResponseBody self = new GetQualityRuleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityRuleTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityRuleTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityRuleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityRuleTaskResponseBody setRuleTaskInfo(GetQualityRuleTaskResponseBodyRuleTaskInfo ruleTaskInfo) {
        this.ruleTaskInfo = ruleTaskInfo;
        return this;
    }
    public GetQualityRuleTaskResponseBodyRuleTaskInfo getRuleTaskInfo() {
        return this.ruleTaskInfo;
    }

    public GetQualityRuleTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityRuleTaskResponseBodyRuleTaskInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd</p>
         */
        @NameInMap("BizDateFormat")
        public String bizDateFormat;

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
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

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
         * <p>11</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ValidateObjectName")
        public String validateObjectName;

        /**
         * <strong>example:</strong>
         * <p>column</p>
         */
        @NameInMap("ValidateObjectType")
        public String validateObjectType;

        /**
         * <strong>example:</strong>
         * <p>20251011</p>
         */
        @NameInMap("ValidatePartition")
        public String validatePartition;

        @NameInMap("ValidateSuccess")
        public Boolean validateSuccess;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WatchTaskId")
        public Long watchTaskId;

        public static GetQualityRuleTaskResponseBodyRuleTaskInfo build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleTaskResponseBodyRuleTaskInfo self = new GetQualityRuleTaskResponseBodyRuleTaskInfo();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setBizDateFormat(String bizDateFormat) {
            this.bizDateFormat = bizDateFormat;
            return this;
        }
        public String getBizDateFormat() {
            return this.bizDateFormat;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setValidateObjectName(String validateObjectName) {
            this.validateObjectName = validateObjectName;
            return this;
        }
        public String getValidateObjectName() {
            return this.validateObjectName;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setValidateObjectType(String validateObjectType) {
            this.validateObjectType = validateObjectType;
            return this;
        }
        public String getValidateObjectType() {
            return this.validateObjectType;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setValidatePartition(String validatePartition) {
            this.validatePartition = validatePartition;
            return this;
        }
        public String getValidatePartition() {
            return this.validatePartition;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setValidateSuccess(Boolean validateSuccess) {
            this.validateSuccess = validateSuccess;
            return this;
        }
        public Boolean getValidateSuccess() {
            return this.validateSuccess;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

        public GetQualityRuleTaskResponseBodyRuleTaskInfo setWatchTaskId(Long watchTaskId) {
            this.watchTaskId = watchTaskId;
            return this;
        }
        public Long getWatchTaskId() {
            return this.watchTaskId;
        }

    }

}
