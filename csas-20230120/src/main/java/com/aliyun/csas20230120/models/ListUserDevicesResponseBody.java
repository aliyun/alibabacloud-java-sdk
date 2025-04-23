// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserDevicesResponseBody extends TeaModel {
    @NameInMap("Devices")
    public java.util.List<ListUserDevicesResponseBodyDevices> devices;

    /**
     * <strong>example:</strong>
     * <p>5FEF5CFA-14CC-5DE5-BD1F-AFFE0996E71D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public static class ListUserDevicesResponseBodyDevicesNetInterfaceInfo extends TeaModel {
        @NameInMap("Mac")
        public String mac;

        @NameInMap("Name")
        public String name;

        public static ListUserDevicesResponseBodyDevicesNetInterfaceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserDevicesResponseBodyDevicesNetInterfaceInfo self = new ListUserDevicesResponseBodyDevicesNetInterfaceInfo();
            return TeaModel.build(map, self);
        }

        public ListUserDevicesResponseBodyDevicesNetInterfaceInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListUserDevicesResponseBodyDevicesNetInterfaceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListUserDevicesResponseBodyDevices extends TeaModel {
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
         * <p>2023-07-17 18:46:55</p>
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
         * <p>Enabled</p>
         */
        @NameInMap("DlpStatus")
        public String dlpStatus;

        @NameInMap("EdrStatus")
        public String edrStatus;

        /**
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("IaStatus")
        public String iaStatus;

        /**
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("InnerIP")
        public String innerIP;

        /**
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
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
         * <p>Enabled</p>
         */
        @NameInMap("NacStatus")
        public String nacStatus;

        @NameInMap("NetInterfaceInfo")
        public java.util.List<ListUserDevicesResponseBodyDevicesNetInterfaceInfo> netInterfaceInfo;

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
         * <p>11.49.XX.XX</p>
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

        @NameInMap("Workshop")
        public String workshop;

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

        public ListUserDevicesResponseBodyDevices setEdrStatus(String edrStatus) {
            this.edrStatus = edrStatus;
            return this;
        }
        public String getEdrStatus() {
            return this.edrStatus;
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

        public ListUserDevicesResponseBodyDevices setNetInterfaceInfo(java.util.List<ListUserDevicesResponseBodyDevicesNetInterfaceInfo> netInterfaceInfo) {
            this.netInterfaceInfo = netInterfaceInfo;
            return this;
        }
        public java.util.List<ListUserDevicesResponseBodyDevicesNetInterfaceInfo> getNetInterfaceInfo() {
            return this.netInterfaceInfo;
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

        public ListUserDevicesResponseBodyDevices setWorkshop(String workshop) {
            this.workshop = workshop;
            return this;
        }
        public String getWorkshop() {
            return this.workshop;
        }

    }

}
