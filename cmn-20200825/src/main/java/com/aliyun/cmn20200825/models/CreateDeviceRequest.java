// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDeviceRequest extends TeaModel {
    // 设备形态ID
    @NameInMap("DeviceFormId")
    public String deviceFormId;

    // 物理空间ID
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

    // SNMP Auth Protocol
    @NameInMap("SnmpAuthProtocol")
    public String snmpAuthProtocol;

    // SNMP Privacy Passphase
    @NameInMap("SnmpPrivacyPassphase")
    public String snmpPrivacyPassphase;

    // SNMP Privacy Protocol
    @NameInMap("SnmpPrivacyProtocol")
    public String snmpPrivacyProtocol;

    // 设备额外属性
    @NameInMap("ExtAttributes")
    public String extAttributes;

    // 幂等校验 token
    @NameInMap("ClientToken")
    public String clientToken;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceRequest self = new CreateDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public CreateDeviceRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public CreateDeviceRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateDeviceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateDeviceRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public CreateDeviceRequest setMac(String mac) {
        this.mac = mac;
        return this;
    }
    public String getMac() {
        return this.mac;
    }

    public CreateDeviceRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public CreateDeviceRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateDeviceRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public CreateDeviceRequest setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    public CreateDeviceRequest setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public CreateDeviceRequest setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
        return this;
    }
    public String getLoginUsername() {
        return this.loginUsername;
    }

    public CreateDeviceRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public CreateDeviceRequest setSnmpAccountVersion(String snmpAccountVersion) {
        this.snmpAccountVersion = snmpAccountVersion;
        return this;
    }
    public String getSnmpAccountVersion() {
        return this.snmpAccountVersion;
    }

    public CreateDeviceRequest setSnmpCommunity(String snmpCommunity) {
        this.snmpCommunity = snmpCommunity;
        return this;
    }
    public String getSnmpCommunity() {
        return this.snmpCommunity;
    }

    public CreateDeviceRequest setSnmpAccountType(String snmpAccountType) {
        this.snmpAccountType = snmpAccountType;
        return this;
    }
    public String getSnmpAccountType() {
        return this.snmpAccountType;
    }

    public CreateDeviceRequest setSnmpSecurityLevel(String snmpSecurityLevel) {
        this.snmpSecurityLevel = snmpSecurityLevel;
        return this;
    }
    public String getSnmpSecurityLevel() {
        return this.snmpSecurityLevel;
    }

    public CreateDeviceRequest setSnmpUsername(String snmpUsername) {
        this.snmpUsername = snmpUsername;
        return this;
    }
    public String getSnmpUsername() {
        return this.snmpUsername;
    }

    public CreateDeviceRequest setSnmpAuthPassphrase(String snmpAuthPassphrase) {
        this.snmpAuthPassphrase = snmpAuthPassphrase;
        return this;
    }
    public String getSnmpAuthPassphrase() {
        return this.snmpAuthPassphrase;
    }

    public CreateDeviceRequest setSnmpAuthProtocol(String snmpAuthProtocol) {
        this.snmpAuthProtocol = snmpAuthProtocol;
        return this;
    }
    public String getSnmpAuthProtocol() {
        return this.snmpAuthProtocol;
    }

    public CreateDeviceRequest setSnmpPrivacyPassphase(String snmpPrivacyPassphase) {
        this.snmpPrivacyPassphase = snmpPrivacyPassphase;
        return this;
    }
    public String getSnmpPrivacyPassphase() {
        return this.snmpPrivacyPassphase;
    }

    public CreateDeviceRequest setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
        this.snmpPrivacyProtocol = snmpPrivacyProtocol;
        return this;
    }
    public String getSnmpPrivacyProtocol() {
        return this.snmpPrivacyProtocol;
    }

    public CreateDeviceRequest setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
        return this;
    }
    public String getExtAttributes() {
        return this.extAttributes;
    }

    public CreateDeviceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDeviceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
