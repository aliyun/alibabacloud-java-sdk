// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingServiceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public InvokeThingServiceResponseData data;

    public static InvokeThingServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeThingServiceResponse self = new InvokeThingServiceResponse();
        return TeaModel.build(map, self);
    }

    public InvokeThingServiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeThingServiceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InvokeThingServiceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InvokeThingServiceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeThingServiceResponse setData(InvokeThingServiceResponseData data) {
        this.data = data;
        return this;
    }
    public InvokeThingServiceResponseData getData() {
        return this.data;
    }

    public static class InvokeThingServiceResponseData extends TeaModel {
        @NameInMap("Result")
        @Validation(required = true)
        public String result;

        @NameInMap("MessageId")
        @Validation(required = true)
        public String messageId;

        public static InvokeThingServiceResponseData build(java.util.Map<String, ?> map) throws Exception {
            InvokeThingServiceResponseData self = new InvokeThingServiceResponseData();
            return TeaModel.build(map, self);
        }

        public InvokeThingServiceResponseData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public InvokeThingServiceResponseData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
