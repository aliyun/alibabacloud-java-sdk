// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSimpleOfficeSiteRequest extends TeaModel {
    /**
     * <p>The access attribute of the office network (workspace).</p>
     * 
     * <strong>example:</strong>
     * <p>Private</p>
     */
    @NameInMap("AccessAttribute")
    public String accessAttribute;

    /**
     * <p>The account type.</p>
     * 
     * <strong>example:</strong>
     * <p>SIMPLE</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The authority URL of the identity authentication service.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://login.microsoftonline.com">https://login.microsoftonline.com</a></p>
     */
    @NameInMap("AuthorityHost")
    public String authorityHost;

    /**
     * <p>The peak Internet bandwidth. Valid values: 10 to 200. Unit: Mbit/s.
     * You can specify this parameter when <code>EnableInternetAccess</code> is set to <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The instance ID of the Cloud Enterprise Network (CEN) instance.</p>
     * <blockquote>
     * <p>To connect to cloud desktops over a VPC connection, add the office network to a CEN instance. The CEN instance is the one that the on-premises network connects to by using a VPN or Express Connect circuit.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cen-3gwy16dojz1m65****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The Alibaba Cloud account ID to which the CEN instance belongs.</p>
     * <ul>
     * <li>If CenId is not specified or the specified CEN instance belongs to the current Alibaba Cloud account, you do not need to specify this parameter.</li>
     * <li>If the specified CEN instance belongs to another Alibaba Cloud account, specify the Alibaba Cloud account ID of that account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>118272523431****</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    /**
     * <p>The IPv4 CIDR block of the VPC for the office network. This parameter is required for advanced office networks. The system uses automatic creation of a VPC based on the specified IPv4 CIDR block. Use one of the following CIDR blocks or their subnets:</p>
     * <ul>
     * <li><code>10.0.0.0/12</code> (valid mask range: 12 to 24 bits)</li>
     * <li><code>172.16.0.0/12</code> (valid mask range: 12 to 24 bits)</li>
     * <li><code>192.168.0.0/16</code> (valid mask range: 16 to 24 bits)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/12</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The client ID registered with the identity provider application.</p>
     * 
     * <strong>example:</strong>
     * <p>a2c8f7e4-1b3d-4c5e-9f0a-6d7b8c9e****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client secret registered with the identity provider application.</p>
     * 
     * <strong>example:</strong>
     * <p>sct-9f3e2d1c****</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>Specifies whether the office network is a CloudBox office network.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CloudBoxOfficeSite")
    public Boolean cloudBoxOfficeSite;

    /**
     * <p>The access method allowed when connecting to cloud desktops.</p>
     * <blockquote>
     * <p>The VPC connection method depends on the Alibaba Cloud PrivateLink service, which is free of charge. If this parameter is set to <code>VPC</code> or <code>Any</code>, the system automatically activates the PrivateLink service.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    /**
     * <p>The domain name of the enterprise AD.</p>
     * 
     * <strong>example:</strong>
     * <p>domain.local</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The enterprise ID (EID).</p>
     * 
     * <strong>example:</strong>
     * <p>e-1234abcd****</p>
     */
    @NameInMap("Eid")
    public String eid;

    /**
     * <p>Specifies whether to grant local administrator permissions to users who use cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>Specifies whether to enable public network access.</p>
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
     * <p>The name of the office network. The name must be 2 to 255 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TestOfficeSite_Simple</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The tenant ID of the identity provider.</p>
     * 
     * <strong>example:</strong>
     * <p>72f988bf-86f1-41af-91ab-2d7cd011****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the vSwitch in the VPC. This parameter is required when you create a CloudBox office network.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    /**
     * <p>The verification code. If the specified CEN instance belongs to another Alibaba Cloud account, call <a href="https://help.aliyun.com/document_detail/335132.html">SendVerifyCode</a> to obtain the verification code first.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    /**
     * <p>The type of the office network.</p>
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
