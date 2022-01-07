// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTaskResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskResponseBody self = new ListTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskResponseBody setData(ListTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTaskResponseBodyData getData() {
        return this.data;
    }

    public ListTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListTaskResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTaskResponseBodyDataData extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("UtcQueueTime")
        public String utcQueueTime;

        public static ListTaskResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskResponseBodyDataData self = new ListTaskResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListTaskResponseBodyDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListTaskResponseBodyDataData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListTaskResponseBodyDataData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListTaskResponseBodyDataData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListTaskResponseBodyDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListTaskResponseBodyDataData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListTaskResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTaskResponseBodyDataData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTaskResponseBodyDataData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListTaskResponseBodyDataData setUtcQueueTime(String utcQueueTime) {
            this.utcQueueTime = utcQueueTime;
            return this;
        }
        public String getUtcQueueTime() {
            return this.utcQueueTime;
        }

    }

    public static class ListTaskResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<ListTaskResponseBodyDataData> data;

        public static ListTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTaskResponseBodyData self = new ListTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTaskResponseBodyData setData(java.util.List<ListTaskResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListTaskResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
