// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDevicesShrinkRequest extends TeaModel {
    @NameInMap("DeviceIds")
    public String deviceIdsShrink;

    @NameInMap("EnablePassword")
    public String enablePassword;

    @NameInMap("ExtAttributes")
    public String extAttributes;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LoginPassword")
    public String loginPassword;

    @NameInMap("LoginType")
    public String loginType;

    @NameInMap("LoginUsername")
    public String loginUsername;

    @NameInMap("Model")
    public String model;

    @NameInMap("PhysicalSpaceId")
    public String physicalSpaceId;

    @NameInMap("PhysicalSpaceName")
    public String physicalSpaceName;

    @NameInMap("SecurityDomain")
    public String securityDomain;

    @NameInMap("ServiceStatus")
    public String serviceStatus;

    @NameInMap("SnmpAccountType")
    public String snmpAccountType;

    @NameInMap("SnmpAccountVersion")
    public String snmpAccountVersion;

    @NameInMap("SnmpAuthPassphrase")
    public String snmpAuthPassphrase;

    @NameInMap("SnmpAuthProtocol")
    public String snmpAuthProtocol;

    @NameInMap("SnmpCommunity")
    public String snmpCommunity;

    @NameInMap("SnmpPrivacyPassphrase")
    public String snmpPrivacyPassphrase;

    @NameInMap("SnmpPrivacyProtocol")
    public String snmpPrivacyProtocol;

    @NameInMap("SnmpSecurityLevel")
    public String snmpSecurityLevel;

    @NameInMap("SnmpUsername")
    public String snmpUsername;

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

    public UpdateDevicesShrinkRequest setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
        return this;
    }
    public String getExtAttributes() {
        return this.extAttributes;
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

    public UpdateDevicesShrinkRequest setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
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
