// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public java.util.List<String> skillGroupId;

    @NameInMap("SkillGroupName")
    public java.util.List<String> skillGroupName;

    public static ListSkillGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupsRequest self = new ListSkillGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListSkillGroupsRequest setSkillGroupId(java.util.List<String> skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    public ListSkillGroupsRequest setSkillGroupName(java.util.List<String> skillGroupName) {
        this.skillGroupName = skillGroupName;
        return this;
    }
    public java.util.List<String> getSkillGroupName() {
        return this.skillGroupName;
    }

}
