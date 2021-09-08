// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechDeviceDetailResponse extends TeaModel {
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
    public GetSpeechDeviceDetailResponseData data;

    public static GetSpeechDeviceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSpeechDeviceDetailResponse self = new GetSpeechDeviceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetSpeechDeviceDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSpeechDeviceDetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSpeechDeviceDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSpeechDeviceDetailResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSpeechDeviceDetailResponse setData(GetSpeechDeviceDetailResponseData data) {
        this.data = data;
        return this;
    }
    public GetSpeechDeviceDetailResponseData getData() {
        return this.data;
    }

    public static class GetSpeechDeviceDetailResponseData extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("AvailableSpace")
        @Validation(required = true)
        public Float availableSpace;

        @NameInMap("TotalSpace")
        @Validation(required = true)
        public Float totalSpace;

        @NameInMap("SpeechListUpdateTime")
        @Validation(required = true)
        public Long speechListUpdateTime;

        public static GetSpeechDeviceDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetSpeechDeviceDetailResponseData self = new GetSpeechDeviceDetailResponseData();
            return TeaModel.build(map, self);
        }

        public GetSpeechDeviceDetailResponseData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetSpeechDeviceDetailResponseData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetSpeechDeviceDetailResponseData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetSpeechDeviceDetailResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSpeechDeviceDetailResponseData setAvailableSpace(Float availableSpace) {
            this.availableSpace = availableSpace;
            return this;
        }
        public Float getAvailableSpace() {
            return this.availableSpace;
        }

        public GetSpeechDeviceDetailResponseData setTotalSpace(Float totalSpace) {
            this.totalSpace = totalSpace;
            return this;
        }
        public Float getTotalSpace() {
            return this.totalSpace;
        }

        public GetSpeechDeviceDetailResponseData setSpeechListUpdateTime(Long speechListUpdateTime) {
            this.speechListUpdateTime = speechListUpdateTime;
            return this;
        }
        public Long getSpeechListUpdateTime() {
            return this.speechListUpdateTime;
        }

    }

}
