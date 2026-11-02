// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteAclRequest extends TeaModel {
    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong>: Write.</p>
     * </li>
     * <li><p><strong>Read</strong>: Read.</p>
     * </li>
     * <li><p><strong>Describe</strong>: Read a transaction ID.</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: Idempotent write to a cluster.</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: Idempotent write to a cluster. Available only for serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: Query configurations. Available only for serverless instances.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Write</p>
     */
    @NameInMap("AclOperationType")
    public String aclOperationType;

    /**
     * <p>The operation types for batch authorization. Separate multiple operations with commas (,). Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong>: Write.</p>
     * </li>
     * <li><p><strong>Read</strong>: Read.</p>
     * </li>
     * <li><p><strong>Describe</strong>: Read a transaction ID.</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: Idempotent write to a cluster.</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: Idempotent write to a cluster. Available only for serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: Query configurations. Available only for serverless instances.</p>
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
     * <li>DENY: Deny.</li>
     * <li>ALLOW: Allow.</li>
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
     * <p>The resource name. You can specify the name of a topic or a consumer group. An asterisk (*) indicates all topics or consumer groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AclResourceName")
    public String aclResourceName;

    /**
     * <p>The matching mode. Valid values:</p>
     * <ul>
     * <li><p><strong>LITERAL</strong>: Exact match.</p>
     * </li>
     * <li><p><strong>PREFIXED</strong>: Prefix match.</p>
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
     * <li><p><strong>Topic</strong>: Message topic.</p>
     * </li>
     * <li><p><strong>Group</strong>: Consumer group.</p>
     * </li>
     * <li><p><strong>Cluster</strong>: Instance.</p>
     * </li>
     * <li><p><strong>TransactionalId</strong>: Transaction ID.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Topic</p>
     */
    @NameInMap("AclResourceType")
    public String aclResourceType;

    /**
     * <p>The source IP address.</p>
     * <blockquote>
     * <ul>
     * <li>Only specific IP addresses or an asterisk (*) to allow all IP addresses are supported. CIDR blocks are not supported.</li>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test12****</p>
     */
    @NameInMap("Username")
    public String username;

    public static DeleteAclRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAclRequest self = new DeleteAclRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAclRequest setAclOperationType(String aclOperationType) {
        this.aclOperationType = aclOperationType;
        return this;
    }
    public String getAclOperationType() {
        return this.aclOperationType;
    }

    public DeleteAclRequest setAclOperationTypes(String aclOperationTypes) {
        this.aclOperationTypes = aclOperationTypes;
        return this;
    }
    public String getAclOperationTypes() {
        return this.aclOperationTypes;
    }

    public DeleteAclRequest setAclPermissionType(String aclPermissionType) {
        this.aclPermissionType = aclPermissionType;
        return this;
    }
    public String getAclPermissionType() {
        return this.aclPermissionType;
    }

    public DeleteAclRequest setAclResourceName(String aclResourceName) {
        this.aclResourceName = aclResourceName;
        return this;
    }
    public String getAclResourceName() {
        return this.aclResourceName;
    }

    public DeleteAclRequest setAclResourcePatternType(String aclResourcePatternType) {
        this.aclResourcePatternType = aclResourcePatternType;
        return this;
    }
    public String getAclResourcePatternType() {
        return this.aclResourcePatternType;
    }

    public DeleteAclRequest setAclResourceType(String aclResourceType) {
        this.aclResourceType = aclResourceType;
        return this;
    }
    public String getAclResourceType() {
        return this.aclResourceType;
    }

    public DeleteAclRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DeleteAclRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAclRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAclRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
