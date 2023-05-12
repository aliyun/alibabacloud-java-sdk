// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorOfficeSiteRequest extends TeaModel {
    @NameInMap("AdHostname")
    public String adHostname;

    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainPassword")
    public String domainPassword;

    @NameInMap("DomainUserName")
    public String domainUserName;

    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    @NameInMap("OUName")
    public String OUName;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

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
