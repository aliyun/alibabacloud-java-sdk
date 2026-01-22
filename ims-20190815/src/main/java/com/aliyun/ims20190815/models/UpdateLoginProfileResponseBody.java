// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileResponseBody extends TeaModel {
    /**
     * <p>The console logon configurations.</p>
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
         * <p>Indicates whether console logon is automatically disabled if a RAM user does not log on to the console in the previous specified number of days. The number of days is specified by MaxIdleDaysForUsers. The default value is true, and you cannot change the value.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoDisableLoginStatus")
        public String autoDisableLoginStatus;

        /**
         * <p>Indicates whether MFA must be enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        /**
         * <p>Indicates whether the RAM user is required to reset the password upon the next logon.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        @NameInMap("PasswordStatus")
        public String passwordStatus;

        /**
         * <p>Indicates whether to enable password-based logons to the console.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The modification time.</p>
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
