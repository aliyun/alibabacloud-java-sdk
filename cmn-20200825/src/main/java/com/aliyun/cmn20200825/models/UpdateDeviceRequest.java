// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceRequest extends TeaModel {
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

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>设备IP</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>设备TELNET账号</p>
     */
    @NameInMap("LoginPassword")
    public String loginPassword;

    /**
     * <p>设备SSH登录账号</p>
     */
    @NameInMap("LoginType")
    public String loginType;

    /**
     * <p>设备SSH登录密码</p>
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
     * <p>物理空间</p>
     */
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

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
     * <p>账号类型</p>
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
     * <p>Auth Protocol</p>
     */
    @NameInMap("SnmpAuthProtocol")
    public String snmpAuthProtocol;

    /**
     * <p>SNMP Community</p>
     */
    @NameInMap("SnmpCommunity")
    public String snmpCommunity;

    /**
     * <p>Privacy Passphase</p>
     */
    @NameInMap("SnmpPrivacyPassphrase")
    public String snmpPrivacyPassphrase;

    /**
     * <p>Privacy Protocol</p>
     */
    @NameInMap("SnmpPrivacyProtocol")
    public String snmpPrivacyProtocol;

    /**
     * <p>安全级别</p>
     */
    @NameInMap("SnmpSecurityLevel")
    public String snmpSecurityLevel;

    /**
     * <p>用户名</p>
     */
    @NameInMap("SnmpUsername")
    public String snmpUsername;

    /**
     * <p>设备厂商</p>
     */
    @NameInMap("Vendor")
    public String vendor;

    public static UpdateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceRequest self = new UpdateDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateDeviceRequest setEnablePassword(String enablePassword) {
        this.enablePassword = enablePassword;
        return this;
    }
    public String getEnablePassword() {
        return this.enablePassword;
    }

    public UpdateDeviceRequest setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
        return this;
    }
    public String getExtAttributes() {
        return this.extAttributes;
    }

    public UpdateDeviceRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public UpdateDeviceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDeviceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public UpdateDeviceRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public UpdateDeviceRequest setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public UpdateDeviceRequest setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
        return this;
    }
    public String getLoginUsername() {
        return this.loginUsername;
    }

    public UpdateDeviceRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public UpdateDeviceRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateDeviceRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public UpdateDeviceRequest setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    public UpdateDeviceRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public UpdateDeviceRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public UpdateDeviceRequest setSnmpAccountType(String snmpAccountType) {
        this.snmpAccountType = snmpAccountType;
        return this;
    }
    public String getSnmpAccountType() {
        return this.snmpAccountType;
    }

    public UpdateDeviceRequest setSnmpAccountVersion(String snmpAccountVersion) {
        this.snmpAccountVersion = snmpAccountVersion;
        return this;
    }
    public String getSnmpAccountVersion() {
        return this.snmpAccountVersion;
    }

    public UpdateDeviceRequest setSnmpAuthPassphrase(String snmpAuthPassphrase) {
        this.snmpAuthPassphrase = snmpAuthPassphrase;
        return this;
    }
    public String getSnmpAuthPassphrase() {
        return this.snmpAuthPassphrase;
    }

    public UpdateDeviceRequest setSnmpAuthProtocol(String snmpAuthProtocol) {
        this.snmpAuthProtocol = snmpAuthProtocol;
        return this;
    }
    public String getSnmpAuthProtocol() {
        return this.snmpAuthProtocol;
    }

    public UpdateDeviceRequest setSnmpCommunity(String snmpCommunity) {
        this.snmpCommunity = snmpCommunity;
        return this;
    }
    public String getSnmpCommunity() {
        return this.snmpCommunity;
    }

    public UpdateDeviceRequest setSnmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
        this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
        return this;
    }
    public String getSnmpPrivacyPassphrase() {
        return this.snmpPrivacyPassphrase;
    }

    public UpdateDeviceRequest setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
        this.snmpPrivacyProtocol = snmpPrivacyProtocol;
        return this;
    }
    public String getSnmpPrivacyProtocol() {
        return this.snmpPrivacyProtocol;
    }

    public UpdateDeviceRequest setSnmpSecurityLevel(String snmpSecurityLevel) {
        this.snmpSecurityLevel = snmpSecurityLevel;
        return this;
    }
    public String getSnmpSecurityLevel() {
        return this.snmpSecurityLevel;
    }

    public UpdateDeviceRequest setSnmpUsername(String snmpUsername) {
        this.snmpUsername = snmpUsername;
        return this;
    }
    public String getSnmpUsername() {
        return this.snmpUsername;
    }

    public UpdateDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
