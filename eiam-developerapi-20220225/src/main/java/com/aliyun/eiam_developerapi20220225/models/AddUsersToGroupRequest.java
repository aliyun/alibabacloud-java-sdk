// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class AddUsersToGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[user_d6sbsuumeta4h66ec3il7yxxxx}</p>
     */
    @NameInMap("userIds")
    public java.util.List<String> userIds;

    public static AddUsersToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUsersToGroupRequest self = new AddUsersToGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddUsersToGroupRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
