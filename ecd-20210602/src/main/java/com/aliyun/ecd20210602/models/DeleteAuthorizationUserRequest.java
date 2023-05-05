// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationUserRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubscribeId")
    public Long subscribeId;

    @NameInMap("UserList")
    public java.util.List<DeleteAuthorizationUserRequestUserList> userList;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static DeleteAuthorizationUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationUserRequest self = new DeleteAuthorizationUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationUserRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteAuthorizationUserRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DeleteAuthorizationUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAuthorizationUserRequest setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public Long getSubscribeId() {
        return this.subscribeId;
    }

    public DeleteAuthorizationUserRequest setUserList(java.util.List<DeleteAuthorizationUserRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<DeleteAuthorizationUserRequestUserList> getUserList() {
        return this.userList;
    }

    public DeleteAuthorizationUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public DeleteAuthorizationUserRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class DeleteAuthorizationUserRequestUserList extends TeaModel {
        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public Integer userId;

        @NameInMap("UserName")
        public String userName;

        public static DeleteAuthorizationUserRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            DeleteAuthorizationUserRequestUserList self = new DeleteAuthorizationUserRequestUserList();
            return TeaModel.build(map, self);
        }

        public DeleteAuthorizationUserRequestUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public DeleteAuthorizationUserRequestUserList setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public DeleteAuthorizationUserRequestUserList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
