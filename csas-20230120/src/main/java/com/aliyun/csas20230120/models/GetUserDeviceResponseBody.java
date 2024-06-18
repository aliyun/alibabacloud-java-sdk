// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserDeviceResponseBody extends TeaModel {
    @NameInMap("Device")
    public GetUserDeviceResponseBodyDevice device;

    /**
     * <strong>example:</strong>
     * <p>EFE7EBB2-449D-5BBB-B381-CA7839BC1649</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("AppStatus")
        public String appStatus;

        /**
         * <strong>example:</strong>
         * <p>2.2.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <strong>example:</strong>
         * <p>Apple M1</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Department")
        public String department;

        /**
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        /**
         * <strong>example:</strong>
         * <p>MacBookPro17,1</p>
         */
        @NameInMap("DeviceModel")
        public String deviceModel;

        /**
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DeviceTag")
        public String deviceTag;

        /**
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>3.5.1</p>
         */
        @NameInMap("DeviceVersion")
        public String deviceVersion;

        /**
         * <strong>example:</strong>
         * <p>APPLE SSD AP0512Q Media</p>
         */
        @NameInMap("Disk")
        public String disk;

        /**
         * <strong>example:</strong>
         * <p>Unauthorized</p>
         */
        @NameInMap("DlpStatus")
        public String dlpStatus;

        @NameInMap("HistoryUsers")
        public java.util.List<GetUserDeviceResponseBodyDeviceHistoryUsers> historyUsers;

        /**
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("IaStatus")
        public String iaStatus;

        /**
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("InnerIP")
        public String innerIP;

        /**
         * <strong>example:</strong>
         * <p>48:9e:XX:XX:02:80</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <strong>example:</strong>
         * <p>Unprovisioned</p>
         */
        @NameInMap("NacStatus")
        public String nacStatus;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("PaStatus")
        public String paStatus;

        /**
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SharingStatus")
        public Boolean sharingStatus;

        /**
         * <strong>example:</strong>
         * <p>106.14.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <strong>example:</strong>
         * <p>2023-08-24 19:04:42</p>
         */
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
