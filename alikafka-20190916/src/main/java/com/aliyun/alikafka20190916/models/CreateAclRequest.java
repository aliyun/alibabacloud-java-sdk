// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateAclRequest extends TeaModel {
    /**
     * <p>The type of the operation allowed by the access control list (ACL). Valid values:</p>
     * <br>
     * <p>*   **Write**</p>
     * <p>*   **Read**</p>
     * <p>*   **Describe**: reads of transactional IDs.</p>
     * <p>*   **IdempotentWrite**: idempotent data writes to clusters.</p>
     * <p>*   **IDEMPOTENT_WRITE**: idempotent data writes to clusters. This value is available only for ApsaraMQ for Kafka V3 instances.</p>
     * <p>*   **DESCRIBE_CONFIGS**: queries of configurations. This value is available only for ApsaraMQ for Kafka V3 instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclOperationType")
    public String aclOperationType;

    /**
     * <p>The types of operations allowed by the ACL. Separate multiple operation types with commas (,).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **Write**</p>
     * <p>*   **Read**</p>
     * <p>*   **Describe**: reads of transactional IDs.</p>
     * <p>*   **IdempotentWrite**: idempotent data writes to clusters.</p>
     * <p>*   **IDEMPOTENT_WRITE**: idempotent data writes to clusters. This value is available only for ApsaraMQ for Kafka V3 instances.</p>
     * <p>*   **DESCRIBE_CONFIGS**: queries of configurations. This value is available only for ApsaraMQ for Kafka V3 instances.</p>
     * <br>
     * <p>>  This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
     */
    @NameInMap("AclOperationTypes")
    public String aclOperationTypes;

    /**
     * <p>The authorization method. Valid values:</p>
     * <br>
     * <p>*   **DENY**</p>
     * <p>*   **ALLOW**</p>
     * <br>
     * <p>>  This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
     */
    @NameInMap("AclPermissionType")
    public String aclPermissionType;

    /**
     * <p>The name or ID of the resource.</p>
     * <br>
     * <p>*   The value can be the name of a topic, consumer group, or cluster, or the ID of a transaction.</p>
     * <p>*   You can use an asterisk (\\*) to represent the names or IDs of all relevant resources.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclResourceName")
    public String aclResourceName;

    /**
     * <p>The matching mode. Valid values:</p>
     * <br>
     * <p>*   **LITERAL**: exact match</p>
     * <p>*   **PREFIXED**: prefix match</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclResourcePatternType")
    public String aclResourcePatternType;

    /**
     * <p>The resource type. Valid values:</p>
     * <br>
     * <p>*   **Topic**</p>
     * <p>*   **Group**</p>
     * <p>*   **Cluster**</p>
     * <p>*   **TransactionalId**: transactional ID</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclResourceType")
    public String aclResourceType;

    /**
     * <p>The source IP address.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can specify only a specific IP address or use the asterisk (\\*) wildcard character to specify all IP addresses. CIDR blocks are not supported.</p>
     * <br>
     * <p>*   This parameter is available only for ApsaraMQ for Kafka V3 serverless instances.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The username.</p>
     * <br>
     * <p>You can use an asterisk (\\*) to represent all usernames.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Username")
    public String username;

    public static CreateAclRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAclRequest self = new CreateAclRequest();
        return TeaModel.build(map, self);
    }

    public CreateAclRequest setAclOperationType(String aclOperationType) {
        this.aclOperationType = aclOperationType;
        return this;
    }
    public String getAclOperationType() {
        return this.aclOperationType;
    }

    public CreateAclRequest setAclOperationTypes(String aclOperationTypes) {
        this.aclOperationTypes = aclOperationTypes;
        return this;
    }
    public String getAclOperationTypes() {
        return this.aclOperationTypes;
    }

    public CreateAclRequest setAclPermissionType(String aclPermissionType) {
        this.aclPermissionType = aclPermissionType;
        return this;
    }
    public String getAclPermissionType() {
        return this.aclPermissionType;
    }

    public CreateAclRequest setAclResourceName(String aclResourceName) {
        this.aclResourceName = aclResourceName;
        return this;
    }
    public String getAclResourceName() {
        return this.aclResourceName;
    }

    public CreateAclRequest setAclResourcePatternType(String aclResourcePatternType) {
        this.aclResourcePatternType = aclResourcePatternType;
        return this;
    }
    public String getAclResourcePatternType() {
        return this.aclResourcePatternType;
    }

    public CreateAclRequest setAclResourceType(String aclResourceType) {
        this.aclResourceType = aclResourceType;
        return this;
    }
    public String getAclResourceType() {
        return this.aclResourceType;
    }

    public CreateAclRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateAclRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAclRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
