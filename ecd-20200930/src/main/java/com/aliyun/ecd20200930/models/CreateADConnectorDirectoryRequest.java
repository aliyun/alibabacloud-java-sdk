// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorDirectoryRequest extends TeaModel {
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

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

    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Specification")
    public Long specification;

    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

    @NameInMap("SubDomainName")
    public String subDomainName;

    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    public static CreateADConnectorDirectoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateADConnectorDirectoryRequest self = new CreateADConnectorDirectoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateADConnectorDirectoryRequest setDesktopAccessType(String desktopAccessType) {
        this.desktopAccessType = desktopAccessType;
        return this;
    }
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    public CreateADConnectorDirectoryRequest setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
        return this;
    }
    public String getDirectoryName() {
        return this.directoryName;
    }

    public CreateADConnectorDirectoryRequest setDnsAddress(java.util.List<String> dnsAddress) {
        this.dnsAddress = dnsAddress;
        return this;
    }
    public java.util.List<String> getDnsAddress() {
        return this.dnsAddress;
    }

    public CreateADConnectorDirectoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateADConnectorDirectoryRequest setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }
    public String getDomainPassword() {
        return this.domainPassword;
    }

    public CreateADConnectorDirectoryRequest setDomainUserName(String domainUserName) {
        this.domainUserName = domainUserName;
        return this;
    }
    public String getDomainUserName() {
        return this.domainUserName;
    }

    public CreateADConnectorDirectoryRequest setEnableAdminAccess(Boolean enableAdminAccess) {
        this.enableAdminAccess = enableAdminAccess;
        return this;
    }
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    public CreateADConnectorDirectoryRequest setMfaEnabled(Boolean mfaEnabled) {
        this.mfaEnabled = mfaEnabled;
        return this;
    }
    public Boolean getMfaEnabled() {
        return this.mfaEnabled;
    }

    public CreateADConnectorDirectoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateADConnectorDirectoryRequest setSpecification(Long specification) {
        this.specification = specification;
        return this;
    }
    public Long getSpecification() {
        return this.specification;
    }

    public CreateADConnectorDirectoryRequest setSubDomainDnsAddress(java.util.List<String> subDomainDnsAddress) {
        this.subDomainDnsAddress = subDomainDnsAddress;
        return this;
    }
    public java.util.List<String> getSubDomainDnsAddress() {
        return this.subDomainDnsAddress;
    }

    public CreateADConnectorDirectoryRequest setSubDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
        return this;
    }
    public String getSubDomainName() {
        return this.subDomainName;
    }

    public CreateADConnectorDirectoryRequest setVSwitchId(java.util.List<String> vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

}
