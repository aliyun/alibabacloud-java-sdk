// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    @NameInMap("body")
    public UpdateUserRequestBody body;

    /**
     * <strong>example:</strong>
     * <p>暂不支持</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setBody(UpdateUserRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserRequestBody getBody() {
        return this.body;
    }

    public UpdateUserRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateUserRequestBody extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>智能体运营组成员</p>
         */
        @NameInMap("note")
        public String note;

        public static UpdateUserRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserRequestBody self = new UpdateUserRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateUserRequestBody setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateUserRequestBody setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateUserRequestBody setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

}
