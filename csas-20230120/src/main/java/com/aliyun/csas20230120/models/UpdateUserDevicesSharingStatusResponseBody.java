// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserDevicesSharingStatusResponseBody extends TeaModel {
    /**
     * <p>Device list.</p>
     */
    @NameInMap("Devices")
    public java.util.List<UpdateUserDevicesSharingStatusResponseBodyDevices> devices;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4D169859-A4F2-5EC8-853B-8447787C0D8A</p>
     */
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

    public static class UpdateUserDevicesSharingStatusResponseBodyDevicesNetInterfaceInfo extends TeaModel {
        /**
         * <p>NIC MAC address.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>NIC name.</p>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateUserDevicesSharingStatusResponseBodyDevicesNetInterfaceInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserDevicesSharingStatusResponseBodyDevicesNetInterfaceInfo self = new UpdateUserDevicesSharingStatusResponseBodyDevicesNetInterfaceInfo();
            return TeaModel.build(map, self);
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevicesNetInterfaceInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public UpdateUserDevicesSharingStatusResponseBodyDevicesNetInterfaceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateUserDevicesSharingStatusResponseBodyDevices extends TeaModel {
        /**
         * <p>The client status. Values:</p>
         * <ul>
         * <li><p><strong>Online</strong>: Online.</p>
         * </li>
         * <li><p><strong>Offline</strong>: Offline.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("AppStatus")
        public String appStatus;

        /**
         * <p>Client version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>Device CPU model.</p>
         * 
         * <strong>example:</strong>
         * <p>Apple M1</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>Device registration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>User\&quot;s department.</p>
         * 
         * <strong>example:</strong>
         * <p>测试部</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>Device ownership. Values:</p>
         * <ul>
         * <li><p><strong>Personal</strong>: Personal device.</p>
         * </li>
         * <li><p><strong>Company</strong>: Company device.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        /**
         * <p>Device model.</p>
         * 
         * <strong>example:</strong>
         * <p>MacBookPro17,1</p>
         */
        @NameInMap("DeviceModel")
        public String deviceModel;

        /**
         * <p>The status of the device. Values:</p>
         * <ul>
         * <li><p><strong>Online</strong>: Online.</p>
         * </li>
         * <li><p><strong>Offline</strong>: Offline.</p>
         * </li>
         * <li><p><strong>LongTermOffline</strong>: Long-term offline.</p>
         * </li>
         * <li><p><strong>Locked</strong>: Locked.</p>
         * </li>
         * <li><p><strong>Lost</strong>: Lost.</p>
         * </li>
         * <li><p><strong>Unbound</strong>: Unbound.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <p>Device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DeviceTag")
        public String deviceTag;

        /**
         * <p>The operating system type of the device. Values:</p>
         * <ul>
         * <li><p><strong>Windows</strong>: Windows system.</p>
         * </li>
         * <li><p><strong>macOS</strong>: macOS system.</p>
         * </li>
         * <li><p><strong>Linux</strong>: Linux system.</p>
         * </li>
         * <li><p><strong>Android</strong>: Android system.</p>
         * </li>
         * <li><p><strong>iOS</strong>: iOS system.</p>
         * </li>
         * <li><p><strong>Windows_Wuying</strong>: Wuying Cloud Desktop system.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>Device operating system version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.1</p>
         */
        @NameInMap("DeviceVersion")
        public String deviceVersion;

        /**
         * <p>Device disk model.</p>
         * 
         * <strong>example:</strong>
         * <p>APPLE SSD AP0512Q Media</p>
         */
        @NameInMap("Disk")
        public String disk;

        /**
         * <p>Data protection status. Values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>Unprovisioned</strong>: Unprovisioned.</p>
         * </li>
         * <li><p><strong>Unauthorized</strong>: Unauthorized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("DlpStatus")
        public String dlpStatus;

        /**
         * <p>Device name.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Internet access status. Values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>Unprovisioned</strong>: Unprovisioned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("IaStatus")
        public String iaStatus;

        /**
         * <p>Device private network IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("InnerIP")
        public String innerIP;

        /**
         * <p>Device MAC address.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>Device memory capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>Network access control status. Values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>Unprovisioned</strong>: Unprovisioned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("NacStatus")
        public String nacStatus;

        /**
         * <p>NIC list.</p>
         */
        @NameInMap("NetInterfaceInfo")
        public java.util.List<UpdateUserDevicesSharingStatusResponseBodyDevicesNetInterfaceInfo> netInterfaceInfo;

        /**
         * <p>Private network access status. Values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>Unprovisioned</strong>: Unprovisioned.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("PaStatus")
        public String paStatus;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>Indicates whether device sharing is enabled. Values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enable sharing.</p>
         * </li>
         * <li><p><strong>false</strong>: Disable sharing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SharingStatus")
        public Boolean sharingStatus;

        /**
         * <p>Device logon IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>11.49.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <p>Device last online time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-24 19:04:42</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
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

        public UpdateUserDevicesSharingStatusResponseBodyDevices setNetInterfaceInfo(java.util.List<UpdateUserDevicesSharingStatusResponseBodyDevicesNetInterfaceInfo> netInterfaceInfo) {
            this.netInterfaceInfo = netInterfaceInfo;
            return this;
        }
        public java.util.List<UpdateUserDevicesSharingStatusResponseBodyDevicesNetInterfaceInfo> getNetInterfaceInfo() {
            return this.netInterfaceInfo;
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
