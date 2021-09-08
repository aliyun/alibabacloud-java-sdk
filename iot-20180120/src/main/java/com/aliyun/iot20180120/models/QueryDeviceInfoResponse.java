// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceInfoResponseData data;

    public static QueryDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceInfoResponse self = new QueryDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceInfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceInfoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceInfoResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceInfoResponse setData(QueryDeviceInfoResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceInfoResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceInfoResponseData extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("DeviceSecret")
        @Validation(required = true)
        public String deviceSecret;

        @NameInMap("Nickname")
        @Validation(required = true)
        public String nickname;

        public static QueryDeviceInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceInfoResponseData self = new QueryDeviceInfoResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceInfoResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceInfoResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceInfoResponseData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceInfoResponseData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryDeviceInfoResponseData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

    }

}
