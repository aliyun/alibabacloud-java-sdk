// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AssignUsersRequest extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A JSON array of RAM user IDs to import, formatted as a string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;28036411123456****&quot;,&quot;29234301123456****&quot;]</p>
     */
    @NameInMap("RamIdList")
    public String ramIdList;

    /**
     * <p>The ID of the role to assign to the users in the instance. After the RAM users are imported, they are assigned this role. Valid roles are Administrator, Teamleader, and Agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent@ccc-test</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <p>A JSON array of skill objects, provided as a string. Each object specifies a skillGroupId and a skillLevel from 1 to 10. A lower skillLevel value indicates higher proficiency and greater call-handling capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;skillGroupId&quot;:&quot;skillgroup@ccc-test&quot;,&quot;skillLevel&quot;:5}]</p>
     */
    @NameInMap("SkillLevelList")
    public String skillLevelList;

    /**
     * <p>The work mode for the agents.</p>
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
