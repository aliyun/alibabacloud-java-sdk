// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetLoginProfileResponseBody extends TeaModel {
    /**
     * <p>The logon information for the console.</p>
     */
    @NameInMap("LoginProfile")
    public GetLoginProfileResponseBodyLoginProfile loginProfile;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E517F18B-632C-48FC-93F1-CDCBCC6F8444</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLoginProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginProfileResponseBody self = new GetLoginProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginProfileResponseBody setLoginProfile(GetLoginProfileResponseBodyLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public GetLoginProfileResponseBodyLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public GetLoginProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLoginProfileResponseBodyLoginProfile extends TeaModel {
        /**
         * <p>Indicates whether console logon is automatically disabled if the user is inactive. This feature is enabled by default and cannot be disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoDisableLoginStatus")
        public String autoDisableLoginStatus;

        /**
         * <p>The time when the RAM user last logged on to the console. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T07:25:25Z</p>
         */
        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        /**
         * <p>Indicates whether multi-factor authentication (MFA) is required for the user. Valid values:</p>
         * <ul>
         * <li><p>false: MFA is not required.</p>
         * </li>
         * <li><p>true: MFA is required.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        /**
         * <p>Indicates whether the RAM user must reset the password at the next logon. Valid values:</p>
         * <ul>
         * <li><p>false: The RAM user is not required to reset the password.</p>
         * </li>
         * <li><p>true: The RAM user is required to reset the password.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        /**
         * <p>The status of the initial password. An initial password is the password that is configured when you create a logon profile or re-enable console logon.</p>
         * <p>Valid values</p>
         * <ul>
         * <li><p>&quot;NotInitial&quot;: The password is not an initial password.</p>
         * </li>
         * <li><p>&quot;InitialValid&quot;: The initial password is valid.</p>
         * </li>
         * <li><p>&quot;InitialExpired&quot;: The initial password has expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotInitial</p>
         */
        @NameInMap("PasswordStatus")
        public String passwordStatus;

        /**
         * <p>The status of console logon. Valid values:</p>
         * <ul>
         * <li><p>Active: Console logon is enabled.</p>
         * </li>
         * <li><p>Inactive: Console logon is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the logon profile was last updated. The time is in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T06:56:45Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        /**
         * <p>The logon name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static GetLoginProfileResponseBodyLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            GetLoginProfileResponseBodyLoginProfile self = new GetLoginProfileResponseBodyLoginProfile();
            return TeaModel.build(map, self);
        }

        public GetLoginProfileResponseBodyLoginProfile setAutoDisableLoginStatus(String autoDisableLoginStatus) {
            this.autoDisableLoginStatus = autoDisableLoginStatus;
            return this;
        }
        public String getAutoDisableLoginStatus() {
            return this.autoDisableLoginStatus;
        }

        public GetLoginProfileResponseBodyLoginProfile setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public GetLoginProfileResponseBodyLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

        public GetLoginProfileResponseBodyLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public GetLoginProfileResponseBodyLoginProfile setPasswordStatus(String passwordStatus) {
            this.passwordStatus = passwordStatus;
            return this;
        }
        public String getPasswordStatus() {
            return this.passwordStatus;
        }

        public GetLoginProfileResponseBodyLoginProfile setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLoginProfileResponseBodyLoginProfile setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetLoginProfileResponseBodyLoginProfile setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
