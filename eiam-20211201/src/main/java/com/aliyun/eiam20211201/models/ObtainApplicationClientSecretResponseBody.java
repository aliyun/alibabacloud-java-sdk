// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainApplicationClientSecretResponseBody extends TeaModel {
    @NameInMap("ApplicationClientSecret")
    public ObtainApplicationClientSecretResponseBodyApplicationClientSecret applicationClientSecret;

    @NameInMap("RequestId")
    public String requestId;

    public static ObtainApplicationClientSecretResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ObtainApplicationClientSecretResponseBody self = new ObtainApplicationClientSecretResponseBody();
        return TeaModel.build(map, self);
    }

    public ObtainApplicationClientSecretResponseBody setApplicationClientSecret(ObtainApplicationClientSecretResponseBodyApplicationClientSecret applicationClientSecret) {
        this.applicationClientSecret = applicationClientSecret;
        return this;
    }
    public ObtainApplicationClientSecretResponseBodyApplicationClientSecret getApplicationClientSecret() {
        return this.applicationClientSecret;
    }

    public ObtainApplicationClientSecretResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ObtainApplicationClientSecretResponseBodyApplicationClientSecret extends TeaModel {
        // IDaaS EIAM 应用Id
        @NameInMap("ApplicationId")
        public String applicationId;

        // IDaaS EIAM 客户端ID
        @NameInMap("ClientId")
        public String clientId;

        // 客户端密钥
        @NameInMap("ClientSecret")
        public String clientSecret;

        // IDaaS EIAM 实例Id
        @NameInMap("InstanceId")
        public String instanceId;

        // IDaaS EIAM 客户端密钥最近使用时间
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        // IDaaS EIAM 客户端密钥Id
        @NameInMap("SecretId")
        public String secretId;

        // IDaaS EIAM 客户端密钥状态
        @NameInMap("Status")
        public String status;

        public static ObtainApplicationClientSecretResponseBodyApplicationClientSecret build(java.util.Map<String, ?> map) throws Exception {
            ObtainApplicationClientSecretResponseBodyApplicationClientSecret self = new ObtainApplicationClientSecretResponseBodyApplicationClientSecret();
            return TeaModel.build(map, self);
        }

        public ObtainApplicationClientSecretResponseBodyApplicationClientSecret setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ObtainApplicationClientSecretResponseBodyApplicationClientSecret setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ObtainApplicationClientSecretResponseBodyApplicationClientSecret setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public ObtainApplicationClientSecretResponseBodyApplicationClientSecret setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ObtainApplicationClientSecretResponseBodyApplicationClientSecret setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ObtainApplicationClientSecretResponseBodyApplicationClientSecret setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public ObtainApplicationClientSecretResponseBodyApplicationClientSecret setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
