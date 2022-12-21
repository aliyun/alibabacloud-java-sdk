// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
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
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    // The information about the user.
    @NameInMap("User")
    public GetUserResponseBodyUser user;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetUserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserResponseBodyUserRoleIdList extends TeaModel {
        @NameInMap("RoleIds")
        public java.util.List<Integer> roleIds;

        public static GetUserResponseBodyUserRoleIdList build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserRoleIdList self = new GetUserResponseBodyUserRoleIdList();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserRoleIdList setRoleIds(java.util.List<Integer> roleIds) {
            this.roleIds = roleIds;
            return this;
        }
        public java.util.List<Integer> getRoleIds() {
            return this.roleIds;
        }

    }

    public static class GetUserResponseBodyUserRoleNameList extends TeaModel {
        @NameInMap("RoleNames")
        public java.util.List<String> roleNames;

        public static GetUserResponseBodyUserRoleNameList build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUserRoleNameList self = new GetUserResponseBodyUserRoleNameList();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUserRoleNameList setRoleNames(java.util.List<String> roleNames) {
            this.roleNames = roleNames;
            return this;
        }
        public java.util.List<String> getRoleNames() {
            return this.roleNames;
        }

    }

    public static class GetUserResponseBodyUser extends TeaModel {
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
        // 
        // >  An Alibaba Cloud account can contain one or more RAM users.
        @NameInMap("ParentUid")
        public Long parentUid;

        // The ID of the role that is assigned to the user. Valid values:
        // 
        // *   **1**: a regular user role.
        // *   **2**: a database administrator (DBA) role.
        // *   **3**: a DMS administrator role.
        // *   **4**: a security administrator role.
        // *   **6**: a schema read-only user role.
        @NameInMap("RoleIdList")
        public GetUserResponseBodyUserRoleIdList roleIdList;

        // The name of the role that is assigned to the user. Valid values:
        // 
        // *   **USER**: a regular user.
        // *   **DBA** : a DBA.
        // *   **ADMIN**: a DMS administrator.
        // *   **SECURITY_ADMIN**: a security administrator.
        // *   **STRUCT_READ_ONLY**: a schema read-only user.
        @NameInMap("RoleNameList")
        public GetUserResponseBodyUserRoleNameList roleNameList;

        // The signature method that is used to secure connections when a webhook URL is used. Valid values:
        // 
        // *   **NONE**: no signature.
        // *   **HMAC_SHA1**: HMAC_SHA1.
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

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setCurExecuteCount(Long curExecuteCount) {
            this.curExecuteCount = curExecuteCount;
            return this;
        }
        public Long getCurExecuteCount() {
            return this.curExecuteCount;
        }

        public GetUserResponseBodyUser setCurResultCount(Long curResultCount) {
            this.curResultCount = curResultCount;
            return this;
        }
        public Long getCurResultCount() {
            return this.curResultCount;
        }

        public GetUserResponseBodyUser setDingRobot(String dingRobot) {
            this.dingRobot = dingRobot;
            return this;
        }
        public String getDingRobot() {
            return this.dingRobot;
        }

        public GetUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyUser setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public GetUserResponseBodyUser setMaxExecuteCount(Long maxExecuteCount) {
            this.maxExecuteCount = maxExecuteCount;
            return this;
        }
        public Long getMaxExecuteCount() {
            return this.maxExecuteCount;
        }

        public GetUserResponseBodyUser setMaxResultCount(Long maxResultCount) {
            this.maxResultCount = maxResultCount;
            return this;
        }
        public Long getMaxResultCount() {
            return this.maxResultCount;
        }

        public GetUserResponseBodyUser setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetUserResponseBodyUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetUserResponseBodyUser setNotificationMode(String notificationMode) {
            this.notificationMode = notificationMode;
            return this;
        }
        public String getNotificationMode() {
            return this.notificationMode;
        }

        public GetUserResponseBodyUser setParentUid(Long parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public Long getParentUid() {
            return this.parentUid;
        }

        public GetUserResponseBodyUser setRoleIdList(GetUserResponseBodyUserRoleIdList roleIdList) {
            this.roleIdList = roleIdList;
            return this;
        }
        public GetUserResponseBodyUserRoleIdList getRoleIdList() {
            return this.roleIdList;
        }

        public GetUserResponseBodyUser setRoleNameList(GetUserResponseBodyUserRoleNameList roleNameList) {
            this.roleNameList = roleNameList;
            return this;
        }
        public GetUserResponseBodyUserRoleNameList getRoleNameList() {
            return this.roleNameList;
        }

        public GetUserResponseBodyUser setSignatureMethod(String signatureMethod) {
            this.signatureMethod = signatureMethod;
            return this;
        }
        public String getSignatureMethod() {
            return this.signatureMethod;
        }

        public GetUserResponseBodyUser setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetUserResponseBodyUser setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setWebhook(String webhook) {
            this.webhook = webhook;
            return this;
        }
        public String getWebhook() {
            return this.webhook;
        }

    }

}
