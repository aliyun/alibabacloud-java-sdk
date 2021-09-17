// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSubscriptionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateSubscriptionResponseBodyData data;

    public static CreateSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubscriptionResponseBody self = new CreateSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubscriptionResponseBody setData(CreateSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public static class CreateSubscriptionResponseBodyData extends TeaModel {
        @NameInMap("SubsId")
        public String subsId;

        public static CreateSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSubscriptionResponseBodyData self = new CreateSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSubscriptionResponseBodyData setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

    }

}
