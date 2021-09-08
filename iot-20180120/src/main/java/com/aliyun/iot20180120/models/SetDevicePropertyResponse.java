// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDevicePropertyResponse extends TeaModel {
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
    public SetDevicePropertyResponseData data;

    public static SetDevicePropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePropertyResponse self = new SetDevicePropertyResponse();
        return TeaModel.build(map, self);
    }

    public SetDevicePropertyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDevicePropertyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetDevicePropertyResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetDevicePropertyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetDevicePropertyResponse setData(SetDevicePropertyResponseData data) {
        this.data = data;
        return this;
    }
    public SetDevicePropertyResponseData getData() {
        return this.data;
    }

    public static class SetDevicePropertyResponseData extends TeaModel {
        @NameInMap("MessageId")
        @Validation(required = true)
        public String messageId;

        public static SetDevicePropertyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SetDevicePropertyResponseData self = new SetDevicePropertyResponseData();
            return TeaModel.build(map, self);
        }

        public SetDevicePropertyResponseData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
