// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListTokenVaultsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TokenVaults")
    public java.util.List<ListTokenVaultsResponseBodyTokenVaults> tokenVaults;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTokenVaultsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTokenVaultsResponseBody self = new ListTokenVaultsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTokenVaultsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTokenVaultsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTokenVaultsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTokenVaultsResponseBody setTokenVaults(java.util.List<ListTokenVaultsResponseBodyTokenVaults> tokenVaults) {
        this.tokenVaults = tokenVaults;
        return this;
    }
    public java.util.List<ListTokenVaultsResponseBodyTokenVaults> getTokenVaults() {
        return this.tokenVaults;
    }

    public ListTokenVaultsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTokenVaultsResponseBodyTokenVaultsEncryptionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SERVICE_MANAGED_KEY</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <strong>example:</strong>
         * <p>acs:kms:cn-beijing:123456:key/key-bjxxxxxxxx</p>
         */
        @NameInMap("KmsKeyArn")
        public String kmsKeyArn;

        public static ListTokenVaultsResponseBodyTokenVaultsEncryptionConfig build(java.util.Map<String, ?> map) throws Exception {
            ListTokenVaultsResponseBodyTokenVaultsEncryptionConfig self = new ListTokenVaultsResponseBodyTokenVaultsEncryptionConfig();
            return TeaModel.build(map, self);
        }

        public ListTokenVaultsResponseBodyTokenVaultsEncryptionConfig setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public ListTokenVaultsResponseBodyTokenVaultsEncryptionConfig setKmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public String getKmsKeyArn() {
            return this.kmsKeyArn;
        }

    }

    public static class ListTokenVaultsResponseBodyTokenVaults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>example description</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EncryptionConfig")
        public ListTokenVaultsResponseBodyTokenVaultsEncryptionConfig encryptionConfig;

        /**
         * <strong>example:</strong>
         * <p>acs:ram::123456:role/AliyunAgentIdentityVaultRole</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-beijing:123456:tokenvault/default</p>
         */
        @NameInMap("TokenVaultArn")
        public String tokenVaultArn;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("TokenVaultName")
        public String tokenVaultName;

        /**
         * <strong>example:</strong>
         * <p>2026-05-08T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListTokenVaultsResponseBodyTokenVaults build(java.util.Map<String, ?> map) throws Exception {
            ListTokenVaultsResponseBodyTokenVaults self = new ListTokenVaultsResponseBodyTokenVaults();
            return TeaModel.build(map, self);
        }

        public ListTokenVaultsResponseBodyTokenVaults setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTokenVaultsResponseBodyTokenVaults setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTokenVaultsResponseBodyTokenVaults setEncryptionConfig(ListTokenVaultsResponseBodyTokenVaultsEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public ListTokenVaultsResponseBodyTokenVaultsEncryptionConfig getEncryptionConfig() {
            return this.encryptionConfig;
        }

        public ListTokenVaultsResponseBodyTokenVaults setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListTokenVaultsResponseBodyTokenVaults setTokenVaultArn(String tokenVaultArn) {
            this.tokenVaultArn = tokenVaultArn;
            return this;
        }
        public String getTokenVaultArn() {
            return this.tokenVaultArn;
        }

        public ListTokenVaultsResponseBodyTokenVaults setTokenVaultName(String tokenVaultName) {
            this.tokenVaultName = tokenVaultName;
            return this;
        }
        public String getTokenVaultName() {
            return this.tokenVaultName;
        }

        public ListTokenVaultsResponseBodyTokenVaults setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
