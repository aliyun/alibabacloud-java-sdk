// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CreateSkillRequest extends TeaModel {
    /**
     * <p>The description of the skill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A Skill for reviewing code quality, security risks, and coding standards.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The metadata of the skill, in JSON object format. One and only one content source must be provided. For specific fields, refer to the supplementary description of request parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;skillMd&quot;:&quot;# Code Review\nCheck code quality, security risks, and coding standards.&quot;}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The unique identifier of the skill. Only letters, digits, underscores, and hyphens are supported. The length cannot exceed 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The visibility of the skill. Valid values: <code>user</code> and <code>tenant</code>. Default value: <code>user</code>.</p>
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
