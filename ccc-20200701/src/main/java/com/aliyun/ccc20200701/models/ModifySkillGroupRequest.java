// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifySkillGroupRequest extends TeaModel {
    /**
     * <p>Description of the skill group. This parameter is optional and defaults to empty.</p>
     * 
     * <strong>example:</strong>
     * <p>云联络中心的新测试技能组。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Display name of the skill group, which must be 1 to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>新测试技能组</p>
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
     * <p>Skill group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static ModifySkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySkillGroupRequest self = new ModifySkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifySkillGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySkillGroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ModifySkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
