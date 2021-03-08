// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDevicesRequest extends TeaModel {
    // 设备ID
    @NameInMap("DeviceIds")
    public java.util.List<String> deviceIds;

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
    @NameInMap("SnmpUserName")
    public String snmpUserName;

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

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicesRequest self = new UpdateDevicesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevicesRequest setDeviceIds(java.util.List<String> deviceIds) {
        this.deviceIds = deviceIds;
        return this;
    }
    public java.util.List<String> getDeviceIds() {
        return this.deviceIds;
    }

    public UpdateDevicesRequest setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public UpdateDevicesRequest setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
        return this;
    }
    public String getLoginUsername() {
        return this.loginUsername;
    }

    public UpdateDevicesRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public UpdateDevicesRequest setSnmpAccountVersion(String snmpAccountVersion) {
        this.snmpAccountVersion = snmpAccountVersion;
        return this;
    }
    public String getSnmpAccountVersion() {
        return this.snmpAccountVersion;
    }

    public UpdateDevicesRequest setSnmpCommunity(String snmpCommunity) {
        this.snmpCommunity = snmpCommunity;
        return this;
    }
    public String getSnmpCommunity() {
        return this.snmpCommunity;
    }

    public UpdateDevicesRequest setSnmpAccountType(String snmpAccountType) {
        this.snmpAccountType = snmpAccountType;
        return this;
    }
    public String getSnmpAccountType() {
        return this.snmpAccountType;
    }

    public UpdateDevicesRequest setSnmpSecurityLevel(String snmpSecurityLevel) {
        this.snmpSecurityLevel = snmpSecurityLevel;
        return this;
    }
    public String getSnmpSecurityLevel() {
        return this.snmpSecurityLevel;
    }

    public UpdateDevicesRequest setSnmpUserName(String snmpUserName) {
        this.snmpUserName = snmpUserName;
        return this;
    }
    public String getSnmpUserName() {
        return this.snmpUserName;
    }

    public UpdateDevicesRequest setSnmpAuthPassphrase(String snmpAuthPassphrase) {
        this.snmpAuthPassphrase = snmpAuthPassphrase;
        return this;
    }
    public String getSnmpAuthPassphrase() {
        return this.snmpAuthPassphrase;
    }

    public UpdateDevicesRequest setSnmpAuthProtocol(String snmpAuthProtocol) {
        this.snmpAuthProtocol = snmpAuthProtocol;
        return this;
    }
    public String getSnmpAuthProtocol() {
        return this.snmpAuthProtocol;
    }

    public UpdateDevicesRequest setSnmpPrivacyPassphase(String snmpPrivacyPassphase) {
        this.snmpPrivacyPassphase = snmpPrivacyPassphase;
        return this;
    }
    public String getSnmpPrivacyPassphase() {
        return this.snmpPrivacyPassphase;
    }

    public UpdateDevicesRequest setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
        this.snmpPrivacyProtocol = snmpPrivacyProtocol;
        return this;
    }
    public String getSnmpPrivacyProtocol() {
        return this.snmpPrivacyProtocol;
    }

    public UpdateDevicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
