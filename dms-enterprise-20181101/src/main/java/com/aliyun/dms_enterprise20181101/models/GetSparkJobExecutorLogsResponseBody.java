// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSparkJobExecutorLogsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    // log of the spark job
    @NameInMap("ExecutorLogs")
    public GetSparkJobExecutorLogsResponseBodyExecutorLogs executorLogs;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSparkJobExecutorLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkJobExecutorLogsResponseBody self = new GetSparkJobExecutorLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkJobExecutorLogsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSparkJobExecutorLogsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSparkJobExecutorLogsResponseBody setExecutorLogs(GetSparkJobExecutorLogsResponseBodyExecutorLogs executorLogs) {
        this.executorLogs = executorLogs;
        return this;
    }
    public GetSparkJobExecutorLogsResponseBodyExecutorLogs getExecutorLogs() {
        return this.executorLogs;
    }

    public GetSparkJobExecutorLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSparkJobExecutorLogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSparkJobExecutorLogsResponseBodyExecutorLogs extends TeaModel {
        @NameInMap("executorLogs")
        public java.util.List<String> executorLogs;

        public static GetSparkJobExecutorLogsResponseBodyExecutorLogs build(java.util.Map<String, ?> map) throws Exception {
            GetSparkJobExecutorLogsResponseBodyExecutorLogs self = new GetSparkJobExecutorLogsResponseBodyExecutorLogs();
            return TeaModel.build(map, self);
        }

        public GetSparkJobExecutorLogsResponseBodyExecutorLogs setExecutorLogs(java.util.List<String> executorLogs) {
            this.executorLogs = executorLogs;
            return this;
        }
        public java.util.List<String> getExecutorLogs() {
            return this.executorLogs;
        }

    }

}
