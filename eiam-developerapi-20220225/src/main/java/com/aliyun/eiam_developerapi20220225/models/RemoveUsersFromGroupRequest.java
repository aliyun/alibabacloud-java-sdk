// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class RemoveUsersFromGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[user_d6sbsuumeta4h66ec3il7yxxxx}</p>
     */
    @NameInMap("userIds")
    public java.util.List<String> userIds;

    public static RemoveUsersFromGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUsersFromGroupRequest self = new RemoveUsersFromGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUsersFromGroupRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
