// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    public static DeleteServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupRequest self = new DeleteServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
