// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchQueryDeviceDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public BatchQueryDeviceDetailResponseBodyData data;

    public static BatchQueryDeviceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryDeviceDetailResponseBody self = new BatchQueryDeviceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryDeviceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryDeviceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchQueryDeviceDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryDeviceDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchQueryDeviceDetailResponseBody setData(BatchQueryDeviceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchQueryDeviceDetailResponseBodyData getData() {
        return this.data;
    }

    public static class BatchQueryDeviceDetailResponseBodyDataData extends TeaModel {
        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Nickname")
        public String nickname;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("UtcActive")
        public String utcActive;

        @NameInMap("GmtActive")
        public String gmtActive;

        @NameInMap("Status")
        public String status;

        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        @NameInMap("NodeType")
        public Integer nodeType;

        @NameInMap("Region")
        public String region;

        public static BatchQueryDeviceDetailResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryDeviceDetailResponseBodyDataData self = new BatchQueryDeviceDetailResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public BatchQueryDeviceDetailResponseBodyDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setUtcActive(String utcActive) {
            this.utcActive = utcActive;
            return this;
        }
        public String getUtcActive() {
            return this.utcActive;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setGmtActive(String gmtActive) {
            this.gmtActive = gmtActive;
            return this;
        }
        public String getGmtActive() {
            return this.gmtActive;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class BatchQueryDeviceDetailResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<BatchQueryDeviceDetailResponseBodyDataData> data;

        public static BatchQueryDeviceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryDeviceDetailResponseBodyData self = new BatchQueryDeviceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchQueryDeviceDetailResponseBodyData setData(java.util.List<BatchQueryDeviceDetailResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<BatchQueryDeviceDetailResponseBodyDataData> getData() {
            return this.data;
        }

    }

}
