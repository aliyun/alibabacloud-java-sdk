// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserDevicesStatusResponseBody extends TeaModel {
    @NameInMap("Devices")
    public java.util.List<UpdateUserDevicesStatusResponseBodyDevices> devices;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserDevicesStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDevicesStatusResponseBody self = new UpdateUserDevicesStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserDevicesStatusResponseBody setDevices(java.util.List<UpdateUserDevicesStatusResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<UpdateUserDevicesStatusResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public UpdateUserDevicesStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateUserDevicesStatusResponseBodyDevices extends TeaModel {
        @NameInMap("AppStatus")
        public String appStatus;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("CPU")
        public String CPU;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Department")
        public String department;

        @NameInMap("DeviceBelong")
        public String deviceBelong;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceStatus")
        public String deviceStatus;

        @NameInMap("DeviceTag")
        public String deviceTag;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("DeviceVersion")
        public String deviceVersion;

        @NameInMap("Disk")
        public String disk;

        @NameInMap("DlpStatus")
        public String dlpStatus;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("IaStatus")
        public String iaStatus;

        @NameInMap("InnerIP")
        public String innerIP;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Memory")
        public String memory;

        @NameInMap("NacStatus")
        public String nacStatus;

        @NameInMap("PaStatus")
        public String paStatus;

        @NameInMap("SaseUserId")
        public String saseUserId;

        @NameInMap("SharingStatus")
        public Boolean sharingStatus;

        @NameInMap("SrcIP")
        public String srcIP;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("Username")
        public String username;

        public static UpdateUserDevicesStatusResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserDevicesStatusResponseBodyDevices self = new UpdateUserDevicesStatusResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public UpdateUserDevicesStatusResponseBodyDevices setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setDeviceBelong(String deviceBelong) {
            this.deviceBelong = deviceBelong;
            return this;
        }
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setDeviceTag(String deviceTag) {
            this.deviceTag = deviceTag;
            return this;
        }
        public String getDeviceTag() {
            return this.deviceTag;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setDeviceVersion(String deviceVersion) {
            this.deviceVersion = deviceVersion;
            return this;
        }
        public String getDeviceVersion() {
            return this.deviceVersion;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setDisk(String disk) {
            this.disk = disk;
            return this;
        }
        public String getDisk() {
            return this.disk;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setDlpStatus(String dlpStatus) {
            this.dlpStatus = dlpStatus;
            return this;
        }
        public String getDlpStatus() {
            return this.dlpStatus;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setIaStatus(String iaStatus) {
            this.iaStatus = iaStatus;
            return this;
        }
        public String getIaStatus() {
            return this.iaStatus;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setInnerIP(String innerIP) {
            this.innerIP = innerIP;
            return this;
        }
        public String getInnerIP() {
            return this.innerIP;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setNacStatus(String nacStatus) {
            this.nacStatus = nacStatus;
            return this;
        }
        public String getNacStatus() {
            return this.nacStatus;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setPaStatus(String paStatus) {
            this.paStatus = paStatus;
            return this;
        }
        public String getPaStatus() {
            return this.paStatus;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setSharingStatus(Boolean sharingStatus) {
            this.sharingStatus = sharingStatus;
            return this;
        }
        public Boolean getSharingStatus() {
            return this.sharingStatus;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setSrcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }
        public String getSrcIP() {
            return this.srcIP;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateUserDevicesStatusResponseBodyDevices setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
