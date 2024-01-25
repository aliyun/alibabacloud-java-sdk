// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertContactFromGroupRequest extends TeaModel {
    @NameInMap("ContactIdListJson")
    public String contactIdListJson;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteAlertContactFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactFromGroupRequest self = new DeleteAlertContactFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactFromGroupRequest setContactIdListJson(String contactIdListJson) {
        this.contactIdListJson = contactIdListJson;
        return this;
    }
    public String getContactIdListJson() {
        return this.contactIdListJson;
    }

    public DeleteAlertContactFromGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteAlertContactFromGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
