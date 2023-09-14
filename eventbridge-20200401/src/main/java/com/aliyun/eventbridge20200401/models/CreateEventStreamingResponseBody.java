// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventStreamingResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The HTTP status code 200 indicates that the request is successful. Other HTTP codes indicate that the request failed. For more information about error codes, see Error codes.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateEventStreamingResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateEventStreamingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventStreamingResponseBody self = new CreateEventStreamingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventStreamingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEventStreamingResponseBody setData(CreateEventStreamingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEventStreamingResponseBodyData getData() {
        return this.data;
    }

    public CreateEventStreamingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEventStreamingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventStreamingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEventStreamingResponseBodyData extends TeaModel {
        /**
         * <p>The ARN of the event stream.</p>
         */
        @NameInMap("EventStreamingARN")
        public String eventStreamingARN;

        public static CreateEventStreamingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEventStreamingResponseBodyData self = new CreateEventStreamingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEventStreamingResponseBodyData setEventStreamingARN(String eventStreamingARN) {
            this.eventStreamingARN = eventStreamingARN;
            return this;
        }
        public String getEventStreamingARN() {
            return this.eventStreamingARN;
        }

    }

}
