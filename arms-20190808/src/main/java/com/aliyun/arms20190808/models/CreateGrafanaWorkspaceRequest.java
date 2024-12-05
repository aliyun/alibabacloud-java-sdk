// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateGrafanaWorkspaceRequest extends TeaModel {
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
    public java.util.List<CreateGrafanaWorkspaceRequestTags> tags;

    public static CreateGrafanaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGrafanaWorkspaceRequest self = new CreateGrafanaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGrafanaWorkspaceRequest setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public CreateGrafanaWorkspaceRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateGrafanaWorkspaceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateGrafanaWorkspaceRequest setCustomAccountNumber(String customAccountNumber) {
        this.customAccountNumber = customAccountNumber;
        return this;
    }
    public String getCustomAccountNumber() {
        return this.customAccountNumber;
    }

    public CreateGrafanaWorkspaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGrafanaWorkspaceRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateGrafanaWorkspaceRequest setGrafanaVersion(String grafanaVersion) {
        this.grafanaVersion = grafanaVersion;
        return this;
    }
    public String getGrafanaVersion() {
        return this.grafanaVersion;
    }

    public CreateGrafanaWorkspaceRequest setGrafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
        this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
        return this;
    }
    public String getGrafanaWorkspaceEdition() {
        return this.grafanaWorkspaceEdition;
    }

    public CreateGrafanaWorkspaceRequest setGrafanaWorkspaceName(String grafanaWorkspaceName) {
        this.grafanaWorkspaceName = grafanaWorkspaceName;
        return this;
    }
    public String getGrafanaWorkspaceName() {
        return this.grafanaWorkspaceName;
    }

    public CreateGrafanaWorkspaceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateGrafanaWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGrafanaWorkspaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGrafanaWorkspaceRequest setTags(java.util.List<CreateGrafanaWorkspaceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateGrafanaWorkspaceRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateGrafanaWorkspaceRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateGrafanaWorkspaceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateGrafanaWorkspaceRequestTags self = new CreateGrafanaWorkspaceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateGrafanaWorkspaceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateGrafanaWorkspaceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
