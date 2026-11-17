// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateSkillShrinkRequest extends TeaModel {
    /**
     * <p>The downloadable URL (HTTP or HTTPS) of the bundle.zip file. This parameter and SkillMdOverride are mutually exclusive.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/skill.zip">https://example.com/skill.zip</a></p>
     */
    @NameInMap("BundleUrl")
    public String bundleUrl;

    /**
     * <p>The description of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>Data analytics skill</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The extended metadata in key-value pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;appId&quot;:&quot;APP_CWJMV36CT9SAFW1QEHX7&quot;}</p>
     */
    @NameInMap("Extra")
    public String extraShrink;

    /**
     * <p>The name of the skill. The name must be unique within the current account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-skill</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The body of the SKILL.md file. This parameter and BundleUrl are mutually exclusive. If you do not provide a bundle, use this field to create a lightweight skill that contains only the SKILL.md file.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     * <h2>name: example-skill
     * description: Sample skill.</h2>
     * <h1>Sample skill</h1>
     * <p>Summarize the text provided by the user</p>
     */
    @NameInMap("SkillMdOverride")
    public String skillMdOverride;

    /**
     * <p>The release notes of the version.</p>
     * 
     * <strong>example:</strong>
     * <p>Initial version</p>
     */
    @NameInMap("VersionNote")
    public String versionNote;

    /**
     * <p>The visibility level. Valid values: TENANT: visible within the account. PROJECT: visible to specified projects. USER: visible to specified users.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    /**
     * <p>The visibility scope. Specify the corresponding field based on the value of Visibility.</p>
     */
    @NameInMap("VisibilityScope")
    public String visibilityScopeShrink;

    public static CreateSkillShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillShrinkRequest self = new CreateSkillShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillShrinkRequest setBundleUrl(String bundleUrl) {
        this.bundleUrl = bundleUrl;
        return this;
    }
    public String getBundleUrl() {
        return this.bundleUrl;
    }

    public CreateSkillShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSkillShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public CreateSkillShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSkillShrinkRequest setSkillMdOverride(String skillMdOverride) {
        this.skillMdOverride = skillMdOverride;
        return this;
    }
    public String getSkillMdOverride() {
        return this.skillMdOverride;
    }

    public CreateSkillShrinkRequest setVersionNote(String versionNote) {
        this.versionNote = versionNote;
        return this;
    }
    public String getVersionNote() {
        return this.versionNote;
    }

    public CreateSkillShrinkRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public CreateSkillShrinkRequest setVisibilityScopeShrink(String visibilityScopeShrink) {
        this.visibilityScopeShrink = visibilityScopeShrink;
        return this;
    }
    public String getVisibilityScopeShrink() {
        return this.visibilityScopeShrink;
    }

}
