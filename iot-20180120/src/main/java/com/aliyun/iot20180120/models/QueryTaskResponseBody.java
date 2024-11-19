// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryTaskResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

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

    public static QueryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskResponseBody self = new QueryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTaskResponseBody setData(QueryTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskResponseBodyData getData() {
        return this.data;
    }

    public QueryTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class QueryTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mydevice</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>BDjhI****01</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <strong>example:</strong>
         * <p>sGWotgRkutxX*****</p>
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
         * <p>this is message about task execution</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>a1S****</p>
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
         * <p>{ &quot;msg&quot;:&quot;this is message reported by device&quot; }</p>
         */
        @NameInMap("StatusDetail")
        public String statusDetail;

        /**
         * <strong>example:</strong>
         * <p>MSnT9***q010101</p>
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

        public static QueryTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskResponseBodyData self = new QueryTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryTaskResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryTaskResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryTaskResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryTaskResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryTaskResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryTaskResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public QueryTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTaskResponseBodyData setStatusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public String getStatusDetail() {
            return this.statusDetail;
        }

        public QueryTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryTaskResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryTaskResponseBodyData setUtcQueueTime(String utcQueueTime) {
            this.utcQueueTime = utcQueueTime;
            return this;
        }
        public String getUtcQueueTime() {
            return this.utcQueueTime;
        }

    }

}
