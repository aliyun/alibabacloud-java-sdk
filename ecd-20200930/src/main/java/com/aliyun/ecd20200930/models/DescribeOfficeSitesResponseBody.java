// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesResponseBody extends TeaModel {
    // The token that is used for the next query. If this parameter is empty, all results are returned.
    @NameInMap("NextToken")
    public String nextToken;

    // Details of the workspaces.
    @NameInMap("OfficeSites")
    public java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> officeSites;

    // The ID of the request.
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
        // The IP address of the AD connector.
        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        // The status of the AD connector.
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        // The ID of the network interface controller (NIC) that is associated with the AD connector.
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        // The type of the AD connector.
        @NameInMap("Specification")
        public String specification;

        // The trust password that is specified when you configured the AD trust relationship.
        @NameInMap("TrustKey")
        public String trustKey;

        // The ID of the vSwitch that corresponds to the network of the AD connector.
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
        // The level of the log entry.
        @NameInMap("Level")
        public String level;

        // Details of the log entry.
        @NameInMap("Message")
        public String message;

        // The step that corresponds to the log entry.
        @NameInMap("Step")
        public String step;

        // The time when the log entry was printed.
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
        // Details of the AD connectors.
        @NameInMap("ADConnectors")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesADConnectors> ADConnectors;

        // The hostname of the domain controller. The hostname must comply with the hostname naming convention of Windows.
        @NameInMap("AdHostname")
        public String adHostname;

        // The maximum public bandwidth. Valid values: 0 to 200.\
        // If the value of this parameter is 0, Internet access is disabled.
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        // The ID of the Cloud Enterprise Network (CEN) instance.
        @NameInMap("CenId")
        public String cenId;

        // The IPv4 CIDR block that is included in the secure office network of the workspace.
        @NameInMap("CidrBlock")
        public String cidrBlock;

        // Indicates whether the workspace is created for cloud desktops on a cloud box.
        @NameInMap("CloudBoxOfficeSite")
        public Boolean cloudBoxOfficeSite;

        // The time when the workspace was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The ID of the security group.
        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        // The method that is used to connect the client to cloud desktops.
        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        // The number of cloud desktops that are created.
        @NameInMap("DesktopCount")
        public Long desktopCount;

        // The endpoint that is used to connect to cloud desktops over a VPC.
        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        // The DNS addresses of the AD domains.
        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        // The username of the DNS account.
        @NameInMap("DnsUserName")
        public String dnsUserName;

        // The domain name of the enterprise AD system.
        @NameInMap("DomainName")
        public String domainName;

        // The password of the domain administrator.
        @NameInMap("DomainPassword")
        public String domainPassword;

        // The username of the domain administrator.
        @NameInMap("DomainUserName")
        public String domainUserName;

        // Indicates whether the permissions of the local administrator are granted to the regular user of the cloud desktop.
        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        // Indicates whether the desktop communication feature is enabled in the workspace. If the feature is enabled, the cloud desktops in the same workspace can access each other.
        @NameInMap("EnableCrossDesktopAccess")
        public Boolean enableCrossDesktopAccess;

        // Indicates whether Internet access is enabled.
        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        // The IDs of the Apsara File Storage NAS (NAS) file systems.
        @NameInMap("FileSystemIds")
        public java.util.List<String> fileSystemIds;

        // Details of the registration logs.
        @NameInMap("Logs")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesLogs> logs;

        // Indicates whether multi-factor authentication (MFA) is enabled.
        @NameInMap("MfaEnabled")
        public Boolean mfaEnabled;

        // The name of the workspace. The name is unique in the same region.
        @NameInMap("Name")
        public String name;

        // Indicates whether two-factor verification for logons is enabled. This parameter is returned only for workspaces of the convenience account type.\
        // If two-factor verification is enabled, the system checks whether security risks exist within the logon account when a convenience user logs on to the EDS client. If risks are detected, the system sends a verification code to the email address that is associated with the account. Then, the convenience user can log on to the client only after the user enters the correct verification code.
        @NameInMap("NeedVerifyLoginRisk")
        public Boolean needVerifyLoginRisk;

        // Indicates whether trusted device verification is enabled.
        @NameInMap("NeedVerifyZeroDevice")
        public Boolean needVerifyZeroDevice;

        // The ID of the Internet access package.
        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        // The ID of the workspace.
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        // The account type of the workspace.
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        // The name of the organizational unit (OU) that is connected to the AD domain.
        @NameInMap("OuName")
        public String ouName;

        // The type of the protocol.
        @NameInMap("ProtocolType")
        public String protocolType;

        // Indicates whether single sign-on (SSO) is enabled.
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        // The type of SSO.
        @NameInMap("SsoType")
        public String ssoType;

        // The status of the workspace.
        @NameInMap("Status")
        public String status;

        // The DNS addresses of the AD subdomains.
        @NameInMap("SubDnsAddress")
        public java.util.List<String> subDnsAddress;

        // The username of a Domain Name System (DNS) account in the AD subdomain.
        @NameInMap("SubDomainName")
        public String subDomainName;

        // > This parameter is unavailable.
        @NameInMap("TrustPassword")
        public String trustPassword;

        // The IDs of the vSwitches.
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        // The ID of the secure office network of the workspace. The ID is also the ID of the virtual private cloud (VPC) used by the workspace.
        @NameInMap("VpcId")
        public String vpcId;

        // The VPC type.
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
