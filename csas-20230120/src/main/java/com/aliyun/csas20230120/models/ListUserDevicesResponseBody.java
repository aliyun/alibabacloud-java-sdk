// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserDevicesResponseBody extends TeaModel {
    @NameInMap("Devices")
    public java.util.List<ListUserDevicesResponseBodyDevices> devices;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListUserDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserDevicesResponseBody self = new ListUserDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserDevicesResponseBody setDevices(java.util.List<ListUserDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<ListUserDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public ListUserDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserDevicesResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListUserDevicesResponseBodyDevices extends TeaModel {
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

        public static ListUserDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            ListUserDevicesResponseBodyDevices self = new ListUserDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public ListUserDevicesResponseBodyDevices setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public ListUserDevicesResponseBodyDevices setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListUserDevicesResponseBodyDevices setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public ListUserDevicesResponseBodyDevices setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserDevicesResponseBodyDevices setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListUserDevicesResponseBodyDevices setDeviceBelong(String deviceBelong) {
            this.deviceBelong = deviceBelong;
            return this;
        }
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        public ListUserDevicesResponseBodyDevices setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListUserDevicesResponseBodyDevices setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public ListUserDevicesResponseBodyDevices setDeviceTag(String deviceTag) {
            this.deviceTag = deviceTag;
            return this;
        }
        public String getDeviceTag() {
            return this.deviceTag;
        }

        public ListUserDevicesResponseBodyDevices setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListUserDevicesResponseBodyDevices setDeviceVersion(String deviceVersion) {
            this.deviceVersion = deviceVersion;
            return this;
        }
        public String getDeviceVersion() {
            return this.deviceVersion;
        }

        public ListUserDevicesResponseBodyDevices setDisk(String disk) {
            this.disk = disk;
            return this;
        }
        public String getDisk() {
            return this.disk;
        }

        public ListUserDevicesResponseBodyDevices setDlpStatus(String dlpStatus) {
            this.dlpStatus = dlpStatus;
            return this;
        }
        public String getDlpStatus() {
            return this.dlpStatus;
        }

        public ListUserDevicesResponseBodyDevices setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListUserDevicesResponseBodyDevices setIaStatus(String iaStatus) {
            this.iaStatus = iaStatus;
            return this;
        }
        public String getIaStatus() {
            return this.iaStatus;
        }

        public ListUserDevicesResponseBodyDevices setInnerIP(String innerIP) {
            this.innerIP = innerIP;
            return this;
        }
        public String getInnerIP() {
            return this.innerIP;
        }

        public ListUserDevicesResponseBodyDevices setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListUserDevicesResponseBodyDevices setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListUserDevicesResponseBodyDevices setNacStatus(String nacStatus) {
            this.nacStatus = nacStatus;
            return this;
        }
        public String getNacStatus() {
            return this.nacStatus;
        }

        public ListUserDevicesResponseBodyDevices setPaStatus(String paStatus) {
            this.paStatus = paStatus;
            return this;
        }
        public String getPaStatus() {
            return this.paStatus;
        }

        public ListUserDevicesResponseBodyDevices setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListUserDevicesResponseBodyDevices setSharingStatus(Boolean sharingStatus) {
            this.sharingStatus = sharingStatus;
            return this;
        }
        public Boolean getSharingStatus() {
            return this.sharingStatus;
        }

        public ListUserDevicesResponseBodyDevices setSrcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }
        public String getSrcIP() {
            return this.srcIP;
        }

        public ListUserDevicesResponseBodyDevices setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserDevicesResponseBodyDevices setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
