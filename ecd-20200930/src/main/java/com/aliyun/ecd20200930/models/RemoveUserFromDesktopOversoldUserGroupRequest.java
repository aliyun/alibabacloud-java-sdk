// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RemoveUserFromDesktopOversoldUserGroupRequest extends TeaModel {
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("UserDesktopId")
    public String userDesktopId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static RemoveUserFromDesktopOversoldUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromDesktopOversoldUserGroupRequest self = new RemoveUserFromDesktopOversoldUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromDesktopOversoldUserGroupRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public RemoveUserFromDesktopOversoldUserGroupRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public RemoveUserFromDesktopOversoldUserGroupRequest setUserDesktopId(String userDesktopId) {
        this.userDesktopId = userDesktopId;
        return this;
    }
    public String getUserDesktopId() {
        return this.userDesktopId;
    }

    public RemoveUserFromDesktopOversoldUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
