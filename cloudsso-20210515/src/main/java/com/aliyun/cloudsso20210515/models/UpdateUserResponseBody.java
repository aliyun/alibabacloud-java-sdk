// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the user.</p>
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
         * <p>The time when the user was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the user.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the user.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The first name of the user.</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <p>The last name of the user.</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <p>The type of the user. Valid values:</p>
         * <br>
         * <p>*   Manual: The user is manually created.</p>
         * <p>*   Synchronized: The user is synchronized from an external identity provider (IdP).</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The status of the user. Valid values:</p>
         * <br>
         * <p>*   Enabled: The logon of the user is enabled.</p>
         * <p>*   Disabled: The logon of the user is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the information about the user was modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The name of the user.</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static UpdateUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserResponseBodyUser self = new UpdateUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public UpdateUserResponseBodyUser setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateUserResponseBodyUser setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public UpdateUserResponseBodyUser setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public UpdateUserResponseBodyUser setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public UpdateUserResponseBodyUser setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public UpdateUserResponseBodyUser setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateUserResponseBodyUser setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public UpdateUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateUserResponseBodyUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
