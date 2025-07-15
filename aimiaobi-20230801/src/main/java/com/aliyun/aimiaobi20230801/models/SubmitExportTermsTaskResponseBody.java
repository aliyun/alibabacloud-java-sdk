// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitExportTermsTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitExportTermsTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitExportTermsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitExportTermsTaskResponseBody self = new SubmitExportTermsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitExportTermsTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitExportTermsTaskResponseBody setData(SubmitExportTermsTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitExportTermsTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitExportTermsTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitExportTermsTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitExportTermsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitExportTermsTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitExportTermsTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitExportTermsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitExportTermsTaskResponseBodyData self = new SubmitExportTermsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitExportTermsTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
