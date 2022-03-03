// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechDeviceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSpeechDeviceDetailResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSpeechDeviceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechDeviceDetailResponseBody self = new GetSpeechDeviceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSpeechDeviceDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSpeechDeviceDetailResponseBody setData(GetSpeechDeviceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSpeechDeviceDetailResponseBodyData getData() {
        return this.data;
    }

    public GetSpeechDeviceDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSpeechDeviceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpeechDeviceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSpeechDeviceDetailResponseBodyData extends TeaModel {
        @NameInMap("AvailableSpace")
        public Float availableSpace;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("SpeechListUpdateTime")
        public Long speechListUpdateTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalSpace")
        public Float totalSpace;

        public static GetSpeechDeviceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechDeviceDetailResponseBodyData self = new GetSpeechDeviceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSpeechDeviceDetailResponseBodyData setAvailableSpace(Float availableSpace) {
            this.availableSpace = availableSpace;
            return this;
        }
        public Float getAvailableSpace() {
            return this.availableSpace;
        }

        public GetSpeechDeviceDetailResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetSpeechDeviceDetailResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetSpeechDeviceDetailResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetSpeechDeviceDetailResponseBodyData setSpeechListUpdateTime(Long speechListUpdateTime) {
            this.speechListUpdateTime = speechListUpdateTime;
            return this;
        }
        public Long getSpeechListUpdateTime() {
            return this.speechListUpdateTime;
        }

        public GetSpeechDeviceDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSpeechDeviceDetailResponseBodyData setTotalSpace(Float totalSpace) {
            this.totalSpace = totalSpace;
            return this;
        }
        public Float getTotalSpace() {
            return this.totalSpace;
        }

    }

}
