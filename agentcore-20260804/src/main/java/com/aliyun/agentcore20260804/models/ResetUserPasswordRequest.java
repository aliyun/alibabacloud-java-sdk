// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ResetUserPasswordRequest extends TeaModel {
    /**
     * <p>The request body for resetting the user password.</p>
     */
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
         * <p>The user ID. At least one of agentCoreUserId and username must be specified. If both are specified, agentCoreUserId takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>usr-123456</p>
         */
        @NameInMap("agentCoreUserId")
        public String agentCoreUserId;

        /**
         * <p>The new password after the reset. The password must be 8 to 32 characters in length and must contain uppercase letters, lowercase letters, digits, and special characters. The password cannot contain the username. If this parameter is not specified, the server generates a random password.</p>
         * 
         * <strong>example:</strong>
         * <p>Example@2026</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The username. At least one of username and agentCoreUserId must be specified.</p>
         * 
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
