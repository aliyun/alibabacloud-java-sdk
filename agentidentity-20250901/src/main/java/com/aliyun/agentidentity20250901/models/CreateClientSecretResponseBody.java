// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateClientSecretResponseBody extends TeaModel {
    /**
     * <p>The client secret information.</p>
     */
    @NameInMap("ClientSecret")
    public CreateClientSecretResponseBodyClientSecret clientSecret;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClientSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClientSecretResponseBody self = new CreateClientSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClientSecretResponseBody setClientSecret(CreateClientSecretResponseBodyClientSecret clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public CreateClientSecretResponseBodyClientSecret getClientSecret() {
        return this.clientSecret;
    }

    public CreateClientSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateClientSecretResponseBodyClientSecret extends TeaModel {
        /**
         * <p>The ID of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>client_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The name of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>my-web-app</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
         * <p>The client key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>secret_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("ClientSecretId")
        public String clientSecretId;

        /**
         * <p>The plaintext client secret. This value is returned only once upon creation and cannot be retrieved later. Store it securely.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("ClientSecretValue")
        public String clientSecretValue;

        /**
         * <p>The time when the client secret was created, in ISO 8601 format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the user pool.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        @NameInMap("UserPoolName")
        public String userPoolName;

        public static CreateClientSecretResponseBodyClientSecret build(java.util.Map<String, ?> map) throws Exception {
            CreateClientSecretResponseBodyClientSecret self = new CreateClientSecretResponseBodyClientSecret();
            return TeaModel.build(map, self);
        }

        public CreateClientSecretResponseBodyClientSecret setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public CreateClientSecretResponseBodyClientSecret setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public CreateClientSecretResponseBodyClientSecret setClientSecretId(String clientSecretId) {
            this.clientSecretId = clientSecretId;
            return this;
        }
        public String getClientSecretId() {
            return this.clientSecretId;
        }

        public CreateClientSecretResponseBodyClientSecret setClientSecretValue(String clientSecretValue) {
            this.clientSecretValue = clientSecretValue;
            return this;
        }
        public String getClientSecretValue() {
            return this.clientSecretValue;
        }

        public CreateClientSecretResponseBodyClientSecret setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateClientSecretResponseBodyClientSecret setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}
