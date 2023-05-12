// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateADConnectorDirectoryRequest extends TeaModel {
    /**
     * <p>The AD trust password.</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("DirectoryName")
    public String directoryName;

    /**
     * <p>The fully qualified domain name (FQDN) of the enterprise AD system. The value must contain the hostname and the domain name. You can register each FQDN only once.</p>
     */
    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    /**
     * <p>The IP address of the DNS server of the enterprise AD system.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to grant the permissions of the local administrator to the regular user of the cloud desktop.</p>
     */
    @NameInMap("DomainPassword")
    public String domainPassword;

    /**
     * <p>The name of the AD directory. The name must be 2 to 255 characters in length, and can contain letters, digits, colons (:), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("DomainUserName")
    public String domainUserName;

    /**
     * <p>The DNS address of the enterprise AD subdomain.\</p>
     * <p>If you specify the `SubDomainName` parameter but you do not specify this parameter, the DNS address of the subdomain is the same as the DNS address of the parent domain.</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>The information that is returned.</p>
     */
    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    /**
     * <p>The ID of the AD directory.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The password of the domain administrator. The password can be up to 64 characters in length.</p>
     */
    @NameInMap("Specification")
    public Long specification;

    /**
     * <p>Details of the vSwitch IDs. You can specify only one vSwitch ID.</p>
     */
    @NameInMap("SubDomainDnsAddress")
    public java.util.List<String> subDomainDnsAddress;

    /**
     * <p>The FQDN of the enterprise AD subdomain. The value must contain the hostname and the subdomain name.</p>
     */
    @NameInMap("SubDomainName")
    public String subDomainName;

    /**
     * <p>The username of the domain administrator. The username can be up to 64 characters in length.</p>
     */
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
