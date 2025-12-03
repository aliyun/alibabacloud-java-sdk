// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class PullTaskResponseBody extends TeaModel {
    /**
     * <p>allowRetry</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>appName</p>
     * 
     * <strong>example:</strong>
     * <p>voldemort-aliyun-com</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>dynamicCode</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>dynamicMessage</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>errorCode</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>errorMsg</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>httpStatusCode</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Module")
    public PullTaskResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>9831C9A6-3423-52C2-B0E5-5AE01D92C097</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>success</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PullTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PullTaskResponseBody self = new PullTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PullTaskResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public PullTaskResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public PullTaskResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public PullTaskResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public PullTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public PullTaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public PullTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PullTaskResponseBody setModule(PullTaskResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public PullTaskResponseBodyModule getModule() {
        return this.module;
    }

    public PullTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PullTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PullTaskResponseBodyModule extends TeaModel {
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <strong>example:</strong>
         * <p>1649470201045</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OutTaskId")
        public String outTaskId;

        @NameInMap("PrincipalKey")
        public String principalKey;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;result\&quot;:\&quot;SUCCESS\&quot;,\&quot;message\&quot;:\&quot;null\&quot;,\&quot;taskId\&quot;:\&quot;d8800bab-88b6-4c60-9e4f-ed38dbbdd9b3\&quot;}</p>
         */
        @NameInMap("TaskData")
        public String taskData;

        /**
         * <strong>example:</strong>
         * <p>704614</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>PATENT_QUERY</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static PullTaskResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            PullTaskResponseBodyModule self = new PullTaskResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public PullTaskResponseBodyModule setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public PullTaskResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public PullTaskResponseBodyModule setOutTaskId(String outTaskId) {
            this.outTaskId = outTaskId;
            return this;
        }
        public String getOutTaskId() {
            return this.outTaskId;
        }

        public PullTaskResponseBodyModule setPrincipalKey(String principalKey) {
            this.principalKey = principalKey;
            return this;
        }
        public String getPrincipalKey() {
            return this.principalKey;
        }

        public PullTaskResponseBodyModule setTaskData(String taskData) {
            this.taskData = taskData;
            return this;
        }
        public String getTaskData() {
            return this.taskData;
        }

        public PullTaskResponseBodyModule setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public PullTaskResponseBodyModule setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
