// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class DeleteGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    public static DeleteGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupRequest self = new DeleteGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
