// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesResponseBody extends TeaModel {
    // The hostname of the domain controller. The hostname must comply with the hostname naming convention of Windows.
    @NameInMap("AdHostname")
    public String adHostname;

    // Details of the directories.
    @NameInMap("Directories")
    public java.util.List<DescribeDirectoriesResponseBodyDirectories> directories;

    // The token that is used for the next query. If this parameter is empty, all results are returned.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirectoriesResponseBody self = new DescribeDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDirectoriesResponseBody setAdHostname(String adHostname) {
        this.adHostname = adHostname;
        return this;
    }
    public String getAdHostname() {
        return this.adHostname;
    }

    public DescribeDirectoriesResponseBody setDirectories(java.util.List<DescribeDirectoriesResponseBodyDirectories> directories) {
        this.directories = directories;
        return this;
    }
    public java.util.List<DescribeDirectoriesResponseBodyDirectories> getDirectories() {
        return this.directories;
    }

    public DescribeDirectoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDirectoriesResponseBodyDirectoriesADConnectors extends TeaModel {
        // The address of the AD connector.
        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        // The status of the AD connector.
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        // The ID of the network interface controller (NIC) with which the AD connector is associated.
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        // The type of the AD connector.
        @NameInMap("Specification")
        public String specification;

        // The trust password of the AD domain controller.
        @NameInMap("TrustKey")
        public String trustKey;

        // The ID of the vSwitch with which the AD connector is associated.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribeDirectoriesResponseBodyDirectoriesADConnectors build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseBodyDirectoriesADConnectors self = new DescribeDirectoriesResponseBodyDirectoriesADConnectors();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setADConnectorAddress(String ADConnectorAddress) {
            this.ADConnectorAddress = ADConnectorAddress;
            return this;
        }
        public String getADConnectorAddress() {
            return this.ADConnectorAddress;
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setConnectorStatus(String connectorStatus) {
            this.connectorStatus = connectorStatus;
            return this;
        }
        public String getConnectorStatus() {
            return this.connectorStatus;
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setTrustKey(String trustKey) {
            this.trustKey = trustKey;
            return this;
        }
        public String getTrustKey() {
            return this.trustKey;
        }

        public DescribeDirectoriesResponseBodyDirectoriesADConnectors setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeDirectoriesResponseBodyDirectoriesLogs extends TeaModel {
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

        public static DescribeDirectoriesResponseBodyDirectoriesLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseBodyDirectoriesLogs self = new DescribeDirectoriesResponseBodyDirectoriesLogs();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseBodyDirectoriesLogs setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeDirectoriesResponseBodyDirectoriesLogs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeDirectoriesResponseBodyDirectoriesLogs setStep(String step) {
            this.step = step;
            return this;
        }
        public String getStep() {
            return this.step;
        }

        public DescribeDirectoriesResponseBodyDirectoriesLogs setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeDirectoriesResponseBodyDirectories extends TeaModel {
        // Details of the AD connectors.
        @NameInMap("ADConnectors")
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> ADConnectors;

        // The time when the directory was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The ID of the security group.
        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        // The method that is used to connect the client to cloud desktops.
        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        // The endpoint that is used to connect to cloud desktops over a VPC.
        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        // The ID of the directory.
        @NameInMap("DirectoryId")
        public String directoryId;

        // The type of the directory.
        @NameInMap("DirectoryType")
        public String directoryType;

        // Details of the DNS addresses of the directory.
        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        // The username of the Domain Name System (DNS) user.
        @NameInMap("DnsUserName")
        public String dnsUserName;

        // The name of the domain.
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

        // Indicates whether the desktop communication feature is enabled for cloud desktops in the same workspace.
        // 
        // If the feature is enabled, the cloud desktops in the same workspace can access each other.
        @NameInMap("EnableCrossDesktopAccess")
        public Boolean enableCrossDesktopAccess;

        // Indicates whether access over the Internet is allowed.
        // 
        // >  This parameter is unavailable.
        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        // Details of the IDs of the Apsara File Storage NAS (NAS) file systems.
        @NameInMap("FileSystemIds")
        public java.util.List<String> fileSystemIds;

        // Details of the registration logs.
        @NameInMap("Logs")
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesLogs> logs;

        // Indicates whether multi-factor authentication (MFA) is enabled.
        @NameInMap("MfaEnabled")
        public Boolean mfaEnabled;

        // The name of the directory.
        @NameInMap("Name")
        public String name;

        // Indicates whether two-factor verification for logons is enabled. This parameter is returned only for workspaces of the convenience account type.\
        // If two-factor verification is enabled, the system checks whether security risks exist within the logon account when a convenience user logs on to the Elastic Desktop Service (EDS) client. If risks are detected, the system sends a verification code to the email address that is associated with the account. Then, the convenience user can log on to the client only after the user enters the correct verification code.
        @NameInMap("NeedVerifyLoginRisk")
        public Boolean needVerifyLoginRisk;

        // The name of the organizational unit (OU) that you specified when you add cloud desktops to domains.
        @NameInMap("OuName")
        public String ouName;

        // Indicates whether single sign-on (SSO) is enabled.
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        // The status of the AD directory. Valid values:
        // 
        // *   REGISTERING
        // *   REGISTERED
        @NameInMap("Status")
        public String status;

        // Details of the DNS addresses of the AD subdomain.
        @NameInMap("SubDnsAddress")
        public java.util.List<String> subDnsAddress;

        // The fully qualified domain name (FQDN) of the enterprise AD subdomain. The value must contain the hostname and the subdomain name. Example: child.example.com.
        @NameInMap("SubDomainName")
        public String subDomainName;

        // The AD trust password.
        @NameInMap("TrustPassword")
        public String trustPassword;

        // Details of vSwitch IDs that are specified when the directory is being created.
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        // The ID of the virtual private cloud (VPC) to which the vSwitch belongs.
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeDirectoriesResponseBodyDirectories build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirectoriesResponseBodyDirectories self = new DescribeDirectoriesResponseBodyDirectories();
            return TeaModel.build(map, self);
        }

        public DescribeDirectoriesResponseBodyDirectories setADConnectors(java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> ADConnectors) {
            this.ADConnectors = ADConnectors;
            return this;
        }
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> getADConnectors() {
            return this.ADConnectors;
        }

        public DescribeDirectoriesResponseBodyDirectories setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDirectoriesResponseBodyDirectories setCustomSecurityGroupId(String customSecurityGroupId) {
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }
        public String getCustomSecurityGroupId() {
            return this.customSecurityGroupId;
        }

        public DescribeDirectoriesResponseBodyDirectories setDesktopAccessType(String desktopAccessType) {
            this.desktopAccessType = desktopAccessType;
            return this;
        }
        public String getDesktopAccessType() {
            return this.desktopAccessType;
        }

        public DescribeDirectoriesResponseBodyDirectories setDesktopVpcEndpoint(String desktopVpcEndpoint) {
            this.desktopVpcEndpoint = desktopVpcEndpoint;
            return this;
        }
        public String getDesktopVpcEndpoint() {
            return this.desktopVpcEndpoint;
        }

        public DescribeDirectoriesResponseBodyDirectories setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public DescribeDirectoriesResponseBodyDirectories setDirectoryType(String directoryType) {
            this.directoryType = directoryType;
            return this;
        }
        public String getDirectoryType() {
            return this.directoryType;
        }

        public DescribeDirectoriesResponseBodyDirectories setDnsAddress(java.util.List<String> dnsAddress) {
            this.dnsAddress = dnsAddress;
            return this;
        }
        public java.util.List<String> getDnsAddress() {
            return this.dnsAddress;
        }

        public DescribeDirectoriesResponseBodyDirectories setDnsUserName(String dnsUserName) {
            this.dnsUserName = dnsUserName;
            return this;
        }
        public String getDnsUserName() {
            return this.dnsUserName;
        }

        public DescribeDirectoriesResponseBodyDirectories setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDirectoriesResponseBodyDirectories setDomainPassword(String domainPassword) {
            this.domainPassword = domainPassword;
            return this;
        }
        public String getDomainPassword() {
            return this.domainPassword;
        }

        public DescribeDirectoriesResponseBodyDirectories setDomainUserName(String domainUserName) {
            this.domainUserName = domainUserName;
            return this;
        }
        public String getDomainUserName() {
            return this.domainUserName;
        }

        public DescribeDirectoriesResponseBodyDirectories setEnableAdminAccess(Boolean enableAdminAccess) {
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }
        public Boolean getEnableAdminAccess() {
            return this.enableAdminAccess;
        }

        public DescribeDirectoriesResponseBodyDirectories setEnableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
            this.enableCrossDesktopAccess = enableCrossDesktopAccess;
            return this;
        }
        public Boolean getEnableCrossDesktopAccess() {
            return this.enableCrossDesktopAccess;
        }

        public DescribeDirectoriesResponseBodyDirectories setEnableInternetAccess(Boolean enableInternetAccess) {
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }
        public Boolean getEnableInternetAccess() {
            return this.enableInternetAccess;
        }

        public DescribeDirectoriesResponseBodyDirectories setFileSystemIds(java.util.List<String> fileSystemIds) {
            this.fileSystemIds = fileSystemIds;
            return this;
        }
        public java.util.List<String> getFileSystemIds() {
            return this.fileSystemIds;
        }

        public DescribeDirectoriesResponseBodyDirectories setLogs(java.util.List<DescribeDirectoriesResponseBodyDirectoriesLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesLogs> getLogs() {
            return this.logs;
        }

        public DescribeDirectoriesResponseBodyDirectories setMfaEnabled(Boolean mfaEnabled) {
            this.mfaEnabled = mfaEnabled;
            return this;
        }
        public Boolean getMfaEnabled() {
            return this.mfaEnabled;
        }

        public DescribeDirectoriesResponseBodyDirectories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeDirectoriesResponseBodyDirectories setNeedVerifyLoginRisk(Boolean needVerifyLoginRisk) {
            this.needVerifyLoginRisk = needVerifyLoginRisk;
            return this;
        }
        public Boolean getNeedVerifyLoginRisk() {
            return this.needVerifyLoginRisk;
        }

        public DescribeDirectoriesResponseBodyDirectories setOuName(String ouName) {
            this.ouName = ouName;
            return this;
        }
        public String getOuName() {
            return this.ouName;
        }

        public DescribeDirectoriesResponseBodyDirectories setSsoEnabled(Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }
        public Boolean getSsoEnabled() {
            return this.ssoEnabled;
        }

        public DescribeDirectoriesResponseBodyDirectories setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDirectoriesResponseBodyDirectories setSubDnsAddress(java.util.List<String> subDnsAddress) {
            this.subDnsAddress = subDnsAddress;
            return this;
        }
        public java.util.List<String> getSubDnsAddress() {
            return this.subDnsAddress;
        }

        public DescribeDirectoriesResponseBodyDirectories setSubDomainName(String subDomainName) {
            this.subDomainName = subDomainName;
            return this;
        }
        public String getSubDomainName() {
            return this.subDomainName;
        }

        public DescribeDirectoriesResponseBodyDirectories setTrustPassword(String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }
        public String getTrustPassword() {
            return this.trustPassword;
        }

        public DescribeDirectoriesResponseBodyDirectories setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeDirectoriesResponseBodyDirectories setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
