// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateLoginProfileResponseBody extends TeaModel {
    /**
     * <p>The logon information for the console.</p>
     */
    @NameInMap("LoginProfile")
    public CreateLoginProfileResponseBodyLoginProfile loginProfile;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>29CB303C-1F05-43A6-A6BC-EBC5A797F8DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLoginProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLoginProfileResponseBody self = new CreateLoginProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLoginProfileResponseBody setLoginProfile(CreateLoginProfileResponseBodyLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public CreateLoginProfileResponseBodyLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public CreateLoginProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLoginProfileResponseBodyLoginProfile extends TeaModel {
        /**
         * <p>Indicates whether the RAM user is required to enable MFA.</p>
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
         * <p>The status of the initial password. This password is set when a logon configuration is created or when console logon is re-enabled.</p>
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
         * <p>Indicates whether password-based logon for the console is enabled or disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the logon configuration was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-14T03:47:51Z</p>
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

        public static CreateLoginProfileResponseBodyLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateLoginProfileResponseBodyLoginProfile self = new CreateLoginProfileResponseBodyLoginProfile();
            return TeaModel.build(map, self);
        }

        public CreateLoginProfileResponseBodyLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

        public CreateLoginProfileResponseBodyLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public CreateLoginProfileResponseBodyLoginProfile setPasswordStatus(String passwordStatus) {
            this.passwordStatus = passwordStatus;
            return this;
        }
        public String getPasswordStatus() {
            return this.passwordStatus;
        }

        public CreateLoginProfileResponseBodyLoginProfile setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLoginProfileResponseBodyLoginProfile setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public CreateLoginProfileResponseBodyLoginProfile setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
