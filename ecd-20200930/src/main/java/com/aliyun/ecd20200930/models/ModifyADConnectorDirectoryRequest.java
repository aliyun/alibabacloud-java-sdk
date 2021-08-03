// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorDirectoryRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainUserName")
    public String domainUserName;

    @NameInMap("DomainPassword")
    public String domainPassword;

    @NameInMap("DirectoryName")
    public String directoryName;

    @NameInMap("SubDomainName")
    public String subDomainName;

    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

    public static ModifyADConnectorDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyADConnectorDirectoryRequest self = new ModifyADConnectorDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public ModifyADConnectorDirectoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyADConnectorDirectoryRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public ModifyADConnectorDirectoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyADConnectorDirectoryRequest setDomainUserName(String domainUserName) {
        this.domainUserName = domainUserName;
        return this;
    }
    public String getDomainUserName() {
        return this.domainUserName;
    }

    public ModifyADConnectorDirectoryRequest setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }
    public String getDomainPassword() {
        return this.domainPassword;
    }

    public ModifyADConnectorDirectoryRequest setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }
    public String getDirectoryName() {
        return this.directoryName;
    }

    public ModifyADConnectorDirectoryRequest setSubDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
        return this;
    }
    public String getSubDomainName() {
        return this.subDomainName;
    }

    public ModifyADConnectorDirectoryRequest setMfaEnabled(Boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
        return this;
    }
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
    }

    public ModifyADConnectorDirectoryRequest setDnsAddress(java.util.List<String> dnsAddress) {
        this.dnsAddress = dnsAddress;
        return this;
    }
    public java.util.List<String> getDnsAddress() {
        return this.dnsAddress;
    }

    public ModifyADConnectorDirectoryRequest setSubDomainDnsAddress(java.util.List<String> subDomainDnsAddress) {
        this.subDomainDnsAddress = subDomainDnsAddress;
        return this;
    }
    public java.util.List<String> getSubDomainDnsAddress() {
        return this.subDomainDnsAddress;
    }

}
