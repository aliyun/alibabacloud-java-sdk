// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchQueryDeviceDetailResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device details returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public BatchQueryDeviceDetailResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchQueryDeviceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryDeviceDetailResponseBody self = new BatchQueryDeviceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryDeviceDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryDeviceDetailResponseBody setData(BatchQueryDeviceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchQueryDeviceDetailResponseBodyData getData() {
        return this.data;
    }

    public BatchQueryDeviceDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class BatchQueryDeviceDetailResponseBodyDataData extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The DeviceSecret of the device.</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        /**
         * <p>The firmware version number of the device.</p>
         */
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        /**
         * <p>The activation time of the device. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtActive")
        public String gmtActive;

        /**
         * <p>The creation time of the device. The time is displayed in UTC.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The unique ID of the device. The device ID is issued by IoT Platform.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The alias of the device.</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   **0**: device. Sub-devices cannot be mounted on a gateway. A device can connect to IoT Platform directly or as a sub-device of a gateway.</p>
         * <p>*   **1**: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain the topological relationships with sub-devices, and synchronize the topological relationships to IoT Platform.</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>The **ProductKey** of the product to which the device belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product to which the device belongs.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The ID of the region where the device resides. The region is the same as the region where IoT Platform resides. You can view the region in the IoT Platform console.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The status of the device. Valid values:</p>
         * <br>
         * <p>*   **ONLINE**: The device is online.</p>
         * <p>*   **OFFLINE**: The device is offline.</p>
         * <p>*   **UNACTIVE**: The device is not activated.</p>
         * <p>*   **DISABLE**: The device is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The activation time of the device. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcActive")
        public String utcActive;

        /**
         * <p>The creation time of the device. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        public static BatchQueryDeviceDetailResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryDeviceDetailResponseBodyDataData self = new BatchQueryDeviceDetailResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public BatchQueryDeviceDetailResponseBodyDataData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setGmtActive(String gmtActive) {
            this.gmtActive = gmtActive;
            return this;
        }
        public String getGmtActive() {
            return this.gmtActive;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
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

        public BatchQueryDeviceDetailResponseBodyDataData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setUtcActive(String utcActive) {
            this.utcActive = utcActive;
            return this;
        }
        public String getUtcActive() {
            return this.utcActive;
        }

        public BatchQueryDeviceDetailResponseBodyDataData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
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
