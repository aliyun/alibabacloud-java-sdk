// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorOfficeSiteRequest extends TeaModel {
    /**
     * <p>The hostname of the domain controller. The hostname must comply with the naming conventions for Windows hosts.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing-ad01</p>
     */
    @NameInMap("AdHostname")
    public String adHostname;

    @NameInMap("BackupDCHostname")
    public String backupDCHostname;

    @NameInMap("BackupDns")
    public String backupDns;

    /**
     * <p>The maximum public bandwidth of the Internet access package. Valid values: 0 to 200.\
     * If you do not specify this parameter or you set this parameter to 0, Internet access is disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-3gwy16dojz1m65****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The Alibaba Cloud account that creates the Cloud Enterprise Network (CEN) instance.</p>
     * <ul>
     * <li>If you do not specify the CenId parameter, or the CEN instance that is specified by the CenId parameter belongs to the current Alibaba Cloud account, skip this parameter.</li>
     * <li>If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the Alibaba Cloud account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>102681951715****</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    /**
     * <p>The IPv4 CIDR block of the virtual private cloud (VPC) that your office network uses. The system creates a VPC for your office network based on the IPv4 CIDR block. We recommend that you set this parameter to one of the following CIDR blocks and their subnets:</p>
     * <ul>
     * <li><code>10.0.0.0/12</code> (subnet mask range: 12 to 24 bits)</li>
     * <li><code>172.16.0.0/12</code> (subnet mask range: 12 to 24 bits)</li>
     * <li><code>192.168.0.0/16</code> (subnet mask range: 16 to 24 bits)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The method to connect to cloud computers from Alibaba Cloud Workspace clients.</p>
     * <blockquote>
     * <p> The VPC connection depends on Alibaba Cloud PrivateLink. You can use PrivateLink for free. When you set this parameter to <code>VPC</code> or <code>Any</code>, PrivateLink is automatically activated.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>Internet: connects clients to cloud desktops only over the Internet. [Default]</li>
     * <li>VPC: connects clients to cloud desktops only over a VPC.</li>
     * <li>Any: connects clients to cloud desktops over the Internet or a VPC. You can select a connection method based on your business requirements when you connect to your cloud desktop from a client.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    /**
     * <p>The IP address of the DNS server of the enterprise AD system. You can specify only one IP address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    /**
     * <p>The domain name of the enterprise AD system. You can register each domain name only once.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The password of the domain administrator. The password can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("DomainPassword")
    public String domainPassword;

    /**
     * <p>The username of the domain administrator. The username can be up to 64 characters in length.</p>
     * <blockquote>
     * <p>Specify the username by using sAMAccountName instead of userPrincipalName.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Administrator</p>
     */
    @NameInMap("DomainUserName")
    public String domainUserName;

    /**
     * <p>Specifies whether to grant the local administrator permissions to users that are authorized to use cloud computers in the office network.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><!-- -->
     * 
     * <p>true</p>
     * <!-- -->
     * 
     * <p>(default)</p>
     * <!-- -->
     * </li>
     * <li><!-- -->
     * 
     * <p>false</p>
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>Specifies whether to enable Internet access.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableInternetAccess")
    public Boolean enableInternetAccess;

    /**
     * <p>Specifies whether to enable multi-factor authentication (MFA).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    /**
     * <p>The office network name. The name must be 2 to 255 characters in length. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-). It must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.\
     * This parameter is empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The protocol type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li><p>Adaptive Streaming Protocol (ASP)</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
    public Long specification;

    /**
     * <p>The DNS address of the enterprise AD subdomain. If you specify <code>SubDomainName</code> but do not specify this parameter, the DNS address of the subdomain is the same as the DNS address of the parent domain.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

    /**
     * <p>The domain name of the enterprise AD subdomain.</p>
     * 
     * <strong>example:</strong>
     * <p>child.example.com</p>
     */
    @NameInMap("SubDomainName")
    public String subDomainName;

    /**
     * <p>The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the <a href="https://help.aliyun.com/document_detail/436847.html">SendVerifyCode</a> operation to obtain the verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    public static CreateADConnectorOfficeSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateADConnectorOfficeSiteRequest self = new CreateADConnectorOfficeSiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateADConnectorOfficeSiteRequest setAdHostname(String adHostname) {
        this.adHostname = adHostname;
        return this;
    }
    public String getAdHostname() {
        return this.adHostname;
    }

    public CreateADConnectorOfficeSiteRequest setBackupDCHostname(String backupDCHostname) {
        this.backupDCHostname = backupDCHostname;
        return this;
    }
    public String getBackupDCHostname() {
        return this.backupDCHostname;
    }

    public CreateADConnectorOfficeSiteRequest setBackupDns(String backupDns) {
        this.backupDns = backupDns;
        return this;
    }
    public String getBackupDns() {
        return this.backupDns;
    }

    public CreateADConnectorOfficeSiteRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateADConnectorOfficeSiteRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateADConnectorOfficeSiteRequest setCenOwnerId(Long cenOwnerId) {
        this.cenOwnerId = cenOwnerId;
        return this;
    }
    public Long getCenOwnerId() {
        return this.cenOwnerId;
    }

    public CreateADConnectorOfficeSiteRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateADConnectorOfficeSiteRequest setDesktopAccessType(String desktopAccessType) {
        this.desktopAccessType = desktopAccessType;
        return this;
    }
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    public CreateADConnectorOfficeSiteRequest setDnsAddress(java.util.List<String> dnsAddress) {
        this.dnsAddress = dnsAddress;
        return this;
    }
    public java.util.List<String> getDnsAddress() {
        return this.dnsAddress;
    }

    public CreateADConnectorOfficeSiteRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateADConnectorOfficeSiteRequest setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }
    public String getDomainPassword() {
        return this.domainPassword;
    }

    public CreateADConnectorOfficeSiteRequest setDomainUserName(String domainUserName) {
        this.domainUserName = domainUserName;
        return this;
    }
    public String getDomainUserName() {
        return this.domainUserName;
    }

    public CreateADConnectorOfficeSiteRequest setEnableAdminAccess(Boolean enableAdminAccess) {
        this.enableAdminAccess = enableAdminAccess;
        return this;
    }
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    public CreateADConnectorOfficeSiteRequest setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
        return this;
    }
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    public CreateADConnectorOfficeSiteRequest setMfaEnabled(Boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
        return this;
    }
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
    }

    public CreateADConnectorOfficeSiteRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public CreateADConnectorOfficeSiteRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public CreateADConnectorOfficeSiteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateADConnectorOfficeSiteRequest setSpecification(Long specification) {
        this.specification = specification;
        return this;
    }
    public Long getSpecification() {
        return this.specification;
    }

    public CreateADConnectorOfficeSiteRequest setSubDomainDnsAddress(java.util.List<String> subDomainDnsAddress) {
        this.subDomainDnsAddress = subDomainDnsAddress;
        return this;
    }
    public java.util.List<String> getSubDomainDnsAddress() {
        return this.subDomainDnsAddress;
    }

    public CreateADConnectorOfficeSiteRequest setSubDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
        return this;
    }
    public String getSubDomainName() {
        return this.subDomainName;
    }

    public CreateADConnectorOfficeSiteRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
