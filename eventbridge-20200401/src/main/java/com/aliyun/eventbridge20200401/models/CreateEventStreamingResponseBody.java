// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventStreamingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateEventStreamingResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
