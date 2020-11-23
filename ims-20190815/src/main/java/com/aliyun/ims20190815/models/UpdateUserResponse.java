// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("User")
    @Validation(required = true)
    public UpdateUserResponseUser user;

    public static UpdateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserResponse self = new UpdateUserResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserResponse setUser(UpdateUserResponseUser user) {
        this.user = user;
        return this;
    }
    public UpdateUserResponseUser getUser() {
        return this.user;
    }

    public static class UpdateUserResponseUser extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("UserPrincipalName")
        @Validation(required = true)
        public String userPrincipalName;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("LastLoginDate")
        @Validation(required = true)
        public String lastLoginDate;

        @NameInMap("MobilePhone")
        @Validation(required = true)
        public String mobilePhone;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        public static UpdateUserResponseUser build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserResponseUser self = new UpdateUserResponseUser();
            return TeaModel.build(map, self);
        }

        public UpdateUserResponseUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateUserResponseUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public UpdateUserResponseUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateUserResponseUser setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public UpdateUserResponseUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateUserResponseUser setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public UpdateUserResponseUser setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
            return this;
        }
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        public UpdateUserResponseUser setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public UpdateUserResponseUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

}
