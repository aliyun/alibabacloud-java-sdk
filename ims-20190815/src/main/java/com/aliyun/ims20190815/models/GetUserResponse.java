// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("User")
    @Validation(required = true)
    public GetUserResponseUser user;

    public static GetUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponse self = new GetUserResponse();
        return TeaModel.build(map, self);
    }

    public GetUserResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserResponse setUser(GetUserResponseUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseUser getUser() {
        return this.user;
    }

    public static class GetUserResponseUser extends TeaModel {
        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("Email")
        @Validation(required = true)
        public String email;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("LastLoginDate")
        @Validation(required = true)
        public String lastLoginDate;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("UserPrincipalName")
        @Validation(required = true)
        public String userPrincipalName;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("MobilePhone")
        @Validation(required = true)
        public String mobilePhone;

        public static GetUserResponseUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseUser self = new GetUserResponseUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseUser setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetUserResponseUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseUser setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetUserResponseUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseUser setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
            return this;
        }
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        public GetUserResponseUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserResponseUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public GetUserResponseUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public GetUserResponseUser setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

    }

}
