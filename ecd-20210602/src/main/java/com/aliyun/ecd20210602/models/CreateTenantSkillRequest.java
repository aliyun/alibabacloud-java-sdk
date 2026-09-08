// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CreateTenantSkillRequest extends TeaModel {
    /**
     * <p>The API key of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>akm-98f66829***</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>The description of the skill. Maximum length: 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This skill is used for****</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name.</p>
     * 
     * <strong>example:</strong>
     * <p>name****</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The environment variables.</p>
     */
    @NameInMap("EnvVars")
    public java.util.Map<String, String> envVars;

    /**
     * <p>The icon parsing tag. This parameter is required when SkillIcon is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>21E9A5B273CB8EC0675*********</p>
     */
    @NameInMap("IconETag")
    public String iconETag;

    /**
     * <p>The skill channel. Valid values:</p>
     * <ul>
     * <li>ENTERPRISE: Enterprise Edition.</li>
     * <li>BUSINESS: Business Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUSINESS</p>
     */
    @NameInMap("SkillChannel")
    public String skillChannel;

    /**
     * <p>The skill icon.</p>
     */
    @NameInMap("SkillIcon")
    public String skillIcon;

    /**
     * <p>The skill version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.1</p>
     */
    @NameInMap("SkillVersion")
    public String skillVersion;

    /**
     * <p>The slug identifier of the skill. This parameter is user-defined and must be unique within the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>find-skills****</p>
     */
    @NameInMap("Slug")
    public String slug;

    /**
     * <p>The file parsing task key.</p>
     * 
     * <strong>example:</strong>
     * <p>E1CF3D69-529D-****</p>
     */
    @NameInMap("TaskKey")
    public String taskKey;

    public static CreateTenantSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantSkillRequest self = new CreateTenantSkillRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantSkillRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateTenantSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTenantSkillRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateTenantSkillRequest setEnvVars(java.util.Map<String, String> envVars) {
        this.envVars = envVars;
        return this;
    }
    public java.util.Map<String, String> getEnvVars() {
        return this.envVars;
    }

    public CreateTenantSkillRequest setIconETag(String iconETag) {
        this.iconETag = iconETag;
        return this;
    }
    public String getIconETag() {
        return this.iconETag;
    }

    public CreateTenantSkillRequest setSkillChannel(String skillChannel) {
        this.skillChannel = skillChannel;
        return this;
    }
    public String getSkillChannel() {
        return this.skillChannel;
    }

    public CreateTenantSkillRequest setSkillIcon(String skillIcon) {
        this.skillIcon = skillIcon;
        return this;
    }
    public String getSkillIcon() {
        return this.skillIcon;
    }

    public CreateTenantSkillRequest setSkillVersion(String skillVersion) {
        this.skillVersion = skillVersion;
        return this;
    }
    public String getSkillVersion() {
        return this.skillVersion;
    }

    public CreateTenantSkillRequest setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public CreateTenantSkillRequest setTaskKey(String taskKey) {
        this.taskKey = taskKey;
        return this;
    }
    public String getTaskKey() {
        return this.taskKey;
    }

}
