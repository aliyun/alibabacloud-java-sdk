// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventSourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateEventSourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateEventSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventSourceResponseBody self = new CreateEventSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEventSourceResponseBody setData(CreateEventSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEventSourceResponseBodyData getData() {
        return this.data;
    }

    public CreateEventSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEventSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEventSourceResponseBodyData extends TeaModel {
        @NameInMap("EventSourceARN")
        public String eventSourceARN;

        public static CreateEventSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEventSourceResponseBodyData self = new CreateEventSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEventSourceResponseBodyData setEventSourceARN(String eventSourceARN) {
            this.eventSourceARN = eventSourceARN;
            return this;
        }
        public String getEventSourceARN() {
            return this.eventSourceARN;
        }

    }

}
