// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OfficeSites")
    public java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> officeSites;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOfficeSitesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSitesResponseBody self = new DescribeOfficeSitesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSitesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeOfficeSitesResponseBody setOfficeSites(java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> officeSites) {
        this.officeSites = officeSites;
        return this;
    }
    public java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> getOfficeSites() {
        return this.officeSites;
    }

    public DescribeOfficeSitesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOfficeSitesResponseBodyOfficeSitesADConnectors extends TeaModel {
        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("TrustKey")
        public String trustKey;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeOfficeSitesResponseBodyOfficeSitesADConnectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseBodyOfficeSitesADConnectors self = new DescribeOfficeSitesResponseBodyOfficeSitesADConnectors();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setADConnectorAddress(String ADConnectorAddress) {
            this.ADConnectorAddress = ADConnectorAddress;
            return this;
        }
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setTrustKey(String trustKey) {
            this.trustKey = trustKey;
            return this;
        }
        public String getTrustKey() {
            return this.trustKey;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesADConnectors setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeOfficeSitesResponseBodyOfficeSitesLogs extends TeaModel {
        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Step")
        public String step;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeOfficeSitesResponseBodyOfficeSitesLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseBodyOfficeSitesLogs self = new DescribeOfficeSitesResponseBodyOfficeSitesLogs();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesLogs setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesLogs setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesLogs setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeOfficeSitesResponseBodyOfficeSites extends TeaModel {
        @NameInMap("ADConnectors")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesADConnectors> ADConnectors;

        @NameInMap("AdHostname")
        public String adHostname;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("CloudBoxOfficeSite")
        public Boolean cloudBoxOfficeSite;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        @NameInMap("DesktopCount")
        public Long desktopCount;

        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        @NameInMap("DnsUserName")
        public String dnsUserName;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainPassword")
        public String domainPassword;

        @NameInMap("DomainUserName")
        public String domainUserName;

        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        @NameInMap("EnableCrossDesktopAccess")
        public Boolean enableCrossDesktopAccess;

        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        @NameInMap("FileSystemIds")
        public java.util.List<String> fileSystemIds;

        @NameInMap("Logs")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesLogs> logs;

        @NameInMap("MfaEnabled")
        public Boolean mfaEnabled;

        @NameInMap("Name")
        public String name;

        @NameInMap("NeedVerifyLoginRisk")
        public Boolean needVerifyLoginRisk;

        @NameInMap("NeedVerifyZeroDevice")
        public Boolean needVerifyZeroDevice;

        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        @NameInMap("OuName")
        public String ouName;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("RdsLicenseAddress")
        public String rdsLicenseAddress;

        @NameInMap("RdsLicenseDomainName")
        public String rdsLicenseDomainName;

        @NameInMap("RdsLicenseStatus")
        public String rdsLicenseStatus;

        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        @NameInMap("SsoType")
        public String ssoType;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubDnsAddress")
        public java.util.List<String> subDnsAddress;

        @NameInMap("SubDomainName")
        public String subDomainName;

        @NameInMap("TotalEdsCount")
        public Long totalEdsCount;

        @NameInMap("TotalEdsCountForGroup")
        public Long totalEdsCountForGroup;

        @NameInMap("TrustPassword")
        public String trustPassword;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcType")
        public String vpcType;

        public static DescribeOfficeSitesResponseBodyOfficeSites build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseBodyOfficeSites self = new DescribeOfficeSitesResponseBodyOfficeSites();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setADConnectors(java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesADConnectors> ADConnectors) {
            this.ADConnectors = ADConnectors;
            return this;
        }
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setAdHostname(String adHostname) {
            this.adHostname = adHostname;
            return this;
        }
        public String getAdHostname() {
            return this.adHostname;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
            this.cloudBoxOfficeSite = cloudBoxOfficeSite;
            return this;
        }
        public Boolean getCloudBoxOfficeSite() {
            return this.cloudBoxOfficeSite;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCustomSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDesktopAccessType(String desktopAccessType) {
            this.desktopAccessType = desktopAccessType;
            return this;
        }
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDesktopCount(Long desktopCount) {
            this.desktopCount = desktopCount;
            return this;
        }
        public Long getDesktopCount() {
            return this.desktopCount;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDesktopVpcEndpoint(String desktopVpcEndpoint) {
            this.desktopVpcEndpoint = desktopVpcEndpoint;
            return this;
        }
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDnsAddress(java.util.List<String> dnsAddress) {
            this.dnsAddress = dnsAddress;
            return this;
        }
        public java.util.List<String> getDnsAddress() {
            return this.dnsAddress;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDnsUserName(String dnsUserName) {
            this.dnsUserName = dnsUserName;
            return this;
        }
        public String getDnsUserName() {
            return this.dnsUserName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDomainPassword(String domainPassword) {
            this.domainPassword = domainPassword;
            return this;
        }
        public String getDomainPassword() {
            return this.domainPassword;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setDomainUserName(String domainUserName) {
            this.domainUserName = domainUserName;
            return this;
        }
        public String getDomainUserName() {
            return this.domainUserName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setEnableAdminAccess(Boolean enableAdminAccess) {
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }
        public Boolean getEnableAdminAccess() {
            return this.enableAdminAccess;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setEnableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
            this.enableCrossDesktopAccess = enableCrossDesktopAccess;
            return this;
        }
        public Boolean getEnableCrossDesktopAccess() {
            return this.enableCrossDesktopAccess;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setEnableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setFileSystemIds(java.util.List<String> fileSystemIds) {
            this.fileSystemIds = fileSystemIds;
            return this;
        }
        public java.util.List<String> getFileSystemIds() {
            return this.fileSystemIds;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setLogs(java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesLogs> getLogs() {
            return this.logs;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setMfaEnabled(Boolean mfaEnabled) {
            this.mfaEnabled = mfaEnabled;
            return this;
        }
        public Boolean getMfaEnabled() {
            return this.mfaEnabled;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setNeedVerifyLoginRisk(Boolean needVerifyLoginRisk) {
            this.needVerifyLoginRisk = needVerifyLoginRisk;
            return this;
        }
        public Boolean getNeedVerifyLoginRisk() {
            return this.needVerifyLoginRisk;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setNeedVerifyZeroDevice(Boolean needVerifyZeroDevice) {
            this.needVerifyZeroDevice = needVerifyZeroDevice;
            return this;
        }
        public Boolean getNeedVerifyZeroDevice() {
            return this.needVerifyZeroDevice;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setNetworkPackageId(String networkPackageId) {
            this.networkPackageId = networkPackageId;
            return this;
        }
        public String getNetworkPackageId() {
            return this.networkPackageId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setOuName(String ouName) {
            this.ouName = ouName;
            return this;
        }
        public String getOuName() {
            return this.ouName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setRdsLicenseAddress(String rdsLicenseAddress) {
            this.rdsLicenseAddress = rdsLicenseAddress;
            return this;
        }
        public String getRdsLicenseAddress() {
            return this.rdsLicenseAddress;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setRdsLicenseDomainName(String rdsLicenseDomainName) {
            this.rdsLicenseDomainName = rdsLicenseDomainName;
            return this;
        }
        public String getRdsLicenseDomainName() {
            return this.rdsLicenseDomainName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setRdsLicenseStatus(String rdsLicenseStatus) {
            this.rdsLicenseStatus = rdsLicenseStatus;
            return this;
        }
        public String getRdsLicenseStatus() {
            return this.rdsLicenseStatus;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setSsoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setSsoType(String ssoType) {
            this.ssoType = ssoType;
            return this;
        }
        public String getSsoType() {
            return this.ssoType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setSubDnsAddress(java.util.List<String> subDnsAddress) {
            this.subDnsAddress = subDnsAddress;
            return this;
        }
        public java.util.List<String> getSubDnsAddress() {
            return this.subDnsAddress;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setSubDomainName(String subDomainName) {
            this.subDomainName = subDomainName;
            return this;
        }
        public String getSubDomainName() {
            return this.subDomainName;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setTotalEdsCount(Long totalEdsCount) {
            this.totalEdsCount = totalEdsCount;
            return this;
        }
        public Long getTotalEdsCount() {
            return this.totalEdsCount;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setTotalEdsCountForGroup(Long totalEdsCountForGroup) {
            this.totalEdsCountForGroup = totalEdsCountForGroup;
            return this;
        }
        public Long getTotalEdsCountForGroup() {
            return this.totalEdsCountForGroup;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setTrustPassword(String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }
        public String getTrustPassword() {
            return this.trustPassword;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

}
