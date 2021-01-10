// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryTaskResponseBodyData data;

    public static QueryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskResponseBody self = new QueryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTaskResponseBody setData(QueryTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTaskResponseBodyDataData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("UtcQueueTime")
        public String utcQueueTime;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("StatusDetail")
        public String statusDetail;

        @NameInMap("Status")
        public String status;

        @NameInMap("Message")
        public String message;

        public static QueryTaskResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskResponseBodyDataData self = new QueryTaskResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public QueryTaskResponseBodyDataData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryTaskResponseBodyDataData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryTaskResponseBodyDataData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryTaskResponseBodyDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryTaskResponseBodyDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryTaskResponseBodyDataData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryTaskResponseBodyDataData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public QueryTaskResponseBodyDataData setUtcQueueTime(String utcQueueTime) {
            this.utcQueueTime = utcQueueTime;
            return this;
        }
        public String getUtcQueueTime() {
            return this.utcQueueTime;
        }

        public QueryTaskResponseBodyDataData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryTaskResponseBodyDataData setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public QueryTaskResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTaskResponseBodyDataData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class QueryTaskResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<QueryTaskResponseBodyDataData> data;

        public static QueryTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskResponseBodyData self = new QueryTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskResponseBodyData setData(java.util.List<QueryTaskResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryTaskResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
