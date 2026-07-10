// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class RecognizeOrderResponseBody extends TeaModel {
    /**
     * <p>Error code. This parameter is not returned during a normal call.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Recognition task information</p>
     */
    @NameInMap("Data")
    public RecognizeOrderResponseBodyData data;

    /**
     * <p>Error message. This parameter is not returned during a normal call.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. true: The call is successful. false: The call has failed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RecognizeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeOrderResponseBody self = new RecognizeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RecognizeOrderResponseBody setData(RecognizeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeOrderResponseBodyData getData() {
        return this.data;
    }

    public RecognizeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RecognizeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RecognizeOrderResponseBodyData extends TeaModel {
        /**
         * <p>Unique idempotent ID of the business party</p>
         * 
         * <strong>example:</strong>
         * <p>ORDER_001</p>
         */
        @NameInMap("OrderUniqueId")
        public String orderUniqueId;

        /**
         * <p>Platform task ID</p>
         * 
         * <strong>example:</strong>
         * <p>TASK_001</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Task status</p>
         * 
         * <strong>example:</strong>
         * <p>PROCESSING</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static RecognizeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeOrderResponseBodyData self = new RecognizeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeOrderResponseBodyData setOrderUniqueId(String orderUniqueId) {
            this.orderUniqueId = orderUniqueId;
            return this;
        }
        public String getOrderUniqueId() {
            return this.orderUniqueId;
        }

        public RecognizeOrderResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RecognizeOrderResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
