// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information of the RAM user.</p>
     */
    @NameInMap("User")
    public UpdateUserResponseBodyUser user;

    public static UpdateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserResponseBody self = new UpdateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateUserResponseBody setUser(UpdateUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public UpdateUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class UpdateUserResponseBodyUser extends TeaModel {
        /**
         * <p>The description of the RAM user.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The time when the RAM user was created.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the RAM user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the RAM user.</p>
         * <br>
         * <p>>  This parameter applies only to the China site (aliyun.com).</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The last time when the RAM user logged on to the console.</p>
         */
        @NameInMap("LastLoginDate")
        public String lastLoginDate;

        /**
         * <p>The mobile phone number of the RAM user.</p>
         * <br>
         * <p>>  This parameter applies only to the China site (aliyun.com).</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The time when the information of the RAM user was updated.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        /**
         * <p>The ID of the RAM user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The logon name of the RAM user.</p>
         */
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        public static UpdateUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserResponseBodyUser self = new UpdateUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public UpdateUserResponseBodyUser setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public UpdateUserResponseBodyUser setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateUserResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateUserResponseBodyUser setLastLoginDate(String lastLoginDate) {
            this.lastLoginDate = lastLoginDate;
            return this;
        }
        public String getLastLoginDate() {
            return this.lastLoginDate;
        }

        public UpdateUserResponseBodyUser setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public UpdateUserResponseBodyUser setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public UpdateUserResponseBodyUser setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public UpdateUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateUserResponseBodyUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

    }

}
