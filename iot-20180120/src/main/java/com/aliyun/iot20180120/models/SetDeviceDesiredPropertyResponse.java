// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceDesiredPropertyResponse extends TeaModel {
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
    public SetDeviceDesiredPropertyResponseData data;

    public static SetDeviceDesiredPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceDesiredPropertyResponse self = new SetDeviceDesiredPropertyResponse();
        return TeaModel.build(map, self);
    }

    public SetDeviceDesiredPropertyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDeviceDesiredPropertyResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SetDeviceDesiredPropertyResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetDeviceDesiredPropertyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetDeviceDesiredPropertyResponse setData(SetDeviceDesiredPropertyResponseData data) {
        this.data = data;
        return this;
    }
    public SetDeviceDesiredPropertyResponseData getData() {
        return this.data;
    }

    public static class SetDeviceDesiredPropertyResponseData extends TeaModel {
        @NameInMap("MessageId")
        @Validation(required = true)
        public String messageId;

        @NameInMap("Versions")
        @Validation(required = true)
        public String versions;

        public static SetDeviceDesiredPropertyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SetDeviceDesiredPropertyResponseData self = new SetDeviceDesiredPropertyResponseData();
            return TeaModel.build(map, self);
        }

        public SetDeviceDesiredPropertyResponseData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SetDeviceDesiredPropertyResponseData setVersions(String versions) {
            this.versions = versions;
            return this;
        }
        public String getVersions() {
            return this.versions;
        }

    }

}
