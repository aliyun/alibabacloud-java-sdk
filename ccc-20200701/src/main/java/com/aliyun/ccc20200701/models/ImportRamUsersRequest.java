// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ImportRamUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;28036411123456****&quot;,&quot;29234301123456****&quot;]</p>
     */
    @NameInMap("RamIdList")
    public String ramIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent@ccc-test</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;skillGroupId&quot;:&quot;skillgroup@ccc-test&quot;,&quot;skillLevel&quot;:5}]</p>
     */
    @NameInMap("SkillLevelList")
    public String skillLevelList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ON_SITE</p>
     */
    @NameInMap("WorkMode")
    public String workMode;

    public static ImportRamUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportRamUsersRequest self = new ImportRamUsersRequest();
        return TeaModel.build(map, self);
    }

    public ImportRamUsersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportRamUsersRequest setRamIdList(String ramIdList) {
        this.ramIdList = ramIdList;
        return this;
    }
    public String getRamIdList() {
        return this.ramIdList;
    }

    public ImportRamUsersRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public ImportRamUsersRequest setSkillLevelList(String skillLevelList) {
        this.skillLevelList = skillLevelList;
        return this;
    }
    public String getSkillLevelList() {
        return this.skillLevelList;
    }

    public ImportRamUsersRequest setWorkMode(String workMode) {
        this.workMode = workMode;
        return this;
    }
    public String getWorkMode() {
        return this.workMode;
    }

}
