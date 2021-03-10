// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InvokeThingServiceResponseBodyData data;

    public static InvokeThingServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeThingServiceResponseBody self = new InvokeThingServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeThingServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeThingServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvokeThingServiceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InvokeThingServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeThingServiceResponseBody setData(InvokeThingServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InvokeThingServiceResponseBodyData getData() {
        return this.data;
    }

    public static class InvokeThingServiceResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public String result;

        @NameInMap("MessageId")
        public String messageId;

        public static InvokeThingServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InvokeThingServiceResponseBodyData self = new InvokeThingServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InvokeThingServiceResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public InvokeThingServiceResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
