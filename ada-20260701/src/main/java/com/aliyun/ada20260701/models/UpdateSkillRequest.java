// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class UpdateSkillRequest extends TeaModel {
    /**
     * <p>The updated description of the skill.</p>
     * 
     * <strong>example:</strong>
     * <p>A skill used to perform code review, security checks, and risk alerts</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expected version number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ExpectedVersion")
    public Long expectedVersion;

    /**
     * <p>The updated metadata of the skill. The JSON object is replaced as a whole. The content supports one of the following: Transit ID, bundleUrl, or skillMd.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;transitId&quot;:&quot;transit_example456&quot;}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>The name of the skill to be updated. This parameter is used only to locate the skill and cannot be used to modify the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The updated visibility. Valid values: <code>user</code> and <code>tenant</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>tenant</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static UpdateSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillRequest self = new UpdateSkillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSkillRequest setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
        return this;
    }
    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    public UpdateSkillRequest setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public UpdateSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSkillRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
