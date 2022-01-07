// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceDesiredPropertyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SetDeviceDesiredPropertyResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SetDeviceDesiredPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceDesiredPropertyResponseBody self = new SetDeviceDesiredPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDeviceDesiredPropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetDeviceDesiredPropertyResponseBody setData(SetDeviceDesiredPropertyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetDeviceDesiredPropertyResponseBodyData getData() {
        return this.data;
    }

    public SetDeviceDesiredPropertyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetDeviceDesiredPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDeviceDesiredPropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetDeviceDesiredPropertyResponseBodyData extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("Versions")
        public String versions;

        public static SetDeviceDesiredPropertyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetDeviceDesiredPropertyResponseBodyData self = new SetDeviceDesiredPropertyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetDeviceDesiredPropertyResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SetDeviceDesiredPropertyResponseBodyData setVersions(String versions) {
            this.versions = versions;
            return this;
        }
        public String getVersions() {
            return this.versions;
        }

    }

}
