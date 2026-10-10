// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AssignUsersRequest extends TeaModel {
    /**
     * <p>Specifies whether to asynchronously execute user assignment.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The list of IDs of the Resource Access Management (RAM) users to be added.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;28036411123456****&quot;,&quot;29234301123456****&quot;]</p>
     */
    @NameInMap("RamIdList")
    public String ramIdList;

    /**
     * <p>The role ID. This specifies the role of the agent in the instance after a successful import. Valid roles include administrator, skill group supervisor, and agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent@ccc-test</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>The list of skill levels for skill groups. The value is a string in JSON array format. Each array element is an object that contains two fields: skillGroupId and skillLevel. Set skillGroupId to the ID of the skill group to which you want to associate the agent. Set skillLevel to the skill level of the agent in the skill group. Valid values: 1 to 10. A smaller value indicates a stronger business capability, allowing the agent to handle more calls per unit of time.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;skillGroupId&quot;:&quot;skillgroup@ccc-test&quot;,&quot;skillLevel&quot;:5}]</p>
     */
    @NameInMap("SkillLevelList")
    public String skillLevelList;

    /**
     * <p>The work mode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ON_SITE</p>
     */
    @NameInMap("WorkMode")
    public String workMode;

    public static AssignUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignUsersRequest self = new AssignUsersRequest();
        return TeaModel.build(map, self);
    }

    public AssignUsersRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public AssignUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssignUsersRequest setRamIdList(String ramIdList) {
        this.ramIdList = ramIdList;
        return this;
    }
    public String getRamIdList() {
        return this.ramIdList;
    }

    public AssignUsersRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public AssignUsersRequest setSkillLevelList(String skillLevelList) {
        this.skillLevelList = skillLevelList;
        return this;
    }
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    public AssignUsersRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
