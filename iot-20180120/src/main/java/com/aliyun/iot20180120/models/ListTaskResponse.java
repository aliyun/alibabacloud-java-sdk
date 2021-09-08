// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("Data")
    @Validation(required = true)
    public ListTaskResponseData data;

    public static ListTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskResponse self = new ListTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaskResponse setData(ListTaskResponseData data) {
        this.data = data;
        return this;
    }
    public ListTaskResponseData getData() {
        return this.data;
    }

    public static class ListTaskResponseDataData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("JobName")
        @Validation(required = true)
        public String jobName;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("UtcQueueTime")
        @Validation(required = true)
        public String utcQueueTime;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ListTaskResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskResponseDataData self = new ListTaskResponseDataData();
            return TeaModel.build(map, self);
        }

        public ListTaskResponseDataData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListTaskResponseDataData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListTaskResponseDataData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTaskResponseDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListTaskResponseDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListTaskResponseDataData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListTaskResponseDataData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListTaskResponseDataData setUtcQueueTime(String utcQueueTime) {
            this.utcQueueTime = utcQueueTime;
            return this;
        }
        public String getUtcQueueTime() {
            return this.utcQueueTime;
        }

        public ListTaskResponseDataData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListTaskResponseDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListTaskResponseData extends TeaModel {
        @NameInMap("data")
        @Validation(required = true)
        public java.util.List<ListTaskResponseDataData> data;

        public static ListTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskResponseData self = new ListTaskResponseData();
            return TeaModel.build(map, self);
        }

        public ListTaskResponseData setData(java.util.List<ListTaskResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListTaskResponseDataData> getData() {
            return this.data;
        }

    }

}
