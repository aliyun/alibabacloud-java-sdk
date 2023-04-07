// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesResponseBody extends TeaModel {
    /**
     * <p>The hostname of the domain controller. The hostname must comply with the hostname naming convention of Windows.</p>
     */
    @NameInMap("AdHostname")
    public String adHostname;

    /**
     * <p>Details of the directories.</p>
     */
    @NameInMap("Directories")
    public java.util.List<DescribeDirectoriesResponseBodyDirectories> directories;

    /**
     * <p>The token that is used for the next query. If this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The address of the AD connector.</p>
         */
        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        /**
         * <p>The status of the AD connector.</p>
         */
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        /**
         * <p>The ID of the network interface controller (NIC) with which the AD connector is associated.</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The type of the AD connector.</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The trust password of the AD domain controller.</p>
         */
        @NameInMap("TrustKey")
        public String trustKey;

        /**
         * <p>The ID of the vSwitch with which the AD connector is associated.</p>
         */
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
        /**
         * <p>The level of the log entry.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>Details of the log entry.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The step that corresponds to the log entry.</p>
         */
        @NameInMap("Step")
        public String step;

        /**
         * <p>The time when the log entry was printed.</p>
         */
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
        /**
         * <p>Details of the AD connectors.</p>
         */
        @NameInMap("ADConnectors")
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> ADConnectors;

        /**
         * <p>The time when the directory was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        /**
         * <p>The method that is used to connect the client to cloud desktops.</p>
         */
        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        /**
         * <p>The endpoint that is used to connect to cloud desktops over a VPC.</p>
         */
        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        /**
         * <p>The ID of the directory.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The type of the directory.</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>Details of the DNS addresses of the directory.</p>
         */
        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        /**
         * <p>The username of the Domain Name System (DNS) user.</p>
         */
        @NameInMap("DnsUserName")
        public String dnsUserName;

        /**
         * <p>The name of the domain.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The password of the domain administrator.</p>
         */
        @NameInMap("DomainPassword")
        public String domainPassword;

        /**
         * <p>The username of the domain administrator.</p>
         */
        @NameInMap("DomainUserName")
        public String domainUserName;

        /**
         * <p>Indicates whether the permissions of the local administrator are granted to the regular user of the cloud desktop.</p>
         */
        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        /**
         * <p>Indicates whether the desktop communication feature is enabled for cloud desktops in the same workspace.</p>
         * <br>
         * <p>If the feature is enabled, the cloud desktops in the same workspace can access each other.</p>
         */
        @NameInMap("EnableCrossDesktopAccess")
        public Boolean enableCrossDesktopAccess;

        /**
         * <p>Indicates whether access over the Internet is allowed.</p>
         * <br>
         * <p>>  This parameter is unavailable.</p>
         */
        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        /**
         * <p>Details of the IDs of the Apsara File Storage NAS (NAS) file systems.</p>
         */
        @NameInMap("FileSystemIds")
        public java.util.List<String> fileSystemIds;

        /**
         * <p>Details of the registration logs.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesLogs> logs;

        /**
         * <p>Indicates whether multi-factor authentication (MFA) is enabled.</p>
         */
        @NameInMap("MfaEnabled")
        public Boolean mfaEnabled;

        /**
         * <p>The name of the directory.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether two-factor verification for logons is enabled. This parameter is returned only for workspaces of the convenience account type.\</p>
         * <p>If two-factor verification is enabled, the system checks whether security risks exist within the logon account when a convenience user logs on to the Elastic Desktop Service (EDS) client. If risks are detected, the system sends a verification code to the email address that is associated with the account. Then, the convenience user can log on to the client only after the user enters the correct verification code.</p>
         */
        @NameInMap("NeedVerifyLoginRisk")
        public Boolean needVerifyLoginRisk;

        /**
         * <p>The name of the organizational unit (OU) that you specified when you add cloud desktops to domains.</p>
         */
        @NameInMap("OuName")
        public String ouName;

        /**
         * <p>Indicates whether single sign-on (SSO) is enabled.</p>
         */
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        /**
         * <p>The status of the AD directory. Valid values:</p>
         * <br>
         * <p>*   REGISTERING</p>
         * <p>*   REGISTERED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Details of the DNS addresses of the AD subdomain.</p>
         */
        @NameInMap("SubDnsAddress")
        public java.util.List<String> subDnsAddress;

        /**
         * <p>The fully qualified domain name (FQDN) of the enterprise AD subdomain. The value must contain the hostname and the subdomain name. Example: child.example.com.</p>
         */
        @NameInMap("SubDomainName")
        public String subDomainName;

        /**
         * <p>The AD trust password.</p>
         */
        @NameInMap("TrustPassword")
        public String trustPassword;

        /**
         * <p>Details of vSwitch IDs that are specified when the directory is being created.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the vSwitch belongs.</p>
         */
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
