// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorOfficeSiteRequest extends TeaModel {
    @NameInMap("AccessAttribute")
    public String accessAttribute;

    /**
     * <p>The domain controller hostname.
     * The hostname must comply with Windows hostname naming conventions.</p>
     * 
     * <strong>example:</strong>
     * <p>beijing-ad01</p>
     */
    @NameInMap("AdHostname")
    public String adHostname;

    /**
     * <p>The hostname of the backup domain controller.</p>
     * 
     * <strong>example:</strong>
     * <p>dc002</p>
     */
    @NameInMap("BackupDCHostname")
    public String backupDCHostname;

    /**
     * <p>The DNS address of the backup domain controller.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.2.100</p>
     */
    @NameInMap("BackupDns")
    public String backupDns;

    /**
     * <p>The peak public bandwidth, specified in Mbit/s. The value can range from 0 to 200.<br>
     * If you omit this parameter or set it to 0, internet access is disabled.<br></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the CEN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-3gwy16dojz1m65****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the Cloud Enterprise Network (CEN) instance.</p>
     * <ul>
     * <li><p>If you do not specify <code>CenId</code>, or the specified CEN instance belongs to your Alibaba Cloud account, you do not need to specify this parameter.</p>
     * </li>
     * <li><p>If the specified CEN instance belongs to another Alibaba Cloud account, you must specify that account\&quot;s ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>102681951715****</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    /**
     * <p>The IPv4 CIDR block for the office site\&quot;s VPC. The system uses this IPv4 CIDR block to automatically create a VPC. We recommend that you use one of the following CIDR blocks or their subnets:</p>
     * <ul>
     * <li><p><code>10.0.0.0/12</code> (The subnet mask length must be 12 to 24 bits.)</p>
     * </li>
     * <li><p><code>172.16.0.0/12</code> (The subnet mask length must be 12 to 24 bits.)</p>
     * </li>
     * <li><p><code>192.168.0.0/16</code> (The subnet mask length must be 16 to 24 bits.)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The method for connecting to cloud desktops.</p>
     * <blockquote>
     * <p>VPC connections are established using Alibaba Cloud PrivateLink, which is a free service. If you set this parameter to <code>VPC</code> or <code>Any</code>, PrivateLink is automatically enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    /**
     * <p>An array that contains the IP address of the DNS server for the enterprise AD. You can specify only one IP address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    /**
     * <p>The domain name for the enterprise AD. Each domain name must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The domain administrator\&quot;s password. The password cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>testPassword</p>
     */
    @NameInMap("DomainPassword")
    public String domainPassword;

    /**
     * <p>The domain administrator\&quot;s username. The username cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>Use the sAMAccountName, not the userPrincipalName.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Administrator</p>
     */
    @NameInMap("DomainUserName")
    public String domainUserName;

    /**
     * <p>Specifies whether to grant local administrator permissions to cloud desktop users. Default: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>This parameter is deprecated. Use the <code>Bandwidth</code> parameter to manage internet access.</p>
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
     * <p>The name of the office site. The name must be 2 to 255 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).<br>
     * This parameter is empty by default.<br></p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The ID of the region. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service (EDS).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The AD Connector type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Specification")
    public Long specification;

    /**
     * <p>The DNS address of the enterprise AD child domain. If you specify <code>SubDomainName</code> but not this parameter, the DNS address of the child domain is considered the same as that of the parent domain.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

    /**
     * <p>The domain name of the enterprise AD child domain.</p>
     * 
     * <strong>example:</strong>
     * <p>child.example.com</p>
     */
    @NameInMap("SubDomainName")
    public String subDomainName;

    /**
     * <p>The list of vSwitch IDs.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    /**
     * <p>The verification code. If the <code>CenId</code> that you specify belongs to another Alibaba Cloud account, you must first call the <a href="https://help.aliyun.com/document_detail/436847.html">SendVerifyCode</a> operation to obtain the verification code.</p>
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

    public CreateADConnectorOfficeSiteRequest setAccessAttribute(String accessAttribute) {
        this.accessAttribute = accessAttribute;
        return this;
    }
    public String getAccessAttribute() {
        return this.accessAttribute;
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

    public CreateADConnectorOfficeSiteRequest setVSwitchId(java.util.List<String> vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateADConnectorOfficeSiteRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

}
