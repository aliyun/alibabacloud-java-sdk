// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListDevicesResponseBody extends TeaModel {
    @NameInMap("AmountDetail")
    public String amountDetail;

    @NameInMap("AmountUsed")
    public Integer amountUsed;

    @NameInMap("Devices")
    public java.util.List<ListDevicesResponseBodyDevices> devices;

    @NameInMap("IotCoefficient")
    public Integer iotCoefficient;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NetworkCoefficient")
    public Integer networkCoefficient;

    @NameInMap("NetworkMaintenanceCoefficient")
    public Integer networkMaintenanceCoefficient;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("OtherCoefficient")
    public Integer otherCoefficient;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServerCoefficient")
    public Integer serverCoefficient;

    @NameInMap("ServerMaintenanceCoefficient")
    public Integer serverMaintenanceCoefficient;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesResponseBody self = new ListDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevicesResponseBody setAmountDetail(String amountDetail) {
        this.amountDetail = amountDetail;
        return this;
    }
    public String getAmountDetail() {
        return this.amountDetail;
    }

    public ListDevicesResponseBody setAmountUsed(Integer amountUsed) {
        this.amountUsed = amountUsed;
        return this;
    }
    public Integer getAmountUsed() {
        return this.amountUsed;
    }

    public ListDevicesResponseBody setDevices(java.util.List<ListDevicesResponseBodyDevices> devices) {
        this.devices = devices;
        return this;
    }
    public java.util.List<ListDevicesResponseBodyDevices> getDevices() {
        return this.devices;
    }

    public ListDevicesResponseBody setIotCoefficient(Integer iotCoefficient) {
        this.iotCoefficient = iotCoefficient;
        return this;
    }
    public Integer getIotCoefficient() {
        return this.iotCoefficient;
    }

    public ListDevicesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDevicesResponseBody setNetworkCoefficient(Integer networkCoefficient) {
        this.networkCoefficient = networkCoefficient;
        return this;
    }
    public Integer getNetworkCoefficient() {
        return this.networkCoefficient;
    }

    public ListDevicesResponseBody setNetworkMaintenanceCoefficient(Integer networkMaintenanceCoefficient) {
        this.networkMaintenanceCoefficient = networkMaintenanceCoefficient;
        return this;
    }
    public Integer getNetworkMaintenanceCoefficient() {
        return this.networkMaintenanceCoefficient;
    }

    public ListDevicesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListDevicesResponseBody setOtherCoefficient(Integer otherCoefficient) {
        this.otherCoefficient = otherCoefficient;
        return this;
    }
    public Integer getOtherCoefficient() {
        return this.otherCoefficient;
    }

    public ListDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicesResponseBody setServerCoefficient(Integer serverCoefficient) {
        this.serverCoefficient = serverCoefficient;
        return this;
    }
    public Integer getServerCoefficient() {
        return this.serverCoefficient;
    }

    public ListDevicesResponseBody setServerMaintenanceCoefficient(Integer serverMaintenanceCoefficient) {
        this.serverMaintenanceCoefficient = serverMaintenanceCoefficient;
        return this;
    }
    public Integer getServerMaintenanceCoefficient() {
        return this.serverMaintenanceCoefficient;
    }

    public ListDevicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDevicesResponseBodyDevices extends TeaModel {
        @NameInMap("DeviceFormId")
        public String deviceFormId;

        @NameInMap("DeviceFormName")
        public String deviceFormName;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("EnablePassword")
        public String enablePassword;

        @NameInMap("ExtAttributes")
        public String extAttributes;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

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

        @NameInMap("PhysicalSpaceId")
        public String physicalSpaceId;

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

        public static ListDevicesResponseBodyDevices build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyDevices self = new ListDevicesResponseBodyDevices();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyDevices setDeviceFormId(String deviceFormId) {
            this.deviceFormId = deviceFormId;
            return this;
        }
        public String getDeviceFormId() {
            return this.deviceFormId;
        }

        public ListDevicesResponseBodyDevices setDeviceFormName(String deviceFormName) {
            this.deviceFormName = deviceFormName;
            return this;
        }
        public String getDeviceFormName() {
            return this.deviceFormName;
        }

        public ListDevicesResponseBodyDevices setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListDevicesResponseBodyDevices setEnablePassword(String enablePassword) {
            this.enablePassword = enablePassword;
            return this;
        }
        public String getEnablePassword() {
            return this.enablePassword;
        }

        public ListDevicesResponseBodyDevices setExtAttributes(String extAttributes) {
            this.extAttributes = extAttributes;
            return this;
        }
        public String getExtAttributes() {
            return this.extAttributes;
        }

        public ListDevicesResponseBodyDevices setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDevicesResponseBodyDevices setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDevicesResponseBodyDevices setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListDevicesResponseBodyDevices setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListDevicesResponseBodyDevices setLoginPassword(String loginPassword) {
            this.loginPassword = loginPassword;
            return this;
        }
        public String getLoginPassword() {
            return this.loginPassword;
        }

        public ListDevicesResponseBodyDevices setLoginType(String loginType) {
            this.loginType = loginType;
            return this;
        }
        public String getLoginType() {
            return this.loginType;
        }

        public ListDevicesResponseBodyDevices setLoginUsername(String loginUsername) {
            this.loginUsername = loginUsername;
            return this;
        }
        public String getLoginUsername() {
            return this.loginUsername;
        }

        public ListDevicesResponseBodyDevices setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public ListDevicesResponseBodyDevices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListDevicesResponseBodyDevices setPhysicalSpaceId(String physicalSpaceId) {
            this.physicalSpaceId = physicalSpaceId;
            return this;
        }
        public String getPhysicalSpaceId() {
            return this.physicalSpaceId;
        }

        public ListDevicesResponseBodyDevices setPhysicalSpaceName(String physicalSpaceName) {
            this.physicalSpaceName = physicalSpaceName;
            return this;
        }
        public String getPhysicalSpaceName() {
            return this.physicalSpaceName;
        }

        public ListDevicesResponseBodyDevices setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public ListDevicesResponseBodyDevices setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListDevicesResponseBodyDevices setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

        public ListDevicesResponseBodyDevices setSnmpAccountType(String snmpAccountType) {
            this.snmpAccountType = snmpAccountType;
            return this;
        }
        public String getSnmpAccountType() {
            return this.snmpAccountType;
        }

        public ListDevicesResponseBodyDevices setSnmpAccountVersion(String snmpAccountVersion) {
            this.snmpAccountVersion = snmpAccountVersion;
            return this;
        }
        public String getSnmpAccountVersion() {
            return this.snmpAccountVersion;
        }

        public ListDevicesResponseBodyDevices setSnmpAuthPassphrase(String snmpAuthPassphrase) {
            this.snmpAuthPassphrase = snmpAuthPassphrase;
            return this;
        }
        public String getSnmpAuthPassphrase() {
            return this.snmpAuthPassphrase;
        }

        public ListDevicesResponseBodyDevices setSnmpAuthProtocol(String snmpAuthProtocol) {
            this.snmpAuthProtocol = snmpAuthProtocol;
            return this;
        }
        public String getSnmpAuthProtocol() {
            return this.snmpAuthProtocol;
        }

        public ListDevicesResponseBodyDevices setSnmpCommunity(String snmpCommunity) {
            this.snmpCommunity = snmpCommunity;
            return this;
        }
        public String getSnmpCommunity() {
            return this.snmpCommunity;
        }

        public ListDevicesResponseBodyDevices setSnmpPrivacyPassphrase(String snmpPrivacyPassphrase) {
            this.snmpPrivacyPassphrase = snmpPrivacyPassphrase;
            return this;
        }
        public String getSnmpPrivacyPassphrase() {
            return this.snmpPrivacyPassphrase;
        }

        public ListDevicesResponseBodyDevices setSnmpPrivacyProtocol(String snmpPrivacyProtocol) {
            this.snmpPrivacyProtocol = snmpPrivacyProtocol;
            return this;
        }
        public String getSnmpPrivacyProtocol() {
            return this.snmpPrivacyProtocol;
        }

        public ListDevicesResponseBodyDevices setSnmpSecurityLevel(String snmpSecurityLevel) {
            this.snmpSecurityLevel = snmpSecurityLevel;
            return this;
        }
        public String getSnmpSecurityLevel() {
            return this.snmpSecurityLevel;
        }

        public ListDevicesResponseBodyDevices setSnmpUsername(String snmpUsername) {
            this.snmpUsername = snmpUsername;
            return this;
        }
        public String getSnmpUsername() {
            return this.snmpUsername;
        }

        public ListDevicesResponseBodyDevices setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
