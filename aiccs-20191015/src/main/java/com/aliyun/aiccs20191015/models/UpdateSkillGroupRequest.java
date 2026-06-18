// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateSkillGroupRequest extends TeaModel {
    /**
     * <p>Unique ID of the customer request. Used for idempotency validation. You can generate it by using a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-****-70b6a298d94d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Skill group description.  </p>
     * <blockquote>
     * <p>This parameter can be updated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>自动化测试</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Display name of the skill group.  </p>
     * <blockquote>
     * <p>This parameter can be updated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>自动化测试</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>AICCS instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Skill group ID.  </p>
     * <p>You can invoke the <a href="https://help.aliyun.com/zh/aiccs/developer-reference/api-aiccs-2019-10-15-queryskillgroups">QuerySkillGroups</a> API and check the <strong>SkillGroupId</strong> field in the response to obtain the skill group ID.  </p>
     * <blockquote>
     * <p>This parameter cannot be updated.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("SkillGroupId")
    public Long skillGroupId;

    /**
     * <p>Skill group name.  </p>
     * <blockquote>
     * <p>This parameter cannot be updated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>自动化测试</p>
     */
    @NameInMap("SkillGroupName")
    public String skillGroupName;

    public static UpdateSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillGroupRequest self = new UpdateSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSkillGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSkillGroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSkillGroupRequest setSkillGroupId(Long skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

    public UpdateSkillGroupRequest setSkillGroupName(String skillGroupName) {
        this.skillGroupName = skillGroupName;
        return this;
    }
    public String getSkillGroupName() {
        return this.skillGroupName;
    }

}
