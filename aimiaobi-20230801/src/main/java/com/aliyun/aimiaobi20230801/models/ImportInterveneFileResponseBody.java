// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ImportInterveneFileResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data.</p>
     */
    @NameInMap("Data")
    public ImportInterveneFileResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded. Set to true for success or false for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImportInterveneFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportInterveneFileResponseBody self = new ImportInterveneFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportInterveneFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportInterveneFileResponseBody setData(ImportInterveneFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportInterveneFileResponseBodyData getData() {
        return this.data;
    }

    public ImportInterveneFileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportInterveneFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportInterveneFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportInterveneFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportInterveneFileResponseBodyData extends TeaModel {
        /**
         * <p>Intervention status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>List of failed index IDs.</p>
         */
        @NameInMap("FailIdList")
        public java.util.List<String> failIdList;

        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;3f7045e099474ba28ceca1b4eb6d6e21&quot;</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ImportInterveneFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportInterveneFileResponseBodyData self = new ImportInterveneFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportInterveneFileResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ImportInterveneFileResponseBodyData setFailIdList(java.util.List<String> failIdList) {
            this.failIdList = failIdList;
            return this;
        }
        public java.util.List<String> getFailIdList() {
            return this.failIdList;
        }

        public ImportInterveneFileResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
