// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteEventsResponseBody extends TeaModel {
    /**
     * <p>The business result code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The operation result.</p>
     */
    @NameInMap("data")
    public DeleteEventsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The description of the request processing result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. For batch operations, you must still check the result of each item.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEventsResponseBody self = new DeleteEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteEventsResponseBody setData(DeleteEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteEventsResponseBodyData getData() {
        return this.data;
    }

    public DeleteEventsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteEventsResponseBodyDataResultsError extends TeaModel {
        /**
         * <p>The error code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The error description.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The event content format is incorrect</p>
         */
        @NameInMap("message")
        public String message;

        public static DeleteEventsResponseBodyDataResultsError build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventsResponseBodyDataResultsError self = new DeleteEventsResponseBodyDataResultsError();
            return TeaModel.build(map, self);
        }

        public DeleteEventsResponseBodyDataResultsError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteEventsResponseBodyDataResultsError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DeleteEventsResponseBodyDataResults extends TeaModel {
        /**
         * <p>The error for the failed item.</p>
         */
        @NameInMap("error")
        public DeleteEventsResponseBodyDataResultsError error;

        /**
         * <p>The ID of the event requested to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <p>The status. Valid values: DELETED, NOT_FOUND, and FAILED.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DELETED</p>
         */
        @NameInMap("status")
        public String status;

        public static DeleteEventsResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventsResponseBodyDataResults self = new DeleteEventsResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public DeleteEventsResponseBodyDataResults setError(DeleteEventsResponseBodyDataResultsError error) {
            this.error = error;
            return this;
        }
        public DeleteEventsResponseBodyDataResultsError getError() {
            return this.error;
        }

        public DeleteEventsResponseBodyDataResults setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public DeleteEventsResponseBodyDataResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DeleteEventsResponseBodyData extends TeaModel {
        /**
         * <p>The itemized deletion results.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("results")
        public java.util.List<DeleteEventsResponseBodyDataResults> results;

        public static DeleteEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteEventsResponseBodyData self = new DeleteEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteEventsResponseBodyData setResults(java.util.List<DeleteEventsResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DeleteEventsResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
