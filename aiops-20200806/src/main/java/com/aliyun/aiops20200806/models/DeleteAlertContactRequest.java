// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertContactRequest extends TeaModel {
    // 要删除的数组,json格式
    @NameInMap("ContactIdListJson")
    public String contactIdListJson;

    @NameInMap("GroupId")
    public Long groupId;

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

}
