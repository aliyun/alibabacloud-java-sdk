// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateSkillShrinkRequest extends TeaModel {
    /**
     * <p>The downloadable URL (HTTP/HTTPS) of the bundle.zip file. Mutually exclusive with SkillMdOverride. If specified, the bundle is replaced.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/skill.zip">https://example.com/skill.zip</a></p>
     */
    @NameInMap("BundleUrl")
    public String bundleUrl;

    /**
     * <p>The Skill description.</p>
     * 
     * <strong>example:</strong>
     * <p>数据分析技能</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expected version number for optimistic locking. If not specified, the update is based on the current highest version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExpectedVersion")
    public Integer expectedVersion;

    /**
     * <p>The extended metadata (key-value pairs).</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;appId\&quot;:\&quot;APP_Q2SDWKIGFWNZTR68K1GQ\&quot;}</p>
     */
    @NameInMap("Extra")
    public String extraShrink;

    /**
     * <p>The name of the Skill to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-skill</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The SKILL.md body content. Mutually exclusive with BundleUrl.</p>
     * 
     * <strong>example:</strong>
     * <p>把大象放冰箱分为三步，把冰箱门打开，把大象放进去，把冰箱门关上。</p>
     */
    @NameInMap("SkillMdOverride")
    public String skillMdOverride;

    /**
     * <p>The version note.</p>
     * 
     * <strong>example:</strong>
     * <p>修订说明</p>
     */
    @NameInMap("VersionNote")
    public String versionNote;

    /**
     * <p>The visibility scope. The corresponding field is used based on the visibility level.</p>
     */
    @NameInMap("VisibilityScope")
    public String visibilityScopeShrink;

    public static UpdateSkillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillShrinkRequest self = new UpdateSkillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillShrinkRequest setBundleUrl(String bundleUrl) {
        this.bundleUrl = bundleUrl;
        return this;
    }
    public String getBundleUrl() {
        return this.bundleUrl;
    }

    public UpdateSkillShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSkillShrinkRequest setExpectedVersion(Integer expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Integer getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateSkillShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public UpdateSkillShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSkillShrinkRequest setSkillMdOverride(String skillMdOverride) {
        this.skillMdOverride = skillMdOverride;
        return this;
    }
    public String getSkillMdOverride() {
        return this.skillMdOverride;
    }

    public UpdateSkillShrinkRequest setVersionNote(String versionNote) {
        this.versionNote = versionNote;
        return this;
    }
    public String getVersionNote() {
        return this.versionNote;
    }

    public UpdateSkillShrinkRequest setVisibilityScopeShrink(String visibilityScopeShrink) {
        this.visibilityScopeShrink = visibilityScopeShrink;
        return this;
    }
    public String getVisibilityScopeShrink() {
        return this.visibilityScopeShrink;
    }

}
