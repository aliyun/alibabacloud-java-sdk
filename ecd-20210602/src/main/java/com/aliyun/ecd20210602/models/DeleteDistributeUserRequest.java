// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteDistributeUserRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubscribeId")
    public Long subscribeId;

    @NameInMap("UserList")
    public java.util.List<DeleteDistributeUserRequestUserList> userList;

    @NameInMap("UserType")
    public String userType;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static DeleteDistributeUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDistributeUserRequest self = new DeleteDistributeUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDistributeUserRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteDistributeUserRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DeleteDistributeUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDistributeUserRequest setSubscribeId(Long subscribeId) {
        this.subscribeId = subscribeId;
        return this;
    }
    public Long getSubscribeId() {
        return this.subscribeId;
    }

    public DeleteDistributeUserRequest setUserList(java.util.List<DeleteDistributeUserRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<DeleteDistributeUserRequestUserList> getUserList() {
        return this.userList;
    }

    public DeleteDistributeUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public DeleteDistributeUserRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static class DeleteDistributeUserRequestUserList extends TeaModel {
        @NameInMap("UserEmail")
        public String userEmail;

        @NameInMap("UserId")
        public Integer userId;

        @NameInMap("UserName")
        public String userName;

        public static DeleteDistributeUserRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            DeleteDistributeUserRequestUserList self = new DeleteDistributeUserRequestUserList();
            return TeaModel.build(map, self);
        }

        public DeleteDistributeUserRequestUserList setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }
        public String getUserEmail() {
            return this.userEmail;
        }

        public DeleteDistributeUserRequestUserList setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

        public DeleteDistributeUserRequestUserList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
