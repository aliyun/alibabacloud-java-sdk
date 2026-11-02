// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateAclRequest extends TeaModel {
    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong>: write</p>
     * </li>
     * <li><p><strong>Read</strong>: read</p>
     * </li>
     * <li><p><strong>Describe</strong>: read a transactional ID</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: perform an idempotent write to a cluster</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: perform an idempotent write to a cluster. Available only for serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: query configurations. Available only for serverless instances.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Read</p>
     */
    @NameInMap("AclOperationType")
    public String aclOperationType;

    /**
     * <p>The operation types for batch authorization. Separate multiple operations with commas (,). Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong>: write</p>
     * </li>
     * <li><p><strong>Read</strong>: read</p>
     * </li>
     * <li><p><strong>Describe</strong>: read a transactional ID</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: perform an idempotent write to a cluster</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: perform an idempotent write to a cluster. Available only for serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: query configurations. Available only for serverless instances.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for serverless instances.</p>
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
     * <li><p><strong>DENY</strong>: deny.</p>
     * </li>
     * <li><p><strong>ALLOW</strong>: allow.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for serverless instances.</p>
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
     * <li><p>The name of the resource. It can be a topic name, a group ID, a cluster name, or a transactional ID.</p>
     * </li>
     * <li><p>You can use an asterisk (*) to specify all resources of this type.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can query the authorized resources by using an asterisk (*) only after you grant permissions to all resources.</li>
     * </ul>
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
     * <li><p><strong>LITERAL</strong>: exact match</p>
     * </li>
     * <li><p><strong>PREFIXED</strong>: prefix match</p>
     * </li>
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
     * <li><p><strong>Topic</strong>: topic</p>
     * </li>
     * <li><p><strong>Group</strong>: consumer group</p>
     * </li>
     * <li><p><strong>Cluster</strong>: instance</p>
     * </li>
     * <li><p><strong>TransactionalId</strong>: transactional ID</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Group</p>
     */
    @NameInMap("AclResourceType")
    public String aclResourceType;

    /**
     * <p>The source IP address.</p>
     * <blockquote>
     * <ul>
     * <li>Only specific IP addresses or an asterisk (*) (which allows all IP addresses) are supported. CIDR blocks are not supported.</li>
     * <li>This parameter is supported only for serverless instances.</li>
     * </ul>
     * </blockquote>
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
     * <li>Before calling this API, you must create a SASL user by calling CreateSaslUser. You can query existing users by calling DescribeSaslUsers.</li>
     * <li>You can use an asterisk (*) to specify all usernames.</li>
     * </ul>
     * <blockquote>
     * <p>You can query the authorized users by using an asterisk (*) only after you grant permissions to all users.</p>
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
