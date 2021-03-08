// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDeviceRequest extends TeaModel {
    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 物理空间
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    // 主机名
    @NameInMap("HostName")
    public String hostName;

    // 设备IP
    @NameInMap("Ip")
    public String ip;

    // 设备SN
    @NameInMap("Sn")
    public String sn;

    // 设备MAC地址
    @NameInMap("Mac")
    public String mac;

    // 设备厂商
    @NameInMap("Vendor")
    public String vendor;

    // 设备型号
    @NameInMap("Model")
    public String model;

    // 设备状态
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    // 设备安全域
    @NameInMap("SecurityDomain")
    public String securityDomain;

    // 登录类型
    @NameInMap("LoginType")
    public String loginType;

    // 登录账号
    @NameInMap("LoginUsername")
    public String loginUsername;

    // 登录密码
    @NameInMap("LoginPassword")
    public String loginPassword;

    // SNMP 版本号
    @NameInMap("SnmpAccountVersion")
    public String snmpAccountVersion;

    // SNMP Community
    @NameInMap("SnmpCommunity")
    public String snmpCommunity;

    // SNMP 账号类型
    @NameInMap("SnmpAccountType")
    public String snmpAccountType;

    // SNMP 安全级别
    @NameInMap("SnmpSecurityLevel")
    public String snmpSecurityLevel;

    // SNMP 用户名
    @NameInMap("SnmpUsername")
    public String snmpUsername;

    // SNMP Auth PassPhrase
    @NameInMap("SnmpAuthPassphrase")
    public String snmpAuthPassphrase;

    // Auth Protocol
    @NameInMap("SnmpAuthProtocol")
    public String snmpAuthProtocol;

    // Privacy Passphase
    @NameInMap("SnmpPrivacyPassphase")
    public String snmpPrivacyPassphase;

    // Privacy Protocol
    @NameInMap("SnmpPrivacyProtocol")
    public String snmpPrivacyProtocol;

    // 设备额外属性
    @NameInMap("ExtAttributes")
    public String extAttributes;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

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

    public UpdateDeviceRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public UpdateDeviceRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public UpdateDeviceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public UpdateDeviceRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public UpdateDeviceRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public UpdateDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public UpdateDeviceRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateDeviceRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public UpdateDeviceRequest setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
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

    public UpdateDeviceRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public UpdateDeviceRequest setSnmpAccountVersion(String snmpAccountVersion) {
        this.snmpAccountVersion = snmpAccountVersion;
        return this;
    }
    public String getSnmpAccountVersion() {
        return this.snmpAccountVersion;
    }

    public UpdateDeviceRequest setSnmpCommunity(String snmpCommunity) {
        this.snmpCommunity = snmpCommunity;
        return this;
    }
    public String getSnmpCommunity() {
        return this.snmpCommunity;
    }

    public UpdateDeviceRequest setSnmpAccountType(String snmpAccountType) {
        this.snmpAccountType = snmpAccountType;
        return this;
    }
    public String getSnmpAccountType() {
        return this.snmpAccountType;
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

    public UpdateDeviceRequest setSnmpPrivacyPassphase(String snmpPrivacyPassphase) {
        this.snmpPrivacyPassphase = snmpPrivacyPassphase;
        return this;
    }
    public String getSnmpPrivacyPassphase() {
        return this.snmpPrivacyPassphase;
    }

    public UpdateDeviceRequest setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
        this.snmpPrivacyProtocol = snmpPrivacyProtocol;
        return this;
    }
    public String getSnmpPrivacyProtocol() {
        return this.snmpPrivacyProtocol;
    }

    public UpdateDeviceRequest setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
        return this;
    }
    public String getExtAttributes() {
        return this.extAttributes;
    }

    public UpdateDeviceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
