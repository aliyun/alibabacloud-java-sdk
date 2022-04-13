// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetSkillGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static GetSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupRequest self = new GetSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
