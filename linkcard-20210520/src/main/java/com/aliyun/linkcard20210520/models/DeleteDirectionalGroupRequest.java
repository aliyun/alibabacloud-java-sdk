// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class DeleteDirectionalGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    public static DeleteDirectionalGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectionalGroupRequest self = new DeleteDirectionalGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDirectionalGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
