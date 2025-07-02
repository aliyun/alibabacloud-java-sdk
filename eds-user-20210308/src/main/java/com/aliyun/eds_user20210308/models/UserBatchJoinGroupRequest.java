// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UserBatchJoinGroupRequest extends TeaModel {
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ug-12341234****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    public static UserBatchJoinGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UserBatchJoinGroupRequest self = new UserBatchJoinGroupRequest();
        return TeaModel.build(map, self);
    }

    public UserBatchJoinGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public UserBatchJoinGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
