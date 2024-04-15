// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorOfficeSiteRequest extends TeaModel {
    /**
     * <p>The hostname of the domain controller. The hostname must comply with the naming conventions for Windows hosts.</p>
     */
    @NameInMap("AdHostname")
    public String adHostname;

    /**
     * <p>The maximum public bandwidth of the Internet access package. Valid values: 0 to 200.\</p>
     * <p>If you do not specify this parameter or you set this parameter to 0, Internet access is disabled.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the CEN instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The Alibaba Cloud account that creates the Cloud Enterprise Network (CEN) instance.</p>
     * <br>
     * <p>*   If you do not specify the CenId parameter, or the CEN instance that is specified by the CenId parameter belongs to the current Alibaba Cloud account, skip this parameter.</p>
     * <p>*   If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    /**
     * <p>The IPv4 CIDR block of the virtual private cloud (VPC) that your office network uses. The system creates a VPC for your office network based on the IPv4 CIDR block. We recommend that you set this parameter to one of the following CIDR blocks and their subnets:</p>
     * <br>
     * <p>*   `10.0.0.0/12` (subnet mask range: 12 to 24 bits)</p>
     * <p>*   `172.16.0.0/12` (subnet mask range: 12 to 24 bits)</p>
     * <p>*   `192.168.0.0/16` (subnet mask range: 16 to 24 bits)</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The method to connect to cloud computers from WUYING clients.</p>
     * <br>
     * <p>>  The VPC connection depends on Alibaba Cloud PrivateLink. You can use PrivateLink for free. When you set this parameter to `VPC` or `Any`, PrivateLink is automatically activated.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>- Internet: connects clients to cloud desktops only over the Internet. [Default]</p>
     * <p>- VPC: connects clients to cloud desktops only over a VPC.</p>
     * <p>- Any: connects clients to cloud desktops over the Internet or a VPC. You can select a connection method based on your business requirements when you connect to your cloud desktop from a client.</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    /**
     * <p>The IP address of the DNS server of the enterprise AD system. You can specify only one IP address.</p>
     */
    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    /**
     * <p>The domain name of the enterprise AD system. You can register each domain name only once.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The password of the domain administrator. The password can be up to 64 characters in length.</p>
     */
    @NameInMap("DomainPassword")
    public String domainPassword;

    /**
     * <p>The username of the domain administrator. The username can be up to 64 characters in length.</p>
     * <br>
     * <p>> Specify the username by using sAMAccountName instead of userPrincipalName.</p>
     */
    @NameInMap("DomainUserName")
    public String domainUserName;

    /**
     * <p>Specifies whether to grant the local administrator permissions to users that are authorized to use cloud computers in the office network.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    (default)</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>Specifies whether to enable Internet access.</p>
     */
    @NameInMap("EnableInternetAccess")
    public Boolean enableInternetAccess;

    /**
     * <p>Specifies whether to enable multi-factor authentication (MFA).</p>
     */
    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    /**
     * <p>The office network name. The name must be 2 to 255 characters in length. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.\</p>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The protocol type.</p>
     * <br>
     * <p>Valid value:</p>
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
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
    public Long specification;

    /**
     * <p>The DNS address of the enterprise AD subdomain. If you specify `SubDomainName` but do not specify this parameter, the DNS address of the subdomain is the same as the DNS address of the parent domain.</p>
     */
    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

    /**
     * <p>The domain name of the enterprise AD subdomain.</p>
     */
    @NameInMap("SubDomainName")
    public String subDomainName;

    /**
     * <p>The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the [SendVerifyCode](~~436847~~) operation to obtain the verification code.</p>
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
