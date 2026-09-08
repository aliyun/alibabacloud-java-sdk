// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class PutEventsResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public PutEventsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>EventBusNotExist</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier that Alibaba Cloud generated for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2BC1857D-E633-5E79-B2C2-43EF5F7730D8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values: true: The operation was successful. false: The operation failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PutEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEventsResponseBody self = new PutEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutEventsResponseBody setData(PutEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PutEventsResponseBodyData getData() {
        return this.data;
    }

    public PutEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PutEventsResponseBodyDataEntryList extends TeaModel {
        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success indicates success. Other values indicate exceptions</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The detailed error description.</p>
         * 
         * <strong>example:</strong>
         * <p>triggerPicture failed</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4c8b7500-2aea-4f5a-b7dd-9d9dd986c07d</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The trace ID, which is used to query the exact call information.</p>
         * 
         * <strong>example:</strong>
         * <p>4E17C677F5357FB23D1A7FF964CD1999</p>
         */
        @NameInMap("TraceId")
        public String traceId;

        public static PutEventsResponseBodyDataEntryList build(java.util.Map<String, ?> map) throws Exception {
            PutEventsResponseBodyDataEntryList self = new PutEventsResponseBodyDataEntryList();
            return TeaModel.build(map, self);
        }

        public PutEventsResponseBodyDataEntryList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PutEventsResponseBodyDataEntryList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public PutEventsResponseBodyDataEntryList setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public PutEventsResponseBodyDataEntryList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

    public static class PutEventsResponseBodyData extends TeaModel {
        /**
         * <p>The collection of event sending results.</p>
         */
        @NameInMap("EntryList")
        public java.util.List<PutEventsResponseBodyDataEntryList> entryList;

        /**
         * <p>The number of events that failed to be sent.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FailedEntryCount")
        public Integer failedEntryCount;

        public static PutEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PutEventsResponseBodyData self = new PutEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PutEventsResponseBodyData setEntryList(java.util.List<PutEventsResponseBodyDataEntryList> entryList) {
            this.entryList = entryList;
            return this;
        }
        public java.util.List<PutEventsResponseBodyDataEntryList> getEntryList() {
            return this.entryList;
        }

        public PutEventsResponseBodyData setFailedEntryCount(Integer failedEntryCount) {
            this.failedEntryCount = failedEntryCount;
            return this;
        }
        public Integer getFailedEntryCount() {
            return this.failedEntryCount;
        }

    }

}
