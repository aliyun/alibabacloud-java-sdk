// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserResponseBody extends TeaModel {
    @NameInMap("User")
    public GetUserResponseBodyUser user;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserResponseBody self = new GetUserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserResponseBody setUser(GetUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserResponseBodyUser getUser() {
        return this.user;
    }

    public GetUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserResponseBodyUser extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        @NameInMap("Email")
        public String email;

        @NameInMap("UpdateDate")
        public String updateDate;

        @NameInMap("MobilePhone")
        public String mobilePhone;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Comments")
        public String comments;

        @NameInMap("LastLoginDate")
        public String lastLoginDate;

        @NameInMap("CreateDate")
        public String createDate;

        public static GetUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserResponseBodyUser self = new GetUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUserResponseBodyUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public GetUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUserResponseBodyUser setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public GetUserResponseBodyUser setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public GetUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public GetUserResponseBodyUser setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetUserResponseBodyUser setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
            return this;
        }
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        public GetUserResponseBodyUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

}
