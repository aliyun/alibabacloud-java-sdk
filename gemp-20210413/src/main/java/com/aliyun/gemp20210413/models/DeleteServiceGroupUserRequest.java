// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupUserRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("newUserId")
    public Long newUserId;

    @NameInMap("oldUserId")
    public Long oldUserId;

    @NameInMap("removeUser")
    public Boolean removeUser;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static DeleteServiceGroupUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupUserRequest self = new DeleteServiceGroupUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteServiceGroupUserRequest setNewUserId(Long newUserId) {
        this.newUserId = newUserId;
        return this;
    }
    public Long getNewUserId() {
        return this.newUserId;
    }

    public DeleteServiceGroupUserRequest setOldUserId(Long oldUserId) {
        this.oldUserId = oldUserId;
        return this;
    }
    public Long getOldUserId() {
        return this.oldUserId;
    }

    public DeleteServiceGroupUserRequest setRemoveUser(Boolean removeUser) {
        this.removeUser = removeUser;
        return this;
    }
    public Boolean getRemoveUser() {
        return this.removeUser;
    }

    public DeleteServiceGroupUserRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
