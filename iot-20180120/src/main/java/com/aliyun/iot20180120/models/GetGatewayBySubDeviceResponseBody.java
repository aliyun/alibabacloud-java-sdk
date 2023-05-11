// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetGatewayBySubDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The gateway details returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public GetGatewayBySubDeviceResponseBodyData data;

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

    public static GetGatewayBySubDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayBySubDeviceResponseBody self = new GetGatewayBySubDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayBySubDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGatewayBySubDeviceResponseBody setData(GetGatewayBySubDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayBySubDeviceResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayBySubDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetGatewayBySubDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayBySubDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayBySubDeviceResponseBodyData extends TeaModel {
        /**
         * <p>The DeviceName of the gateway.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The DeviceSecret of the gateway.</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        /**
         * <p>The firmware version number of the device.</p>
         */
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        /**
         * <p>The activation time of the gateway. The time is displayed in GMT. The time is the local time of the region where the gateway resides.</p>
         */
        @NameInMap("GmtActive")
        public String gmtActive;

        /**
         * <p>The creation time of the gateway. The time is displayed in GMT. The time is the local time of the region where the gateway resides.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last online time of the gateway. The time is displayed in GMT. The time is the local time of the region where the gateway resides.</p>
         */
        @NameInMap("GmtOnline")
        public String gmtOnline;

        /**
         * <p>The IP address of the gateway.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The node type. The value 1 indicates that the device is a gateway.</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The **ProductKey** of the product to which the gateway belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product to which the gateway belongs.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The status of the gateway device. Valid values:</p>
         * <br>
         * <p>*   **online**: The device is online.</p>
         * <p>*   **offline**: The device is offline.</p>
         * <p>*   **unactive**: The device is not activated.</p>
         * <p>*   **disable**: The device is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The activation time of the gateway. The time is displayed in UTC. The actual time of the region where the gateway resides is calculated based on the time zone of the region.</p>
         */
        @NameInMap("UtcActive")
        public String utcActive;

        /**
         * <p>The creation time of the gateway. The time is displayed in UTC. The actual time of the region where the gateway resides is calculated based on the time zone of the region.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The last online time of the gateway. The time is displayed in UTC. The actual time of the region where the gateway resides is calculated based on the time zone of the region.</p>
         */
        @NameInMap("UtcOnline")
        public String utcOnline;

        /**
         * <p>The ID of the gateway device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         */
        @NameInMap("iotId")
        public String iotId;

        /**
         * <p>The region where the gateway resides. This region corresponds to the region that is displayed in the IoT Platform console.</p>
         */
        @NameInMap("region")
        public String region;

        public static GetGatewayBySubDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayBySubDeviceResponseBodyData self = new GetGatewayBySubDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayBySubDeviceResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetGatewayBySubDeviceResponseBodyData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public GetGatewayBySubDeviceResponseBodyData setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public GetGatewayBySubDeviceResponseBodyData setGmtActive(String gmtActive) {
            this.gmtActive = gmtActive;
            return this;
        }
        public String getGmtActive() {
            return this.gmtActive;
        }

        public GetGatewayBySubDeviceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayBySubDeviceResponseBodyData setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public GetGatewayBySubDeviceResponseBodyData setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public GetGatewayBySubDeviceResponseBodyData setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public GetGatewayBySubDeviceResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetGatewayBySubDeviceResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetGatewayBySubDeviceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGatewayBySubDeviceResponseBodyData setUtcActive(String utcActive) {
            this.utcActive = utcActive;
            return this;
        }
        public String getUtcActive() {
            return this.utcActive;
        }

        public GetGatewayBySubDeviceResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetGatewayBySubDeviceResponseBodyData setUtcOnline(String utcOnline) {
            this.utcOnline = utcOnline;
            return this;
        }
        public String getUtcOnline() {
            return this.utcOnline;
        }

        public GetGatewayBySubDeviceResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetGatewayBySubDeviceResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
