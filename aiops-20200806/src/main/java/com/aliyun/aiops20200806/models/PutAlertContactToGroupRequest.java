// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertContactToGroupRequest extends TeaModel {
    @NameInMap("ContactIdListJson")
    public String contactIdListJson;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("GroupIdListJson")
    public String groupIdListJson;

    @NameInMap("OperaUid")
    public String operaUid;

    public static PutAlertContactToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertContactToGroupRequest self = new PutAlertContactToGroupRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertContactToGroupRequest setContactIdListJson(String contactIdListJson) {
        this.contactIdListJson = contactIdListJson;
        return this;
    }
    public String getContactIdListJson() {
        return this.contactIdListJson;
    }

    public PutAlertContactToGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public PutAlertContactToGroupRequest setGroupIdListJson(String groupIdListJson) {
        this.groupIdListJson = groupIdListJson;
        return this;
    }
    public String getGroupIdListJson() {
        return this.groupIdListJson;
    }

    public PutAlertContactToGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
