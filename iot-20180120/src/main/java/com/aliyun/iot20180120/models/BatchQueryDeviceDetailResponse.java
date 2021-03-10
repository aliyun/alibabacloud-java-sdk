// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchQueryDeviceDetailResponse extends TeaModel {
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
    public BatchQueryDeviceDetailResponseData data;

    public static BatchQueryDeviceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryDeviceDetailResponse self = new BatchQueryDeviceDetailResponse();
        return TeaModel.build(map, self);
    }

    public BatchQueryDeviceDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryDeviceDetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchQueryDeviceDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryDeviceDetailResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchQueryDeviceDetailResponse setData(BatchQueryDeviceDetailResponseData data) {
        this.data = data;
        return this;
    }
    public BatchQueryDeviceDetailResponseData getData() {
        return this.data;
    }

    public static class BatchQueryDeviceDetailResponseDataData extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("Nickname")
        @Validation(required = true)
        public String nickname;

        @NameInMap("DeviceSecret")
        @Validation(required = true)
        public String deviceSecret;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("UtcActive")
        @Validation(required = true)
        public String utcActive;

        @NameInMap("GmtActive")
        @Validation(required = true)
        public String gmtActive;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("FirmwareVersion")
        @Validation(required = true)
        public String firmwareVersion;

        @NameInMap("NodeType")
        @Validation(required = true)
        public Integer nodeType;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        public static BatchQueryDeviceDetailResponseDataData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryDeviceDetailResponseDataData self = new BatchQueryDeviceDetailResponseDataData();
            return TeaModel.build(map, self);
        }

        public BatchQueryDeviceDetailResponseDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public BatchQueryDeviceDetailResponseDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public BatchQueryDeviceDetailResponseDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchQueryDeviceDetailResponseDataData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public BatchQueryDeviceDetailResponseDataData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public BatchQueryDeviceDetailResponseDataData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchQueryDeviceDetailResponseDataData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public BatchQueryDeviceDetailResponseDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchQueryDeviceDetailResponseDataData setUtcActive(String utcActive) {
            this.utcActive = utcActive;
            return this;
        }
        public String getUtcActive() {
            return this.utcActive;
        }

        public BatchQueryDeviceDetailResponseDataData setGmtActive(String gmtActive) {
            this.gmtActive = gmtActive;
            return this;
        }
        public String getGmtActive() {
            return this.gmtActive;
        }

        public BatchQueryDeviceDetailResponseDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryDeviceDetailResponseDataData setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public BatchQueryDeviceDetailResponseDataData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public BatchQueryDeviceDetailResponseDataData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class BatchQueryDeviceDetailResponseData extends TeaModel {
        @NameInMap("Data")
        @Validation(required = true)
        public java.util.List<BatchQueryDeviceDetailResponseDataData> data;

        public static BatchQueryDeviceDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryDeviceDetailResponseData self = new BatchQueryDeviceDetailResponseData();
            return TeaModel.build(map, self);
        }

        public BatchQueryDeviceDetailResponseData setData(java.util.List<BatchQueryDeviceDetailResponseDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<BatchQueryDeviceDetailResponseDataData> getData() {
            return this.data;
        }

    }

}
