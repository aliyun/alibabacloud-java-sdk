// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    /**
     * <p>The request body for creating a user.</p>
     */
    @NameInMap("body")
    public CreateUserRequestBody body;

    /**
     * <p>Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not supported</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setBody(CreateUserRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateUserRequestBody getBody() {
        return this.body;
    }

    public CreateUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateUserRequestBody extends TeaModel {
        /**
         * <p>The display name of the user. The display name must be 1 to 32 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>John Smith</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The email address of the user. The email address can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user-01@example.com">user-01@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>The username. The username must be unique within the workspace and can contain only lowercase letters, digits, and hyphens. It must start and end with a lowercase letter or digit and be 1 to 32 characters in length. Reserved names such as manager, admin, or names starting with worker- cannot be used.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user-01</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The remarks of the user. The remarks can be up to 1024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Member of the agent operations team</p>
         */
        @NameInMap("note")
        public String note;

        /**
         * <p>The initial password of the user. The password must be 8 to 32 characters in length and contain uppercase letters, lowercase letters, digits, and special characters. The password cannot contain the username. If this parameter is not specified, the server generates a random password and returns it in the initialPassword field of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>Example@2026</p>
         */
        @NameInMap("password")
        public String password;

        public static CreateUserRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateUserRequestBody self = new CreateUserRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateUserRequestBody setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateUserRequestBody setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateUserRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateUserRequestBody setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CreateUserRequestBody setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

}
