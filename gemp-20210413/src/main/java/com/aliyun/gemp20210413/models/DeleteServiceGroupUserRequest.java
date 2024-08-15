// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>88888</p>
     */
    @NameInMap("newUserId")
    public Long newUserId;

    /**
     * <strong>example:</strong>
     * <p>777777</p>
     */
    @NameInMap("oldUserId")
    public Long oldUserId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("removeUser")
    public Boolean removeUser;

    /**
     * <strong>example:</strong>
     * <p>66666</p>
     */
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
