// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CreateSkillRequest extends TeaModel {
    /**
     * <p>The description of the Skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A Skill for reviewing code quality, security risks, and coding standards.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The Skill metadata in JSON object format. Exactly one content source must be provided. For more information about the fields, see &quot;Request parameter description&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;skillMd&quot;:&quot;# Code Review\nCheck code quality, security risks, and coding standards.&quot;}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The unique identifier of the Skill. Only letters, digits, underscores, and hyphens are supported. The value can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The visibility of the Skill. Valid values:</p>
     * <ul>
     * <li>user</li>
     * <li>tenant</li>
     * </ul>
     * <p>Default value: user.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static CreateSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillRequest self = new CreateSkillRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSkillRequest setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public CreateSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSkillRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
