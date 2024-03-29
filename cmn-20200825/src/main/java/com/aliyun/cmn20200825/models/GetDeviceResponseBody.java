// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetDeviceResponseBody extends TeaModel {
    @NameInMap("Device")
    public GetDeviceResponseBodyDevice device;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceResponseBody self = new GetDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceResponseBody setDevice(GetDeviceResponseBodyDevice device) {
        this.device = device;
        return this;
    }
    public GetDeviceResponseBodyDevice getDevice() {
        return this.device;
    }

    public GetDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceResponseBodyDevice extends TeaModel {
        @NameInMap("DeviceFormId")
        public String deviceFormId;

        @NameInMap("DeviceFormName")
        public String deviceFormName;

        /**
         * <p>设备ID</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("EnablePassword")
        public String enablePassword;

        /**
         * <p>设备额外属性(JSON)</p>
         */
        @NameInMap("ExtAttributes")
        public String extAttributes;

        /**
         * <p>主机名</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>设备IP</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>登录账号</p>
         */
        @NameInMap("LoginPassword")
        public String loginPassword;

        /**
         * <p>登录类型，SSH或者TELNET</p>
         */
        @NameInMap("LoginType")
        public String loginType;

        /**
         * <p>登录账号</p>
         */
        @NameInMap("LoginUsername")
        public String loginUsername;

        /**
         * <p>设备MAC地址</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <p>设备型号</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>物理空间ID</p>
         */
        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

        /**
         * <p>物理空间名称</p>
         */
        @NameInMap("PhysicalSpaceName")
        public String physicalSpaceName;

        /**
         * <p>设备安全域</p>
         */
        @NameInMap("SecurityDomain")
        public String securityDomain;

        /**
         * <p>设备状态</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        /**
         * <p>设备SN</p>
         */
        @NameInMap("Sn")
        public String sn;

        /**
         * <p>SNMP 账号类型</p>
         */
        @NameInMap("SnmpAccountType")
        public String snmpAccountType;

        /**
         * <p>SNMP版本号</p>
         */
        @NameInMap("SnmpAccountVersion")
        public String snmpAccountVersion;

        /**
         * <p>SNMP Auth PassPhrase</p>
         */
        @NameInMap("SnmpAuthPassphrase")
        public String snmpAuthPassphrase;

        /**
         * <p>SNMP Auth Protocol</p>
         */
        @NameInMap("SnmpAuthProtocol")
        public String snmpAuthProtocol;

        /**
         * <p>SNMP Community</p>
         */
        @NameInMap("SnmpCommunity")
        public String snmpCommunity;

        /**
         * <p>SNMP Privacy Passphrase</p>
         */
        @NameInMap("SnmpPrivacyPassphrase")
        public String snmpPrivacyPassphrase;

        /**
         * <p>SNMP Privacy Protocol</p>
         */
        @NameInMap("SnmpPrivacyProtocol")
        public String snmpPrivacyProtocol;

        /**
         * <p>SNMP 安全级别</p>
         */
        @NameInMap("SnmpSecurityLevel")
        public String snmpSecurityLevel;

        /**
         * <p>SNMP 用户名</p>
         */
        @NameInMap("SnmpUsername")
        public String snmpUsername;

        /**
         * <p>设备厂商</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        public static GetDeviceResponseBodyDevice build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceResponseBodyDevice self = new GetDeviceResponseBodyDevice();
            return TeaModel.build(map, self);
        }

        public GetDeviceResponseBodyDevice setDeviceFormId(String deviceFormId) {
            this.deviceFormId = deviceFormId;
            return this;
        }
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        public GetDeviceResponseBodyDevice setDeviceFormName(String deviceFormName) {
            this.deviceFormName = deviceFormName;
            return this;
        }
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        public GetDeviceResponseBodyDevice setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetDeviceResponseBodyDevice setEnablePassword(String enablePassword) {
            this.enablePassword = enablePassword;
            return this;
        }
        public String getEnablePassword() {
            return this.enablePassword;
        }

        public GetDeviceResponseBodyDevice setExtAttributes(String extAttributes) {
            this.extAttributes = extAttributes;
            return this;
        }
        public String getExtAttributes() {
            return this.extAttributes;
        }

        public GetDeviceResponseBodyDevice setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetDeviceResponseBodyDevice setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetDeviceResponseBodyDevice setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public GetDeviceResponseBodyDevice setLoginType(String loginType) {
            this.loginType = loginType;
            return this;
        }
        public String getLoginType() {
            return this.loginType;
        }

        public GetDeviceResponseBodyDevice setLoginUsername(String loginUsername) {
            this.loginUsername = loginUsername;
            return this;
        }
        public String getLoginUsername() {
            return this.loginUsername;
        }

        public GetDeviceResponseBodyDevice setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public GetDeviceResponseBodyDevice setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetDeviceResponseBodyDevice setPhysicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        public GetDeviceResponseBodyDevice setPhysicalSpaceName(String physicalSpaceName) {
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }
        public String getPhysicalSpaceName() {
            return this.physicalSpaceName;
        }

        public GetDeviceResponseBodyDevice setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public GetDeviceResponseBodyDevice setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public GetDeviceResponseBodyDevice setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public GetDeviceResponseBodyDevice setSnmpAccountType(String snmpAccountType) {
            this.snmpAccountType = snmpAccountType;
            return this;
        }
        public String getSnmpAccountType() {
            return this.snmpAccountType;
        }

        public GetDeviceResponseBodyDevice setSnmpAccountVersion(String snmpAccountVersion) {
            this.snmpAccountVersion = snmpAccountVersion;
            return this;
        }
        public String getSnmpAccountVersion() {
            return this.snmpAccountVersion;
        }

        public GetDeviceResponseBodyDevice setSnmpAuthPassphrase(String snmpAuthPassphrase) {
            this.snmpAuthPassphrase = snmpAuthPassphrase;
            return this;
        }
        public String getSnmpAuthPassphrase() {
            return this.snmpAuthPassphrase;
        }

        public GetDeviceResponseBodyDevice setSnmpAuthProtocol(String snmpAuthProtocol) {
            this.snmpAuthProtocol = snmpAuthProtocol;
            return this;
        }
        public String getSnmpAuthProtocol() {
            return this.snmpAuthProtocol;
        }

        public GetDeviceResponseBodyDevice setSnmpCommunity(String snmpCommunity) {
            this.snmpCommunity = snmpCommunity;
            return this;
        }
        public String getSnmpCommunity() {
            return this.snmpCommunity;
        }

        public GetDeviceResponseBodyDevice setSnmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
            this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
            return this;
        }
        public String getSnmpPrivacyPassphrase() {
            return this.snmpPrivacyPassphrase;
        }

        public GetDeviceResponseBodyDevice setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
            this.snmpPrivacyProtocol = snmpPrivacyProtocol;
            return this;
        }
        public String getSnmpPrivacyProtocol() {
            return this.snmpPrivacyProtocol;
        }

        public GetDeviceResponseBodyDevice setSnmpSecurityLevel(String snmpSecurityLevel) {
            this.snmpSecurityLevel = snmpSecurityLevel;
            return this;
        }
        public String getSnmpSecurityLevel() {
            return this.snmpSecurityLevel;
        }

        public GetDeviceResponseBodyDevice setSnmpUsername(String snmpUsername) {
            this.snmpUsername = snmpUsername;
            return this;
        }
        public String getSnmpUsername() {
            return this.snmpUsername;
        }

        public GetDeviceResponseBodyDevice setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
