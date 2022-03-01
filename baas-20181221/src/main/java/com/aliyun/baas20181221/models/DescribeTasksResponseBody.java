// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeTasksResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeTasksResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeTasksResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTasksResponseBody setResult(java.util.List<DescribeTasksResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeTasksResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTasksResponseBodyResult extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Handled")
        public Boolean handled;

        @NameInMap("OperationType")
        public String operationType;

        @NameInMap("RequestTime")
        public Long requestTime;

        @NameInMap("ResponseTime")
        public String responseTime;

        @NameInMap("Result")
        public String result;

        @NameInMap("Sender")
        public String sender;

        @NameInMap("Target")
        public String target;

        @NameInMap("TaskId")
        public Integer taskId;

        public static DescribeTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyResult self = new DescribeTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyResult setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeTasksResponseBodyResult setHandled(Boolean handled) {
            this.handled = handled;
            return this;
        }
        public Boolean getHandled() {
            return this.handled;
        }

        public DescribeTasksResponseBodyResult setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public DescribeTasksResponseBodyResult setRequestTime(Long requestTime) {
            this.requestTime = requestTime;
            return this;
        }
        public Long getRequestTime() {
            return this.requestTime;
        }

        public DescribeTasksResponseBodyResult setResponseTime(String responseTime) {
            this.responseTime = responseTime;
            return this;
        }
        public String getResponseTime() {
            return this.responseTime;
        }

        public DescribeTasksResponseBodyResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeTasksResponseBodyResult setSender(String sender) {
            this.sender = sender;
            return this;
        }
        public String getSender() {
            return this.sender;
        }

        public DescribeTasksResponseBodyResult setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeTasksResponseBodyResult setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

}
