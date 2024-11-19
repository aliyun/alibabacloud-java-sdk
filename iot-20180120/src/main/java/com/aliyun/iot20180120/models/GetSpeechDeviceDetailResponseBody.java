// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSpeechDeviceDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.speechsolution.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSpeechDeviceDetailResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>speech solution has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("AvailableSpace")
        public Float availableSpace;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>4de2c367**<strong>8c585e5992</strong></p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <strong>example:</strong>
         * <p>1620624606000</p>
         */
        @NameInMap("SpeechListUpdateTime")
        public Long speechListUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
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
