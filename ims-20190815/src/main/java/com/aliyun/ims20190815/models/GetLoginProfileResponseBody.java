// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetLoginProfileResponseBody extends TeaModel {
    /**
     * <p>The logon information.</p>
     */
    @NameInMap("LoginProfile")
    public GetLoginProfileResponseBodyLoginProfile loginProfile;

    /**
     * <p>The request ID.</p>
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
         * <p>The last time when the RAM user logged on to the console.</p>
         */
        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        /**
         * <p>Indicates whether multi-factor authentication (MFA) must be enabled.</p>
         */
        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        /**
         * <p>Indicates whether the RAM user must reset the password at the next logon.</p>
         */
        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        /**
         * <p>The status of password-based logon.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        /**
         * <p>The logon name of the RAM user.</p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static GetLoginProfileResponseBodyLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            GetLoginProfileResponseBodyLoginProfile self = new GetLoginProfileResponseBodyLoginProfile();
            return TeaModel.build(map, self);
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
