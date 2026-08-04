// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUserDevicesStatusResponseBody extends TeaModel {
    /**
     * <p>A list of endpoint devices.</p>
     */
    @NameInMap("Devices")
    public java.util.List<UpdateUserDevicesStatusResponseBodyDevices> devices;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FEF5CFA-14CC-5DE5-BD1F-AFFE0996E71D</p>
     */
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

    public static class UpdateUserDevicesStatusResponseBodyDevicesNetInterfaceInfo extends TeaModel {
        /**
         * <p>The MAC address of the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The NIC name.</p>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateUserDevicesStatusResponseBodyDevicesNetInterfaceInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserDevicesStatusResponseBodyDevicesNetInterfaceInfo self = new UpdateUserDevicesStatusResponseBodyDevicesNetInterfaceInfo();
            return TeaModel.build(map, self);
        }

        public UpdateUserDevicesStatusResponseBodyDevicesNetInterfaceInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public UpdateUserDevicesStatusResponseBodyDevicesNetInterfaceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateUserDevicesStatusResponseBodyDevices extends TeaModel {
        /**
         * <p>The client status. Valid values:</p>
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
         * <p>The client version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.0</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>The CPU model of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>Apple M1</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>The time when the endpoint device was registered.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-17 18:46:55</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The department to which the user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>测试部</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The ownership of the endpoint device. Valid values:</p>
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
         * <p>The model of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>MacBookPro17,1</p>
         */
        @NameInMap("DeviceModel")
        public String deviceModel;

        /**
         * <p>The status of the endpoint device. Valid values:</p>
         * <ul>
         * <li><p><strong>Online</strong>: Online.</p>
         * </li>
         * <li><p><strong>Offline</strong>: Offline.</p>
         * </li>
         * <li><p><strong>LongTermOffline</strong>: Long-term offline.</p>
         * </li>
         * <li><p><strong>Locked</strong>: Locked.</p>
         * </li>
         * <li><p><strong>Lost</strong>: Reported as lost.</p>
         * </li>
         * <li><p><strong>Unbound</strong>: Detached.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <p>The endpoint device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DeviceTag")
        public String deviceTag;

        /**
         * <p>The operating system type of the endpoint device. Valid values:</p>
         * <ul>
         * <li><p><strong>Windows</strong>: Windows.</p>
         * </li>
         * <li><p><strong>macOS</strong>: macOS.</p>
         * </li>
         * <li><p><strong>Linux</strong>: Linux.</p>
         * </li>
         * <li><p><strong>Android</strong>: Android.</p>
         * </li>
         * <li><p><strong>iOS</strong>: iOS.</p>
         * </li>
         * <li><p><strong>Windows_Wuying</strong>: Alibaba Cloud Cloud Desktop.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The operating system version of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.1</p>
         */
        @NameInMap("DeviceVersion")
        public String deviceVersion;

        /**
         * <p>The disk model of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>APPLE SSD AP0512Q Media</p>
         */
        @NameInMap("Disk")
        public String disk;

        /**
         * <p>The data protection status. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>Unprovisioned</strong>: Not configured.</p>
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
         * <p>The device name.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Internet access status. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Internet access is enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Internet access is disabled.</p>
         * </li>
         * <li><p><strong>Unprovisioned</strong>: The device is unconfigured.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("IaStatus")
        public String iaStatus;

        /**
         * <p>The private network IP address of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("InnerIP")
        public String innerIP;

        /**
         * <p>The MAC address of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The memory capacity of the endpoint device, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The network admission control status. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>Unprovisioned</strong>: Not configured.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("NacStatus")
        public String nacStatus;

        /**
         * <p>A list of network interface controllers (NICs) on the endpoint device.</p>
         */
        @NameInMap("NetInterfaceInfo")
        public java.util.List<UpdateUserDevicesStatusResponseBodyDevicesNetInterfaceInfo> netInterfaceInfo;

        /**
         * <p>The private network access status. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>Unprovisioned</strong>: Not configured.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("PaStatus")
        public String paStatus;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>Whether sharing is enabled for the device. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Sharing is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Sharing is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SharingStatus")
        public Boolean sharingStatus;

        /**
         * <p>The IP address used to log on to the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>11.49.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <p>The last time the endpoint device was online.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-24 19:04:42</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>王先生</p>
         */
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

        public UpdateUserDevicesStatusResponseBodyDevices setNetInterfaceInfo(java.util.List<UpdateUserDevicesStatusResponseBodyDevicesNetInterfaceInfo> netInterfaceInfo) {
            this.netInterfaceInfo = netInterfaceInfo;
            return this;
        }
        public java.util.List<UpdateUserDevicesStatusResponseBodyDevicesNetInterfaceInfo> getNetInterfaceInfo() {
            return this.netInterfaceInfo;
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
