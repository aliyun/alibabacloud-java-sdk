// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSitesResponseBody extends TeaModel {
    /**
     * <p>The token for the next query. If NextToken is empty, no more results exist.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The collection of office network information.</p>
     */
    @NameInMap("OfficeSites")
    public java.util.List<DescribeOfficeSitesResponseBodyOfficeSites> officeSites;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of query results.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public DescribeOfficeSitesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOfficeSitesResponseBodyOfficeSitesADConnectors extends TeaModel {
        /**
         * <p>The endpoint of the AD Connector.</p>
         * 
         * <strong>example:</strong>
         * <p>172.24.<em>.</em></p>
         */
        @NameInMap("ADConnectorAddress")
        public String ADConnectorAddress;

        /**
         * <p>The status of the AD Connector.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ConnectorStatus")
        public String connectorStatus;

        /**
         * <p>The ID of the network interface controller (NIC) attached to the AD Connector.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp1i4wx78lgosrj6****</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The specification of the AD Connector.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The trust password configured when setting up the AD trust relationship.</p>
         * 
         * <strong>example:</strong>
         * <p>password123***</p>
         */
        @NameInMap("TrustKey")
        public String trustKey;

        /**
         * <p>The vSwitch ID of the network where the AD Connector resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp19ocz3erfx15uon****</p>
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
         * <p>The log level.</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The detailed log information.</p>
         * 
         * <strong>example:</strong>
         * <p>code:success | message:Create Connector complete</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The step that corresponds to the log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_CONNECTOR</p>
         */
        @NameInMap("Step")
        public String step;

        /**
         * <p>The time when the log was printed. The time is in the ISO 8601 standard (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-12T09:42Z</p>
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

    public static class DescribeOfficeSitesResponseBodyOfficeSitesResourceAmounts extends TeaModel {
        /**
         * <p>The resource count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("amount")
        public Long amount;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static DescribeOfficeSitesResponseBodyOfficeSitesResourceAmounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSitesResponseBodyOfficeSitesResourceAmounts self = new DescribeOfficeSitesResponseBodyOfficeSitesResourceAmounts();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesResourceAmounts setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public DescribeOfficeSitesResponseBodyOfficeSitesResourceAmounts setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeOfficeSitesResponseBodyOfficeSites extends TeaModel {
        /**
         * <p>The collection of AD Connector information.</p>
         */
        @NameInMap("ADConnectors")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesADConnectors> ADConnectors;

        /**
         * <p>The Alibaba Cloud Global Accelerator (GA) instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1astu3yrplkzoo2****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <p>The access attribute of the office network (workspace).</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("AccessAttribute")
        public String accessAttribute;

        /**
         * <p>The account type.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The hostname of the domain controller. The hostname must comply with Windows hostname naming conventions.</p>
         * 
         * <strong>example:</strong>
         * <p>beijing-ad01</p>
         */
        @NameInMap("AdHostname")
        public String adHostname;

        /**
         * <p>The authority URL of the identity authentication service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://login.microsoftonline.com">https://login.microsoftonline.com</a></p>
         */
        @NameInMap("AuthorityHost")
        public String authorityHost;

        /**
         * <p>The hostname of the backup domain controller.</p>
         * 
         * <strong>example:</strong>
         * <p>beijing-ad02</p>
         */
        @NameInMap("BackupDCHostname")
        public String backupDCHostname;

        /**
         * <p>The DNS address of the backup domain controller.</p>
         * 
         * <strong>example:</strong>
         * <p>172.24.XX.XX</p>
         */
        @NameInMap("BackupDns")
        public String backupDns;

        /**
         * <p>The peak Internet bandwidth. Valid values: 0 to 1000. Unit: Mbit/s.<br>If the value is empty or 0, Internet access is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The basic bandwidth type.</p>
         * 
         * <strong>example:</strong>
         * <p>basic_plus</p>
         */
        @NameInMap("BasicInternetType")
        public String basicInternetType;

        /**
         * <p>The status of the Cloud Enterprise Network (CEN) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>attached</p>
         */
        @NameInMap("CenAttachStatus")
        public String cenAttachStatus;

        /**
         * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-3gwy16dojz1m65****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The IPv4 CIDR block of the office network VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The client ID registered with the identity provider application.</p>
         * 
         * <strong>example:</strong>
         * <p>a2c8f7e4-1b3d-4c5e-9f0a-6d7b8c9e****</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client secret registered with the identity provider application.</p>
         * 
         * <strong>example:</strong>
         * <p>sct-9f3e2d1c****</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>Indicates whether the office network is a CloudBox office network.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CloudBoxOfficeSite")
        public Boolean cloudBoxOfficeSite;

        /**
         * <p>The time when the office network was created. The time is in the ISO 8601 standard (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-06T05:58Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The custom access gateway address.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-****.com</p>
         */
        @NameInMap("CustomAccessPoint")
        public String customAccessPoint;

        /**
         * <p>The array of custom DNS addresses.</p>
         */
        @NameInMap("CustomDnsAddress")
        public java.util.List<String> customDnsAddress;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1ce64o4g9mdf5u****</p>
         */
        @NameInMap("CustomSecurityGroupId")
        public String customSecurityGroupId;

        /**
         * <p>The access method allowed when connecting to cloud computers.</p>
         * <blockquote>
         * <p>The VPC connection method depends on the Alibaba Cloud PrivateLink service, which is free of charge. When this parameter is set to <code>VPC</code> or <code>Any</code>, the system automatically activates the PrivateLink service for you.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>INTERNET</p>
         */
        @NameInMap("DesktopAccessType")
        public String desktopAccessType;

        /**
         * <p>The number of cloud computers that have been created.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DesktopCount")
        public Long desktopCount;

        /**
         * <p>The endpoint used for VPC connections to cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com">http://ep-bp1s2vmbj55r5rzc****.epsrv-bp1pcfhpwvlpny01****.cn-hangzhou.privatelink.aliyuncs.com</a></p>
         */
        @NameInMap("DesktopVpcEndpoint")
        public String desktopVpcEndpoint;

        /**
         * <p>The array of DNS addresses corresponding to the AD domain.</p>
         */
        @NameInMap("DnsAddress")
        public java.util.List<String> dnsAddress;

        /**
         * <p>The DNS username.</p>
         * 
         * <strong>example:</strong>
         * <p>testDnsUserName</p>
         */
        @NameInMap("DnsUserName")
        public String dnsUserName;

        /**
         * <p>The domain name of the enterprise AD.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The password of the domain administrator.</p>
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
         * <p>Administrator</p>
         */
        @NameInMap("DomainUserName")
        public String domainUserName;

        /**
         * <p>The enterprise ID (EID).</p>
         * 
         * <strong>example:</strong>
         * <p>e-1234abcd****</p>
         */
        @NameInMap("Eid")
        public String eid;

        /**
         * <p>Indicates whether local administrator permissions are granted to users of cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        /**
         * <p>Indicates whether cross-cloud computer access within the office network is enabled. If enabled, cloud computers within the same office network can access each other over the network.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableCrossDesktopAccess")
        public Boolean enableCrossDesktopAccess;

        /**
         * <p>Indicates whether the public network access feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableInternetAccess")
        public Boolean enableInternetAccess;

        /**
         * <p>Indicates whether cloud service route access control is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableServiceRoute")
        public Boolean enableServiceRoute;

        /**
         * <p>The environment type. This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The array of NAS file system IDs.</p>
         */
        @NameInMap("FileSystemIds")
        public java.util.List<String> fileSystemIds;

        /**
         * <p>Indicates whether the directory is an LDAP directory.</p>
         */
        @NameInMap("IsLdap")
        public Boolean isLdap;

        /**
         * <p>The access URL of the LDAP service.</p>
         * 
         * <strong>example:</strong>
         * <p>ldap://192.168.0.10:389</p>
         */
        @NameInMap("LdapUrl")
        public String ldapUrl;

        /**
         * <p>The registration log information.</p>
         */
        @NameInMap("Logs")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesLogs> logs;

        /**
         * <p>Indicates whether multi-factor authentication (MFA) is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MfaEnabled")
        public Boolean mfaEnabled;

        /**
         * <p>The name of the office network. The name is unique within a region.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D_Office_Network</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Applicable only to convenience account office networks. Indicates whether secondary authentication is required during logon. If logon secondary authentication is enabled, the system checks whether the logon account has security risks when a convenience user logs on to the client. If a risk is detected, the system sends a verification code to the email address associated with the account. The convenience user can log on to the client only after passing the verification code check.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedVerifyLoginRisk")
        public Boolean needVerifyLoginRisk;

        /**
         * <p>Indicates whether trusted device verification is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedVerifyZeroDevice")
        public Boolean needVerifyZeroDevice;

        /**
         * <p>The Internet access package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>np-amtp8e8q1o9e4****</p>
         */
        @NameInMap("NetworkPackageId")
        public String networkPackageId;

        /**
         * <p>The network version. The new version supports products such as WUYING Cloud Application.</p>
         * 
         * <strong>example:</strong>
         * <p>NM</p>
         */
        @NameInMap("NmVersion")
        public String nmVersion;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The account system type of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>AD_CONNECTOR</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The organizational unit (OU) in the AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com/Domain Controllers</p>
         */
        @NameInMap("OuName")
        public String ouName;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The IP address of the RDS license.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        @NameInMap("RdsLicenseAddress")
        public String rdsLicenseAddress;

        /**
         * <p>The domain name where the RDS license resides.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("RdsLicenseDomainName")
        public String rdsLicenseDomainName;

        /**
         * <p>The status of the RDS license.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RdsLicenseStatus")
        public String rdsLicenseStatus;

        /**
         * <p>The resource count list.</p>
         */
        @NameInMap("ResourceAmounts")
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesResourceAmounts> resourceAmounts;

        /**
         * <p>The Network Security Protection Settings of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>SASE</p>
         */
        @NameInMap("SecurityProtection")
        public String securityProtection;

        /**
         * <p>Indicates whether single sign-on (SSO) is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SsoEnabled")
        public Boolean ssoEnabled;

        /**
         * <p>The SSO type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAML</p>
         */
        @NameInMap("SsoType")
        public String ssoType;

        /**
         * <p>The status of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>REGISTERED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The array of DNS addresses of the AD subdomain.</p>
         */
        @NameInMap("SubDnsAddress")
        public java.util.List<String> subDnsAddress;

        /**
         * <p>The username of the AD subdomain DNS.</p>
         * 
         * <strong>example:</strong>
         * <p>testSubDnsUserName</p>
         */
        @NameInMap("SubDomainName")
        public String subDomainName;

        /**
         * <p>The subnet mode of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SubnetMode")
        public String subnetMode;

        /**
         * <p>The tenant ID of the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>72f988bf-86f1-41af-91ab-2d7cd011****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The number of cloud computers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalEdsCount")
        public Long totalEdsCount;

        /**
         * <p>The number of cloud computers in shared cloud computer groups.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalEdsCountForGroup")
        public Long totalEdsCountForGroup;

        /**
         * <p>The total number of network interface controllers (NICs).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalResourceAmount")
        public Long totalResourceAmount;

        /**
         * <blockquote>
         * <p>This parameter is not yet available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>To be hidden.</p>
         */
        @NameInMap("TrustPassword")
        public String trustPassword;

        /**
         * <p>The array of vSwitch IDs.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID of the secure office network.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6tz5k67puge5jn8****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The usage mode of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        /**
         * <p>The version of the workspace network component (VPL).</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("VplVersion")
        public String vplVersion;

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

        public DescribeOfficeSitesResponseBodyOfficeSites setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setAccessAttribute(String accessAttribute) {
            this.accessAttribute = accessAttribute;
            return this;
        }
        public String getAccessAttribute() {
            return this.accessAttribute;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setAdHostname(String adHostname) {
            this.adHostname = adHostname;
            return this;
        }
        public String getAdHostname() {
            return this.adHostname;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setAuthorityHost(String authorityHost) {
            this.authorityHost = authorityHost;
            return this;
        }
        public String getAuthorityHost() {
            return this.authorityHost;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setBackupDCHostname(String backupDCHostname) {
            this.backupDCHostname = backupDCHostname;
            return this;
        }
        public String getBackupDCHostname() {
            return this.backupDCHostname;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setBackupDns(String backupDns) {
            this.backupDns = backupDns;
            return this;
        }
        public String getBackupDns() {
            return this.backupDns;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setBasicInternetType(String basicInternetType) {
            this.basicInternetType = basicInternetType;
            return this;
        }
        public String getBasicInternetType() {
            return this.basicInternetType;
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

        public DescribeOfficeSitesResponseBodyOfficeSites setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
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

        public DescribeOfficeSitesResponseBodyOfficeSites setCustomAccessPoint(String customAccessPoint) {
            this.customAccessPoint = customAccessPoint;
            return this;
        }
        public String getCustomAccessPoint() {
            return this.customAccessPoint;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setCustomDnsAddress(java.util.List<String> customDnsAddress) {
            this.customDnsAddress = customDnsAddress;
            return this;
        }
        public java.util.List<String> getCustomDnsAddress() {
            return this.customDnsAddress;
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

        public DescribeOfficeSitesResponseBodyOfficeSites setEid(String eid) {
            this.eid = eid;
            return this;
        }
        public String getEid() {
            return this.eid;
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

        public DescribeOfficeSitesResponseBodyOfficeSites setEnableServiceRoute(Boolean enableServiceRoute) {
            this.enableServiceRoute = enableServiceRoute;
            return this;
        }
        public Boolean getEnableServiceRoute() {
            return this.enableServiceRoute;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setFileSystemIds(java.util.List<String> fileSystemIds) {
            this.fileSystemIds = fileSystemIds;
            return this;
        }
        public java.util.List<String> getFileSystemIds() {
            return this.fileSystemIds;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setIsLdap(Boolean isLdap) {
            this.isLdap = isLdap;
            return this;
        }
        public Boolean getIsLdap() {
            return this.isLdap;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setLdapUrl(String ldapUrl) {
            this.ldapUrl = ldapUrl;
            return this;
        }
        public String getLdapUrl() {
            return this.ldapUrl;
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

        public DescribeOfficeSitesResponseBodyOfficeSites setNmVersion(String nmVersion) {
            this.nmVersion = nmVersion;
            return this;
        }
        public String getNmVersion() {
            return this.nmVersion;
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

        public DescribeOfficeSitesResponseBodyOfficeSites setResourceAmounts(java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesResourceAmounts> resourceAmounts) {
            this.resourceAmounts = resourceAmounts;
            return this;
        }
        public java.util.List<DescribeOfficeSitesResponseBodyOfficeSitesResourceAmounts> getResourceAmounts() {
            return this.resourceAmounts;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setSecurityProtection(String securityProtection) {
            this.securityProtection = securityProtection;
            return this;
        }
        public String getSecurityProtection() {
            return this.securityProtection;
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

        public DescribeOfficeSitesResponseBodyOfficeSites setSubnetMode(String subnetMode) {
            this.subnetMode = subnetMode;
            return this;
        }
        public String getSubnetMode() {
            return this.subnetMode;
        }

        public DescribeOfficeSitesResponseBodyOfficeSites setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
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

        public DescribeOfficeSitesResponseBodyOfficeSites setTotalResourceAmount(Long totalResourceAmount) {
            this.totalResourceAmount = totalResourceAmount;
            return this;
        }
        public Long getTotalResourceAmount() {
            return this.totalResourceAmount;
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

        public DescribeOfficeSitesResponseBodyOfficeSites setVplVersion(String vplVersion) {
            this.vplVersion = vplVersion;
            return this;
        }
        public String getVplVersion() {
            return this.vplVersion;
        }

    }

}
