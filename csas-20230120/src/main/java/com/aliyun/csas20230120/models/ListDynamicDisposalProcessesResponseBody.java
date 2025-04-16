// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDynamicDisposalProcessesResponseBody extends TeaModel {
    @NameInMap("DisposalProcesses")
    public java.util.List<ListDynamicDisposalProcessesResponseBodyDisposalProcesses> disposalProcesses;

    /**
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("DevTag")
        public String devTag;

        @NameInMap("DevType")
        public String devType;

        @NameInMap("Disk")
        public String disk;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Memory")
        public String memory;

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
        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("Department")
        public String department;

        @NameInMap("DlpStatus")
        public String dlpStatus;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("LaStatus")
        public String laStatus;

        @NameInMap("LoginStatus")
        public String loginStatus;

        @NameInMap("NacStatus")
        public String nacStatus;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("SaseUserId")
        public String saseUserId;

        @NameInMap("Username")
        public String username;

        @NameInMap("Workshop")
        public String workshop;

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
        @NameInMap("Department")
        public String department;

        /**
         * <strong>example:</strong>
         * <p>FD7554AD-4CDE-6359-6B49-4FE950606C2C</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        @NameInMap("DeviceBasicInfo")
        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceBasicInfo deviceBasicInfo;

        @NameInMap("DeviceStatusInfo")
        public ListDynamicDisposalProcessesResponseBodyDisposalProcessesDeviceStatusInfo deviceStatusInfo;

        @NameInMap("DisposalActions")
        public java.util.List<String> disposalActions;

        /**
         * <strong>example:</strong>
         * <p>dp-xxxxxxxx</p>
         */
        @NameInMap("DisposalProcessId")
        public String disposalProcessId;

        /**
         * <strong>example:</strong>
         * <p>1743059249</p>
         */
        @NameInMap("DisposalTime")
        public String disposalTime;

        /**
         * <strong>example:</strong>
         * <p>dynamic-policy-xxxxxxxx</p>
         */
        @NameInMap("DynamicPolicyId")
        public String dynamicPolicyId;

        @NameInMap("DynamicPolicyName")
        public String dynamicPolicyName;

        /**
         * <strong>example:</strong>
         * <p>WANGCHENCHENNBB</p>
         */
        @NameInMap("Hostname")
        public String hostname;

        /**
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("RecoveryType")
        public String recoveryType;

        /**
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
         * <strong>example:</strong>
         * <p>asdqwedg-xzczvzdaf-asfafs</p>
         */
        @NameInMap("SaseUserId")
        public String saseUserId;

        /**
         * <strong>example:</strong>
         * <p>disposal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
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
