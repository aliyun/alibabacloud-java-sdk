// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationClientSecretResponseBody extends TeaModel {
    /**
     * <p>The information about the client key.</p>
     */
    @NameInMap("ApplicationClientSecret")
    public CreateApplicationClientSecretResponseBodyApplicationClientSecret applicationClientSecret;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationClientSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationClientSecretResponseBody self = new CreateApplicationClientSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationClientSecretResponseBody setApplicationClientSecret(CreateApplicationClientSecretResponseBodyApplicationClientSecret applicationClientSecret) {
        this.applicationClientSecret = applicationClientSecret;
        return this;
    }
    public CreateApplicationClientSecretResponseBodyApplicationClientSecret getApplicationClientSecret() {
        return this.applicationClientSecret;
    }

    public CreateApplicationClientSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateApplicationClientSecretResponseBodyApplicationClientSecret extends TeaModel {
        /**
         * <p>The client ID of the application.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client key secret of the application.</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The client key ID of the application.</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        public static CreateApplicationClientSecretResponseBodyApplicationClientSecret build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationClientSecretResponseBodyApplicationClientSecret self = new CreateApplicationClientSecretResponseBodyApplicationClientSecret();
            return TeaModel.build(map, self);
        }

        public CreateApplicationClientSecretResponseBodyApplicationClientSecret setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public CreateApplicationClientSecretResponseBodyApplicationClientSecret setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public CreateApplicationClientSecretResponseBodyApplicationClientSecret setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

    }

}
