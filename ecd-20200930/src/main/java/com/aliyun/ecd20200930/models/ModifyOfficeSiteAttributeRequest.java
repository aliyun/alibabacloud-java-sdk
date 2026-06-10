// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAttributeRequest extends TeaModel {
    @NameInMap("AuthorityHost")
    public String authorityHost;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The method for connecting to cloud computers.</p>
     * <blockquote>
     * <p>VPC connections use Alibaba Cloud PrivateLink, a free service. If you set this parameter to VPC or Any, PrivateLink is automatically activated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Specifies whether to grant cloud computer users local administrative permissions.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>Specifies whether to enable two-factor authentication. This parameter is applicable to only office sites that use convenience accounts. If enabled, the system performs a security check during logon. If the system detects a risk, it sends a verification code to the email address that is associated with the account. The user must enter the correct verification code to log on.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedVerifyLoginRisk")
    public Boolean needVerifyLoginRisk;

    /**
     * <p>Specifies whether to enable device verification. This feature is available only for office sites that use convenience accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedVerifyZeroDevice")
    public Boolean needVerifyZeroDevice;

    /**
     * <p>The ID of the office site.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-882398****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The name of the office site. The name must be 2 to 255 characters long. The name must start with a letter or a Chinese character, and cannot start with http\:// or https\://. It can contain digits, colons (:), underscores (_), and hyphens (-).<br>
     * This parameter is optional.<br></p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions where Elastic Desktop Service is available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    public static ModifyOfficeSiteAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteAttributeRequest self = new ModifyOfficeSiteAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteAttributeRequest setAuthorityHost(String authorityHost) {
        this.authorityHost = authorityHost;
        return this;
    }
    public String getAuthorityHost() {
        return this.authorityHost;
    }

    public ModifyOfficeSiteAttributeRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public ModifyOfficeSiteAttributeRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public ModifyOfficeSiteAttributeRequest setDesktopAccessType(String desktopAccessType) {
        this.desktopAccessType = desktopAccessType;
        return this;
    }
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    public ModifyOfficeSiteAttributeRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyOfficeSiteAttributeRequest setEnableAdminAccess(Boolean enableAdminAccess) {
        this.enableAdminAccess = enableAdminAccess;
        return this;
    }
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    public ModifyOfficeSiteAttributeRequest setNeedVerifyLoginRisk(Boolean needVerifyLoginRisk) {
        this.needVerifyLoginRisk = needVerifyLoginRisk;
        return this;
    }
    public Boolean getNeedVerifyLoginRisk() {
        return this.needVerifyLoginRisk;
    }

    public ModifyOfficeSiteAttributeRequest setNeedVerifyZeroDevice(Boolean needVerifyZeroDevice) {
        this.needVerifyZeroDevice = needVerifyZeroDevice;
        return this;
    }
    public Boolean getNeedVerifyZeroDevice() {
        return this.needVerifyZeroDevice;
    }

    public ModifyOfficeSiteAttributeRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifyOfficeSiteAttributeRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public ModifyOfficeSiteAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyOfficeSiteAttributeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyOfficeSiteAttributeRequest setVSwitchId(java.util.List<String> vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

}
