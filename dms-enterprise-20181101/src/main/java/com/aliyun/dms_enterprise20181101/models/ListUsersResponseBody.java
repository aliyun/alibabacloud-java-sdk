// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // - **true**: The request was successful.
    // - **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    // The details of users.
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
        // The number of queries that are performed on the current day.
        @NameInMap("CurExecuteCount")
        public Long curExecuteCount;

        // The number of rows that are queried on the current day.
        @NameInMap("CurResultCount")
        public Long curResultCount;

        // The DingTalk chatbot URL that is used to receive notifications.
        // 
        // > 
        // *   The system returns this parameter if the user has set a DingTalk chatbot URL in the console. To set a DingTalk chatbot URL in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to **Notice**.
        // *   The system does not return this parameter if the user has not set a DingTalk chatbot URL.
        @NameInMap("DingRobot")
        public String dingRobot;

        // The email address that is used to receive notifications.
        // 
        // > 
        // *   The system returns this parameter if the user has set an email address in the console. To set an email address in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to **Notice**.
        // *   The system does not return this parameter if the user has not set an email address.
        @NameInMap("Email")
        public String email;

        // The last time when the user logged on to the console.
        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        // The maximum number of queries that can be performed on the current day.
        @NameInMap("MaxExecuteCount")
        public Long maxExecuteCount;

        // The maximum number of rows that can be queried on the current day.
        @NameInMap("MaxResultCount")
        public Long maxResultCount;

        // The mobile phone number that is used to receive notifications.
        // 
        // > 
        // *   The system returns this parameter if the user has set a mobile phone number in the console. To set a mobile phone number in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to **Notice**.
        // *   The system does not return this parameter if the user has not set a mobile phone number.
        @NameInMap("Mobile")
        public String mobile;

        // The nickname of the user.
        @NameInMap("NickName")
        public String nickName;

        // The notification method. The system returns one or more values. Valid values:
        // 
        // *   **SMS**: text message.
        // *   **EMAIL**: email.
        // *   **DingTalk**: DingTalk.
        // *   **DINGROBOT**: DingTalk chatbot.
        // *   **WEBHOOK**: webhook.
        @NameInMap("NotificationMode")
        public String notificationMode;

        // The UID of the Alibaba Cloud account of the user.
        @NameInMap("ParentUid")
        public String parentUid;

        // The ID of the role that is assigned to the user. Valid values:
        // 
        // *   **1**: a regular user role.
        // *   **2**: a DBA role.
        // *   **3**: a DMS administrator role.
        // *   **4**: a security administrator role.
        // *   **6**: a schema read-only user role.
        @NameInMap("RoleIdList")
        public ListUsersResponseBodyUserListUserRoleIdList roleIdList;

        // The name of the role that is assigned to the user. Valid values:
        // 
        // *   **USER**: a regular user.
        // *   **DBA**: a DBA.
        // *   **ADMIN**: a DMS administrator.
        // *   **SECURITY_ADMIN**: a security administrator.
        // *   **STRUCT_READ_ONLY**: a schema read-only user.
        @NameInMap("RoleNameList")
        public ListUsersResponseBodyUserListUserRoleNameList roleNameList;

        // The signature method that is used to secure connections when a webhook URL is used. Valid values:
        // 
        // *   **NONE**: no signature.
        // *   **HMAC_SHA1**: HMAC-SHA1.
        @NameInMap("SignatureMethod")
        public String signatureMethod;

        // The status of the user. Valid values:
        // 
        // *   **NORMAL**: The user is normal.
        // *   **DISABLE**: The user is disabled.
        // *   **DELETE**: The user is deleted.
        @NameInMap("State")
        public String state;

        // The UID of the user.
        @NameInMap("Uid")
        public String uid;

        // The ID of the user.
        @NameInMap("UserId")
        public String userId;

        // The webhook URL that is used to receive notifications.
        // 
        // > 
        // *   If the user has set a webhook URL, DMS sends notifications to the specified URL.
        // *   The system does not return this parameter if the user has not set a webhook URL.
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
