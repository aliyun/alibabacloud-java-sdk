// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityRuleTasksResponseBody extends TeaModel {
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

    @NameInMap("PageResult")
    public ListQualityRuleTasksResponseBodyPageResult pageResult;

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

    public static ListQualityRuleTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityRuleTasksResponseBody self = new ListQualityRuleTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityRuleTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQualityRuleTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListQualityRuleTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQualityRuleTasksResponseBody setPageResult(ListQualityRuleTasksResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListQualityRuleTasksResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListQualityRuleTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityRuleTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList extends TeaModel {
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

        public static ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList self = new ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList();
            return TeaModel.build(map, self);
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setBizDateFormat(String bizDateFormat) {
            this.bizDateFormat = bizDateFormat;
            return this;
        }
        public String getBizDateFormat() {
            return this.bizDateFormat;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setValidateObjectName(String validateObjectName) {
            this.validateObjectName = validateObjectName;
            return this;
        }
        public String getValidateObjectName() {
            return this.validateObjectName;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setValidateObjectType(String validateObjectType) {
            this.validateObjectType = validateObjectType;
            return this;
        }
        public String getValidateObjectType() {
            return this.validateObjectType;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setValidatePartition(String validatePartition) {
            this.validatePartition = validatePartition;
            return this;
        }
        public String getValidatePartition() {
            return this.validatePartition;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setValidateSuccess(Boolean validateSuccess) {
            this.validateSuccess = validateSuccess;
            return this;
        }
        public Boolean getValidateSuccess() {
            return this.validateSuccess;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

        public ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList setWatchTaskId(Long watchTaskId) {
            this.watchTaskId = watchTaskId;
            return this;
        }
        public Long getWatchTaskId() {
            return this.watchTaskId;
        }

    }

    public static class ListQualityRuleTasksResponseBodyPageResult extends TeaModel {
        @NameInMap("QualityRuleTaskList")
        public java.util.List<ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList> qualityRuleTaskList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListQualityRuleTasksResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListQualityRuleTasksResponseBodyPageResult self = new ListQualityRuleTasksResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListQualityRuleTasksResponseBodyPageResult setQualityRuleTaskList(java.util.List<ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList> qualityRuleTaskList) {
            this.qualityRuleTaskList = qualityRuleTaskList;
            return this;
        }
        public java.util.List<ListQualityRuleTasksResponseBodyPageResultQualityRuleTaskList> getQualityRuleTaskList() {
            return this.qualityRuleTaskList;
        }

        public ListQualityRuleTasksResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
