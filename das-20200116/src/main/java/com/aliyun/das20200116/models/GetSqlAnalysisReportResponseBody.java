// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlAnalysisReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetSqlAnalysisReportResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSqlAnalysisReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlAnalysisReportResponseBody self = new GetSqlAnalysisReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlAnalysisReportResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetSqlAnalysisReportResponseBody setData(java.util.List<GetSqlAnalysisReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSqlAnalysisReportResponseBodyData> getData() {
        return this.data;
    }

    public GetSqlAnalysisReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSqlAnalysisReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlAnalysisReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSqlAnalysisReportResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("Result")
        public String result;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("UserId")
        public String userId;

        public static GetSqlAnalysisReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSqlAnalysisReportResponseBodyData self = new GetSqlAnalysisReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSqlAnalysisReportResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSqlAnalysisReportResponseBodyData setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public GetSqlAnalysisReportResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetSqlAnalysisReportResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetSqlAnalysisReportResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
