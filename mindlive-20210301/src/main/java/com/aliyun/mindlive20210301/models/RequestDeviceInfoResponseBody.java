// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestDeviceInfoResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public RequestDeviceInfoResponseBodyData data;

    public static RequestDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestDeviceInfoResponseBody self = new RequestDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestDeviceInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RequestDeviceInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestDeviceInfoResponseBody setData(RequestDeviceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestDeviceInfoResponseBodyData getData() {
        return this.data;
    }

    public static class RequestDeviceInfoResponseBodyData extends TeaModel {
        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceId")
        public String deviceId;

        public static RequestDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestDeviceInfoResponseBodyData self = new RequestDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestDeviceInfoResponseBodyData setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public RequestDeviceInfoResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public RequestDeviceInfoResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

    }

}
