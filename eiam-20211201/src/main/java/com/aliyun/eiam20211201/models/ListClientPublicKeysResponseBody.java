// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListClientPublicKeysResponseBody extends TeaModel {
    /**
     * <p>The list of client public keys for the application.</p>
     */
    @NameInMap("ClientPublicKeys")
    public java.util.List<ListClientPublicKeysResponseBodyClientPublicKeys> clientPublicKeys;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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

    public static ListClientPublicKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientPublicKeysResponseBody self = new ListClientPublicKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientPublicKeysResponseBody setClientPublicKeys(java.util.List<ListClientPublicKeysResponseBodyClientPublicKeys> clientPublicKeys) {
        this.clientPublicKeys = clientPublicKeys;
        return this;
    }
    public java.util.List<ListClientPublicKeysResponseBodyClientPublicKeys> getClientPublicKeys() {
        return this.clientPublicKeys;
    }

    public ListClientPublicKeysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListClientPublicKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListClientPublicKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClientPublicKeysResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListClientPublicKeysResponseBodyClientPublicKeys extends TeaModel {
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
         * <p>The ID of the client public key.</p>
         * 
         * <strong>example:</strong>
         * <p>KEYEqDnDJhztiEAwSin7MZoxGcihzCAuxxxx</p>
         */
        @NameInMap("ClientPublicKeyId")
        public String clientPublicKeyId;

        /**
         * <p>The time when the key was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1722006052000</p>
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
         * <p>1762006052000</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>Indicates whether the key is used with priority.</p>
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

        public static ListClientPublicKeysResponseBodyClientPublicKeys build(java.util.Map<String, ?> map) throws Exception {
            ListClientPublicKeysResponseBodyClientPublicKeys self = new ListClientPublicKeysResponseBodyClientPublicKeys();
            return TeaModel.build(map, self);
        }

        public ListClientPublicKeysResponseBodyClientPublicKeys setAlgorithmType(String algorithmType) {
            this.algorithmType = algorithmType;
            return this;
        }
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        public ListClientPublicKeysResponseBodyClientPublicKeys setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListClientPublicKeysResponseBodyClientPublicKeys setClientPublicKeyId(String clientPublicKeyId) {
            this.clientPublicKeyId = clientPublicKeyId;
            return this;
        }
        public String getClientPublicKeyId() {
            return this.clientPublicKeyId;
        }

        public ListClientPublicKeysResponseBodyClientPublicKeys setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListClientPublicKeysResponseBodyClientPublicKeys setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListClientPublicKeysResponseBodyClientPublicKeys setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListClientPublicKeysResponseBodyClientPublicKeys setPrimary(Boolean primary) {
            this.primary = primary;
            return this;
        }
        public Boolean getPrimary() {
            return this.primary;
        }

        public ListClientPublicKeysResponseBodyClientPublicKeys setPublicKey(String publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public String getPublicKey() {
            return this.publicKey;
        }

        public ListClientPublicKeysResponseBodyClientPublicKeys setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
