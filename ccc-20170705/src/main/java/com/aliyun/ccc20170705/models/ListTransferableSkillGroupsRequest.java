// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListTransferableSkillGroupsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListTransferableSkillGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransferableSkillGroupsRequest self = new ListTransferableSkillGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransferableSkillGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
