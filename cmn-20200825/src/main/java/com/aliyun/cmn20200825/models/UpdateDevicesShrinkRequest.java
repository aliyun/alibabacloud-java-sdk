// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDevicesShrinkRequest extends TeaModel {
    // 设备ID
    @NameInMap("DeviceIds")
    public String deviceIdsShrink;

    // enable密码
    @NameInMap("EnablePassword")
    public String enablePassword;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 登录密码
    @NameInMap("LoginPassword")
    public String loginPassword;

    // 登录类型
    @NameInMap("LoginType")
    public String loginType;

    // 登录账号
    @NameInMap("LoginUsername")
    public String loginUsername;

    // 型号
    @NameInMap("Model")
    public String model;

    // 物理空间id
    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    // 物理空间名称
    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    // 服务状态
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    // SNMP 账号类型
    @NameInMap("SnmpAccountType")
    public String snmpAccountType;

    // SNMP 版本号
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

    // 厂商
    @NameInMap("Vendor")
    public String vendor;

    public static UpdateDevicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDevicesShrinkRequest self = new UpdateDevicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDevicesShrinkRequest setDeviceIdsShrink(String deviceIdsShrink) {
        this.deviceIdsShrink = deviceIdsShrink;
        return this;
    }
    public String getDeviceIdsShrink() {
        return this.deviceIdsShrink;
    }

    public UpdateDevicesShrinkRequest setEnablePassword(String enablePassword) {
        this.enablePassword = enablePassword;
        return this;
    }
    public String getEnablePassword() {
        return this.enablePassword;
    }

    public UpdateDevicesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDevicesShrinkRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
    }

    public UpdateDevicesShrinkRequest setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public UpdateDevicesShrinkRequest setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
        return this;
    }
    public String getLoginUsername() {
        return this.loginUsername;
    }

    public UpdateDevicesShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateDevicesShrinkRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public UpdateDevicesShrinkRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public UpdateDevicesShrinkRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public UpdateDevicesShrinkRequest setSnmpAccountType(String snmpAccountType) {
        this.snmpAccountType = snmpAccountType;
        return this;
    }
    public String getSnmpAccountType() {
        return this.snmpAccountType;
    }

    public UpdateDevicesShrinkRequest setSnmpAccountVersion(String snmpAccountVersion) {
        this.snmpAccountVersion = snmpAccountVersion;
        return this;
    }
    public String getSnmpAccountVersion() {
        return this.snmpAccountVersion;
    }

    public UpdateDevicesShrinkRequest setSnmpAuthPassphrase(String snmpAuthPassphrase) {
        this.snmpAuthPassphrase = snmpAuthPassphrase;
        return this;
    }
    public String getSnmpAuthPassphrase() {
        return this.snmpAuthPassphrase;
    }

    public UpdateDevicesShrinkRequest setSnmpAuthProtocol(String snmpAuthProtocol) {
        this.snmpAuthProtocol = snmpAuthProtocol;
        return this;
    }
    public String getSnmpAuthProtocol() {
        return this.snmpAuthProtocol;
    }

    public UpdateDevicesShrinkRequest setSnmpCommunity(String snmpCommunity) {
        this.snmpCommunity = snmpCommunity;
        return this;
    }
    public String getSnmpCommunity() {
        return this.snmpCommunity;
    }

    public UpdateDevicesShrinkRequest setSnmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
        this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
        return this;
    }
    public String getSnmpPrivacyPassphrase() {
        return this.snmpPrivacyPassphrase;
    }

    public UpdateDevicesShrinkRequest setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
        this.snmpPrivacyProtocol = snmpPrivacyProtocol;
        return this;
    }
    public String getSnmpPrivacyProtocol() {
        return this.snmpPrivacyProtocol;
    }

    public UpdateDevicesShrinkRequest setSnmpSecurityLevel(String snmpSecurityLevel) {
        this.snmpSecurityLevel = snmpSecurityLevel;
        return this;
    }
    public String getSnmpSecurityLevel() {
        return this.snmpSecurityLevel;
    }

    public UpdateDevicesShrinkRequest setSnmpUsername(String snmpUsername) {
        this.snmpUsername = snmpUsername;
        return this;
    }
    public String getSnmpUsername() {
        return this.snmpUsername;
    }

    public UpdateDevicesShrinkRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
