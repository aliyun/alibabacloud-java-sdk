// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationClientSecretsResponseBody extends TeaModel {
    /**
     * <p>The information about the client secrets.</p>
     */
    @NameInMap("ApplicationClientSecrets")
    public java.util.List<ListApplicationClientSecretsResponseBodyApplicationClientSecrets> applicationClientSecrets;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The client ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The client secret of the application. The returned ClientSecret is masked.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJh*****************************************************************************************************OQ</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The expiration time of the client secret. This is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1749830226000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_wdziy4vnjt33ehhf7z2o2nxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The last time the client secret was used. This is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>The client secret ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>sci_k52x2ru63rlkflina5utgkxxxx</p>
         */
        @NameInMap("SecretId")
        public String secretId;

        /**
         * <p>The status of the client secret. Valid values:</p>
         * <ul>
         * <li><p>enabled: The client secret is enabled.</p>
         * </li>
         * <li><p>disabled: The client secret is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
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

        public ListApplicationClientSecretsResponseBodyApplicationClientSecrets setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
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
