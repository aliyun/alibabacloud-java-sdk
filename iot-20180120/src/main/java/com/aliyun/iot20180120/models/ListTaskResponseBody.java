// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTaskResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>223sdf***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>512FF8FD-A97F-4AAF-B0A2-7BE3D3A19BB3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>mydevice</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>BDjhIC***i000101</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <strong>example:</strong>
         * <p>sGWotg***010001</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>MyTestJobIax6Eq</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>a1S0OM***</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>MSnT9wl***q010101</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>2019-05-21T13:03:56.000Z</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        /**
         * <strong>example:</strong>
         * <p>2019-05-21T13:03:53.000Z</p>
         */
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
