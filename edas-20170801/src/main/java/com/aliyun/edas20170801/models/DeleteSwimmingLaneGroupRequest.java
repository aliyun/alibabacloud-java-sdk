// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteSwimmingLaneGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    public static DeleteSwimmingLaneGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimmingLaneGroupRequest self = new DeleteSwimmingLaneGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSwimmingLaneGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}
