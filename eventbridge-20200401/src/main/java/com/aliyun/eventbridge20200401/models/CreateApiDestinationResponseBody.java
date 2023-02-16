// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateApiDestinationResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Date")
    public CreateApiDestinationResponseBodyDate date;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateApiDestinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiDestinationResponseBody self = new CreateApiDestinationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiDestinationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateApiDestinationResponseBody setDate(CreateApiDestinationResponseBodyDate date) {
        this.date = date;
        return this;
    }
    public CreateApiDestinationResponseBodyDate getDate() {
        return this.date;
    }

    public CreateApiDestinationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateApiDestinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateApiDestinationResponseBodyDate extends TeaModel {
        @NameInMap("ApiDestinationName")
        public String apiDestinationName;

        public static CreateApiDestinationResponseBodyDate build(java.util.Map<String, ?> map) throws Exception {
            CreateApiDestinationResponseBodyDate self = new CreateApiDestinationResponseBodyDate();
            return TeaModel.build(map, self);
        }

        public CreateApiDestinationResponseBodyDate setApiDestinationName(String apiDestinationName) {
            this.apiDestinationName = apiDestinationName;
            return this;
        }
        public String getApiDestinationName() {
            return this.apiDestinationName;
        }

    }

}
