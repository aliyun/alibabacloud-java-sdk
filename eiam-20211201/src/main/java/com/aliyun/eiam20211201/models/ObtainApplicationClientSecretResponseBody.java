// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainApplicationClientSecretResponseBody extends TeaModel {
    /**
     * <p>The secret information.</p>
     */
    @NameInMap("ApplicationClientSecret")
    public ObtainApplicationClientSecretResponseBodyApplicationClientSecret applicationClientSecret;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
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
         * <p>The client secret of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>CSEHDcHcrUKHw1CuxkJEHPveWRXBGqVqRsxxxx</p>
         */
        @NameInMap("ClientSecret")
        public String clientSecret;

        /**
         * <p>The expiration time of the client secret. This is a UNIX timestamp. Unit: milliseconds.</p>
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
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The last time the client secret was used. This is a UNIX timestamp. Unit: milliseconds.</p>
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
         * <li><p>enabled: The secret is enabled.</p>
         * </li>
         * <li><p>disabled: The secret is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
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

        public ObtainApplicationClientSecretResponseBodyApplicationClientSecret setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
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
