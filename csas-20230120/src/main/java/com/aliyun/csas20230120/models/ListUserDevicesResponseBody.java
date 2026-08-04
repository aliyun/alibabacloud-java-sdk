// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserDevicesResponseBody extends TeaModel {
    /**
     * <p>The list of endpoint devices.</p>
     */
    @NameInMap("Devices")
    public java.util.List<ListUserDevicesResponseBodyDevices> devices;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FEF5CFA-14CC-5DE5-BD1F-AFFE0996E71D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of endpoint devices.</p>
     * 
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
        /**
         * <p>The MAC address of the network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The name of the network interface.</p>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
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
         * <p>The client status. Valid values:</p>
         * <ul>
         * <li><strong>Online</strong>: online.</li>
         * <li><strong>Offline</strong>: offline.</li>
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
         * <p>The auto-logon status of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("AutoLoginStatus")
        public String autoLoginStatus;

        /**
         * <p>The CPU model of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>Apple M1</p>
         */
        @NameInMap("CPU")
        public String CPU;

        @NameInMap("City")
        public String city;

        /**
         * <p>The city name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing City</p>
         */
        @NameInMap("CityEn")
        public String cityEn;

        /**
         * <p>The city name in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>北京市</p>
         */
        @NameInMap("CityZh")
        public String cityZh;

        @NameInMap("Continent")
        public String continent;

        /**
         * <p>The continent name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia</p>
         */
        @NameInMap("ContinentEn")
        public String continentEn;

        /**
         * <p>The continent name in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>亚洲</p>
         */
        @NameInMap("ContinentZh")
        public String continentZh;

        @NameInMap("Country")
        public String country;

        /**
         * <p>The country name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
        @NameInMap("CountryEn")
        public String countryEn;

        /**
         * <p>The country name in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>中国</p>
         */
        @NameInMap("CountryZh")
        public String countryZh;

        /**
         * <p>The registration time of the endpoint device.</p>
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
         * <li><strong>Personal</strong>: personal device.</li>
         * <li><strong>Company</strong>: company device.</li>
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
         * <li><strong>Online</strong>: online.</li>
         * <li><strong>Offline</strong>: offline.</li>
         * <li><strong>LongTermOffline</strong>: long-term offline.</li>
         * <li><strong>Locked</strong>: locked.</li>
         * <li><strong>Lost</strong>: reported as lost.</li>
         * <li><strong>Unbound</strong>: unbound.</li>
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
         * <li><strong>Windows</strong>: Windows.</li>
         * <li><strong>macOS</strong>: macOS.</li>
         * <li><strong>Linux</strong>: Linux.</li>
         * <li><strong>Android</strong>: Android.</li>
         * <li><strong>iOS</strong>: iOS.</li>
         * <li><strong>Windows_Wuying</strong>: WUYING Workspace.</li>
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
         * <p>The office data protection status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * <li><strong>Unprovisioned</strong>: not configured.</li>
         * <li><strong>Unauthorized</strong>: unauthorized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("DlpStatus")
        public String dlpStatus;

        /**
         * <p>The anti-intrusion status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("EdrStatus")
        public String edrStatus;

        /**
         * <p>The list of full department paths.</p>
         */
        @NameInMap("FullDepartment")
        public java.util.List<String> fullDepartment;

        /**
         * <p>The name of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The Internet access status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * <li><strong>Unprovisioned</strong>: not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("IaStatus")
        public String iaStatus;

        /**
         * <p>The internal IP address of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("InnerIP")
        public String innerIP;

        /**
         * <p>Indicates whether the device is joined to an Active Directory (AD) domain.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("JoinAdDomain")
        public Boolean joinAdDomain;

        /**
         * <p>The MAC address of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The collection of matched device group IDs.</p>
         */
        @NameInMap("MatchDeviceGroupIds")
        public java.util.List<String> matchDeviceGroupIds;

        /**
         * <p>The memory capacity of the endpoint device. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The network access control status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * <li><strong>Unprovisioned</strong>: not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("NacStatus")
        public String nacStatus;

        /**
         * <p>The list of network interfaces of the endpoint device.</p>
         */
        @NameInMap("NetInterfaceInfo")
        public java.util.List<ListUserDevicesResponseBodyDevicesNetInterfaceInfo> netInterfaceInfo;

        /**
         * <p>The private access status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: enabled.</li>
         * <li><strong>Disabled</strong>: disabled.</li>
         * <li><strong>Unprovisioned</strong>: not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("PaStatus")
        public String paStatus;

        @NameInMap("Province")
        public String province;

        /**
         * <p>The province name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        @NameInMap("ProvinceEn")
        public String provinceEn;

        /**
         * <p>The province name in Chinese.</p>
         * 
         * <strong>example:</strong>
         * <p>北京市</p>
         */
        @NameInMap("ProvinceZh")
        public String provinceZh;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>Specifies whether sharing is enabled for the device. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Sharing is enabled.</li>
         * <li><strong>false</strong>: Sharing is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SharingStatus")
        public Boolean sharingStatus;

        /**
         * <p>The motherboard serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>PJGGU00WBD****</p>
         */
        @NameInMap("SnBaseBoard")
        public String snBaseBoard;

        /**
         * <p>The BIOS system serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>5CG003****</p>
         */
        @NameInMap("SnBios")
        public String snBios;

        /**
         * <p>The hard disk serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>WD-WXR1A99A****</p>
         */
        @NameInMap("SnDiskDrive")
        public String snDiskDrive;

        /**
         * <p>The processor serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>BFEBFBFF0008****</p>
         */
        @NameInMap("SnProcessor")
        public String snProcessor;

        /**
         * <p>The system serial number.</p>
         * 
         * <strong>example:</strong>
         * <p>KVN9C9****</p>
         */
        @NameInMap("SnSystem")
        public String snSystem;

        /**
         * <p>The logon IP address of the endpoint device.</p>
         * 
         * <strong>example:</strong>
         * <p>11.49.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <p>The last online time of the endpoint device.</p>
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

        /**
         * <p>The name of the office area.</p>
         * 
         * <strong>example:</strong>
         * <p>测试办公区</p>
         */
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

        public ListUserDevicesResponseBodyDevices setAutoLoginStatus(String autoLoginStatus) {
            this.autoLoginStatus = autoLoginStatus;
            return this;
        }
        public String getAutoLoginStatus() {
            return this.autoLoginStatus;
        }

        public ListUserDevicesResponseBodyDevices setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public ListUserDevicesResponseBodyDevices setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListUserDevicesResponseBodyDevices setCityEn(String cityEn) {
            this.cityEn = cityEn;
            return this;
        }
        public String getCityEn() {
            return this.cityEn;
        }

        public ListUserDevicesResponseBodyDevices setCityZh(String cityZh) {
            this.cityZh = cityZh;
            return this;
        }
        public String getCityZh() {
            return this.cityZh;
        }

        public ListUserDevicesResponseBodyDevices setContinent(String continent) {
            this.continent = continent;
            return this;
        }
        public String getContinent() {
            return this.continent;
        }

        public ListUserDevicesResponseBodyDevices setContinentEn(String continentEn) {
            this.continentEn = continentEn;
            return this;
        }
        public String getContinentEn() {
            return this.continentEn;
        }

        public ListUserDevicesResponseBodyDevices setContinentZh(String continentZh) {
            this.continentZh = continentZh;
            return this;
        }
        public String getContinentZh() {
            return this.continentZh;
        }

        public ListUserDevicesResponseBodyDevices setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public ListUserDevicesResponseBodyDevices setCountryEn(String countryEn) {
            this.countryEn = countryEn;
            return this;
        }
        public String getCountryEn() {
            return this.countryEn;
        }

        public ListUserDevicesResponseBodyDevices setCountryZh(String countryZh) {
            this.countryZh = countryZh;
            return this;
        }
        public String getCountryZh() {
            return this.countryZh;
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

        public ListUserDevicesResponseBodyDevices setFullDepartment(java.util.List<String> fullDepartment) {
            this.fullDepartment = fullDepartment;
            return this;
        }
        public java.util.List<String> getFullDepartment() {
            return this.fullDepartment;
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

        public ListUserDevicesResponseBodyDevices setJoinAdDomain(Boolean joinAdDomain) {
            this.joinAdDomain = joinAdDomain;
            return this;
        }
        public Boolean getJoinAdDomain() {
            return this.joinAdDomain;
        }

        public ListUserDevicesResponseBodyDevices setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListUserDevicesResponseBodyDevices setMatchDeviceGroupIds(java.util.List<String> matchDeviceGroupIds) {
            this.matchDeviceGroupIds = matchDeviceGroupIds;
            return this;
        }
        public java.util.List<String> getMatchDeviceGroupIds() {
            return this.matchDeviceGroupIds;
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

        public ListUserDevicesResponseBodyDevices setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListUserDevicesResponseBodyDevices setProvinceEn(String provinceEn) {
            this.provinceEn = provinceEn;
            return this;
        }
        public String getProvinceEn() {
            return this.provinceEn;
        }

        public ListUserDevicesResponseBodyDevices setProvinceZh(String provinceZh) {
            this.provinceZh = provinceZh;
            return this;
        }
        public String getProvinceZh() {
            return this.provinceZh;
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

        public ListUserDevicesResponseBodyDevices setSnBaseBoard(String snBaseBoard) {
            this.snBaseBoard = snBaseBoard;
            return this;
        }
        public String getSnBaseBoard() {
            return this.snBaseBoard;
        }

        public ListUserDevicesResponseBodyDevices setSnBios(String snBios) {
            this.snBios = snBios;
            return this;
        }
        public String getSnBios() {
            return this.snBios;
        }

        public ListUserDevicesResponseBodyDevices setSnDiskDrive(String snDiskDrive) {
            this.snDiskDrive = snDiskDrive;
            return this;
        }
        public String getSnDiskDrive() {
            return this.snDiskDrive;
        }

        public ListUserDevicesResponseBodyDevices setSnProcessor(String snProcessor) {
            this.snProcessor = snProcessor;
            return this;
        }
        public String getSnProcessor() {
            return this.snProcessor;
        }

        public ListUserDevicesResponseBodyDevices setSnSystem(String snSystem) {
            this.snSystem = snSystem;
            return this;
        }
        public String getSnSystem() {
            return this.snSystem;
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
