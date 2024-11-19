// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceDetailResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device details returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryDeviceDetailResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceDetailResponseBody self = new QueryDeviceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceDetailResponseBody setData(QueryDeviceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceDetailResponseBodyData extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The DeviceSecret of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>mz2Canp4GB7qRVf1OYPNtRqB2anu****</p>
         */
        @NameInMap("DeviceSecret")
        public String deviceSecret;

        /**
         * <p>The version number of the default OTA module of the device.</p>
         * <p>If you want to query the version information about other OTA modules, call the <a href="https://help.aliyun.com/document_detail/190622.html">ListOTAModuleVersionsByDevice</a> operation. The version information is submitted by the device.</p>
         * 
         * <strong>example:</strong>
         * <p>V1.0.0.0</p>
         */
        @NameInMap("FirmwareVersion")
        public String firmwareVersion;

        /**
         * <p>The time when the device was activated. The time is in the GMT format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-06 10:48:41</p>
         */
        @NameInMap("GmtActive")
        public String gmtActive;

        /**
         * <p>The time when the device was created. The time is in the GMT format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-06 10:47:50</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The most recent time when the device was online. The time is in the GMT format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-06 13:43:12</p>
         */
        @NameInMap("GmtOnline")
        public String gmtOnline;

        @NameInMap("GmtTimestamp")
        public String gmtTimestamp;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The IP address of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The alias of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>detectors_in_beijing</p>
         */
        @NameInMap("Nickname")
        public String nickname;

        /**
         * <p>The type of the node. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: device. Sub-devices cannot be attached to a device. A device can connect to IoT Platform directly or as a sub-device of a gateway.</li>
         * <li><strong>1</strong>: gateway. Sub-devices can be attached to a gateway. A gateway can manage sub-devices, maintain the topological relationships with sub-devices, and synchronize the topological relationships to IoT Platform.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>Indicates whether the operation is called by the owner of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Owner")
        public Boolean owner;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1rYuVF****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The ID of the region where the device resides. The region is the same as the region where IoT Platform resides. You can view the region in the IoT Platform console.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The device status. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>ONLINE</strong>: The device is online.</li>
         * <li><strong>OFFLINE</strong>: The device is offline.</li>
         * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
         * <li><strong>DISABLE</strong>: The device is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the device was activated. The time is in the UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-06T02:48:41.000Z</p>
         */
        @NameInMap("UtcActive")
        public String utcActive;

        /**
         * <p>The time when the device was created. The time is in the UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-06T02:47:50.000Z</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The most recent time when the device was online. The time is in the UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-06T05:43:12.000Z</p>
         */
        @NameInMap("UtcOnline")
        public String utcOnline;

        @NameInMap("UtcTimestamp")
        public String utcTimestamp;

        public static QueryDeviceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceDetailResponseBodyData self = new QueryDeviceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceDetailResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryDeviceDetailResponseBodyData setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public QueryDeviceDetailResponseBodyData setFirmwareVersion(String firmwareVersion) {
            this.firmwareVersion = firmwareVersion;
            return this;
        }
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        public QueryDeviceDetailResponseBodyData setGmtActive(String gmtActive) {
            this.gmtActive = gmtActive;
            return this;
        }
        public String getGmtActive() {
            return this.gmtActive;
        }

        public QueryDeviceDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDeviceDetailResponseBodyData setGmtOnline(String gmtOnline) {
            this.gmtOnline = gmtOnline;
            return this;
        }
        public String getGmtOnline() {
            return this.gmtOnline;
        }

        public QueryDeviceDetailResponseBodyData setGmtTimestamp(String gmtTimestamp) {
            this.gmtTimestamp = gmtTimestamp;
            return this;
        }
        public String getGmtTimestamp() {
            return this.gmtTimestamp;
        }

        public QueryDeviceDetailResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryDeviceDetailResponseBodyData setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public QueryDeviceDetailResponseBodyData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public QueryDeviceDetailResponseBodyData setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public QueryDeviceDetailResponseBodyData setOwner(Boolean owner) {
            this.owner = owner;
            return this;
        }
        public Boolean getOwner() {
            return this.owner;
        }

        public QueryDeviceDetailResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryDeviceDetailResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryDeviceDetailResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryDeviceDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDeviceDetailResponseBodyData setUtcActive(String utcActive) {
            this.utcActive = utcActive;
            return this;
        }
        public String getUtcActive() {
            return this.utcActive;
        }

        public QueryDeviceDetailResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryDeviceDetailResponseBodyData setUtcOnline(String utcOnline) {
            this.utcOnline = utcOnline;
            return this;
        }
        public String getUtcOnline() {
            return this.utcOnline;
        }

        public QueryDeviceDetailResponseBodyData setUtcTimestamp(String utcTimestamp) {
            this.utcTimestamp = utcTimestamp;
            return this;
        }
        public String getUtcTimestamp() {
            return this.utcTimestamp;
        }

    }

}
