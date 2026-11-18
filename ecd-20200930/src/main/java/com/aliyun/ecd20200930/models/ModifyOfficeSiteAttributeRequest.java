// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAttributeRequest extends TeaModel {
    /**
     * <p>The authority URL of the identity authentication service.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://login.microsoftonline.com">https://login.microsoftonline.com</a></p>
     */
    @NameInMap("AuthorityHost")
    public String authorityHost;

    /**
     * <p>The client ID registered for the identity provider application.</p>
     * 
     * <strong>example:</strong>
     * <p>a2c8f7e4-1b3d-4c5e-9f0a-6d7b8c9e****</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The client secret registered for the identity provider application.</p>
     * 
     * <strong>example:</strong>
     * <p>sct-9f3e2d1c****</p>
     */
    @NameInMap("ClientSecret")
    public String clientSecret;

    /**
     * <p>The access method allowed when connecting to cloud desktops.</p>
     * <blockquote>
     * <p>The VPC connection method relies on the Alibaba Cloud PrivateLink service, which is free of charge. If you set this parameter to <code>VPC</code> or <code>Any</code>, the system automatically activates the PrivateLink service for you.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
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
     * <p>Specifies whether to grant local administrator permissions to users of cloud desktops.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>Specifies whether to enable User Profile Management (UPM). Currently, you can only set this parameter to false to unbind UPM from the workspace. To enable UPM, call the CreateAndBindNasFileSystem operation.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableUpm")
    public Boolean enableUpm;

    /**
     * <p>Applies only to office networks with convenience accounts. Specifies whether secondary authentication is required during logon. If secondary authentication is enabled, the system checks for security risks when a convenience user logs on to the client. If risks are detected, the system sends a verification code to the email address associated with the account. The convenience user can log on to the client only after entering the correct verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedVerifyLoginRisk")
    public Boolean needVerifyLoginRisk;

    /**
     * <p>Applies only to office networks with convenience accounts. Specifies whether to enable device verification. For AD office networks, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NeedVerifyZeroDevice")
    public Boolean needVerifyZeroDevice;

    /**
     * <p>The office network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-882398****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The name of the office network. The name must be 2 to 255 characters in length, and can contain letters and Chinese characters. It must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>. It can contain digits, colons (:), underscores (_), and hyphens (-).<br>Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D Department Office Network</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Wuying Workspace.</p>
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
     * <p>The vSwitch ID. Currently, you can configure only one vSwitch.</p>
     */
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

    public ModifyOfficeSiteAttributeRequest setEnableUpm(Boolean enableUpm) {
        this.enableUpm = enableUpm;
        return this;
    }
    public Boolean getEnableUpm() {
        return this.enableUpm;
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
