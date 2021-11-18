// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyPrimaryTrunksOfSkillGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PrimaryProviderName")
    public java.util.List<String> primaryProviderName;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static ModifyPrimaryTrunksOfSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrimaryTrunksOfSkillGroupRequest self = new ModifyPrimaryTrunksOfSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrimaryTrunksOfSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyPrimaryTrunksOfSkillGroupRequest setPrimaryProviderName(java.util.List<String> primaryProviderName) {
        this.primaryProviderName = primaryProviderName;
        return this;
    }
    public java.util.List<String> getPrimaryProviderName() {
        return this.primaryProviderName;
    }

    public ModifyPrimaryTrunksOfSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
