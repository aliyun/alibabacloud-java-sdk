// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertContactGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactGroupRequest self = new DeleteAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteAlertContactGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
