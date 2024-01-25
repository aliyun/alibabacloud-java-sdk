// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertContactRequest extends TeaModel {
    @NameInMap("ContactIdListJson")
    public String contactIdListJson;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertContactRequest self = new DeleteAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertContactRequest setContactIdListJson(String contactIdListJson) {
        this.contactIdListJson = contactIdListJson;
        return this;
    }
    public String getContactIdListJson() {
        return this.contactIdListJson;
    }

    public DeleteAlertContactRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DeleteAlertContactRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
