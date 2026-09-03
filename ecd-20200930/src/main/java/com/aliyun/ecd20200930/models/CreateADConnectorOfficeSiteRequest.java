// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorOfficeSiteRequest extends TeaModel {
    /**
     * <p>The access attribute of the office network (workspace).</p>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
    @NameInMap("AccessAttribute")
    public String accessAttribute;

    /**
     * <p>The hostname of the domain controller. The hostname must comply with Windows hostname naming conventions.</p>
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
     * <p>The peak Internet bandwidth, in Mbit/s. Valid values: 0 to 200.<br>If you do not set this parameter or set it to 0, the Internet access feature is not enabled. Settings take effect immediately.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The instance ID of the Cloud Enterprise Network (CEN).</p>
     * 
     * <strong>example:</strong>
     * <p>cen-3gwy16dojz1m65****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The Alibaba Cloud account ID of the Cloud Enterprise Network (CEN) instance owner.</p>
     * <ul>
     * <li>If CenId is not specified, or the specified CenId belongs to the current Alibaba Cloud account, you do not need to specify this parameter.</li>
     * <li>If the specified CenId belongs to another Alibaba Cloud account, specify the Alibaba Cloud account ID of that account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>102681951715****</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    /**
     * <p>The IPv4 CIDR block of the office network VPC. The system uses automatic creation to provision a VPC based on the specified IPv4 CIDR block. Use one of the following CIDR blocks or their subnets as the IPv4 CIDR block:</p>
     * <ul>
     * <li><code>10.0.0.0/12</code> (valid mask range: 12 to 24 bits)</li>
     * <li><code>172.16.0.0/12</code> (valid mask range: 12 to 24 bits)</li>
     * <li><code>192.168.0.0/16</code> (valid mask range: 16 to 24 bits)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>47.100.XX.XX</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The access method allowed when connecting to cloud computers.</p>
     * <blockquote>
     * <p>The VPC connection method depends on the Alibaba Cloud PrivateLink service, which is free of charge. If this parameter is set to <code>VPC</code> or <code>Any</code>, the system automatically activates the PrivateLink service for you.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    /**
     * <p>The IP address of the DNS server corresponding to the enterprise AD. Currently, only one IP address is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    /**
     * <p>The domain name of the enterprise AD. The same domain name can be registered only once.</p>
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
     * <p>Use the sAMAccountName format for the username. Do not use the userPrincipalName format.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Administrator</p>
     */
    @NameInMap("DomainUserName")
    public String domainUserName;

    /**
     * <p>Specifies whether to grant local administrator permissions to users who use cloud computers.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>Specifies whether public network access is enabled. This parameter indicates whether the feature is active.</p>
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
     * <p>The name of the office network. The name must be 2 to 255 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.<br>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>RD_Office_Network</p>
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
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The AD Connector specification.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Specification")
    public Long specification;

    /**
     * <p>The DNS address of the enterprise AD subdomain. If <code>SubDomainName</code> is specified but this parameter is not, the subdomain DNS is considered the same as the parent domain DNS.</p>
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
     * <p>The list of vSwitch IDs.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    /**
     * <p>The verification code. If the specified CenId belongs to another Alibaba Cloud account, you must first call <a href="https://help.aliyun.com/document_detail/436847.html">SendVerifyCode</a> to obtain the verification code.</p>
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
