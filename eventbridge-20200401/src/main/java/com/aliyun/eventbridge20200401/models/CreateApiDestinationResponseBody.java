// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateApiDestinationResponseBody extends TeaModel {
    /**
     * <p>The returned response code. The value Success indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the API destination is created.</p>
     */
    @NameInMap("Date")
    public CreateApiDestinationResponseBodyDate date;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The name of the API destination.</p>
         */
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
