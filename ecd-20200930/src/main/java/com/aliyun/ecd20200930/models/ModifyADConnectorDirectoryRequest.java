// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorDirectoryRequest extends TeaModel {
    @NameInMap("AdHostname")
    public String adHostname;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("DirectoryName")
    public String directoryName;

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

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

    @NameInMap("SubDomainName")
    public String subDomainName;

    public static ModifyADConnectorDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyADConnectorDirectoryRequest self = new ModifyADConnectorDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyADConnectorDirectoryRequest setAdHostname(String adHostname) {
        this.adHostname = adHostname;
        return this;
    }
    public String getAdHostname() {
        return this.adHostname;
    }

    public ModifyADConnectorDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ModifyADConnectorDirectoryRequest setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }
    public String getDirectoryName() {
        return this.directoryName;
    }

    public ModifyADConnectorDirectoryRequest setDnsAddress(java.util.List<String> dnsAddress) {
        this.dnsAddress = dnsAddress;
        return this;
    }
    public java.util.List<String> getDnsAddress() {
        return this.dnsAddress;
    }

    public ModifyADConnectorDirectoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyADConnectorDirectoryRequest setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }
    public String getDomainPassword() {
        return this.domainPassword;
    }

    public ModifyADConnectorDirectoryRequest setDomainUserName(String domainUserName) {
        this.domainUserName = domainUserName;
        return this;
    }
    public String getDomainUserName() {
        return this.domainUserName;
    }

    public ModifyADConnectorDirectoryRequest setMfaEnabled(Boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
        return this;
    }
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
    }

    public ModifyADConnectorDirectoryRequest setOUName(String OUName) {
        this.OUName = OUName;
        return this;
    }
    public String getOUName() {
        return this.OUName;
    }

    public ModifyADConnectorDirectoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyADConnectorDirectoryRequest setSubDomainDnsAddress(java.util.List<String> subDomainDnsAddress) {
        this.subDomainDnsAddress = subDomainDnsAddress;
        return this;
    }
    public java.util.List<String> getSubDomainDnsAddress() {
        return this.subDomainDnsAddress;
    }

    public ModifyADConnectorDirectoryRequest setSubDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
        return this;
    }
    public String getSubDomainName() {
        return this.subDomainName;
    }

}
