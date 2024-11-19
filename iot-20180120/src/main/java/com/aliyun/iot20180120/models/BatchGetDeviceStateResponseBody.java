// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceStateResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device status information returned if the call is successful. For more information, see the following parameters that are included in the DeviceStatus parameter.</p>
     */
    @NameInMap("DeviceStatusList")
    public BatchGetDeviceStateResponseBodyDeviceStatusList deviceStatusList;

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
     * <p>Indicates whether the call was successful. Valid values:</p>
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

    public static BatchGetDeviceStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceStateResponseBody self = new BatchGetDeviceStateResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceStateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetDeviceStateResponseBody setDeviceStatusList(BatchGetDeviceStateResponseBodyDeviceStatusList deviceStatusList) {
        this.deviceStatusList = deviceStatusList;
        return this;
    }
    public BatchGetDeviceStateResponseBodyDeviceStatusList getDeviceStatusList() {
        return this.deviceStatusList;
    }

    public BatchGetDeviceStateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetDeviceStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetDeviceStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus extends TeaModel {
        /**
         * <p>The IP address of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.1</p>
         */
        @NameInMap("AsAddress")
        public String asAddress;

        /**
         * <p>The ID of the device (expired).</p>
         * <blockquote>
         * <p> This parameter is no longer supported. Do not use this parameter to identify a device. You can use the value of the <strong>IotId</strong>** parameter or a combination of the values of the **<strong>ProductKey</strong> and DeviceName parameters to identify a device.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dwnS41bhNxjslDAI****</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the device. The ID is the unique identifier that is issued by IoT Platform to the device.</p>
         * 
         * <strong>example:</strong>
         * <p>dwnS41bhNxjslDAI****000100</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The last time when the device was online.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-17 16:19:11</p>
         */
        @NameInMap("LastOnlineTime")
        public String lastOnlineTime;

        /**
         * <p>The status of the device. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>ONLINE</strong>: The device is online.</li>
         * <li><strong>OFFLINE</strong>: The device is offline.</li>
         * <li><strong>UNACTIVE</strong>: The device is not activated.</li>
         * <li><strong>DISABLE</strong>: The device is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFFLINE</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus build(java.util.Map<String, ?> map) throws Exception {
            BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus self = new BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus();
            return TeaModel.build(map, self);
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setAsAddress(String asAddress) {
            this.asAddress = asAddress;
            return this;
        }
        public String getAsAddress() {
            return this.asAddress;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class BatchGetDeviceStateResponseBodyDeviceStatusList extends TeaModel {
        @NameInMap("DeviceStatus")
        public java.util.List<BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus> deviceStatus;

        public static BatchGetDeviceStateResponseBodyDeviceStatusList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetDeviceStateResponseBodyDeviceStatusList self = new BatchGetDeviceStateResponseBodyDeviceStatusList();
            return TeaModel.build(map, self);
        }

        public BatchGetDeviceStateResponseBodyDeviceStatusList setDeviceStatus(java.util.List<BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus> deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public java.util.List<BatchGetDeviceStateResponseBodyDeviceStatusListDeviceStatus> getDeviceStatus() {
            return this.deviceStatus;
        }

    }

}
