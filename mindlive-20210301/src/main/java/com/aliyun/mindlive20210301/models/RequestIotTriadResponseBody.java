// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestIotTriadResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public RequestIotTriadResponseBodyData data;

    public static RequestIotTriadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RequestIotTriadResponseBody self = new RequestIotTriadResponseBody();
        return TeaModel.build(map, self);
    }

    public RequestIotTriadResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RequestIotTriadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestIotTriadResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RequestIotTriadResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RequestIotTriadResponseBody setData(RequestIotTriadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RequestIotTriadResponseBodyData getData() {
        return this.data;
    }

    public static class RequestIotTriadResponseBodyData extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        public static RequestIotTriadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RequestIotTriadResponseBodyData self = new RequestIotTriadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RequestIotTriadResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public RequestIotTriadResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public RequestIotTriadResponseBodyData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

    }

}
