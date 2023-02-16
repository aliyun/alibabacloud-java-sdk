// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateEventBusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateEventBusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateEventBusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEventBusResponseBody self = new CreateEventBusResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEventBusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateEventBusResponseBody setData(CreateEventBusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEventBusResponseBodyData getData() {
        return this.data;
    }

    public CreateEventBusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEventBusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEventBusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEventBusResponseBodyData extends TeaModel {
        @NameInMap("EventBusARN")
        public String eventBusARN;

        public static CreateEventBusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEventBusResponseBodyData self = new CreateEventBusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEventBusResponseBodyData setEventBusARN(String eventBusARN) {
            this.eventBusARN = eventBusARN;
            return this;
        }
        public String getEventBusARN() {
            return this.eventBusARN;
        }

    }

}
