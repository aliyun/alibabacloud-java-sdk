// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class UserBatchQuitGroupRequest extends TeaModel {
    @NameInMap("EndUserIds")
    public java.util.List<String> endUserIds;

    /**
     * <strong>example:</strong>
     * <p>ug-lkuvalovhnlxvv****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    public static UserBatchQuitGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UserBatchQuitGroupRequest self = new UserBatchQuitGroupRequest();
        return TeaModel.build(map, self);
    }

    public UserBatchQuitGroupRequest setEndUserIds(java.util.List<String> endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    public UserBatchQuitGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
