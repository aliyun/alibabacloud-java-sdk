// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user information.</p>
     */
    @NameInMap("User")
    public CreateUserResponseBodyUser user;

    public static CreateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserResponseBody self = new CreateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserResponseBody setUser(CreateUserResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public CreateUserResponseBodyUser getUser() {
        return this.user;
    }

    public static class CreateUserResponseBodyUser extends TeaModel {
        /**
         * <p>The description of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Data Analyst</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The status of the user. Valid values:</p>
         * <ul>
         * <li>Enabled: Enabled.</li>
         * <li>Disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the user. Valid values:</p>
         * <ul>
         * <li>Manual: The user is manually created by calling an API operation.</li>
         * <li>JIT: The user is created through JIT.</li>
         * <li>SCIM: The user is synchronized through the System for Cross-domain Identity Management protocol.</li>
         * <li>SYNC_DINGTALK: The user is synchronized from DingTalk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static CreateUserResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            CreateUserResponseBodyUser self = new CreateUserResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public CreateUserResponseBodyUser setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateUserResponseBodyUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateUserResponseBodyUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateUserResponseBodyUser setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateUserResponseBodyUser setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateUserResponseBodyUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateUserResponseBodyUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
