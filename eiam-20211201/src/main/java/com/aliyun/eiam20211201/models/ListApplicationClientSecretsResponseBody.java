// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationClientSecretsResponseBody extends TeaModel {
    @NameInMap("ApplicationClientSecrets")
    public java.util.List<ListApplicationClientSecretsResponseBodyApplicationClientSecrets> applicationClientSecrets;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationClientSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationClientSecretsResponseBody self = new ListApplicationClientSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationClientSecretsResponseBody setApplicationClientSecrets(java.util.List<ListApplicationClientSecretsResponseBodyApplicationClientSecrets> applicationClientSecrets) {
        this.applicationClientSecrets = applicationClientSecrets;
        return this;
    }
    public java.util.List<ListApplicationClientSecretsResponseBodyApplicationClientSecrets> getApplicationClientSecrets() {
        return this.applicationClientSecrets;
    }

    public ListApplicationClientSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationClientSecretsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationClientSecretsResponseBodyApplicationClientSecrets extends TeaModel {
        /**
         * <p>IDaaS EIAM 应用Id</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>IDaaS EIAM 客户端ID</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>客户端密钥（已脱敏）</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>IDaaS EIAM 客户端密钥最近使用时间</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>IDaaS EIAM 客户端密钥Id</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        /**
         * <p>IDaaS EIAM 客户端密钥状态</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListApplicationClientSecretsResponseBodyApplicationClientSecrets build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationClientSecretsResponseBodyApplicationClientSecrets self = new ListApplicationClientSecretsResponseBodyApplicationClientSecrets();
            return TeaModel.build(map, self);
        }

        public ListApplicationClientSecretsResponseBodyApplicationClientSecrets setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationClientSecretsResponseBodyApplicationClientSecrets setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListApplicationClientSecretsResponseBodyApplicationClientSecrets setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public ListApplicationClientSecretsResponseBodyApplicationClientSecrets setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationClientSecretsResponseBodyApplicationClientSecrets setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListApplicationClientSecretsResponseBodyApplicationClientSecrets setSecretId(String secretId) {
            this.secretId = secretId;
            return this;
        }
        public String getSecretId() {
            return this.secretId;
        }

        public ListApplicationClientSecretsResponseBodyApplicationClientSecrets setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
