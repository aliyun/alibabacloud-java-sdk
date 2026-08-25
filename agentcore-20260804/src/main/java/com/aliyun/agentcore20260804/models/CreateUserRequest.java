// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    @NameInMap("body")
    public CreateUserRequestBody body;

    /**
     * <strong>example:</strong>
     * <p>暂不支持</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:user-01@example.com">user-01@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user-01</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>智能体运营组成员</p>
         */
        @NameInMap("note")
        public String note;

        /**
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
