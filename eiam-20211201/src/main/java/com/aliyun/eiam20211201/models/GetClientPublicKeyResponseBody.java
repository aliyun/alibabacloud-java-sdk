// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetClientPublicKeyResponseBody extends TeaModel {
    /**
     * <p>Information about the application\&quot;s ClientPublicKey.</p>
     */
    @NameInMap("ClientPublicKey")
    public GetClientPublicKeyResponseBodyClientPublicKey clientPublicKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetClientPublicKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientPublicKeyResponseBody self = new GetClientPublicKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientPublicKeyResponseBody setClientPublicKey(GetClientPublicKeyResponseBodyClientPublicKey clientPublicKey) {
        this.clientPublicKey = clientPublicKey;
        return this;
    }
    public GetClientPublicKeyResponseBodyClientPublicKey getClientPublicKey() {
        return this.clientPublicKey;
    }

    public GetClientPublicKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClientPublicKeyResponseBodyClientPublicKey extends TeaModel {
        /**
         * <p>The algorithm type.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA-2048</p>
         */
        @NameInMap("AlgorithmType")
        public String algorithmType;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The ID of the application\&quot;s ClientPublicKey.</p>
         * 
         * <strong>example:</strong>
         * <p>KEYEqDnDJhztiEAwSin7MZoxGcihzCAuxxxx</p>
         */
        @NameInMap("ClientPublicKeyId")
        public String clientPublicKeyId;

        /**
         * <p>The time when the public key was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1731305755000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the key was last used.</p>
         * 
         * <strong>example:</strong>
         * <p>1771305755000</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>Indicates whether this is the primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Primary")
        public Boolean primary;

        /**
         * <p>The public key.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PUBLIC KEY-----
         * MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmnWMdp9FU3vXljeIqpgR
         * 05E6jEgzIfKsFaLkv+07e2Lg8luTaJh8Q2nkbxdNpTfqBnMMyTgml88WktP45F78
         * La7hQtR3vz0Eu1yA92gXwD5Oob7ay4JYQZ0C80o2tB3FsbXG2jUvr31MNkf/0oBY
         * qUKK5Hnlk1TdrnZ5VkzgLGHKlj+NJHHF/57DbT64C2qpAWeKHAr9umJ8++0hKqG/
         * oRSOpb7oWK4t5c39ulp1j5JJ6cwqrKVCXvsHfWHywOHkcyus+ZNPTQvpwjRnEmRz
         * Vy3NWrjT7JlIa8vS1aUU+FxeFd2MLQzxFxquFLwi05su2faRexaeYwWW6IWAI3tX
         * twxxxxxx
         * -----END PUBLIC KEY-----</p>
         */
        @NameInMap("PublicKey")
        public String publicKey;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetClientPublicKeyResponseBodyClientPublicKey build(java.util.Map<String, ?> map) throws Exception {
            GetClientPublicKeyResponseBodyClientPublicKey self = new GetClientPublicKeyResponseBodyClientPublicKey();
            return TeaModel.build(map, self);
        }

        public GetClientPublicKeyResponseBodyClientPublicKey setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public GetClientPublicKeyResponseBodyClientPublicKey setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetClientPublicKeyResponseBodyClientPublicKey setClientPublicKeyId(String clientPublicKeyId) {
            this.clientPublicKeyId = clientPublicKeyId;
            return this;
        }
        public String getClientPublicKeyId() {
            return this.clientPublicKeyId;
        }

        public GetClientPublicKeyResponseBodyClientPublicKey setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetClientPublicKeyResponseBodyClientPublicKey setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetClientPublicKeyResponseBodyClientPublicKey setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public GetClientPublicKeyResponseBodyClientPublicKey setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public GetClientPublicKeyResponseBodyClientPublicKey setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public GetClientPublicKeyResponseBodyClientPublicKey setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
