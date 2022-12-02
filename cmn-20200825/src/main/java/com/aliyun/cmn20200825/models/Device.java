// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Device extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AccountVersion")
    public String accountVersion;

    @NameInMap("AuthPassPhrase")
    public String authPassPhrase;

    @NameInMap("AuthProtocol")
    public String authProtocol;

    @NameInMap("Community")
    public String community;

    @NameInMap("DeviceForm")
    public String deviceForm;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DeviceIp")
    public String deviceIp;

    @NameInMap("DeviceMac")
    public String deviceMac;

    @NameInMap("DeviceSn")
    public String deviceSn;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("Model")
    public String model;

    @NameInMap("PrivacyPassPhrase")
    public String privacyPassPhrase;

    @NameInMap("PrivacyProtocol")
    public String privacyProtocol;

    @NameInMap("SecurityDomain")
    public String securityDomain;

    @NameInMap("SecurityLevel")
    public String securityLevel;

    @NameInMap("Space")
    public String space;

    @NameInMap("SshAccount")
    public String sshAccount;

    @NameInMap("SshPassword")
    public String sshPassword;

    @NameInMap("Status")
    public String status;

    @NameInMap("TelnetAccount")
    public String telnetAccount;

    @NameInMap("TelnetPassword")
    public String telnetPassword;

    @NameInMap("UserName")
    public String userName;

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
