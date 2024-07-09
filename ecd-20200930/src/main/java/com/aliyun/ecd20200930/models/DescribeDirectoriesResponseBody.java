// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDirectoriesResponseBody extends TeaModel {
    /**
     * <p>The hostname of the domain controller. The hostname must comply with the hostname naming convention of Windows. This parameter is returned only when the directory type is AD office network.</p>
     * 
     * <strong>example:</strong>
     * <p>cnshsv21hmc****</p>
     */
    @NameInMap("AdHostname")
    public String adHostname;

    /**
     * <p>The directories.</p>
     */
    @NameInMap("Directories")
    public java.util.List<DescribeDirectoriesResponseBodyDirectories> directories;

    /**
     * <p>The token that is used for the next query. If this parameter is empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F369A091-002F-49C8-AD55-02A776297C7B</p>
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
         * <p>The connection address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.17.**.**</p>
         */
        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>CONNECT_ERROR</li>
         * <li>RUNNING</li>
         * <li>CONNECTING: You must configure domain trust for your AD system.</li>
         * <li>EXPIRED</li>
         * <li>CREATING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        /**
         * <p>The ID of the NIC to which the AD connector is mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1i4wx78lgosrj6****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The AD connector type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>1: General</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>2: Advanced</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The trust password of the AD domain controller.</p>
         * 
         * <strong>example:</strong>
         * <p>yfpoAD****</p>
         */
        @NameInMap("TrustKey")
        public String trustKey;

        /**
         * <p>The ID of the vSwitch with which the AD connector is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp19ocz3erfx15uon****</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li><p>ERROR</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>INFO</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>WARN</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>Details of the log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>code:success | message:Create Connector complete.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The step that corresponds to the log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribeDirectories</p>
         */
        @NameInMap("Step")
        public String step;

        /**
         * <p>The time when the log entry was printed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-22T06:45Z</p>
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
         * <p>Details of the AD connector.</p>
         */
        @NameInMap("ADConnectors")
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesADConnectors> ADConnectors;

        @NameInMap("AdHostname")
        public String adHostname;

        @NameInMap("BackupDCHostname")
        public String backupDCHostname;

        @NameInMap("BackupDns")
        public String backupDns;

        /**
         * <p>The time when the directory was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-02T01:44Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The security group ID. This parameter is returned only when the directory type is AD office network.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1ce64o4g9mdf5u****</p>
         */
        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        /**
         * <p>The method in which the cloud computer is connected.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>VPC</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Internet</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Any</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        /**
         * <p>The endpoint that is used to connect to cloud computers in the directory over a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com">http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com</a></p>
         */
        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-gx2x1dhsmu52rd****</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The directory type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>AD_CONNECTOR: AD directory</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>RAM: RAM directory</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RAM</p>
         */
        @NameInMap("DirectoryType")
        public String directoryType;

        /**
         * <p>The DNS address of the directory.</p>
         */
        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        /**
         * <p>The username of a DNS user.</p>
         * 
         * <strong>example:</strong>
         * <p>testDnsUserName</p>
         */
        @NameInMap("DnsUserName")
        public String dnsUserName;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The password of the domain administrator. This parameter is returned only when the directory type is AD office network.</p>
         * 
         * <strong>example:</strong>
         * <p>testPassword</p>
         */
        @NameInMap("DomainPassword")
        public String domainPassword;

        /**
         * <p>The username of the domain administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>sAMAccountName</p>
         */
        @NameInMap("DomainUserName")
        public String domainUserName;

        /**
         * <p>Indicates whether the local administrator permissions are granted to users that use cloud computers in the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        /**
         * <p>Indicates whether cloud computers can communicate with each other in the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCrossDesktopAccess")
        public Boolean enableCrossDesktopAccess;

        /**
         * <p>Indicates whether access over the Internet is enabled.</p>
         * <blockquote>
         * <p> This parameter is unavailable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        /**
         * <p>The IDs of Apsara File Storage NAS (NAS) file systems.</p>
         */
        @NameInMap("FileSystemIds")
        public java.util.List<String> fileSystemIds;

        /**
         * <p>The registration logs. This parameter is returned only when the directory type is AD office network.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribeDirectoriesResponseBodyDirectoriesLogs> logs;

        /**
         * <p>Indicates whether MFA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MfaEnabled")
        public Boolean mfaEnabled;

        /**
         * <p>The directory name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDirectoryName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether two-step verification for logons is enabled. This parameter is returned only for directories of convenience account type.\
         * If two-factor verification is enabled, the system checks whether security risks exist within the logon account when a convenience user logs on to an Alibaba Cloud Workspace client. If risks are detected, the system sends a verification code to the email address that is associated with the account. Then, the convenience user can log on to the client only after the user enters the correct verification code.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedVerifyLoginRisk")
        public Boolean needVerifyLoginRisk;

        /**
         * <p>The organization unit that you selected when you added the cloud computer to the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com/Domain Controllers</p>
         */
        @NameInMap("OuName")
        public String ouName;

        /**
         * <p>Indicates whether single sign-on (SSO) is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        /**
         * <p>The status of the AD directory.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>REGISTERING</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>REGISTERED</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGISTERING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The DNS address of the enterprise AD subdomain.</p>
         */
        @NameInMap("SubDnsAddress")
        public java.util.List<String> subDnsAddress;

        /**
         * <p>The fully qualified domain name (FQDN) of the existing AD subdomain. The value contains both the host name and the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>child.example.com</p>
         */
        @NameInMap("SubDomainName")
        public String subDomainName;

        /**
         * <p>The AD trust password. This parameter is returned only when the directory type is AD office network.</p>
         * 
         * <strong>example:</strong>
         * <p>82Tg****</p>
         */
        @NameInMap("TrustPassword")
        public String trustPassword;

        /**
         * <p>The IDs of the vSwitches specified when the directory was created.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The ID of the VPC to which the vSwitch belongs. This parameter is returned only when the directory type is AD office network.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6tz5k67puge5jn8****</p>
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

        public DescribeDirectoriesResponseBodyDirectories setAdHostname(String adHostname) {
            this.adHostname = adHostname;
            return this;
        }
        public String getAdHostname() {
            return this.adHostname;
        }

        public DescribeDirectoriesResponseBodyDirectories setBackupDCHostname(String backupDCHostname) {
            this.backupDCHostname = backupDCHostname;
            return this;
        }
        public String getBackupDCHostname() {
            return this.backupDCHostname;
        }

        public DescribeDirectoriesResponseBodyDirectories setBackupDns(String backupDns) {
            this.backupDns = backupDns;
            return this;
        }
        public String getBackupDns() {
            return this.backupDns;
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
