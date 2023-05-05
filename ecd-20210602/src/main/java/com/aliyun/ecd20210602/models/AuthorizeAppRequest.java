// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class AuthorizeAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubscribeId")
    public Long subscribeId;

    @NameInMap("UserList")
    public java.util.List<AuthorizeAppRequestUserList> userList;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static AuthorizeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeAppRequest self = new AuthorizeAppRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public AuthorizeAppRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public AuthorizeAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AuthorizeAppRequest setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public Long getSubscribeId() {
        return this.subscribeId;
    }

    public AuthorizeAppRequest setUserList(java.util.List<AuthorizeAppRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<AuthorizeAppRequestUserList> getUserList() {
        return this.userList;
    }

    public AuthorizeAppRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public AuthorizeAppRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class AuthorizeAppRequestUserList extends TeaModel {
        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserName")
        public String userName;

        public static AuthorizeAppRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            AuthorizeAppRequestUserList self = new AuthorizeAppRequestUserList();
            return TeaModel.build(map, self);
        }

        public AuthorizeAppRequestUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public AuthorizeAppRequestUserList setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public AuthorizeAppRequestUserList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
