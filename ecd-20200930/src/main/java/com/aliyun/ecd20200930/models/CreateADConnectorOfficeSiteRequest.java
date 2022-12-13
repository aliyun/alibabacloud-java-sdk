// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorOfficeSiteRequest extends TeaModel {
    // Host name. The host name must comply with the Windows host convention.
    @NameInMap("AdHostname")
    public String adHostname;

    // The maximum public bandwidth value. Valid values: 0 to 200.
    // 
    // If you do not specify this parameter or you set this parameter to 0, Internet access is disabled.
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // The ID of the CEN instance.
    @NameInMap("CenId")
    public String cenId;

    // The ID of the Alibaba Cloud account to which the Cloud Enterprise Network (CEN) instance belongs.
    // 
    // *   If you do not specify the CenId parameter, or the CEN instance that you specify for the CenId parameter belongs to the current Alibaba Cloud account, skip this parameter.
    // *   If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the exact Alibaba Cloud account.
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    // The IPv4 CIDR block in the secure office network of the workspace. The system creates a virtual private cloud (VPC) based on the IPv4 CIDR block that you specify. We recommend that you set the IPv4 CIDR block to 10.0.0.0/12, 172.16.0.0/12, 192.168.0.0/16, or a subnet of these CIDR blocks. If you set the IPv4 CIDR block to 10.0.0.0/12 or 172.16.0.0/12, the mask is 12 to 24 bits in length. If you set the IPv4 CIDR block to 192.168.0.0/16, the mask is 16 to 24 bits in length.
    @NameInMap("CidrBlock")
    public String cidrBlock;

    // The method that you use to connect to cloud desktops. Valid values:
    // 
    // *   Internet: connects clients to cloud desktops only over the Internet.
    // *   VPC: connects clients to cloud desktops only over a VPC.
    // *   Any: connects clients to cloud desktops over the Internet or a VPC. You can select a connection method when you use a client to connect to the cloud desktop.
    // 
    // Default value: Internet.
    // 
    // >  The VPC connection method is provided by Alibaba Cloud PrivateLink. You are not charged for PrivateLink. When you set this parameter to VPC or Any, PrivateLink is automatically activated.
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    // The domain name of the enterprise AD system. You can register each domain name only once.
    @NameInMap("DomainName")
    public String domainName;

    // The password of the domain administrator. The password can be up to 64 characters in length.
    @NameInMap("DomainPassword")
    public String domainPassword;

    // The username of the domain administrator. The username can be up to 64 characters in length.
    // 
    // >  Specify the value of the sAMAccountName parameter instead of the value of the userPrincipalName parameter as the username.
    @NameInMap("DomainUserName")
    public String domainUserName;

    // Specifies whether to grant the permissions of the local administrator to the desktop users. Default value: true.
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    // Specifies whether to enable Internet access.
    @NameInMap("EnableInternetAccess")
    public Boolean enableInternetAccess;

    // Specifies whether to enable multi-factor authentication (MFA).
    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    // The name of the workspace. The name must be 2 to 255 characters in length. It must start with a letter and cannot start with `http://` or `https://`. It can contain digits, colons (:), underscores (\_), and hyphens (-).
    // 
    // Default value: null.
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    // Protocol Type. Valid values: ASP.
    @NameInMap("ProtocolType")
    public String protocolType;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // Specification of AD Connector.
    // 
    // *   1: General.
    // *   2: High.
    @NameInMap("Specification")
    public Long specification;

    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

    // The domain name of the enterprise AD subdomain.
    @NameInMap("SubDomainName")
    public String subDomainName;

    // The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the SendVerifyCode operation to obtain the verification code.
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
