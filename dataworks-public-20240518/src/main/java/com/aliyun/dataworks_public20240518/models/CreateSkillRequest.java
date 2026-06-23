// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSkillRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/skill.zip">https://example.com/skill.zip</a></p>
     */
    @NameInMap("BundleUrl")
    public String bundleUrl;

    /**
     * <strong>example:</strong>
     * <p>数据分析技能</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>{&quot;appId&quot;:&quot;APP_CWJMV36CT9SAFW1QEHX7&quot;}</p>
     */
    @NameInMap("Extra")
    public java.util.Map<String, ?> extra;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-skill</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("SkillMdOverride")
    public String skillMdOverride;

    /**
     * <strong>example:</strong>
     * <p>初版</p>
     */
    @NameInMap("VersionNote")
    public String versionNote;

    /**
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    @NameInMap("VisibilityScope")
    public CreateSkillRequestVisibilityScope visibilityScope;

    public static CreateSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillRequest self = new CreateSkillRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillRequest setBundleUrl(String bundleUrl) {
        this.bundleUrl = bundleUrl;
        return this;
    }
    public String getBundleUrl() {
        return this.bundleUrl;
    }

    public CreateSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSkillRequest setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public CreateSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSkillRequest setSkillMdOverride(String skillMdOverride) {
        this.skillMdOverride = skillMdOverride;
        return this;
    }
    public String getSkillMdOverride() {
        return this.skillMdOverride;
    }

    public CreateSkillRequest setVersionNote(String versionNote) {
        this.versionNote = versionNote;
        return this;
    }
    public String getVersionNote() {
        return this.versionNote;
    }

    public CreateSkillRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateSkillRequest setVisibilityScope(CreateSkillRequestVisibilityScope visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }
    public CreateSkillRequestVisibilityScope getVisibilityScope() {
        return this.visibilityScope;
    }

    public static class CreateSkillRequestVisibilityScope extends TeaModel {
        @NameInMap("ProjectIds")
        public java.util.List<String> projectIds;

        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        public static CreateSkillRequestVisibilityScope build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillRequestVisibilityScope self = new CreateSkillRequestVisibilityScope();
            return TeaModel.build(map, self);
        }

        public CreateSkillRequestVisibilityScope setProjectIds(java.util.List<String> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<String> getProjectIds() {
            return this.projectIds;
        }

        public CreateSkillRequestVisibilityScope setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

    }

}
