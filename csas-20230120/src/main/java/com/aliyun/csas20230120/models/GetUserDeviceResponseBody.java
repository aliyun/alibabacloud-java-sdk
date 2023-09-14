// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserDeviceResponseBody extends TeaModel {
    @NameInMap("Device")
    public GetUserDeviceResponseBodyDevice device;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUserDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeviceResponseBody self = new GetUserDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserDeviceResponseBody setDevice(GetUserDeviceResponseBodyDevice device) {
        this.device = device;
        return this;
    }
    public GetUserDeviceResponseBodyDevice getDevice() {
        return this.device;
    }

    public GetUserDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserDeviceResponseBodyDeviceHistoryUsers extends TeaModel {
        @NameInMap("SaseUserId")
        public String saseUserId;

        @NameInMap("Username")
        public String username;

        public static GetUserDeviceResponseBodyDeviceHistoryUsers build(java.util.Map<String, ?> map) throws Exception {
            GetUserDeviceResponseBodyDeviceHistoryUsers self = new GetUserDeviceResponseBodyDeviceHistoryUsers();
            return TeaModel.build(map, self);
        }

        public GetUserDeviceResponseBodyDeviceHistoryUsers setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public GetUserDeviceResponseBodyDeviceHistoryUsers setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetUserDeviceResponseBodyDevice extends TeaModel {
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

        @NameInMap("HistoryUsers")
        public java.util.List<GetUserDeviceResponseBodyDeviceHistoryUsers> historyUsers;

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

        public static GetUserDeviceResponseBodyDevice build(java.util.Map<String, ?> map) throws Exception {
            GetUserDeviceResponseBodyDevice self = new GetUserDeviceResponseBodyDevice();
            return TeaModel.build(map, self);
        }

        public GetUserDeviceResponseBodyDevice setAppStatus(String appStatus) {
            this.appStatus = appStatus;
            return this;
        }
        public String getAppStatus() {
            return this.appStatus;
        }

        public GetUserDeviceResponseBodyDevice setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public GetUserDeviceResponseBodyDevice setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public GetUserDeviceResponseBodyDevice setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserDeviceResponseBodyDevice setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public GetUserDeviceResponseBodyDevice setDeviceBelong(String deviceBelong) {
            this.deviceBelong = deviceBelong;
            return this;
        }
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        public GetUserDeviceResponseBodyDevice setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public GetUserDeviceResponseBodyDevice setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public GetUserDeviceResponseBodyDevice setDeviceTag(String deviceTag) {
            this.deviceTag = deviceTag;
            return this;
        }
        public String getDeviceTag() {
            return this.deviceTag;
        }

        public GetUserDeviceResponseBodyDevice setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetUserDeviceResponseBodyDevice setDeviceVersion(String deviceVersion) {
            this.deviceVersion = deviceVersion;
            return this;
        }
        public String getDeviceVersion() {
            return this.deviceVersion;
        }

        public GetUserDeviceResponseBodyDevice setDisk(String disk) {
            this.disk = disk;
            return this;
        }
        public String getDisk() {
            return this.disk;
        }

        public GetUserDeviceResponseBodyDevice setDlpStatus(String dlpStatus) {
            this.dlpStatus = dlpStatus;
            return this;
        }
        public String getDlpStatus() {
            return this.dlpStatus;
        }

        public GetUserDeviceResponseBodyDevice setHistoryUsers(java.util.List<GetUserDeviceResponseBodyDeviceHistoryUsers> historyUsers) {
            this.historyUsers = historyUsers;
            return this;
        }
        public java.util.List<GetUserDeviceResponseBodyDeviceHistoryUsers> getHistoryUsers() {
            return this.historyUsers;
        }

        public GetUserDeviceResponseBodyDevice setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public GetUserDeviceResponseBodyDevice setIaStatus(String iaStatus) {
            this.iaStatus = iaStatus;
            return this;
        }
        public String getIaStatus() {
            return this.iaStatus;
        }

        public GetUserDeviceResponseBodyDevice setInnerIP(String innerIP) {
            this.innerIP = innerIP;
            return this;
        }
        public String getInnerIP() {
            return this.innerIP;
        }

        public GetUserDeviceResponseBodyDevice setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public GetUserDeviceResponseBodyDevice setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetUserDeviceResponseBodyDevice setNacStatus(String nacStatus) {
            this.nacStatus = nacStatus;
            return this;
        }
        public String getNacStatus() {
            return this.nacStatus;
        }

        public GetUserDeviceResponseBodyDevice setPaStatus(String paStatus) {
            this.paStatus = paStatus;
            return this;
        }
        public String getPaStatus() {
            return this.paStatus;
        }

        public GetUserDeviceResponseBodyDevice setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public GetUserDeviceResponseBodyDevice setSharingStatus(Boolean sharingStatus) {
            this.sharingStatus = sharingStatus;
            return this;
        }
        public Boolean getSharingStatus() {
            return this.sharingStatus;
        }

        public GetUserDeviceResponseBodyDevice setSrcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }
        public String getSrcIP() {
            return this.srcIP;
        }

        public GetUserDeviceResponseBodyDevice setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetUserDeviceResponseBodyDevice setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
