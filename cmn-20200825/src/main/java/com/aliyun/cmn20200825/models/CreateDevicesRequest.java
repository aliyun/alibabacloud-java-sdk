// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDevicesRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DeviceFormId")
    public String deviceFormId;

    @NameInMap("DeviceParamModelList")
    public java.util.List<CreateDevicesRequestDeviceParamModelList> deviceParamModelList;

    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicesRequest self = new CreateDevicesRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevicesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDevicesRequest setDeviceFormId(String deviceFormId) {
        this.deviceFormId = deviceFormId;
        return this;
    }
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    public CreateDevicesRequest setDeviceParamModelList(java.util.List<CreateDevicesRequestDeviceParamModelList> deviceParamModelList) {
        this.deviceParamModelList = deviceParamModelList;
        return this;
    }
    public java.util.List<CreateDevicesRequestDeviceParamModelList> getDeviceParamModelList() {
        return this.deviceParamModelList;
    }

    public CreateDevicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public static class CreateDevicesRequestDeviceParamModelList extends TeaModel {
        @NameInMap("EnablePassword")
        public String enablePassword;

        @NameInMap("ExtAttributes")
        public String extAttributes;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("LoginPassword")
        public String loginPassword;

        @NameInMap("LoginType")
        public String loginType;

        @NameInMap("LoginUsername")
        public String loginUsername;

        @NameInMap("Mac")
        public String mac;

        @NameInMap("Model")
        public String model;

        @NameInMap("PhysicalSpaceName")
        public String physicalSpaceName;

        @NameInMap("SecurityDomain")
        public String securityDomain;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("Sn")
        public String sn;

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

        public static CreateDevicesRequestDeviceParamModelList build(java.util.Map<String, ?> map) throws Exception {
            CreateDevicesRequestDeviceParamModelList self = new CreateDevicesRequestDeviceParamModelList();
            return TeaModel.build(map, self);
        }

        public CreateDevicesRequestDeviceParamModelList setEnablePassword(String enablePassword) {
            this.enablePassword = enablePassword;
            return this;
        }
        public String getEnablePassword() {
            return this.enablePassword;
        }

        public CreateDevicesRequestDeviceParamModelList setExtAttributes(String extAttributes) {
            this.extAttributes = extAttributes;
            return this;
        }
        public String getExtAttributes() {
            return this.extAttributes;
        }

        public CreateDevicesRequestDeviceParamModelList setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public CreateDevicesRequestDeviceParamModelList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public CreateDevicesRequestDeviceParamModelList setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public CreateDevicesRequestDeviceParamModelList setLoginType(String loginType) {
            this.loginType = loginType;
            return this;
        }
        public String getLoginType() {
            return this.loginType;
        }

        public CreateDevicesRequestDeviceParamModelList setLoginUsername(String loginUsername) {
            this.loginUsername = loginUsername;
            return this;
        }
        public String getLoginUsername() {
            return this.loginUsername;
        }

        public CreateDevicesRequestDeviceParamModelList setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public CreateDevicesRequestDeviceParamModelList setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateDevicesRequestDeviceParamModelList setPhysicalSpaceName(String physicalSpaceName) {
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }
        public String getPhysicalSpaceName() {
            return this.physicalSpaceName;
        }

        public CreateDevicesRequestDeviceParamModelList setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public CreateDevicesRequestDeviceParamModelList setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public CreateDevicesRequestDeviceParamModelList setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public CreateDevicesRequestDeviceParamModelList setSnmpAccountType(String snmpAccountType) {
            this.snmpAccountType = snmpAccountType;
            return this;
        }
        public String getSnmpAccountType() {
            return this.snmpAccountType;
        }

        public CreateDevicesRequestDeviceParamModelList setSnmpAccountVersion(String snmpAccountVersion) {
            this.snmpAccountVersion = snmpAccountVersion;
            return this;
        }
        public String getSnmpAccountVersion() {
            return this.snmpAccountVersion;
        }

        public CreateDevicesRequestDeviceParamModelList setSnmpAuthPassphrase(String snmpAuthPassphrase) {
            this.snmpAuthPassphrase = snmpAuthPassphrase;
            return this;
        }
        public String getSnmpAuthPassphrase() {
            return this.snmpAuthPassphrase;
        }

        public CreateDevicesRequestDeviceParamModelList setSnmpAuthProtocol(String snmpAuthProtocol) {
            this.snmpAuthProtocol = snmpAuthProtocol;
            return this;
        }
        public String getSnmpAuthProtocol() {
            return this.snmpAuthProtocol;
        }

        public CreateDevicesRequestDeviceParamModelList setSnmpCommunity(String snmpCommunity) {
            this.snmpCommunity = snmpCommunity;
            return this;
        }
        public String getSnmpCommunity() {
            return this.snmpCommunity;
        }

        public CreateDevicesRequestDeviceParamModelList setSnmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
            this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
            return this;
        }
        public String getSnmpPrivacyPassphrase() {
            return this.snmpPrivacyPassphrase;
        }

        public CreateDevicesRequestDeviceParamModelList setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
            this.snmpPrivacyProtocol = snmpPrivacyProtocol;
            return this;
        }
        public String getSnmpPrivacyProtocol() {
            return this.snmpPrivacyProtocol;
        }

        public CreateDevicesRequestDeviceParamModelList setSnmpSecurityLevel(String snmpSecurityLevel) {
            this.snmpSecurityLevel = snmpSecurityLevel;
            return this;
        }
        public String getSnmpSecurityLevel() {
            return this.snmpSecurityLevel;
        }

        public CreateDevicesRequestDeviceParamModelList setSnmpUsername(String snmpUsername) {
            this.snmpUsername = snmpUsername;
            return this;
        }
        public String getSnmpUsername() {
            return this.snmpUsername;
        }

        public CreateDevicesRequestDeviceParamModelList setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
