// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ClearIntervenesResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public ClearIntervenesResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request identifier</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates success: true for success, false for failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ClearIntervenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearIntervenesResponseBody self = new ClearIntervenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearIntervenesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClearIntervenesResponseBody setData(ClearIntervenesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClearIntervenesResponseBodyData getData() {
        return this.data;
    }

    public ClearIntervenesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ClearIntervenesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClearIntervenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearIntervenesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ClearIntervenesResponseBodyData extends TeaModel {
        /**
         * <p>Status code returned by the intervention service</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>List of failed index IDs</p>
         */
        @NameInMap("FailIdList")
        public java.util.List<String> failIdList;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ClearIntervenesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClearIntervenesResponseBodyData self = new ClearIntervenesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClearIntervenesResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ClearIntervenesResponseBodyData setFailIdList(java.util.List<String> failIdList) {
            this.failIdList = failIdList;
            return this;
        }
        public java.util.List<String> getFailIdList() {
            return this.failIdList;
        }

        public ClearIntervenesResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
