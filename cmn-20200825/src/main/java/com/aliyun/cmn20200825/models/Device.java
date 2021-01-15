// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Device extends TeaModel {
    // 账号类型
    @NameInMap("AccountType")
    public String accountType;

    // snmp版本号
    @NameInMap("AccountVersion")
    public String accountVersion;

    // Auth PassPhrase
    @NameInMap("AuthPassPhrase")
    public String authPassPhrase;

    // Auth Protocol
    @NameInMap("AuthProtocol")
    public String authProtocol;

    // community
    @NameInMap("Community")
    public String community;

    // 设备形态
    @NameInMap("DeviceForm")
    public String deviceForm;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 设备IP
    @NameInMap("DeviceIp")
    public String deviceIp;

    // 设备MAC地址
    @NameInMap("DeviceMac")
    public String deviceMac;

    // 设备SN
    @NameInMap("DeviceSn")
    public String deviceSn;

    // 主机名
    @NameInMap("Hostname")
    public String hostname;

    // 设备型号
    @NameInMap("Model")
    public String model;

    // Privacy PassPhrase
    @NameInMap("PrivacyPassPhrase")
    public String privacyPassPhrase;

    // Privacy Protocol
    @NameInMap("PrivacyProtocol")
    public String privacyProtocol;

    // 设备安全域
    @NameInMap("SecurityDomain")
    public String securityDomain;

    // 安全等级
    @NameInMap("SecurityLevel")
    public String securityLevel;

    // 设备所属物理空间
    @NameInMap("Space")
    public String space;

    // SSH登录账号
    @NameInMap("SshAccount")
    public String sshAccount;

    // SSH登录密码
    @NameInMap("SshPassword")
    public String sshPassword;

    // 设备状态
    @NameInMap("Status")
    public String status;

    // TELNET登录账号
    @NameInMap("TelnetAccount")
    public String telnetAccount;

    // TELNET登录密码
    @NameInMap("TelnetPassword")
    public String telnetPassword;

    // 用户名
    @NameInMap("UserName")
    public String userName;

    // 设备厂商
    @NameInMap("Vendor")
    public String vendor;

    public static Device build(java.util.Map<String, ?> map) throws Exception {
        Device self = new Device();
        return TeaModel.build(map, self);
    }

    public Device setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public Device setAccountVersion(String accountVersion) {
        this.accountVersion = accountVersion;
        return this;
    }
    public String getAccountVersion() {
        return this.accountVersion;
    }

    public Device setAuthPassPhrase(String authPassPhrase) {
        this.authPassPhrase = authPassPhrase;
        return this;
    }
    public String getAuthPassPhrase() {
        return this.authPassPhrase;
    }

    public Device setAuthProtocol(String authProtocol) {
        this.authProtocol = authProtocol;
        return this;
    }
    public String getAuthProtocol() {
        return this.authProtocol;
    }

    public Device setCommunity(String community) {
        this.community = community;
        return this;
    }
    public String getCommunity() {
        return this.community;
    }

    public Device setDeviceForm(String deviceForm) {
        this.deviceForm = deviceForm;
        return this;
    }
    public String getDeviceForm() {
        return this.deviceForm;
    }

    public Device setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public Device setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
        return this;
    }
    public String getDeviceIp() {
        return this.deviceIp;
    }

    public Device setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
        return this;
    }
    public String getDeviceMac() {
        return this.deviceMac;
    }

    public Device setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public Device setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public Device setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public Device setPrivacyPassPhrase(String privacyPassPhrase) {
        this.privacyPassPhrase = privacyPassPhrase;
        return this;
    }
    public String getPrivacyPassPhrase() {
        return this.privacyPassPhrase;
    }

    public Device setPrivacyProtocol(String privacyProtocol) {
        this.privacyProtocol = privacyProtocol;
        return this;
    }
    public String getPrivacyProtocol() {
        return this.privacyProtocol;
    }

    public Device setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    public Device setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    public Device setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public Device setSshAccount(String sshAccount) {
        this.sshAccount = sshAccount;
        return this;
    }
    public String getSshAccount() {
        return this.sshAccount;
    }

    public Device setSshPassword(String sshPassword) {
        this.sshPassword = sshPassword;
        return this;
    }
    public String getSshPassword() {
        return this.sshPassword;
    }

    public Device setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Device setTelnetAccount(String telnetAccount) {
        this.telnetAccount = telnetAccount;
        return this;
    }
    public String getTelnetAccount() {
        return this.telnetAccount;
    }

    public Device setTelnetPassword(String telnetPassword) {
        this.telnetPassword = telnetPassword;
        return this;
    }
    public String getTelnetPassword() {
        return this.telnetPassword;
    }

    public Device setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public Device setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
