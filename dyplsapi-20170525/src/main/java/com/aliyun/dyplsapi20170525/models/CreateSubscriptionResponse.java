// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSubscriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateSubscriptionResponseData data;

    public static CreateSubscriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionResponse self = new CreateSubscriptionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubscriptionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSubscriptionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSubscriptionResponse setData(CreateSubscriptionResponseData data) {
        this.data = data;
        return this;
    }
    public CreateSubscriptionResponseData getData() {
        return this.data;
    }

    public static class CreateSubscriptionResponseData extends TeaModel {
        @NameInMap("SubsId")
        @Validation(required = true)
        public String subsId;

        public static CreateSubscriptionResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionResponseData self = new CreateSubscriptionResponseData();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionResponseData setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

    }

}
