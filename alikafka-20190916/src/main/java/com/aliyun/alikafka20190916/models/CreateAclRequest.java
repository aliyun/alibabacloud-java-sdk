// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateAclRequest extends TeaModel {
    /**
     * <p>The type of the operation allowed by the access control list (ACL). Valid values:</p>
     * <ul>
     * <li><strong>Write</strong></li>
     * <li><strong>Read</strong></li>
     * <li><strong>Describe</strong>: reads of transactional IDs.</li>
     * <li><strong>IdempotentWrite</strong>: idempotent data writes to clusters.</li>
     * <li><strong>IDEMPOTENT_WRITE</strong>: idempotent data writes to clusters. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
     * <li><strong>DESCRIBE_CONFIGS</strong>: configuration query. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Read</p>
     */
    @NameInMap("AclOperationType")
    public String aclOperationType;

    /**
     * <p>The types of operations allowed by the ACL. Separate multiple operation types with commas (,).</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>Write</strong></li>
     * <li><strong>Read</strong></li>
     * <li><strong>Describe</strong>: reads of transactional IDs.</li>
     * <li><strong>IdempotentWrite</strong>: idempotent data writes to clusters.</li>
     * <li><strong>IDEMPOTENT_WRITE</strong>: idempotent data writes to clusters. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
     * <li><strong>DESCRIBE_CONFIGS</strong>: configuration query. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Write,Read</p>
     */
    @NameInMap("AclOperationTypes")
    public String aclOperationTypes;

    /**
     * <p>The authorization method. Valid values:</p>
     * <ul>
     * <li><strong>DENY</strong></li>
     * <li><strong>ALLOW</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DENY</p>
     */
    @NameInMap("AclPermissionType")
    public String aclPermissionType;

    /**
     * <p>The resource name.</p>
     * <ul>
     * <li>The value can be a topic name, a group ID, a cluster name, or a transaction ID.</li>
     * <li>You can use an asterisk (\*) to specify the names of all resources of the specified type.</li>
     * </ul>
     * <blockquote>
     * <p>You can use an asterisk (\*) to query the resources on which permissions are granted only after you grant the user the required permissions on all resources.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>X****</p>
     */
    @NameInMap("AclResourceName")
    public String aclResourceName;

    /**
     * <p>The matching mode. Valid values:</p>
     * <ul>
     * <li><strong>LITERAL</strong>: exact match</li>
     * <li><strong>PREFIXED</strong>: prefix match</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LITERAL</p>
     */
    @NameInMap("AclResourcePatternType")
    public String aclResourcePatternType;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><strong>Topic</strong></li>
     * <li><strong>Group</strong></li>
     * <li><strong>Cluster</strong></li>
     * <li><strong>TransactionalId</strong>: transactional ID</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Group</p>
     */
    @NameInMap("AclResourceType")
    public String aclResourceType;

    /**
     * <p>The IP address of the source.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can specify a specific IP address or use the asterisk (\*) wildcard character to specify all IP addresses. CIDR blocks are not supported.</p>
     * </li>
     * <li><p>This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-v0h1cng0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The username.</p>
     * <ul>
     * <li>You can use an asterisk (\*) to specify all usernames.</li>
     * </ul>
     * <blockquote>
     * <p>You can use an asterisk (\*) to query the authorized users only after you grant the required permissions to all users.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test***</p>
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
