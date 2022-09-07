// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCustomCallTaggingResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<CreateCustomCallTaggingResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomCallTaggingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomCallTaggingResponseBody self = new CreateCustomCallTaggingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomCallTaggingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCustomCallTaggingResponseBody setData(java.util.List<CreateCustomCallTaggingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CreateCustomCallTaggingResponseBodyData> getData() {
        return this.data;
    }

    public CreateCustomCallTaggingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateCustomCallTaggingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCustomCallTaggingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCustomCallTaggingResponseBodyData extends TeaModel {
        @NameInMap("Item")
        public String item;

        @NameInMap("Reason")
        public String reason;

        public static CreateCustomCallTaggingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomCallTaggingResponseBodyData self = new CreateCustomCallTaggingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCustomCallTaggingResponseBodyData setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public CreateCustomCallTaggingResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
