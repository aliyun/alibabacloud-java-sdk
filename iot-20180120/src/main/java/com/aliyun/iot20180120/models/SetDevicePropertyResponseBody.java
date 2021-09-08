// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDevicePropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SetDevicePropertyResponseBodyData data;

    public static SetDevicePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePropertyResponseBody self = new SetDevicePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDevicePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDevicePropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetDevicePropertyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetDevicePropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetDevicePropertyResponseBody setData(SetDevicePropertyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetDevicePropertyResponseBodyData getData() {
        return this.data;
    }

    public static class SetDevicePropertyResponseBodyData extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        public static SetDevicePropertyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetDevicePropertyResponseBodyData self = new SetDevicePropertyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetDevicePropertyResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
