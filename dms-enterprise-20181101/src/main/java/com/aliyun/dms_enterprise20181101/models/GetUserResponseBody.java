// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown server error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>804BB128-CAFA-5DD0-BA1E-43DDE488****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The information about the user.</p>
     */
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
        /**
         * <p>The number of queries that are performed on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CurExecuteCount")
        public Long curExecuteCount;

        /**
         * <p>The number of rows that are queried on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("CurResultCount")
        public Long curResultCount;

        /**
         * <p>The DingTalk chatbot URL that is used to receive notifications.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The system returns this parameter if the user has set a DingTalk chatbot URL in the console. To set a DingTalk chatbot URL in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to <strong>Notice</strong>.</p>
         * </li>
         * <li><p>The system does not return this parameter if the user has not set a DingTalk chatbot URL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://XXX.dingtalk.com/robot/send?access_token=">https://XXX.dingtalk.com/robot/send?access_token=</a>***</p>
         */
        @NameInMap("DingRobot")
        public String dingRobot;

        /**
         * <p>The email address that is used to receive notifications.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The system returns this parameter if the user has set an email address in the console. To set an email address in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to <strong>Notice</strong>.</p>
         * </li>
         * <li><p>The system does not return this parameter if the user has not set an email address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Uesr_email</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The last point in time when the user logged on to the console.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-08 11:26:21</p>
         */
        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        /**
         * <p>The maximum number of queries that can be performed on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxExecuteCount")
        public Long maxExecuteCount;

        /**
         * <p>The maximum number of rows that can be queried on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxResultCount")
        public Long maxResultCount;

        /**
         * <p>The mobile number of the user.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The system returns this parameter if the user has set a mobile phone number in the console. To set a mobile phone number in the console, move the pointer over the profile picture in the upper-right corner and click the Edit icon next to <strong>Notice</strong>.</p>
         * </li>
         * <li><p>The system does not return this parameter if the user has not set a mobile phone number.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1389223****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>User_NickName</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The notification method. The system returns one or more values. Valid values:</p>
         * <ul>
         * <li><strong>SMS</strong>: text message</li>
         * <li><strong>EMAIL</strong>: email.</li>
         * <li><strong>DINGDING</strong>: DingTalk.</li>
         * <li><strong>DINGROBOT</strong>: DingTalk chatbot.</li>
         * <li><strong>WEBHOOK</strong>: webhook.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EMAIL</p>
         */
        @NameInMap("NotificationMode")
        public String notificationMode;

        /**
         * <p>The UID of the Alibaba Cloud account of the user.</p>
         * <blockquote>
         * <p>An Alibaba Cloud account can contain one or more RAM users.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("ParentUid")
        public Long parentUid;

        /**
         * <p>The list of role IDs.</p>
         */
        @NameInMap("RoleIdList")
        public GetUserResponseBodyUserRoleIdList roleIdList;

        /**
         * <p>The list of role names.</p>
         */
        @NameInMap("RoleNameList")
        public GetUserResponseBodyUserRoleNameList roleNameList;

        /**
         * <p>The signature method that is used to secure connections when a webhook URL is used. Valid values:</p>
         * <ul>
         * <li><strong>NONE</strong>: no signature.</li>
         * <li><strong>HMAC_SHA1</strong>: HMAC_SHA1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        @NameInMap("SignatureMethod")
        public String signatureMethod;

        /**
         * <p>The status of the user. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The user is normal.</li>
         * <li><strong>DISABLE</strong>: The user is disabled.</li>
         * <li><strong>DELETE</strong>: The user is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The UID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>22275482072787****</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The webhook URL that is used to receive notifications.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If the user has set a webhook URL, DMS sends notifications to the specified URL.</p>
         * </li>
         * <li><p>The system does not return this parameter if the user has not set a webhook URL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dms-XXX.aliyun.com:8">http://dms-XXX.aliyun.com:8</a>***</p>
         */
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
