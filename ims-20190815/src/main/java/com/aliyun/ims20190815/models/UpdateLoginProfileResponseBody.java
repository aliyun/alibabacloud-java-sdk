// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateLoginProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoginProfile")
    public UpdateLoginProfileResponseBodyLoginProfile loginProfile;

    public static UpdateLoginProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginProfileResponseBody self = new UpdateLoginProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLoginProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLoginProfileResponseBody setLoginProfile(UpdateLoginProfileResponseBodyLoginProfile loginProfile) {
        this.loginProfile = loginProfile;
        return this;
    }
    public UpdateLoginProfileResponseBodyLoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    public static class UpdateLoginProfileResponseBodyLoginProfile extends TeaModel {
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("PasswordResetRequired")
        public Boolean passwordResetRequired;

        @NameInMap("MFABindRequired")
        public Boolean MFABindRequired;

        public static UpdateLoginProfileResponseBodyLoginProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoginProfileResponseBodyLoginProfile self = new UpdateLoginProfileResponseBodyLoginProfile();
            return TeaModel.build(map, self);
        }

        public UpdateLoginProfileResponseBodyLoginProfile setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
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

        public UpdateLoginProfileResponseBodyLoginProfile setPasswordResetRequired(Boolean passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Boolean getPasswordResetRequired() {
            return this.passwordResetRequired;
        }

        public UpdateLoginProfileResponseBodyLoginProfile setMFABindRequired(Boolean MFABindRequired) {
            this.MFABindRequired = MFABindRequired;
            return this;
        }
        public Boolean getMFABindRequired() {
            return this.MFABindRequired;
        }

    }

}
