// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncWritingBiddingDocResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AsyncWritingBiddingDocResponseBodyData data;

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

    public static AsyncWritingBiddingDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsyncWritingBiddingDocResponseBody self = new AsyncWritingBiddingDocResponseBody();
        return TeaModel.build(map, self);
    }

    public AsyncWritingBiddingDocResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AsyncWritingBiddingDocResponseBody setData(AsyncWritingBiddingDocResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AsyncWritingBiddingDocResponseBodyData getData() {
        return this.data;
    }

    public AsyncWritingBiddingDocResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AsyncWritingBiddingDocResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsyncWritingBiddingDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AsyncWritingBiddingDocResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AsyncWritingBiddingDocResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static AsyncWritingBiddingDocResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AsyncWritingBiddingDocResponseBodyData self = new AsyncWritingBiddingDocResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AsyncWritingBiddingDocResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
