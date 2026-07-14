// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListMarketingFlowResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListMarketingFlowResponseBodyData> data;

    /**
     * <p>The message returned for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CB6122C9-09B5-5926-**476A96CB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.                                 </li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListMarketingFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMarketingFlowResponseBody self = new ListMarketingFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMarketingFlowResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListMarketingFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMarketingFlowResponseBody setData(java.util.List<ListMarketingFlowResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMarketingFlowResponseBodyData> getData() {
        return this.data;
    }

    public ListMarketingFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMarketingFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMarketingFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMarketingFlowResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMarketingFlowResponseBodyData extends TeaModel {
        /**
         * <p>The campaign code.</p>
         * 
         * <strong>example:</strong>
         * <p>3243243***</p>
         */
        @NameInMap("ActivityCode")
        public String activityCode;

        /**
         * <p>The campaign description.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("ActivityDesc")
        public String activityDesc;

        /**
         * <p>The campaign name.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The campaign status.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("ActivityStatus")
        public String activityStatus;

        /**
         * <p>The business tenant code. Default value: ALICOM_OPAAS.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The business extension information. Default value: &quot;{}&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BizExtend")
        public java.util.Map<String, ?> bizExtend;

        /**
         * <p>The upgrade start time. The upgrade start time is specified as a cron expression.</p>
         * <p>For example, <code>0 0 4 1/1 * ?</code> indicates that the upgrade starts at 4:00 on the first day of each month and is performed at 4:00 every day.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 4 1/1 * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01 XX1:11:11</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The execution method.</p>
         * 
         * <strong>example:</strong>
         * <p>1(默认corn)</p>
         */
        @NameInMap("ExecutionType")
        public String executionType;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-XX-01 11:11:11</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time (deprecated).</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("GmtModifier")
        public String gmtModifier;

        /**
         * <p>The operational activity ID.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether custom parameters are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("ParamFlag")
        public String paramFlag;

        /**
         * <p>The custom user parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;CustomerLimit\&quot;:false}</p>
         */
        @NameInMap("Params")
        public java.util.Map<String, ?> params;

        /**
         * <p>The associated flow code.</p>
         * 
         * <strong>example:</strong>
         * <p>dsafdsf***</p>
         */
        @NameInMap("RelatedFlowCode")
        public String relatedFlowCode;

        /**
         * <p>The name of the associated flow.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("RelatedFlowName")
        public String relatedFlowName;

        /**
         * <p>The ID of the associated group.</p>
         * 
         * <strong>example:</strong>
         * <p>54354**</p>
         */
        @NameInMap("RelatedGroupId")
        public String relatedGroupId;

        /**
         * <p>The name of the associated group.</p>
         * 
         * <strong>example:</strong>
         * <p>AAA</p>
         */
        @NameInMap("RelatedGroupName")
        public String relatedGroupName;

        /**
         * <p>The specific time. This parameter is valid when the execution method is set to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>特定时间(执行方式为2时)</p>
         */
        @NameInMap("SpecificTime")
        public String specificTime;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-XX 11:11:11</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("TenantCode")
        public String tenantCode;

        public static ListMarketingFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMarketingFlowResponseBodyData self = new ListMarketingFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMarketingFlowResponseBodyData setActivityCode(String activityCode) {
            this.activityCode = activityCode;
            return this;
        }
        public String getActivityCode() {
            return this.activityCode;
        }

        public ListMarketingFlowResponseBodyData setActivityDesc(String activityDesc) {
            this.activityDesc = activityDesc;
            return this;
        }
        public String getActivityDesc() {
            return this.activityDesc;
        }

        public ListMarketingFlowResponseBodyData setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public ListMarketingFlowResponseBodyData setActivityStatus(String activityStatus) {
            this.activityStatus = activityStatus;
            return this;
        }
        public String getActivityStatus() {
            return this.activityStatus;
        }

        public ListMarketingFlowResponseBodyData setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public ListMarketingFlowResponseBodyData setBizExtend(java.util.Map<String, ?> bizExtend) {
            this.bizExtend = bizExtend;
            return this;
        }
        public java.util.Map<String, ?> getBizExtend() {
            return this.bizExtend;
        }

        public ListMarketingFlowResponseBodyData setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public ListMarketingFlowResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListMarketingFlowResponseBodyData setExecutionType(String executionType) {
            this.executionType = executionType;
            return this;
        }
        public String getExecutionType() {
            return this.executionType;
        }

        public ListMarketingFlowResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMarketingFlowResponseBodyData setGmtModifier(String gmtModifier) {
            this.gmtModifier = gmtModifier;
            return this;
        }
        public String getGmtModifier() {
            return this.gmtModifier;
        }

        public ListMarketingFlowResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMarketingFlowResponseBodyData setParamFlag(String paramFlag) {
            this.paramFlag = paramFlag;
            return this;
        }
        public String getParamFlag() {
            return this.paramFlag;
        }

        public ListMarketingFlowResponseBodyData setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public ListMarketingFlowResponseBodyData setRelatedFlowCode(String relatedFlowCode) {
            this.relatedFlowCode = relatedFlowCode;
            return this;
        }
        public String getRelatedFlowCode() {
            return this.relatedFlowCode;
        }

        public ListMarketingFlowResponseBodyData setRelatedFlowName(String relatedFlowName) {
            this.relatedFlowName = relatedFlowName;
            return this;
        }
        public String getRelatedFlowName() {
            return this.relatedFlowName;
        }

        public ListMarketingFlowResponseBodyData setRelatedGroupId(String relatedGroupId) {
            this.relatedGroupId = relatedGroupId;
            return this;
        }
        public String getRelatedGroupId() {
            return this.relatedGroupId;
        }

        public ListMarketingFlowResponseBodyData setRelatedGroupName(String relatedGroupName) {
            this.relatedGroupName = relatedGroupName;
            return this;
        }
        public String getRelatedGroupName() {
            return this.relatedGroupName;
        }

        public ListMarketingFlowResponseBodyData setSpecificTime(String specificTime) {
            this.specificTime = specificTime;
            return this;
        }
        public String getSpecificTime() {
            return this.specificTime;
        }

        public ListMarketingFlowResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListMarketingFlowResponseBodyData setTenantCode(String tenantCode) {
            this.tenantCode = tenantCode;
            return this;
        }
        public String getTenantCode() {
            return this.tenantCode;
        }

    }

}
