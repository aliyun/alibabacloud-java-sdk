// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class AddUserToDesktopOversoldUserGroupRequest extends TeaModel {
    @NameInMap("AddUserAmount")
    public Integer addUserAmount;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("OversoldGroupId")
    public String oversoldGroupId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static AddUserToDesktopOversoldUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToDesktopOversoldUserGroupRequest self = new AddUserToDesktopOversoldUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToDesktopOversoldUserGroupRequest setAddUserAmount(Integer addUserAmount) {
        this.addUserAmount = addUserAmount;
        return this;
    }
    public Integer getAddUserAmount() {
        return this.addUserAmount;
    }

    public AddUserToDesktopOversoldUserGroupRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public AddUserToDesktopOversoldUserGroupRequest setOversoldGroupId(String oversoldGroupId) {
        this.oversoldGroupId = oversoldGroupId;
        return this;
    }
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    public AddUserToDesktopOversoldUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
