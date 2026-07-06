// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteAclRequest extends TeaModel {
    /**
     * <p>Operation type. Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong>: Write</p>
     * </li>
     * <li><p><strong>Read</strong>: Read</p>
     * </li>
     * <li><p><strong>Describe</strong>: Read TransactionalId</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: Idempotent write to Cluster</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: Idempotent write to Cluster, only available for Serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: Query configuration, only available for Serverless instances.</p>
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
     * <p>Batch authorization operation types. Multiple operations are separated by commas (,).</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong>: Read</p>
     * </li>
     * <li><p><strong>Read</strong>: Write</p>
     * </li>
     * <li><p><strong>Describe</strong>: Read TransactionalId</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: Idempotent write to Cluster</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: Idempotent write to Cluster, only available for Serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: Query configuration, only available for Serverless instances.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is only supported for Serverless instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Write,Read</p>
     */
    @NameInMap("AclOperationTypes")
    public String aclOperationTypes;

    /**
     * <p>Authorization method. Valid values:</p>
     * <ul>
     * <li><p>DENY: Deny</p>
     * </li>
     * <li><p>ALLOW: Allow</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is only supported for Serverless instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DENY</p>
     */
    @NameInMap("AclPermissionType")
    public String aclPermissionType;

    /**
     * <p>Resource name.</p>
     * <ul>
     * <li><p>Topic name or Group name.</p>
     * </li>
     * <li><p>Asterisk (\*) represents all Topic or Group names.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AclResourceName")
    public String aclResourceName;

    /**
     * <p>Matching pattern. Valid values:</p>
     * <ul>
     * <li><p><strong>LITERAL</strong>: Exact matching pattern</p>
     * </li>
     * <li><p><strong>PREFIXED</strong>: Prefix matching pattern</p>
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
     * <p>Resource type.</p>
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
     * <p>Source IP.</p>
     * <blockquote>
     * <ul>
     * <li><p>Only supports specific IP addresses or setting \* (all IPs), does not support IP segments.</p>
     * </li>
     * <li><p>This parameter is only supported for Serverless instances.</p>
     * </li>
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
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-v0h1cng0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Username.</p>
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
