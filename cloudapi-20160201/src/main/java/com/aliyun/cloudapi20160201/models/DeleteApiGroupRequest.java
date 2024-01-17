// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteApiGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    public static DeleteApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiGroupRequest self = new DeleteApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
