// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesResponseBody extends TeaModel {
    /**
     * <p>The token that determines the start point of the next query. If this parameter is empty, all results are returned.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The information about office networks.</p>
     */
    @NameInMap("OfficeSites")
    public java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> officeSites;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The connection address of the AD connector.</p>
         */
        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        /**
         * <p>The status of the AD connector.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   CONNECT_ERROR</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   RUNNING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   CONNECTING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    (You must configure the AD domain in which the AD connector is used.)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   EXPIRED</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   CREATING</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        /**
         * <p>The ID of an elastic network interface (ENI) to which the AD connector is mounted.</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The AD connector type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   1: General</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   2: Advanced</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The trust password that is specified when you configure the AD trust relationship.</p>
         */
        @NameInMap("TrustKey")
        public String trustKey;

        /**
         * <p>The ID of the vSwitch that resides in the network of the AD connector.</p>
         */
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
        /**
         * <p>The log severity.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   ERROR</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   INFO</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   WARN</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>Details of the log entry.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The step in the log entry.</p>
         */
        @NameInMap("Step")
        public String step;

        /**
         * <p>The time when the log entry was printed.</p>
         */
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
        /**
         * <p>The details of AD connectors.</p>
         */
        @NameInMap("ADConnectors")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesADConnectors> ADConnectors;

        /**
         * <p>The hostname of the domain controller. The hostname must comply with Windows hostname naming convention.</p>
         */
        @NameInMap("AdHostname")
        public String adHostname;

        /**
         * <p>The maximum public bandwidth value. Valid values: 0 to 1000.\</p>
         * <p>If you leave this parameter empty or set this parameter to 0, Internet access is not enabled.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The CEN instance status.</p>
         */
        @NameInMap("CenAttachStatus")
        public String cenAttachStatus;

        /**
         * <p>The CEN instance ID.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The IPv4 CIDR block of the VPC that the office network uses.</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>Indicates whether the CloudBox-based office network is created.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("CloudBoxOfficeSite")
        public Boolean cloudBoxOfficeSite;

        /**
         * <p>The time when the office network was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The security group ID.</p>
         */
        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        /**
         * <p>The method that is used to connect cloud computers that reside in the office network from WUYING clients.</p>
         * <br>
         * <p>>  The VPC connection depends on Alibaba Cloud PrivateLink. You can use Alibaba Cloud PrivateLink for free. When you set this parameter to `VPC` or `Any`, PrivateLink is automatically activated.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   INTERNET (default): Cloud computers are connected from WUYING clients over the Internet.</p>
         * <p>*   VPC: Cloud computers are connected from WUYING clients over the VPC.</p>
         * <p>*   ANY: Cloud computers are connected from WUYING clients over the Internet or the VPC. When you use can choose a method to connect cloud computers over the Internet or VPC from WUYING clients based on their business requirements.</p>
         */
        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        /**
         * <p>The number of cloud computers that are created.</p>
         */
        @NameInMap("DesktopCount")
        public Long desktopCount;

        /**
         * <p>The endpoint that is used by the VPC, over which cloud computers are connected.</p>
         */
        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        /**
         * <p>The array of DNS addresses in the AD domains.</p>
         */
        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        /**
         * <p>The username of a Domain Name System (DNS) user.</p>
         */
        @NameInMap("DnsUserName")
        public String dnsUserName;

        /**
         * <p>The domain name of the enterprise AD.</p>
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
         * <p>Indicates whether the local administrator permissions are granted to users that are authorized to use cloud computers in the office network.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>* true (default)</p>
         * <p>* false</p>
         */
        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        /**
         * <p>Indicates whether the connection between cloud computers in the office network is enabled. After you enable the connection between cloud computers in the office network, cloud computers in the office network can access each other.</p>
         */
        @NameInMap("EnableCrossDesktopAccess")
        public Boolean enableCrossDesktopAccess;

        /**
         * <p>Indicates whether Internet access is enabled.</p>
         */
        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        /**
         * <p>An array of Apsara File Storage NAS (NAS) file system IDs.</p>
         */
        @NameInMap("FileSystemIds")
        public java.util.List<String> fileSystemIds;

        /**
         * <p>Details about registration logs.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesLogs> logs;

        /**
         * <p>Indicates whether multi-factor authentication (MFA) is enabled.</p>
         */
        @NameInMap("MfaEnabled")
        public Boolean mfaEnabled;

        /**
         * <p>The office network name. The name is unique in a region.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Indicates whether two-factor verification is enabled when an end user logs on to a WUYING client. This parameter is required only for convenience office networks. If two-factor verification is enabled, the system checks whether security risks exist within the logon account when the end user uses a convenience user to log on to the client. If risks are detected, the system sends a verification code to the email address that is associated with the account of the convenience user. Then, the end user can log on to the client only when the verification code is correct.</p>
         */
        @NameInMap("NeedVerifyLoginRisk")
        public Boolean needVerifyLoginRisk;

        /**
         * <p>Indicates whether the trusted device verification is enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("NeedVerifyZeroDevice")
        public Boolean needVerifyZeroDevice;

        /**
         * <p>The premium bandwidth plan ID.</p>
         */
        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        /**
         * <p>The office network ID.</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The account type of the office network.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SIMPLE: convenience account</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   AD_CONNECTOR: enterprise AD account</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The organizational unit (OU) in the AD domain to which the office network is connected.</p>
         */
        @NameInMap("OuName")
        public String ouName;

        /**
         * <p>The protocol type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   High-definition Experience (HDX)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Adaptive Streaming Protocol (ASP)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The IP address of the RDS license.</p>
         */
        @NameInMap("RdsLicenseAddress")
        public String rdsLicenseAddress;

        /**
         * <p>The domain name of the RDS license.</p>
         */
        @NameInMap("RdsLicenseDomainName")
        public String rdsLicenseDomainName;

        /**
         * <p>The remote desktop service (RDS) license status.</p>
         */
        @NameInMap("RdsLicenseStatus")
        public String rdsLicenseStatus;

        /**
         * <p>Indicates whether single sign-on (SSO) is enabled.</p>
         */
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        /**
         * <p>>  This parameter is unavailable.</p>
         */
        @NameInMap("SsoType")
        public String ssoType;

        /**
         * <p>The office network status.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   REGISTERING: The office network is being registered.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DEREGISTERING: The office network is being deregistered.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   REGISTERED: The office network is registered.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NEEDCONFIGTRUST: A trust relationship is required for the office network.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   CONFIGTRUSTFAILED: A trust relationship fails to be configured for the office network.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DEREGISTERED: The office network is deregistered.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ERROR: One or more configurations of the office network are invalid.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   CONFIGTRUSTING: A trust relationship is being configured for the office network.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   NEEDCONFIGUSER: Users are required for the office network.</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>An array of DNS addresses for AD subdomains.</p>
         */
        @NameInMap("SubDnsAddress")
        public java.util.List<String> subDnsAddress;

        /**
         * <p>The username of enterprise AD subdomain.</p>
         */
        @NameInMap("SubDomainName")
        public String subDomainName;

        /**
         * <p>The total number of cloud computers.</p>
         */
        @NameInMap("TotalEdsCount")
        public Long totalEdsCount;

        /**
         * <p>The total number of cloud computers in the cloud computer pool (formerly desktop group).</p>
         */
        @NameInMap("TotalEdsCountForGroup")
        public Long totalEdsCountForGroup;

        /**
         * <p>>  This parameter is unavailable.</p>
         */
        @NameInMap("TrustPassword")
        public String trustPassword;

        /**
         * <p>An array of VSwitch IDs.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Basic</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Customized</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Standard</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
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

        public DescribeOfficeSitesResponseBodyOfficeSites setCenAttachStatus(String cenAttachStatus) {
            this.cenAttachStatus = cenAttachStatus;
            return this;
        }
        public String getCenAttachStatus() {
            return this.cenAttachStatus;
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
