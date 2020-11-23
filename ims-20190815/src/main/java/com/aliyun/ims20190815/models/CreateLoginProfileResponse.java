// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateLoginProfileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LoginProfile")
    @Validation(required = true)
    public CreateLoginProfileResponseLoginProfile loginProfile;

    public static CreateLoginProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLoginProfileResponse self = new CreateLoginProfileResponse();
        return TeaModel.build(map, self);
    }

    public CreateLoginProfileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLoginProfileResponse setLoginProfile(CreateLoginProfileResponseLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public CreateLoginProfileResponseLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public static class CreateLoginProfileResponseLoginProfile extends TeaModel {
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

        public static CreateLoginProfileResponseLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateLoginProfileResponseLoginProfile self = new CreateLoginProfileResponseLoginProfile();
            return TeaModel.build(map, self);
        }

        public CreateLoginProfileResponseLoginProfile setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public CreateLoginProfileResponseLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public CreateLoginProfileResponseLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

        public CreateLoginProfileResponseLoginProfile setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public CreateLoginProfileResponseLoginProfile setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
