// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    /**
     * <p>The request body for updating a user.</p>
     */
    @NameInMap("body")
    public UpdateUserRequestBody body;

    /**
     * <p>Not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Not supported</p>
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
         * <p>The display name of the user. The name must be 1 to 32 characters in length. At least one of displayName, email, and note must be specified.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The email address of the user. The address can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user-01@example.com">user-01@example.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>The note for the user. The note can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent operations team member</p>
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
