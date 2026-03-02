// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileResponseBody extends TeaModel {
    /**
     * <p>The console logon information.</p>
     */
    @NameInMap("LoginProfile")
    public UpdateLoginProfileResponseBodyLoginProfile loginProfile;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BCDB6A7F-2199-41D9-B577-4FA536A5ADE1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLoginProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginProfileResponseBody self = new UpdateLoginProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoginProfileResponseBody setLoginProfile(UpdateLoginProfileResponseBodyLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public UpdateLoginProfileResponseBodyLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public UpdateLoginProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLoginProfileResponseBodyLoginProfile extends TeaModel {
        /**
         * <p>Indicates whether to automatically disable console logon for an inactive account. This feature is enabled by default and cannot be disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoDisableLoginStatus")
        public String autoDisableLoginStatus;

        /**
         * <p>Indicates whether MFA is enforced for the user.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        /**
         * <p>Indicates whether the RAM user must reset the password at the next logon.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        /**
         * <p>The status of the initial password. An initial password is the one set when a logon profile is created or console logon is re-enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>&quot;NotInitial&quot;: Not an initial password.</p>
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
         * <p>Specifies whether password logon to the console is enabled or disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the logon profile was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T07:48:41Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        /**
         * <p>The logon name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@example11.onaliyun.com">test@example11.onaliyun.com</a></p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static UpdateLoginProfileResponseBodyLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoginProfileResponseBodyLoginProfile self = new UpdateLoginProfileResponseBodyLoginProfile();
            return TeaModel.build(map, self);
        }

        public UpdateLoginProfileResponseBodyLoginProfile setAutoDisableLoginStatus(String autoDisableLoginStatus) {
            this.autoDisableLoginStatus = autoDisableLoginStatus;
            return this;
        }
        public String getAutoDisableLoginStatus() {
            return this.autoDisableLoginStatus;
        }

        public UpdateLoginProfileResponseBodyLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

        public UpdateLoginProfileResponseBodyLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public UpdateLoginProfileResponseBodyLoginProfile setPasswordStatus(String passwordStatus) {
            this.passwordStatus = passwordStatus;
            return this;
        }
        public String getPasswordStatus() {
            return this.passwordStatus;
        }

        public UpdateLoginProfileResponseBodyLoginProfile setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateLoginProfileResponseBodyLoginProfile setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public UpdateLoginProfileResponseBodyLoginProfile setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
