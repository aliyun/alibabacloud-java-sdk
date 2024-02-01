// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class EnableGbSubDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnableGbSubDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnableGbSubDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableGbSubDeviceResponseBody self = new EnableGbSubDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableGbSubDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableGbSubDeviceResponseBody setData(EnableGbSubDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableGbSubDeviceResponseBodyData getData() {
        return this.data;
    }

    public EnableGbSubDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public EnableGbSubDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableGbSubDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnableGbSubDeviceResponseBodyData extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ProductKey")
        public String productKey;

        public static EnableGbSubDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableGbSubDeviceResponseBodyData self = new EnableGbSubDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableGbSubDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public EnableGbSubDeviceResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
