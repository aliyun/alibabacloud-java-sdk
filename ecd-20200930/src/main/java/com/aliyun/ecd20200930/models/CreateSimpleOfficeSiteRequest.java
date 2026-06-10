// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSimpleOfficeSiteRequest extends TeaModel {
    @NameInMap("AccessAttribute")
    public String accessAttribute;

    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AuthorityHost")
    public String authorityHost;

    /**
     * <p>The peak public bandwidth. Valid values: 10 to 200. Unit: Mbps.
     * This parameter is valid only when <code>EnableInternetAccess</code> is set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * <blockquote>
     * <p>If you want to connect to cloud desktops over a VPC, attach the office site to the same CEN instance that is connected to your on-premises network by a VPN or an Express Connect circuit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cen-3gwy16dojz1m65****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the CEN instance.</p>
     * <ul>
     * <li><p>If you do not specify CenId, or if the CEN instance belongs to your Alibaba Cloud account, this parameter is not required.</p>
     * </li>
     * <li><p>If the CEN instance is owned by another Alibaba Cloud account, specify the ID of that account.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>118272523431****</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    /**
     * <p>The IPv4 CIDR block for the office site\&quot;s Virtual Private Cloud (VPC). This parameter is required for standard office sites. The system automatically creates a VPC based on the specified IPv4 CIDR block. Use one of the following CIDR blocks or their subnets:</p>
     * <ul>
     * <li><p><code>10.0.0.0/12</code> (The valid mask range is 12 to 24 bits.)</p>
     * </li>
     * <li><p><code>172.16.0.0/12</code> (The valid mask range is 12 to 24 bits.)</p>
     * </li>
     * <li><p><code>192.168.0.0/16</code> (The valid mask range is 16 to 24 bits.)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/12</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>Specifies whether to create a Cloud Box office site.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CloudBoxOfficeSite")
    public Boolean cloudBoxOfficeSite;

    /**
     * <p>Specifies how clients can connect to cloud desktops.</p>
     * <blockquote>
     * <p>VPC connections rely on the Alibaba Cloud PrivateLink service, which is free of charge. If you set this parameter to <code>VPC</code> or <code>Any</code>, the system automatically enables the PrivateLink service.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Eid")
    public String eid;

    /**
     * <p>Specifies whether to grant users local administrator privileges on their cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>Specifies whether to enable internet access.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableInternetAccess")
    public Boolean enableInternetAccess;

    /**
     * <p>Specifies whether to enable trusted device verification.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedVerifyZeroDevice")
    public Boolean needVerifyZeroDevice;

    /**
     * <p>The name of the office site. The name must be 2 to 255 characters in length. It must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>TestOfficeSite_Simple</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to get a list of regions that support Elastic Desktop Service (ECD).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The vSwitch ID. This parameter is required when you create a Cloud Box office site.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    /**
     * <p>The verification code. If the CEN instance is owned by another Alibaba Cloud account, you must first call <a href="https://help.aliyun.com/document_detail/335132.html">SendVerifyCode</a> to obtain a verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    /**
     * <p>The type of the office site.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("VpcType")
    public String vpcType;

    public static CreateSimpleOfficeSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimpleOfficeSiteRequest self = new CreateSimpleOfficeSiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimpleOfficeSiteRequest setAccessAttribute(String accessAttribute) {
        this.accessAttribute = accessAttribute;
        return this;
    }
    public String getAccessAttribute() {
        return this.accessAttribute;
    }

    public CreateSimpleOfficeSiteRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateSimpleOfficeSiteRequest setAuthorityHost(String authorityHost) {
        this.authorityHost = authorityHost;
        return this;
    }
    public String getAuthorityHost() {
        return this.authorityHost;
    }

    public CreateSimpleOfficeSiteRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateSimpleOfficeSiteRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateSimpleOfficeSiteRequest setCenOwnerId(Long cenOwnerId) {
        this.cenOwnerId = cenOwnerId;
        return this;
    }
    public Long getCenOwnerId() {
        return this.cenOwnerId;
    }

    public CreateSimpleOfficeSiteRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateSimpleOfficeSiteRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public CreateSimpleOfficeSiteRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public CreateSimpleOfficeSiteRequest setCloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
        this.cloudBoxOfficeSite = cloudBoxOfficeSite;
        return this;
    }
    public Boolean getCloudBoxOfficeSite() {
        return this.cloudBoxOfficeSite;
    }

    public CreateSimpleOfficeSiteRequest setDesktopAccessType(String desktopAccessType) {
        this.desktopAccessType = desktopAccessType;
        return this;
    }
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    public CreateSimpleOfficeSiteRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateSimpleOfficeSiteRequest setEid(String eid) {
        this.eid = eid;
        return this;
    }
    public String getEid() {
        return this.eid;
    }

    public CreateSimpleOfficeSiteRequest setEnableAdminAccess(Boolean enableAdminAccess) {
        this.enableAdminAccess = enableAdminAccess;
        return this;
    }
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    public CreateSimpleOfficeSiteRequest setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
        return this;
    }
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    public CreateSimpleOfficeSiteRequest setNeedVerifyZeroDevice(Boolean needVerifyZeroDevice) {
        this.needVerifyZeroDevice = needVerifyZeroDevice;
        return this;
    }
    public Boolean getNeedVerifyZeroDevice() {
        return this.needVerifyZeroDevice;
    }

    public CreateSimpleOfficeSiteRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public CreateSimpleOfficeSiteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSimpleOfficeSiteRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateSimpleOfficeSiteRequest setVSwitchId(java.util.List<String> vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateSimpleOfficeSiteRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public CreateSimpleOfficeSiteRequest setVpcType(String vpcType) {
        this.vpcType = vpcType;
        return this;
    }
    public String getVpcType() {
        return this.vpcType;
    }

}
