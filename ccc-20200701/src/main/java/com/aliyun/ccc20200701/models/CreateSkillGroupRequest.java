// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateSkillGroupRequest extends TeaModel {
    /**
     * <p>Description of the skill group. This parameter is optional. If not specified, it defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>云联络中心的测试技能组。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Display name of the skill group. It must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试技能组</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Media type. The default value is AUDIO. Other valid values include CHAT and VIDEO.</p>
     * 
     * <strong>example:</strong>
     * <p>CHAT</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The skill group name. It must be 1 to 64 characters in length, can contain digits, letters, underscores (_), and hyphens (-), and must start with a letter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillGroupRequest self = new CreateSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSkillGroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSkillGroupRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public CreateSkillGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
