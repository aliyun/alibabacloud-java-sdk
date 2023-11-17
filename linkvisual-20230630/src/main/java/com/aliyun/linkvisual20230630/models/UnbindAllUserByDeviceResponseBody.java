// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class UnbindAllUserByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UnbindAllUserByDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UnbindAllUserByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindAllUserByDeviceResponseBody self = new UnbindAllUserByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindAllUserByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindAllUserByDeviceResponseBody setData(UnbindAllUserByDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UnbindAllUserByDeviceResponseBodyData getData() {
        return this.data;
    }

    public UnbindAllUserByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UnbindAllUserByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindAllUserByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult extends TeaModel {
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

        public static UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult build(java.util.Map<String, ?> map) throws Exception {
            UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult self = new UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult();
            return TeaModel.build(map, self);
        }

        public UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult setUnbindResultCode(Integer unbindResultCode) {
            this.unbindResultCode = unbindResultCode;
            return this;
        }
        public Integer getUnbindResultCode() {
            return this.unbindResultCode;
        }

        public UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult setUnbindResultMessage(String unbindResultMessage) {
            this.unbindResultMessage = unbindResultMessage;
            return this;
        }
        public String getUnbindResultMessage() {
            return this.unbindResultMessage;
        }

    }

    public static class UnbindAllUserByDeviceResponseBodyData extends TeaModel {
        @NameInMap("SubDeviceUnbindResult")
        public java.util.List<UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult> subDeviceUnbindResult;

        public static UnbindAllUserByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UnbindAllUserByDeviceResponseBodyData self = new UnbindAllUserByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UnbindAllUserByDeviceResponseBodyData setSubDeviceUnbindResult(java.util.List<UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult> subDeviceUnbindResult) {
            this.subDeviceUnbindResult = subDeviceUnbindResult;
            return this;
        }
        public java.util.List<UnbindAllUserByDeviceResponseBodyDataSubDeviceUnbindResult> getSubDeviceUnbindResult() {
            return this.subDeviceUnbindResult;
        }

    }

}
