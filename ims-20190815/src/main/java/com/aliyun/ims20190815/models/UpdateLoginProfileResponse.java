// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LoginProfile")
    @Validation(required = true)
    public UpdateLoginProfileResponseLoginProfile loginProfile;

    public static UpdateLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginProfileResponse self = new UpdateLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLoginProfileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLoginProfileResponse setLoginProfile(UpdateLoginProfileResponseLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public UpdateLoginProfileResponseLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public static class UpdateLoginProfileResponseLoginProfile extends TeaModel {
        @NameInMap("UserPrincipalName")
        @Validation(required = true)
        public String userPrincipalName;

        @NameInMap("PasswordResetRequired")
        @Validation(required = true)
        public Boolean passwordResetRequired;

        @NameInMap("MFABindRequired")
        @Validation(required = true)
        public Boolean MFABindRequired;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static UpdateLoginProfileResponseLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoginProfileResponseLoginProfile self = new UpdateLoginProfileResponseLoginProfile();
            return TeaModel.build(map, self);
        }

        public UpdateLoginProfileResponseLoginProfile setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public UpdateLoginProfileResponseLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public UpdateLoginProfileResponseLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

        public UpdateLoginProfileResponseLoginProfile setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public UpdateLoginProfileResponseLoginProfile setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
