// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class DeleteXspaceGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    public static DeleteXspaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteXspaceGroupRequest self = new DeleteXspaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteXspaceGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}
