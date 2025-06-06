// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicDisposalProcessesResponseBody extends TeaModel {
    /**
     * <p>List of disposal processes.</p>
     */
    @NameInMap("DisposalProcesses")
    public java.util.List<ListDynamicDisposalProcessesResponseBodyDisposalProcesses> disposalProcesses;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of dynamic disposal processes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    public static ListDynamicDisposalProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicDisposalProcessesResponseBody self = new ListDynamicDisposalProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDynamicDisposalProcessesResponseBody setDisposalProcesses(java.util.List<ListDynamicDisposalProcessesResponseBodyDisposalProcesses> disposalProcesses) {
        this.disposalProcesses = disposalProcesses;
        return this;
    }
    public java.util.List<ListDynamicDisposalProcessesResponseBodyDisposalProcesses> getDisposalProcesses() {
        return this.disposalProcesses;
    }

    public ListDynamicDisposalProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDynamicDisposalProcessesResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static class ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo extends TeaModel {
        /**
         * <p>CPU model.</p>
         * 
         * <strong>example:</strong>
         * <p>Intel(R) Core(TM) i5-10210U CPU @ 1.60GHz</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>Device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A84D0AF0-1ACC-02B8-6A07-FC898F71BE09</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p>Device operating system type. Values:</p>
         * <ul>
         * <li><strong>Windows</strong>：Windows system.</li>
         * <li><strong>macOS</strong>：macOS system.</li>
         * <li><strong>Linux</strong>：Linux system.</li>
         * <li><strong>Android</strong>：Android system.</li>
         * <li><strong>iOS</strong>：iOS system.</li>
         * <li><strong>Windows_Wuying</strong>：Wuying cloud desktop system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("DevType")
        public String devType;

        /**
         * <p>Device disk model.</p>
         * 
         * <strong>example:</strong>
         * <p>KXG6AZNV512G TOSHIBA</p>
         */
        @NameInMap("Disk")
        public String disk;

        /**
         * <p>Device name.</p>
         * 
         * <strong>example:</strong>
         * <p>DESKTOP-ERLV3AK</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Device MAC address.</p>
         * 
         * <strong>example:</strong>
         * <p>CE:3B:<strong>:</strong>:FD:FB</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>Device memory capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>Operating system version</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        public static ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo self = new ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo setDevType(String devType) {
            this.devType = devType;
            return this;
        }
        public String getDevType() {
            return this.devType;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo setDisk(String disk) {
            this.disk = disk;
            return this;
        }
        public String getDisk() {
            return this.disk;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

    }

    public static class ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo extends TeaModel {
        /**
         * <p>Client version.</p>
         * 
         * <strong>example:</strong>
         * <p>4.5.1</p>
         */
        @NameInMap("AppVersion")
        public String appVersion;

        /**
         * <p>Department to which the user belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>IT运维部</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>Office data protection status. Values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * <li><strong>Unprovisioned</strong>: Not configured.</li>
         * <li><strong>Unauthorized</strong>: Unauthorized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("DlpStatus")
        public String dlpStatus;

        /**
         * <p>Public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>120.26.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>Internet behavior management enablement status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("LaStatus")
        public String laStatus;

        /**
         * <p>Login status.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("LoginStatus")
        public String loginStatus;

        /**
         * <p>Network access control status. Values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * <li><strong>Unprovisioned</strong>: Not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("NacStatus")
        public String nacStatus;

        /**
         * <p>Private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.XX.XX</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>Unique ID of the SASE user.</p>
         * 
         * <strong>example:</strong>
         * <p>su_dfsdfsdgasgsgag</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <p>Identified office area name.</p>
         * 
         * <strong>example:</strong>
         * <p>office</p>
         */
        @NameInMap("Workshop")
        public String workshop;

        /**
         * <p>ZTNA enablement status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ZtnaStatus")
        public String ztnaStatus;

        public static ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo self = new ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo();
            return TeaModel.build(map, self);
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setDlpStatus(String dlpStatus) {
            this.dlpStatus = dlpStatus;
            return this;
        }
        public String getDlpStatus() {
            return this.dlpStatus;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setLaStatus(String laStatus) {
            this.laStatus = laStatus;
            return this;
        }
        public String getLaStatus() {
            return this.laStatus;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setLoginStatus(String loginStatus) {
            this.loginStatus = loginStatus;
            return this;
        }
        public String getLoginStatus() {
            return this.loginStatus;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setNacStatus(String nacStatus) {
            this.nacStatus = nacStatus;
            return this;
        }
        public String getNacStatus() {
            return this.nacStatus;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setWorkshop(String workshop) {
            this.workshop = workshop;
            return this;
        }
        public String getWorkshop() {
            return this.workshop;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo setZtnaStatus(String ztnaStatus) {
            this.ztnaStatus = ztnaStatus;
            return this;
        }
        public String getZtnaStatus() {
            return this.ztnaStatus;
        }

    }

    public static class ListDynamicDisposalProcessesResponseBodyDisposalProcesses extends TeaModel {
        /**
         * <p>User\&quot;s department.</p>
         * 
         * <strong>example:</strong>
         * <p>IT</p>
         */
        @NameInMap("Department")
        public String department;

        /**
         * <p>Device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FD7554AD-4CDE-6359-6B49-4FE950606C2C</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <p>Basic device information.</p>
         */
        @NameInMap("DeviceBasicInfo")
        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo deviceBasicInfo;

        /**
         * <p>设备状态信息。</p>
         */
        @NameInMap("DeviceStatusInfo")
        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo deviceStatusInfo;

        /**
         * <p>List of disposal actions.</p>
         */
        @NameInMap("DisposalActions")
        public java.util.List<String> disposalActions;

        /**
         * <p>Disposal process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dp-xxxxxxxx</p>
         */
        @NameInMap("DisposalProcessId")
        public String disposalProcessId;

        /**
         * <p>Disposal time, in seconds since the epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>1743059249</p>
         */
        @NameInMap("DisposalTime")
        public String disposalTime;

        /**
         * <p>Dynamic policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dynamic-policy-xxxxxxxx</p>
         */
        @NameInMap("DynamicPolicyId")
        public String dynamicPolicyId;

        /**
         * <p>Dynamic policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>动态策略1</p>
         */
        @NameInMap("DynamicPolicyName")
        public String dynamicPolicyName;

        /**
         * <p>Terminal device name. Length: 1~128 characters, supporting Chinese and uppercase/lowercase English letters, and can include numbers, half-width periods (.), commas (,), semicolons (;), hyphens (-), underscores (<em>), slashes (/), at (@) symbols, and spaces. Entering an underscore (</em>) alone will additionally query all terminal devices with 4-byte UTF-8 characters in their names.</p>
         * 
         * <strong>example:</strong>
         * <p>WANGCHENCHENNBB</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <p>Recovery type.</p>
         * <ul>
         * <li><strong>auto</strong>：Automatic recovery.</li>
         * <li><strong>console</strong>：Console recovery.</li>
         * <li><strong>auth</strong>：Certification and reporting recovery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("RecoveryType")
        public String recoveryType;

        /**
         * <p>Rule content.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;Combinator&quot;: &quot;OR&quot;,
         *   &quot;Rules&quot;: [
         *     {
         *       &quot;Operator&quot;: &quot;version_gt&quot;,
         *       &quot;Values&quot;: [
         *         &quot;1&quot;
         *       ],
         *       &quot;RuleType&quot;: &quot;device_info&quot;,
         *       &quot;Id&quot;: &quot;1&quot;,
         *       &quot;RuleSubType&quot;: &quot;basic_info&quot;,
         *       &quot;Name&quot;: &quot;app_version&quot;
         *     }
         *   ]
         * }</p>
         */
        @NameInMap("RuleContent")
        public Object ruleContent;

        /**
         * <p>SASE用户ID。</p>
         * 
         * <strong>example:</strong>
         * <p>asdqwedg-xzczvzdaf-asfafs</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <p>Disposal status. Values:</p>
         * <ul>
         * <li><strong>disposal</strong>: In the disposal state.</li>
         * <li><strong>finished</strong>: Already automatically recovered.</li>
         * <li><strong>recovery</strong>: Recovered by authentication and reporting or console recovery.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disposal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Username.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaoming</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListDynamicDisposalProcessesResponseBodyDisposalProcesses build(java.util.Map<String, ?> map) throws Exception {
            ListDynamicDisposalProcessesResponseBodyDisposalProcesses self = new ListDynamicDisposalProcessesResponseBodyDisposalProcesses();
            return TeaModel.build(map, self);
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setDeviceBasicInfo(ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo deviceBasicInfo) {
            this.deviceBasicInfo = deviceBasicInfo;
            return this;
        }
        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo getDeviceBasicInfo() {
            return this.deviceBasicInfo;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setDeviceStatusInfo(ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo deviceStatusInfo) {
            this.deviceStatusInfo = deviceStatusInfo;
            return this;
        }
        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo getDeviceStatusInfo() {
            return this.deviceStatusInfo;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setDisposalActions(java.util.List<String> disposalActions) {
            this.disposalActions = disposalActions;
            return this;
        }
        public java.util.List<String> getDisposalActions() {
            return this.disposalActions;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setDisposalProcessId(String disposalProcessId) {
            this.disposalProcessId = disposalProcessId;
            return this;
        }
        public String getDisposalProcessId() {
            return this.disposalProcessId;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setDisposalTime(String disposalTime) {
            this.disposalTime = disposalTime;
            return this;
        }
        public String getDisposalTime() {
            return this.disposalTime;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setDynamicPolicyId(String dynamicPolicyId) {
            this.dynamicPolicyId = dynamicPolicyId;
            return this;
        }
        public String getDynamicPolicyId() {
            return this.dynamicPolicyId;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setDynamicPolicyName(String dynamicPolicyName) {
            this.dynamicPolicyName = dynamicPolicyName;
            return this;
        }
        public String getDynamicPolicyName() {
            return this.dynamicPolicyName;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setRecoveryType(String recoveryType) {
            this.recoveryType = recoveryType;
            return this;
        }
        public String getRecoveryType() {
            return this.recoveryType;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setRuleContent(Object ruleContent) {
            this.ruleContent = ruleContent;
            return this;
        }
        public Object getRuleContent() {
            return this.ruleContent;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setSaseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }
        public String getSaseUserId() {
            return this.saseUserId;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDynamicDisposalProcessesResponseBodyDisposalProcesses setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
