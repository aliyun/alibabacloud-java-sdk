// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteStandardGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Tid")
    public Long tid;

    public static DeleteStandardGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStandardGroupRequest self = new DeleteStandardGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStandardGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteStandardGroupRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
