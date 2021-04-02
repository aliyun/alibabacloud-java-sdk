// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetLoginProfileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LoginProfile")
    @Validation(required = true)
    public GetLoginProfileResponseLoginProfile loginProfile;

    public static GetLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoginProfileResponse self = new GetLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public GetLoginProfileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoginProfileResponse setLoginProfile(GetLoginProfileResponseLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public GetLoginProfileResponseLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public static class GetLoginProfileResponseLoginProfile extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("LastLoginTime")
        @Validation(required = true)
        public String lastLoginTime;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("PasswordResetRequired")
        @Validation(required = true)
        public Boolean passwordResetRequired;

        @NameInMap("UserPrincipalName")
        @Validation(required = true)
        public String userPrincipalName;

        @NameInMap("MFABindRequired")
        @Validation(required = true)
        public Boolean MFABindRequired;

        public static GetLoginProfileResponseLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            GetLoginProfileResponseLoginProfile self = new GetLoginProfileResponseLoginProfile();
            return TeaModel.build(map, self);
        }

        public GetLoginProfileResponseLoginProfile setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLoginProfileResponseLoginProfile setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public GetLoginProfileResponseLoginProfile setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetLoginProfileResponseLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public GetLoginProfileResponseLoginProfile setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public GetLoginProfileResponseLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

    }

}
