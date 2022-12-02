// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDevicesRequest extends TeaModel {
    @NameInMap("DeviceIds")
    public java.util.List<String> deviceIds;

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

    public UpdateDevicesRequest setEnablePassword(String enablePassword) {
        this.enablePassword = enablePassword;
        return this;
    }
    public String getEnablePassword() {
        return this.enablePassword;
    }

    public UpdateDevicesRequest setExtAttributes(String extAttributes) {
        this.extAttributes = extAttributes;
        return this;
    }
    public String getExtAttributes() {
        return this.extAttributes;
    }

    public UpdateDevicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDevicesRequest setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
        return this;
    }
    public String getLoginPassword() {
        return this.loginPassword;
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

    public UpdateDevicesRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateDevicesRequest setPhysicalSpaceId(String physicalSpaceId) {
        this.physicalSpaceId = physicalSpaceId;
        return this;
    }
    public String getPhysicalSpaceId() {
        return this.physicalSpaceId;
    }

    public UpdateDevicesRequest setPhysicalSpaceName(String physicalSpaceName) {
        this.physicalSpaceName = physicalSpaceName;
        return this;
    }
    public String getPhysicalSpaceName() {
        return this.physicalSpaceName;
    }

    public UpdateDevicesRequest setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    public UpdateDevicesRequest setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    public UpdateDevicesRequest setSnmpAccountType(String snmpAccountType) {
        this.snmpAccountType = snmpAccountType;
        return this;
    }
    public String getSnmpAccountType() {
        return this.snmpAccountType;
    }

    public UpdateDevicesRequest setSnmpAccountVersion(String snmpAccountVersion) {
        this.snmpAccountVersion = snmpAccountVersion;
        return this;
    }
    public String getSnmpAccountVersion() {
        return this.snmpAccountVersion;
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

    public UpdateDevicesRequest setSnmpCommunity(String snmpCommunity) {
        this.snmpCommunity = snmpCommunity;
        return this;
    }
    public String getSnmpCommunity() {
        return this.snmpCommunity;
    }

    public UpdateDevicesRequest setSnmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
        this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
        return this;
    }
    public String getSnmpPrivacyPassphrase() {
        return this.snmpPrivacyPassphrase;
    }

    public UpdateDevicesRequest setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
        this.snmpPrivacyProtocol = snmpPrivacyProtocol;
        return this;
    }
    public String getSnmpPrivacyProtocol() {
        return this.snmpPrivacyProtocol;
    }

    public UpdateDevicesRequest setSnmpSecurityLevel(String snmpSecurityLevel) {
        this.snmpSecurityLevel = snmpSecurityLevel;
        return this;
    }
    public String getSnmpSecurityLevel() {
        return this.snmpSecurityLevel;
    }

    public UpdateDevicesRequest setSnmpUsername(String snmpUsername) {
        this.snmpUsername = snmpUsername;
        return this;
    }
    public String getSnmpUsername() {
        return this.snmpUsername;
    }

    public UpdateDevicesRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
