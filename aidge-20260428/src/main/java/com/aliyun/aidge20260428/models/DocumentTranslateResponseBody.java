// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class DocumentTranslateResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The asynchronous task information.</p>
     */
    @NameInMap("Data")
    public DocumentTranslateResponseBodyData data;

    /**
     * <p>The error message. Not returned for successful calls.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>39E8A74B-F99E-1195-A5FF-3ECC5F94F304</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true: The call is successful. false: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DocumentTranslateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DocumentTranslateResponseBody self = new DocumentTranslateResponseBody();
        return TeaModel.build(map, self);
    }

    public DocumentTranslateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DocumentTranslateResponseBody setData(DocumentTranslateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DocumentTranslateResponseBodyData getData() {
        return this.data;
    }

    public DocumentTranslateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DocumentTranslateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DocumentTranslateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DocumentTranslateResponseBodyData extends TeaModel {
        /**
         * <p>The unique identifier of the asynchronous task, used to query the task status and result.</p>
         * 
         * <strong>example:</strong>
         * <p>6071a030-5c92-9df1-96d0-44952343439a</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DocumentTranslateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DocumentTranslateResponseBodyData self = new DocumentTranslateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DocumentTranslateResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
