// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class UnbindDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UnbindDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UnbindDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceResponseBody self = new UnbindDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindDeviceResponseBody setData(UnbindDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnbindDeviceResponseBodyData getData() {
        return this.data;
    }

    public UnbindDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UnbindDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UnbindDeviceResponseBodyDataSubDeviceUnbindResult extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("UnbindResultCode")
        public Integer unbindResultCode;

        @NameInMap("UnbindResultMessage")
        public String unbindResultMessage;

        public static UnbindDeviceResponseBodyDataSubDeviceUnbindResult build(java.util.Map<String, ?> map) throws Exception {
            UnbindDeviceResponseBodyDataSubDeviceUnbindResult self = new UnbindDeviceResponseBodyDataSubDeviceUnbindResult();
            return TeaModel.build(map, self);
        }

        public UnbindDeviceResponseBodyDataSubDeviceUnbindResult setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public UnbindDeviceResponseBodyDataSubDeviceUnbindResult setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public UnbindDeviceResponseBodyDataSubDeviceUnbindResult setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public UnbindDeviceResponseBodyDataSubDeviceUnbindResult setUnbindResultCode(Integer unbindResultCode) {
            this.unbindResultCode = unbindResultCode;
            return this;
        }
        public Integer getUnbindResultCode() {
            return this.unbindResultCode;
        }

        public UnbindDeviceResponseBodyDataSubDeviceUnbindResult setUnbindResultMessage(String unbindResultMessage) {
            this.unbindResultMessage = unbindResultMessage;
            return this;
        }
        public String getUnbindResultMessage() {
            return this.unbindResultMessage;
        }

    }

    public static class UnbindDeviceResponseBodyData extends TeaModel {
        @NameInMap("SubDeviceUnbindResult")
        public java.util.List<UnbindDeviceResponseBodyDataSubDeviceUnbindResult> subDeviceUnbindResult;

        public static UnbindDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnbindDeviceResponseBodyData self = new UnbindDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnbindDeviceResponseBodyData setSubDeviceUnbindResult(java.util.List<UnbindDeviceResponseBodyDataSubDeviceUnbindResult> subDeviceUnbindResult) {
            this.subDeviceUnbindResult = subDeviceUnbindResult;
            return this;
        }
        public java.util.List<UnbindDeviceResponseBodyDataSubDeviceUnbindResult> getSubDeviceUnbindResult() {
            return this.subDeviceUnbindResult;
        }

    }

}
