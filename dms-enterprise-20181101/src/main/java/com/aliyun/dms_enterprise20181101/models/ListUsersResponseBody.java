// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("UserList")
    public ListUsersResponseBodyUserList userList;

    public static ListUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUsersResponseBody self = new ListUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUsersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUsersResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUsersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUsersResponseBody setUserList(ListUsersResponseBodyUserList userList) {
        this.userList = userList;
        return this;
    }
    public ListUsersResponseBodyUserList getUserList() {
        return this.userList;
    }

    public static class ListUsersResponseBodyUserListUserRoleIdList extends TeaModel {
        @NameInMap("RoleIds")
        public java.util.List<Integer> roleIds;

        public static ListUsersResponseBodyUserListUserRoleIdList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUserListUserRoleIdList self = new ListUsersResponseBodyUserListUserRoleIdList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUserListUserRoleIdList setRoleIds(java.util.List<Integer> roleIds) {
            this.roleIds = roleIds;
            return this;
        }
        public java.util.List<Integer> getRoleIds() {
            return this.roleIds;
        }

    }

    public static class ListUsersResponseBodyUserListUserRoleNameList extends TeaModel {
        @NameInMap("RoleNames")
        public java.util.List<String> roleNames;

        public static ListUsersResponseBodyUserListUserRoleNameList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUserListUserRoleNameList self = new ListUsersResponseBodyUserListUserRoleNameList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUserListUserRoleNameList setRoleNames(java.util.List<String> roleNames) {
            this.roleNames = roleNames;
            return this;
        }
        public java.util.List<String> getRoleNames() {
            return this.roleNames;
        }

    }

    public static class ListUsersResponseBodyUserListUser extends TeaModel {
        @NameInMap("CurExecuteCount")
        public Long curExecuteCount;

        @NameInMap("CurResultCount")
        public Long curResultCount;

        @NameInMap("DingRobot")
        public String dingRobot;

        @NameInMap("Email")
        public String email;

        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        @NameInMap("MaxExecuteCount")
        public Long maxExecuteCount;

        @NameInMap("MaxResultCount")
        public Long maxResultCount;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("NotificationMode")
        public String notificationMode;

        @NameInMap("ParentUid")
        public String parentUid;

        @NameInMap("RoleIdList")
        public ListUsersResponseBodyUserListUserRoleIdList roleIdList;

        @NameInMap("RoleNameList")
        public ListUsersResponseBodyUserListUserRoleNameList roleNameList;

        @NameInMap("SignatureMethod")
        public String signatureMethod;

        @NameInMap("State")
        public String state;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Webhook")
        public String webhook;

        public static ListUsersResponseBodyUserListUser build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUserListUser self = new ListUsersResponseBodyUserListUser();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUserListUser setCurExecuteCount(Long curExecuteCount) {
            this.curExecuteCount = curExecuteCount;
            return this;
        }
        public Long getCurExecuteCount() {
            return this.curExecuteCount;
        }

        public ListUsersResponseBodyUserListUser setCurResultCount(Long curResultCount) {
            this.curResultCount = curResultCount;
            return this;
        }
        public Long getCurResultCount() {
            return this.curResultCount;
        }

        public ListUsersResponseBodyUserListUser setDingRobot(String dingRobot) {
            this.dingRobot = dingRobot;
            return this;
        }
        public String getDingRobot() {
            return this.dingRobot;
        }

        public ListUsersResponseBodyUserListUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListUsersResponseBodyUserListUser setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public ListUsersResponseBodyUserListUser setMaxExecuteCount(Long maxExecuteCount) {
            this.maxExecuteCount = maxExecuteCount;
            return this;
        }
        public Long getMaxExecuteCount() {
            return this.maxExecuteCount;
        }

        public ListUsersResponseBodyUserListUser setMaxResultCount(Long maxResultCount) {
            this.maxResultCount = maxResultCount;
            return this;
        }
        public Long getMaxResultCount() {
            return this.maxResultCount;
        }

        public ListUsersResponseBodyUserListUser setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListUsersResponseBodyUserListUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListUsersResponseBodyUserListUser setNotificationMode(String notificationMode) {
            this.notificationMode = notificationMode;
            return this;
        }
        public String getNotificationMode() {
            return this.notificationMode;
        }

        public ListUsersResponseBodyUserListUser setParentUid(String parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public String getParentUid() {
            return this.parentUid;
        }

        public ListUsersResponseBodyUserListUser setRoleIdList(ListUsersResponseBodyUserListUserRoleIdList roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public ListUsersResponseBodyUserListUserRoleIdList getRoleIdList() {
            return this.roleIdList;
        }

        public ListUsersResponseBodyUserListUser setRoleNameList(ListUsersResponseBodyUserListUserRoleNameList roleNameList) {
            this.roleNameList = roleNameList;
            return this;
        }
        public ListUsersResponseBodyUserListUserRoleNameList getRoleNameList() {
            return this.roleNameList;
        }

        public ListUsersResponseBodyUserListUser setSignatureMethod(String signatureMethod) {
            this.signatureMethod = signatureMethod;
            return this;
        }
        public String getSignatureMethod() {
            return this.signatureMethod;
        }

        public ListUsersResponseBodyUserListUser setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListUsersResponseBodyUserListUser setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListUsersResponseBodyUserListUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUsersResponseBodyUserListUser setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

    public static class ListUsersResponseBodyUserList extends TeaModel {
        @NameInMap("User")
        public java.util.List<ListUsersResponseBodyUserListUser> user;

        public static ListUsersResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            ListUsersResponseBodyUserList self = new ListUsersResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public ListUsersResponseBodyUserList setUser(java.util.List<ListUsersResponseBodyUserListUser> user) {
            this.user = user;
            return this;
        }
        public java.util.List<ListUsersResponseBodyUserListUser> getUser() {
            return this.user;
        }

    }

}
