// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateEventsResponseBody extends TeaModel {
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
    public CreateEventsResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request processing description.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. For batch operations, you must still check the result of each item.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventsResponseBody self = new CreateEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEventsResponseBody setData(CreateEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEventsResponseBodyData getData() {
        return this.data;
    }

    public CreateEventsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEventsResponseBodyDataResultsError extends TeaModel {
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

        public static CreateEventsResponseBodyDataResultsError build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsResponseBodyDataResultsError self = new CreateEventsResponseBodyDataResultsError();
            return TeaModel.build(map, self);
        }

        public CreateEventsResponseBodyDataResultsError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateEventsResponseBodyDataResultsError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class CreateEventsResponseBodyDataResults extends TeaModel {
        /**
         * <p>The error for the failed item.</p>
         */
        @NameInMap("error")
        public CreateEventsResponseBodyDataResultsError error;

        /**
         * <p>The event ID generated after the event is successfully saved.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <p>The time when the event reached the server after being successfully saved, in Unix milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1758614401000</p>
         */
        @NameInMap("receivedAt")
        public Long receivedAt;

        /**
         * <p>The status. Valid values: STORED and FAILED.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STORED</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateEventsResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsResponseBodyDataResults self = new CreateEventsResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public CreateEventsResponseBodyDataResults setError(CreateEventsResponseBodyDataResultsError error) {
            this.error = error;
            return this;
        }
        public CreateEventsResponseBodyDataResultsError getError() {
            return this.error;
        }

        public CreateEventsResponseBodyDataResults setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public CreateEventsResponseBodyDataResults setReceivedAt(Long receivedAt) {
            this.receivedAt = receivedAt;
            return this;
        }
        public Long getReceivedAt() {
            return this.receivedAt;
        }

        public CreateEventsResponseBodyDataResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateEventsResponseBodyData extends TeaModel {
        /**
         * <p>The write result for each item. A successful top-level response does not indicate that every item was successful.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("results")
        public java.util.List<CreateEventsResponseBodyDataResults> results;

        public static CreateEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsResponseBodyData self = new CreateEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEventsResponseBodyData setResults(java.util.List<CreateEventsResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<CreateEventsResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
