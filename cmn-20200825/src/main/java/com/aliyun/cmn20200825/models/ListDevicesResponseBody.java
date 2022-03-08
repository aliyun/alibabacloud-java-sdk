// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDevicesResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("Devices")
    public java.util.List<ListDevicesResponseBodyDevices> devices;

    // 每页数量。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesResponseBody self = new ListDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevicesResponseBody setDevices(java.util.List<ListDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<ListDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public ListDevicesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDevicesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDevicesResponseBodyDevices extends TeaModel {
        // 设备形态ID
        @NameInMap("DeviceFormId")
        public String deviceFormId;

        // 设备形态名称
        @NameInMap("DeviceFormName")
        public String deviceFormName;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // enable密码
        @NameInMap("EnablePassword")
        public String enablePassword;

        // 设备额外属性
        @NameInMap("ExtAttributes")
        public String extAttributes;

        // 创建时间
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 修改时间
        @NameInMap("GmtModified")
        public String gmtModified;

        // 主机名
        @NameInMap("HostName")
        public String hostName;

        // 设备IP
        @NameInMap("Ip")
        public String ip;

        // 登录密码
        @NameInMap("LoginPassword")
        public String loginPassword;

        // 登录类型
        @NameInMap("LoginType")
        public String loginType;

        // 登录账号
        @NameInMap("LoginUsername")
        public String loginUsername;

        // 设备MAC地址
        @NameInMap("Mac")
        public String mac;

        // 设备型号
        @NameInMap("Model")
        public String model;

        // 物理空间ID
        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

        // 物理空间名称
        @NameInMap("PhysicalSpaceName")
        public String physicalSpaceName;

        // 设备安全域
        @NameInMap("SecurityDomain")
        public String securityDomain;

        // 设备状态
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        // 设备SN
        @NameInMap("Sn")
        public String sn;

        // SNMP 账号类型
        @NameInMap("SnmpAccountType")
        public String snmpAccountType;

        // SNMP版本号
        @NameInMap("SnmpAccountVersion")
        public String snmpAccountVersion;

        // SNMP Auth Passphrase
        @NameInMap("SnmpAuthPassphrase")
        public String snmpAuthPassphrase;

        // SNMP Auth Protocol
        @NameInMap("SnmpAuthProtocol")
        public String snmpAuthProtocol;

        // SNMP Community
        @NameInMap("SnmpCommunity")
        public String snmpCommunity;

        // SNMP Privacy Passphrase
        @NameInMap("SnmpPrivacyPassphrase")
        public String snmpPrivacyPassphrase;

        // SNMP Privacy Protocol
        @NameInMap("SnmpPrivacyProtocol")
        public String snmpPrivacyProtocol;

        // SNMP 安全级别
        @NameInMap("SnmpSecurityLevel")
        public String snmpSecurityLevel;

        // SNMP 用户名
        @NameInMap("SnmpUsername")
        public String snmpUsername;

        // 设备厂商
        @NameInMap("Vendor")
        public String vendor;

        public static ListDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyDevices self = new ListDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyDevices setDeviceFormId(String deviceFormId) {
            this.deviceFormId = deviceFormId;
            return this;
        }
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        public ListDevicesResponseBodyDevices setDeviceFormName(String deviceFormName) {
            this.deviceFormName = deviceFormName;
            return this;
        }
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        public ListDevicesResponseBodyDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListDevicesResponseBodyDevices setEnablePassword(String enablePassword) {
            this.enablePassword = enablePassword;
            return this;
        }
        public String getEnablePassword() {
            return this.enablePassword;
        }

        public ListDevicesResponseBodyDevices setExtAttributes(String extAttributes) {
            this.extAttributes = extAttributes;
            return this;
        }
        public String getExtAttributes() {
            return this.extAttributes;
        }

        public ListDevicesResponseBodyDevices setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDevicesResponseBodyDevices setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDevicesResponseBodyDevices setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListDevicesResponseBodyDevices setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListDevicesResponseBodyDevices setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public ListDevicesResponseBodyDevices setLoginType(String loginType) {
            this.loginType = loginType;
            return this;
        }
        public String getLoginType() {
            return this.loginType;
        }

        public ListDevicesResponseBodyDevices setLoginUsername(String loginUsername) {
            this.loginUsername = loginUsername;
            return this;
        }
        public String getLoginUsername() {
            return this.loginUsername;
        }

        public ListDevicesResponseBodyDevices setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListDevicesResponseBodyDevices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListDevicesResponseBodyDevices setPhysicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        public ListDevicesResponseBodyDevices setPhysicalSpaceName(String physicalSpaceName) {
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }
        public String getPhysicalSpaceName() {
            return this.physicalSpaceName;
        }

        public ListDevicesResponseBodyDevices setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public ListDevicesResponseBodyDevices setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListDevicesResponseBodyDevices setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListDevicesResponseBodyDevices setSnmpAccountType(String snmpAccountType) {
            this.snmpAccountType = snmpAccountType;
            return this;
        }
        public String getSnmpAccountType() {
            return this.snmpAccountType;
        }

        public ListDevicesResponseBodyDevices setSnmpAccountVersion(String snmpAccountVersion) {
            this.snmpAccountVersion = snmpAccountVersion;
            return this;
        }
        public String getSnmpAccountVersion() {
            return this.snmpAccountVersion;
        }

        public ListDevicesResponseBodyDevices setSnmpAuthPassphrase(String snmpAuthPassphrase) {
            this.snmpAuthPassphrase = snmpAuthPassphrase;
            return this;
        }
        public String getSnmpAuthPassphrase() {
            return this.snmpAuthPassphrase;
        }

        public ListDevicesResponseBodyDevices setSnmpAuthProtocol(String snmpAuthProtocol) {
            this.snmpAuthProtocol = snmpAuthProtocol;
            return this;
        }
        public String getSnmpAuthProtocol() {
            return this.snmpAuthProtocol;
        }

        public ListDevicesResponseBodyDevices setSnmpCommunity(String snmpCommunity) {
            this.snmpCommunity = snmpCommunity;
            return this;
        }
        public String getSnmpCommunity() {
            return this.snmpCommunity;
        }

        public ListDevicesResponseBodyDevices setSnmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
            this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
            return this;
        }
        public String getSnmpPrivacyPassphrase() {
            return this.snmpPrivacyPassphrase;
        }

        public ListDevicesResponseBodyDevices setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
            this.snmpPrivacyProtocol = snmpPrivacyProtocol;
            return this;
        }
        public String getSnmpPrivacyProtocol() {
            return this.snmpPrivacyProtocol;
        }

        public ListDevicesResponseBodyDevices setSnmpSecurityLevel(String snmpSecurityLevel) {
            this.snmpSecurityLevel = snmpSecurityLevel;
            return this;
        }
        public String getSnmpSecurityLevel() {
            return this.snmpSecurityLevel;
        }

        public ListDevicesResponseBodyDevices setSnmpUsername(String snmpUsername) {
            this.snmpUsername = snmpUsername;
            return this;
        }
        public String getSnmpUsername() {
            return this.snmpUsername;
        }

        public ListDevicesResponseBodyDevices setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
