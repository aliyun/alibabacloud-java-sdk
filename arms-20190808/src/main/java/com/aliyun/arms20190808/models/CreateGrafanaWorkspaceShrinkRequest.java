// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateGrafanaWorkspaceShrinkRequest extends TeaModel {
    @NameInMap("AccountNumber")
    public String accountNumber;

    /**
     * <p>The language. Default value: zh. Valid values:</p>
     * <ul>
     * <li>zh</li>
     * <li>en</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("CustomAccountNumber")
    public String customAccountNumber;

    /**
     * <p>The description of the workspace</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Duration")
    public String duration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.x</p>
     */
    @NameInMap("GrafanaVersion")
    public String grafanaVersion;

    /**
     * <p>The edition.</p>
     * <p><strong>Valid values:</strong></p>
     * <ul>
     * <li>standard: <code>Beta Edition or Standard Edition</code></li>
     * <li>personal_edition: Developer Edition</li>
     * <li>experts_edition: Pro Edition</li>
     * <li>advanced_edition: Advanced Edition</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>experts_edition</p>
     */
    @NameInMap("GrafanaWorkspaceEdition")
    public String grafanaWorkspaceEdition;

    /**
     * <p>The name of the Grafana workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testgrafana</p>
     */
    @NameInMap("GrafanaWorkspaceName")
    public String grafanaWorkspaceName;

    /**
     * <p>The password of the workspace. The password must be 8 to 30 characters in length. It must include at least three of the following characters types: uppercase letter, lowercase letter, digit, and special character. Special characters include () \&quot; ~ ! @ # $ % ^ &amp; \* - _ + =.</p>
     * 
     * <strong>example:</strong>
     * <p>Test123456!</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static CreateGrafanaWorkspaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGrafanaWorkspaceShrinkRequest self = new CreateGrafanaWorkspaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateGrafanaWorkspaceShrinkRequest setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public CreateGrafanaWorkspaceShrinkRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateGrafanaWorkspaceShrinkRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateGrafanaWorkspaceShrinkRequest setCustomAccountNumber(String customAccountNumber) {
        this.customAccountNumber = customAccountNumber;
        return this;
    }
    public String getCustomAccountNumber() {
        return this.customAccountNumber;
    }

    public CreateGrafanaWorkspaceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGrafanaWorkspaceShrinkRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateGrafanaWorkspaceShrinkRequest setGrafanaVersion(String grafanaVersion) {
        this.grafanaVersion = grafanaVersion;
        return this;
    }
    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    public CreateGrafanaWorkspaceShrinkRequest setGrafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
        this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
        return this;
    }
    public String getGrafanaWorkspaceEdition() {
        return this.grafanaWorkspaceEdition;
    }

    public CreateGrafanaWorkspaceShrinkRequest setGrafanaWorkspaceName(String grafanaWorkspaceName) {
        this.grafanaWorkspaceName = grafanaWorkspaceName;
        return this;
    }
    public String getGrafanaWorkspaceName() {
        return this.grafanaWorkspaceName;
    }

    public CreateGrafanaWorkspaceShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateGrafanaWorkspaceShrinkRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateGrafanaWorkspaceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGrafanaWorkspaceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGrafanaWorkspaceShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
