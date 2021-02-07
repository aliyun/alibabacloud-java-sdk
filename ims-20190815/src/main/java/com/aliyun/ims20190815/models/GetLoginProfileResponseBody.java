// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetLoginProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoginProfile")
    public GetLoginProfileResponseBodyLoginProfile loginProfile;

    public static GetLoginProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginProfileResponseBody self = new GetLoginProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLoginProfileResponseBody setLoginProfile(GetLoginProfileResponseBodyLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public GetLoginProfileResponseBodyLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public static class GetLoginProfileResponseBodyLoginProfile extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        public static GetLoginProfileResponseBodyLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            GetLoginProfileResponseBodyLoginProfile self = new GetLoginProfileResponseBodyLoginProfile();
            return TeaModel.build(map, self);
        }

        public GetLoginProfileResponseBodyLoginProfile setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLoginProfileResponseBodyLoginProfile setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public GetLoginProfileResponseBodyLoginProfile setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetLoginProfileResponseBodyLoginProfile setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public GetLoginProfileResponseBodyLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public GetLoginProfileResponseBodyLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

    }

}
