// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiCallsResponseBody extends TeaModel {
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
    public ListDataServiceApiCallsResponseBodyPageResult pageResult;

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

    public static ListDataServiceApiCallsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiCallsResponseBody self = new ListDataServiceApiCallsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiCallsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataServiceApiCallsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApiCallsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataServiceApiCallsResponseBody setPageResult(ListDataServiceApiCallsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListDataServiceApiCallsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListDataServiceApiCallsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApiCallsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceApiCallsResponseBodyPageResultCallLogList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>102112</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>201211</p>
         */
        @NameInMap("AppKey")
        public Long appKey;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("BizCodeDescription")
        public String bizCodeDescription;

        /**
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("CostTime")
        public Integer costTime;

        /**
         * <strong>example:</strong>
         * <p>2024-11-01 01:01:03.000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Env")
        public Integer env;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("ExecuteCostTime")
        public Integer executeCostTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExecuteMode")
        public Integer executeMode;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HttpStatusCode")
        public String httpStatusCode;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("HttpStatusDescription")
        public String httpStatusDescription;

        /**
         * <strong>example:</strong>
         * <p>102356</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>102356</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>1234567890-232sds-3e232-ae2e232</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;test&quot;}</p>
         */
        @NameInMap("RequestParameter")
        public String requestParameter;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("RequestSize")
        public Integer requestSize;

        /**
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;200&quot;,&quot;message&quot;:&quot;success&quot;}</p>
         */
        @NameInMap("ResponseParameter")
        public String responseParameter;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ResponseSize")
        public Integer responseSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResultCount")
        public Integer resultCount;

        /**
         * <strong>example:</strong>
         * <p>select col1 from t_test1 limit 100;</p>
         */
        @NameInMap("Sql")
        public String sql;

        /**
         * <strong>example:</strong>
         * <p>2024-11-01 01:01:01.000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Successful")
        public Boolean successful;

        public static ListDataServiceApiCallsResponseBodyPageResultCallLogList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiCallsResponseBodyPageResultCallLogList self = new ListDataServiceApiCallsResponseBodyPageResultCallLogList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setBizCodeDescription(String bizCodeDescription) {
            this.bizCodeDescription = bizCodeDescription;
            return this;
        }
        public String getBizCodeDescription() {
            return this.bizCodeDescription;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setCostTime(Integer costTime) {
            this.costTime = costTime;
            return this;
        }
        public Integer getCostTime() {
            return this.costTime;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setEnv(Integer env) {
            this.env = env;
            return this;
        }
        public Integer getEnv() {
            return this.env;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setExecuteCostTime(Integer executeCostTime) {
            this.executeCostTime = executeCostTime;
            return this;
        }
        public Integer getExecuteCostTime() {
            return this.executeCostTime;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setExecuteMode(Integer executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public Integer getExecuteMode() {
            return this.executeMode;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setHttpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public String getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setHttpStatusDescription(String httpStatusDescription) {
            this.httpStatusDescription = httpStatusDescription;
            return this;
        }
        public String getHttpStatusDescription() {
            return this.httpStatusDescription;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setRequestParameter(String requestParameter) {
            this.requestParameter = requestParameter;
            return this;
        }
        public String getRequestParameter() {
            return this.requestParameter;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setRequestSize(Integer requestSize) {
            this.requestSize = requestSize;
            return this;
        }
        public Integer getRequestSize() {
            return this.requestSize;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setResponseParameter(String responseParameter) {
            this.responseParameter = responseParameter;
            return this;
        }
        public String getResponseParameter() {
            return this.responseParameter;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setResponseSize(Integer responseSize) {
            this.responseSize = responseSize;
            return this;
        }
        public Integer getResponseSize() {
            return this.responseSize;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setResultCount(Integer resultCount) {
            this.resultCount = resultCount;
            return this;
        }
        public Integer getResultCount() {
            return this.resultCount;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataServiceApiCallsResponseBodyPageResultCallLogList setSuccessful(Boolean successful) {
            this.successful = successful;
            return this;
        }
        public Boolean getSuccessful() {
            return this.successful;
        }

    }

    public static class ListDataServiceApiCallsResponseBodyPageResult extends TeaModel {
        @NameInMap("CallLogList")
        public java.util.List<ListDataServiceApiCallsResponseBodyPageResultCallLogList> callLogList;

        /**
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListDataServiceApiCallsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiCallsResponseBodyPageResult self = new ListDataServiceApiCallsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiCallsResponseBodyPageResult setCallLogList(java.util.List<ListDataServiceApiCallsResponseBodyPageResultCallLogList> callLogList) {
            this.callLogList = callLogList;
            return this;
        }
        public java.util.List<ListDataServiceApiCallsResponseBodyPageResultCallLogList> getCallLogList() {
            return this.callLogList;
        }

        public ListDataServiceApiCallsResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
