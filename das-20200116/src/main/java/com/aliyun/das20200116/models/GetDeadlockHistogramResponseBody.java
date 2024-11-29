// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadlockHistogramResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetDeadlockHistogramResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0A74B755-98B7-59DB-8724-1321B394****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDeadlockHistogramResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeadlockHistogramResponseBody self = new GetDeadlockHistogramResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeadlockHistogramResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetDeadlockHistogramResponseBody setData(java.util.List<GetDeadlockHistogramResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDeadlockHistogramResponseBodyData> getData() {
        return this.data;
    }

    public GetDeadlockHistogramResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeadlockHistogramResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeadlockHistogramResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeadlockHistogramResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1729998000000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>pc-bp1u5mas9exx7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LockNumber")
        public Integer lockNumber;

        /**
         * <strong>example:</strong>
         * <p>pi-bp16v3824rt73****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>1729994400000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-1321B394****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>108************</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static GetDeadlockHistogramResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeadlockHistogramResponseBodyData self = new GetDeadlockHistogramResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeadlockHistogramResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetDeadlockHistogramResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDeadlockHistogramResponseBodyData setLockNumber(Integer lockNumber) {
            this.lockNumber = lockNumber;
            return this;
        }
        public Integer getLockNumber() {
            return this.lockNumber;
        }

        public GetDeadlockHistogramResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetDeadlockHistogramResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetDeadlockHistogramResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeadlockHistogramResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetDeadlockHistogramResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
