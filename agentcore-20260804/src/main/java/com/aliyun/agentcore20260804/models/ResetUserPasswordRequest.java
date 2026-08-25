// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ResetUserPasswordRequest extends TeaModel {
    @NameInMap("body")
    public ResetUserPasswordRequestBody body;

    public static ResetUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserPasswordRequest self = new ResetUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserPasswordRequest setBody(ResetUserPasswordRequestBody body) {
        this.body = body;
        return this;
    }
    public ResetUserPasswordRequestBody getBody() {
        return this.body;
    }

    public static class ResetUserPasswordRequestBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>usr-123456</p>
         */
        @NameInMap("agentCoreUserId")
        public String agentCoreUserId;

        /**
         * <strong>example:</strong>
         * <p>Example@2026</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>user-01</p>
         */
        @NameInMap("username")
        public String username;

        public static ResetUserPasswordRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ResetUserPasswordRequestBody self = new ResetUserPasswordRequestBody();
            return TeaModel.build(map, self);
        }

        public ResetUserPasswordRequestBody setAgentCoreUserId(String agentCoreUserId) {
            this.agentCoreUserId = agentCoreUserId;
            return this;
        }
        public String getAgentCoreUserId() {
            return this.agentCoreUserId;
        }

        public ResetUserPasswordRequestBody setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ResetUserPasswordRequestBody setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
