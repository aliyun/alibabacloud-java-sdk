// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceStateResponse extends TeaModel {
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

    @NameInMap("DeviceStatusList")
    @Validation(required = true)
    public BatchGetDeviceStateResponseDeviceStatusList deviceStatusList;

    public static BatchGetDeviceStateResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceStateResponse self = new BatchGetDeviceStateResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceStateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetDeviceStateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetDeviceStateResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetDeviceStateResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetDeviceStateResponse setDeviceStatusList(BatchGetDeviceStateResponseDeviceStatusList deviceStatusList) {
        this.deviceStatusList = deviceStatusList;
        return this;
    }
    public BatchGetDeviceStateResponseDeviceStatusList getDeviceStatusList() {
        return this.deviceStatusList;
    }

    public static class BatchGetDeviceStateResponseDeviceStatusListDeviceStatus extends TeaModel {
        @NameInMap("DeviceId")
        @Validation(required = true)
        public String deviceId;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("AsAddress")
        @Validation(required = true)
        public String asAddress;

        @NameInMap("LastOnlineTime")
        @Validation(required = true)
        public String lastOnlineTime;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        public static BatchGetDeviceStateResponseDeviceStatusListDeviceStatus build(java.util.Map<String, ?> map) throws Exception {
            BatchGetDeviceStateResponseDeviceStatusListDeviceStatus self = new BatchGetDeviceStateResponseDeviceStatusListDeviceStatus();
            return TeaModel.build(map, self);
        }

        public BatchGetDeviceStateResponseDeviceStatusListDeviceStatus setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchGetDeviceStateResponseDeviceStatusListDeviceStatus setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchGetDeviceStateResponseDeviceStatusListDeviceStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchGetDeviceStateResponseDeviceStatusListDeviceStatus setAsAddress(String asAddress) {
            this.asAddress = asAddress;
            return this;
        }
        public String getAsAddress() {
            return this.asAddress;
        }

        public BatchGetDeviceStateResponseDeviceStatusListDeviceStatus setLastOnlineTime(String lastOnlineTime) {
            this.lastOnlineTime = lastOnlineTime;
            return this;
        }
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        public BatchGetDeviceStateResponseDeviceStatusListDeviceStatus setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class BatchGetDeviceStateResponseDeviceStatusList extends TeaModel {
        @NameInMap("DeviceStatus")
        @Validation(required = true)
        public java.util.List<BatchGetDeviceStateResponseDeviceStatusListDeviceStatus> deviceStatus;

        public static BatchGetDeviceStateResponseDeviceStatusList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetDeviceStateResponseDeviceStatusList self = new BatchGetDeviceStateResponseDeviceStatusList();
            return TeaModel.build(map, self);
        }

        public BatchGetDeviceStateResponseDeviceStatusList setDeviceStatus(java.util.List<BatchGetDeviceStateResponseDeviceStatusListDeviceStatus> deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public java.util.List<BatchGetDeviceStateResponseDeviceStatusListDeviceStatus> getDeviceStatus() {
            return this.deviceStatus;
        }

    }

}
