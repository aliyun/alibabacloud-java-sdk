// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorOfficeSiteRequest extends TeaModel {
    // The hostname of the domain controller. The hostname must comply with the naming conventions for hostnames in Windows.
    @NameInMap("AdHostname")
    public String adHostname;

    // Details of the IP addresses of the Domain Name System (DNS) servers that correspond to the enterprise AD system. You can specify only one IP address.
    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    // The domain name of the enterprise AD system. You can register each domain name only once.
    @NameInMap("DomainName")
    public String domainName;

    // The password of the domain administrator. The username can be up to 64 characters in length.
    @NameInMap("DomainPassword")
    public String domainPassword;

    // The username of the domain administrator. The username can be up to 64 characters in length.
    // 
    // > Specify the value of the sAMAccountName parameter instead of the value of the userPrincipalName parameter as the username.
    @NameInMap("DomainUserName")
    public String domainUserName;

    // Specifies whether to enable multi-factor authentication (MFA).\
    // Default value: false.
    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    // The name of the organizational unit (OU) in the AD domain. You can call the [ListUserAdOrganizationUnits](~~311259~~) operation to obtain the name of the OU.
    @NameInMap("OUName")
    public String OUName;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The name of the workspace. The name must be 2 to 255 characters in length. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    // The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The DNS address of the enterprise AD subdomain. You can specify only one IP address. If you specify a value for the `SubDomainName` parameter but you do not specify a value for this parameter, the DNS address of the subdomain is the same as the DNS address of the parent domain.
    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

    // The domain name of the enterprise AD subdomain.
    @NameInMap("SubDomainName")
    public String subDomainName;

    public static ModifyADConnectorOfficeSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyADConnectorOfficeSiteRequest self = new ModifyADConnectorOfficeSiteRequest();
        return TeaModel.build(map, self);
    }

    public ModifyADConnectorOfficeSiteRequest setAdHostname(String adHostname) {
        this.adHostname = adHostname;
        return this;
    }
    public String getAdHostname() {
        return this.adHostname;
    }

    public ModifyADConnectorOfficeSiteRequest setDnsAddress(java.util.List<String> dnsAddress) {
        this.dnsAddress = dnsAddress;
        return this;
    }
    public java.util.List<String> getDnsAddress() {
        return this.dnsAddress;
    }

    public ModifyADConnectorOfficeSiteRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyADConnectorOfficeSiteRequest setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }
    public String getDomainPassword() {
        return this.domainPassword;
    }

    public ModifyADConnectorOfficeSiteRequest setDomainUserName(String domainUserName) {
        this.domainUserName = domainUserName;
        return this;
    }
    public String getDomainUserName() {
        return this.domainUserName;
    }

    public ModifyADConnectorOfficeSiteRequest setMfaEnabled(Boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
        return this;
    }
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
    }

    public ModifyADConnectorOfficeSiteRequest setOUName(String OUName) {
        this.OUName = OUName;
        return this;
    }
    public String getOUName() {
        return this.OUName;
    }

    public ModifyADConnectorOfficeSiteRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifyADConnectorOfficeSiteRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public ModifyADConnectorOfficeSiteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyADConnectorOfficeSiteRequest setSubDomainDnsAddress(java.util.List<String> subDomainDnsAddress) {
        this.subDomainDnsAddress = subDomainDnsAddress;
        return this;
    }
    public java.util.List<String> getSubDomainDnsAddress() {
        return this.subDomainDnsAddress;
    }

    public ModifyADConnectorOfficeSiteRequest setSubDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
        return this;
    }
    public String getSubDomainName() {
        return this.subDomainName;
    }

}
