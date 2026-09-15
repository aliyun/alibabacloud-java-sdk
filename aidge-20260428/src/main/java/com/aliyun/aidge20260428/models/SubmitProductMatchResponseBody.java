// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SubmitProductMatchResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The submit result of the matching product identification asynchronous task.</p>
     */
    @NameInMap("Data")
    public SubmitProductMatchResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
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
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitProductMatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitProductMatchResponseBody self = new SubmitProductMatchResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitProductMatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitProductMatchResponseBody setData(SubmitProductMatchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitProductMatchResponseBodyData getData() {
        return this.data;
    }

    public SubmitProductMatchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitProductMatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitProductMatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitProductMatchResponseBodyData extends TeaModel {
        /**
         * <p>The task acceptance time in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T09:30:00Z</p>
         */
        @NameInMap("SubmittedAt")
        public String submittedAt;

        /**
         * <p>The asynchronous task ID used for QueryAsyncTaskResult queries.</p>
         * 
         * <strong>example:</strong>
         * <p>b7ea15cb609f47b7999d2d68dfbf3c90</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static SubmitProductMatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitProductMatchResponseBodyData self = new SubmitProductMatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitProductMatchResponseBodyData setSubmittedAt(String submittedAt) {
            this.submittedAt = submittedAt;
            return this;
        }
        public String getSubmittedAt() {
            return this.submittedAt;
        }

        public SubmitProductMatchResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
