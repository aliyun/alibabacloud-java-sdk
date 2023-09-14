// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserDevicesSharingStatusResponseBody extends TeaModel {
    @NameInMap("Devices")
    public java.util.List<UpdateUserDevicesSharingStatusResponseBodyDevices> devices;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserDevicesSharingStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserDevicesSharingStatusResponseBody self = new UpdateUserDevicesSharingStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserDevicesSharingStatusResponseBody setDevices(java.util.List<UpdateUserDevicesSharingStatusResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<UpdateUserDevicesSharingStatusResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public UpdateUserDevicesSharingStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateUserDevicesSharingStatusResponseBodyDevices extends TeaModel {
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

        public static UpdateUserDevicesSharingStatusResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserDevicesSharingStatusResponseBodyDevices self = new UpdateUserDevicesSharingStatusResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setDeviceBelong(String deviceBelong) {
            this.deviceBelong = deviceBelong;
            return this;
        }
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setDeviceTag(String deviceTag) {
            this.deviceTag = deviceTag;
            return this;
        }
        public String getDeviceTag() {
            return this.deviceTag;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setDeviceVersion(String deviceVersion) {
            this.deviceVersion = deviceVersion;
            return this;
        }
        public String getDeviceVersion() {
            return this.deviceVersion;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setDisk(String disk) {
            this.disk = disk;
            return this;
        }
        public String getDisk() {
            return this.disk;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setDlpStatus(String dlpStatus) {
            this.dlpStatus = dlpStatus;
            return this;
        }
        public String getDlpStatus() {
            return this.dlpStatus;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setIaStatus(String iaStatus) {
            this.iaStatus = iaStatus;
            return this;
        }
        public String getIaStatus() {
            return this.iaStatus;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setInnerIP(String innerIP) {
            this.innerIP = innerIP;
            return this;
        }
        public String getInnerIP() {
            return this.innerIP;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setNacStatus(String nacStatus) {
            this.nacStatus = nacStatus;
            return this;
        }
        public String getNacStatus() {
            return this.nacStatus;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setPaStatus(String paStatus) {
            this.paStatus = paStatus;
            return this;
        }
        public String getPaStatus() {
            return this.paStatus;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setSharingStatus(Boolean sharingStatus) {
            this.sharingStatus = sharingStatus;
            return this;
        }
        public Boolean getSharingStatus() {
            return this.sharingStatus;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setSrcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }
        public String getSrcIP() {
            return this.srcIP;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevices setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
