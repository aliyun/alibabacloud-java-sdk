// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetLoginProfileResponseBody extends TeaModel {
    /**
     * <p>The console logon profile.</p>
     */
    @NameInMap("LoginProfile")
    public GetLoginProfileResponseBodyLoginProfile loginProfile;

    /**
     * <p>The request ID.</p>
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
         * <p>Specifies whether console logon is automatically disabled when the idle disablement conditions are met. This feature is enabled by default and cannot be disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoDisableLoginStatus")
        public String autoDisableLoginStatus;

        /**
         * <p>The last console logon time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T07:25:25Z</p>
         */
        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        /**
         * <p>Specifies whether the user is required to enable multi-factor authentication (MFA). Valid values:</p>
         * <ul>
         * <li>false: MFA is not required.</li>
         * <li>true: MFA is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        /**
         * <p>Specifies whether the Resource Access Management (RAM) user must reset the password upon the next logon. Valid values:</p>
         * <ul>
         * <li>false: The user is not required to reset the password.</li>
         * <li>true: The user must reset the password.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        /**
         * <p>The status of the initial password. An initial password is the password set when console logon is newly created or re-enabled. Valid values:</p>
         * <ul>
         * <li>&quot;NotInitial&quot;: The password is not an initial password.</li>
         * <li>&quot;InitialValid&quot;: The initial password is valid.</li>
         * <li>&quot;InitialExpired&quot;: The initial password has expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NotInitial</p>
         */
        @NameInMap("PasswordStatus")
        public String passwordStatus;

        /**
         * <p>Indicates whether console logon is enabled or disabled. Valid values:</p>
         * <ul>
         * <li>Active: Console logon is enabled.</li>
         * <li>Inactive: Console logon is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T06:56:45Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        /**
         * <p>The logon name of the Resource Access Management (RAM) user.</p>
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
