// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyADConnectorOfficeSiteRequest extends TeaModel {
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
     * <p>The IP address of the DNS server corresponding to the enterprise AD. Currently, only one IP address can be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.<em>.</em></p>
     */
    @NameInMap("DnsAddress")
    public java.util.List<String> dnsAddress;

    /**
     * <p>The domain name of the enterprise AD. The same domain name can be registered only once.</p>
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
     * <p>Use sAMAccountName for the username. Do not use userPrincipalName.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Administrator</p>
     */
    @NameInMap("DomainUserName")
    public String domainUserName;

    /**
     * <p>Specifies whether to enable multi-factor authentication (MFA).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("MfaEnabled")
    public Boolean mfaEnabled;

    /**
     * <p>The organizational unit (OU) of the AD domain. You can call <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> to obtain the value.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com/Domain Controllers</p>
     */
    @NameInMap("OUName")
    public String OUName;

    /**
     * <p>The office network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The office network name. The name must be 2 to 255 characters in length. It must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

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
     * <p>The DNS address of the enterprise AD subdomain. Currently, only one address can be specified. If <code>SubDomainName</code> is specified but this parameter is not, the subdomain DNS defaults to the same value as the parent domain.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.<em>.</em></p>
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

    public ModifyADConnectorOfficeSiteRequest setBackupDCHostname(String backupDCHostname) {
        this.backupDCHostname = backupDCHostname;
        return this;
    }
    public String getBackupDCHostname() {
        return this.backupDCHostname;
    }

    public ModifyADConnectorOfficeSiteRequest setBackupDns(String backupDns) {
        this.backupDns = backupDns;
        return this;
    }
    public String getBackupDns() {
        return this.backupDns;
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
