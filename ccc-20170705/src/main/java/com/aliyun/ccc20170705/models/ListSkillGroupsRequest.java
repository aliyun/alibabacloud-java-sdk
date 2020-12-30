// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListSkillGroupsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

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

}
