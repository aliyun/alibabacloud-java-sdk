// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUsersResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The details of users.</p>
     */
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
        /**
         * <p>The number of queries that were performed on the current day.</p>
         */
        @NameInMap("CurExecuteCount")
        public Long curExecuteCount;

        /**
         * <p>The number of rows that were queried on the current day.</p>
         */
        @NameInMap("CurResultCount")
        public Long curResultCount;

        /**
         * <p>The DingTalk chatbot URL that is used to receive notifications.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   The system returns this parameter if you have set a DingTalk chatbot URL in the console. To set a DingTalk chatbot URL in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to **Notice**.</p>
         * <br>
         * <p>*   The system does not return this parameter if you have not set a DingTalk chatbot URL.</p>
         */
        @NameInMap("DingRobot")
        public String dingRobot;

        /**
         * <p>The email address that is used to receive notifications.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   The system returns this parameter if you have set an email address in the console. To set an email address in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to **Notice**.</p>
         * <br>
         * <p>*   The system does not return this parameter if you have not set an email address.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The time when the user last logged on to the console.</p>
         */
        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        /**
         * <p>The maximum number of queries that can be performed on the current day.</p>
         */
        @NameInMap("MaxExecuteCount")
        public Long maxExecuteCount;

        /**
         * <p>The maximum number of rows that can be queried on the current day.</p>
         */
        @NameInMap("MaxResultCount")
        public Long maxResultCount;

        /**
         * <p>The mobile phone number of the user.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   The system returns this parameter if you have set a mobile phone number in the console. To set a mobile phone number in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to **Notice**.</p>
         * <br>
         * <p>*   The system does not return this parameter if you have not set a mobile phone number.</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The nickname of the user.</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The notification method. The system returns one or more values. Valid values:</p>
         * <br>
         * <p>*   **SMS**: text message</p>
         * <p>*   **EMAIL**: email.</p>
         * <p>*   **DINGDING**: DingTalk.</p>
         * <p>*   **DINGROBOT**: DingTalk chatbot.</p>
         * <p>*   **WEBHOOK**: webhook.</p>
         */
        @NameInMap("NotificationMode")
        public String notificationMode;

        /**
         * <p>The ID of the Alibaba Cloud account of the user.</p>
         */
        @NameInMap("ParentUid")
        public String parentUid;

        /**
         * <p>The IDs of the roles.</p>
         */
        @NameInMap("RoleIdList")
        public ListUsersResponseBodyUserListUserRoleIdList roleIdList;

        /**
         * <p>The names of roles.</p>
         */
        @NameInMap("RoleNameList")
        public ListUsersResponseBodyUserListUserRoleNameList roleNameList;

        /**
         * <p>The signature method that is used to secure connections when a webhook URL is used. Valid values:</p>
         * <br>
         * <p>*   **NONE**: no signature.</p>
         * <p>*   **HMAC_SHA1**: HMAC_SHA1.</p>
         */
        @NameInMap("SignatureMethod")
        public String signatureMethod;

        /**
         * <p>The status of the user. Valid values:</p>
         * <br>
         * <p>*   **NORMAL**: The user is normal.</p>
         * <p>*   **DISABLE**: The user is disabled.</p>
         * <p>*   **DELETE**: The user is deleted.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The webhook URL that is used to receive notifications.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If you have set a webhook URL, DMS sends notifications to the specified URL.</p>
         * <br>
         * <p>*   The system does not return this parameter if you have not set a webhook URL.</p>
         */
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
