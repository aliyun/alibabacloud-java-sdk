// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserDeviceResponseBody extends TeaModel {
    /**
     * <p>The terminal device.</p>
     */
    @NameInMap("Device")
    public GetUserDeviceResponseBodyDevice device;

    /**
     * <p>The ID of the request.</p>
     * 
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_e8f218fb171edd167c2ad917d21f53148bdefc510ca1f3c3cc0249d3643d****</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>Ms. Zhang</p>
         */
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

    public static class GetUserDeviceResponseBodyDeviceNetInterfaceInfo extends TeaModel {
        /**
         * <p>The MAC address of the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>00:16:XX:XX:7c:46</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The name of the NIC.</p>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetUserDeviceResponseBodyDeviceNetInterfaceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUserDeviceResponseBodyDeviceNetInterfaceInfo self = new GetUserDeviceResponseBodyDeviceNetInterfaceInfo();
            return TeaModel.build(map, self);
        }

        public GetUserDeviceResponseBodyDeviceNetInterfaceInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public GetUserDeviceResponseBodyDeviceNetInterfaceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetUserDeviceResponseBodyDeviceProcesses extends TeaModel {
        /**
         * <p>The CPU usage percentage of the process.</p>
         * 
         * <strong>example:</strong>
         * <p>0.05</p>
         */
        @NameInMap("Cpu")
        public Double cpu;

        /**
         * <p>The process running description.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Program Files\Google\Chrome\Application\chrome.exe</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The memory usage of the process, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>chrome.exe</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetUserDeviceResponseBodyDeviceProcesses build(java.util.Map<String, ?> map) throws Exception {
            GetUserDeviceResponseBodyDeviceProcesses self = new GetUserDeviceResponseBodyDeviceProcesses();
            return TeaModel.build(map, self);
        }

        public GetUserDeviceResponseBodyDeviceProcesses setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public GetUserDeviceResponseBodyDeviceProcesses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserDeviceResponseBodyDeviceProcesses setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public GetUserDeviceResponseBodyDeviceProcesses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetUserDeviceResponseBodyDevice extends TeaModel {
        /**
         * <p>The client status. Valid values:</p>
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
         * <p>The auto-logon status of the device. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("AutoLoginStatus")
        public String autoLoginStatus;

        /**
         * <p>The battery health percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BatteryHealthPercentage")
        public Integer batteryHealthPercentage;

        /**
         * <p>The battery remaining charge percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("BatteryRemainingPercentage")
        public Integer batteryRemainingPercentage;

        /**
         * <p>The CPU model of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>Apple M1</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>The city to which the public IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou City</p>
         */
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

        /**
         * <p>The continent to which the public IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia</p>
         */
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

        /**
         * <p>The country to which the public IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>China</p>
         */
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
         * <p>The registration time of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The department to which the user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>QA Department</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>The ownership of the terminal device. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        /**
         * <p>The model of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>MacBookPro17,1</p>
         */
        @NameInMap("DeviceModel")
        public String deviceModel;

        /**
         * <p>The status of the terminal device. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Online</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <p>The ID of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        @NameInMap("DeviceTag")
        public String deviceTag;

        /**
         * <p>The operating system type of the terminal device. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The operating system version of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.1</p>
         */
        @NameInMap("DeviceVersion")
        public String deviceVersion;

        /**
         * <p>The disk model of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>APPLE SSD AP0512Q Media</p>
         */
        @NameInMap("Disk")
        public String disk;

        /**
         * <p>The available disk space, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DiskAvailable")
        public Integer diskAvailable;

        /**
         * <p>The used disk space, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>103</p>
         */
        @NameInMap("DiskUsed")
        public Integer diskUsed;

        /**
         * <p>The office data protection status. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Unauthorized</p>
         */
        @NameInMap("DlpStatus")
        public String dlpStatus;

        /**
         * <p>The anti-intrusion status. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("EdrStatus")
        public String edrStatus;

        /**
         * <p>The historical users of the terminal device.</p>
         */
        @NameInMap("HistoryUsers")
        public java.util.List<GetUserDeviceResponseBodyDeviceHistoryUsers> historyUsers;

        /**
         * <p>The name of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>win10-64bit</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>The Internet access status. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("IaStatus")
        public String iaStatus;

        /**
         * <p>The internal IP address of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("InnerIP")
        public String innerIP;

        /**
         * <p>Indicates whether the terminal has joined an AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("JoinAdDomain")
        public Boolean joinAdDomain;

        /**
         * <p>The MAC address of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>48:9e:XX:XX:02:80</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>The IDs of matched device groups.</p>
         */
        @NameInMap("MatchDeviceGroupIds")
        public java.util.List<String> matchDeviceGroupIds;

        /**
         * <p>The memory capacity of the terminal device. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The network access control status. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Unprovisioned</p>
         */
        @NameInMap("NacStatus")
        public String nacStatus;

        /**
         * <p>The list of network interface controllers (NICs) of the terminal device.</p>
         */
        @NameInMap("NetInterfaceInfo")
        public java.util.List<GetUserDeviceResponseBodyDeviceNetInterfaceInfo> netInterfaceInfo;

        /**
         * <p>The private access status. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("PaStatus")
        public String paStatus;

        /**
         * <p>The list of processes running on the terminal.</p>
         */
        @NameInMap("Processes")
        public java.util.List<GetUserDeviceResponseBodyDeviceProcesses> processes;

        /**
         * <p>The province to which the public IP address belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhejiang</p>
         */
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
         * <p>Indicates whether sharing is enabled for the device. Valid values:</p>
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
         * <p>The serial number (SN) of the BIOS system.</p>
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
         * <p>The serial number (SN) of the processor.</p>
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
         * <p>The logon IP address of the terminal device.</p>
         * 
         * <strong>example:</strong>
         * <p>106.14.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <p>The timestamp when the terminal process information was collected.</p>
         * 
         * <strong>example:</strong>
         * <p>1775096714</p>
         */
        @NameInMap("TerminalInfoCollectTime")
        public Long terminalInfoCollectTime;

        /**
         * <p>The last online time of the terminal device.</p>
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
         * <p>Mr. Wang</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>The name of the office area.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Office Area</p>
         */
        @NameInMap("Workshop")
        public String workshop;

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

        public GetUserDeviceResponseBodyDevice setAutoLoginStatus(String autoLoginStatus) {
            this.autoLoginStatus = autoLoginStatus;
            return this;
        }
        public String getAutoLoginStatus() {
            return this.autoLoginStatus;
        }

        public GetUserDeviceResponseBodyDevice setBatteryHealthPercentage(Integer batteryHealthPercentage) {
            this.batteryHealthPercentage = batteryHealthPercentage;
            return this;
        }
        public Integer getBatteryHealthPercentage() {
            return this.batteryHealthPercentage;
        }

        public GetUserDeviceResponseBodyDevice setBatteryRemainingPercentage(Integer batteryRemainingPercentage) {
            this.batteryRemainingPercentage = batteryRemainingPercentage;
            return this;
        }
        public Integer getBatteryRemainingPercentage() {
            return this.batteryRemainingPercentage;
        }

        public GetUserDeviceResponseBodyDevice setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public GetUserDeviceResponseBodyDevice setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetUserDeviceResponseBodyDevice setCityEn(String cityEn) {
            this.cityEn = cityEn;
            return this;
        }
        public String getCityEn() {
            return this.cityEn;
        }

        public GetUserDeviceResponseBodyDevice setCityZh(String cityZh) {
            this.cityZh = cityZh;
            return this;
        }
        public String getCityZh() {
            return this.cityZh;
        }

        public GetUserDeviceResponseBodyDevice setContinent(String continent) {
            this.continent = continent;
            return this;
        }
        public String getContinent() {
            return this.continent;
        }

        public GetUserDeviceResponseBodyDevice setContinentEn(String continentEn) {
            this.continentEn = continentEn;
            return this;
        }
        public String getContinentEn() {
            return this.continentEn;
        }

        public GetUserDeviceResponseBodyDevice setContinentZh(String continentZh) {
            this.continentZh = continentZh;
            return this;
        }
        public String getContinentZh() {
            return this.continentZh;
        }

        public GetUserDeviceResponseBodyDevice setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetUserDeviceResponseBodyDevice setCountryEn(String countryEn) {
            this.countryEn = countryEn;
            return this;
        }
        public String getCountryEn() {
            return this.countryEn;
        }

        public GetUserDeviceResponseBodyDevice setCountryZh(String countryZh) {
            this.countryZh = countryZh;
            return this;
        }
        public String getCountryZh() {
            return this.countryZh;
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

        public GetUserDeviceResponseBodyDevice setDiskAvailable(Integer diskAvailable) {
            this.diskAvailable = diskAvailable;
            return this;
        }
        public Integer getDiskAvailable() {
            return this.diskAvailable;
        }

        public GetUserDeviceResponseBodyDevice setDiskUsed(Integer diskUsed) {
            this.diskUsed = diskUsed;
            return this;
        }
        public Integer getDiskUsed() {
            return this.diskUsed;
        }

        public GetUserDeviceResponseBodyDevice setDlpStatus(String dlpStatus) {
            this.dlpStatus = dlpStatus;
            return this;
        }
        public String getDlpStatus() {
            return this.dlpStatus;
        }

        public GetUserDeviceResponseBodyDevice setEdrStatus(String edrStatus) {
            this.edrStatus = edrStatus;
            return this;
        }
        public String getEdrStatus() {
            return this.edrStatus;
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

        public GetUserDeviceResponseBodyDevice setJoinAdDomain(Boolean joinAdDomain) {
            this.joinAdDomain = joinAdDomain;
            return this;
        }
        public Boolean getJoinAdDomain() {
            return this.joinAdDomain;
        }

        public GetUserDeviceResponseBodyDevice setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public GetUserDeviceResponseBodyDevice setMatchDeviceGroupIds(java.util.List<String> matchDeviceGroupIds) {
            this.matchDeviceGroupIds = matchDeviceGroupIds;
            return this;
        }
        public java.util.List<String> getMatchDeviceGroupIds() {
            return this.matchDeviceGroupIds;
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

        public GetUserDeviceResponseBodyDevice setNetInterfaceInfo(java.util.List<GetUserDeviceResponseBodyDeviceNetInterfaceInfo> netInterfaceInfo) {
            this.netInterfaceInfo = netInterfaceInfo;
            return this;
        }
        public java.util.List<GetUserDeviceResponseBodyDeviceNetInterfaceInfo> getNetInterfaceInfo() {
            return this.netInterfaceInfo;
        }

        public GetUserDeviceResponseBodyDevice setPaStatus(String paStatus) {
            this.paStatus = paStatus;
            return this;
        }
        public String getPaStatus() {
            return this.paStatus;
        }

        public GetUserDeviceResponseBodyDevice setProcesses(java.util.List<GetUserDeviceResponseBodyDeviceProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<GetUserDeviceResponseBodyDeviceProcesses> getProcesses() {
            return this.processes;
        }

        public GetUserDeviceResponseBodyDevice setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetUserDeviceResponseBodyDevice setProvinceEn(String provinceEn) {
            this.provinceEn = provinceEn;
            return this;
        }
        public String getProvinceEn() {
            return this.provinceEn;
        }

        public GetUserDeviceResponseBodyDevice setProvinceZh(String provinceZh) {
            this.provinceZh = provinceZh;
            return this;
        }
        public String getProvinceZh() {
            return this.provinceZh;
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

        public GetUserDeviceResponseBodyDevice setSnBaseBoard(String snBaseBoard) {
            this.snBaseBoard = snBaseBoard;
            return this;
        }
        public String getSnBaseBoard() {
            return this.snBaseBoard;
        }

        public GetUserDeviceResponseBodyDevice setSnBios(String snBios) {
            this.snBios = snBios;
            return this;
        }
        public String getSnBios() {
            return this.snBios;
        }

        public GetUserDeviceResponseBodyDevice setSnDiskDrive(String snDiskDrive) {
            this.snDiskDrive = snDiskDrive;
            return this;
        }
        public String getSnDiskDrive() {
            return this.snDiskDrive;
        }

        public GetUserDeviceResponseBodyDevice setSnProcessor(String snProcessor) {
            this.snProcessor = snProcessor;
            return this;
        }
        public String getSnProcessor() {
            return this.snProcessor;
        }

        public GetUserDeviceResponseBodyDevice setSnSystem(String snSystem) {
            this.snSystem = snSystem;
            return this;
        }
        public String getSnSystem() {
            return this.snSystem;
        }

        public GetUserDeviceResponseBodyDevice setSrcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }
        public String getSrcIP() {
            return this.srcIP;
        }

        public GetUserDeviceResponseBodyDevice setTerminalInfoCollectTime(Long terminalInfoCollectTime) {
            this.terminalInfoCollectTime = terminalInfoCollectTime;
            return this;
        }
        public Long getTerminalInfoCollectTime() {
            return this.terminalInfoCollectTime;
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

        public GetUserDeviceResponseBodyDevice setWorkshop(String workshop) {
            this.workshop = workshop;
            return this;
        }
        public String getWorkshop() {
            return this.workshop;
        }

    }

}
