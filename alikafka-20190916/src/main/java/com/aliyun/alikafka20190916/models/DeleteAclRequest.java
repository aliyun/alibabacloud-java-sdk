// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DeleteAclRequest extends TeaModel {
    /**
     * <p>The type of the operation allowed by the access control list (ACL). Valid values:</p>
     * <ul>
     * <li><strong>Write</strong>: data writes.</li>
     * <li><strong>Read</strong>: data reads.</li>
     * <li><strong>Describe</strong>: reads of transaction IDs.</li>
     * <li><strong>IdempotentWrite</strong>: idempotent data writes to clusters.</li>
     * <li><strong>IDEMPOTENT_WRITE</strong>: idempotent data writes to clusters. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
     * <li><strong>DESCRIBE_CONFIGS</strong>: configuration query. This value is available only for serverless ApsaraMQ for Kafka instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Write</p>
     */
    @NameInMap("AclOperationType")
    public String aclOperationType;

    /**
     * <p>The types of operations allowed by the ACL. Separate multiple operations with commas (,).</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>Write</strong>: data writes.</li>
     * <li><strong>Read</strong>: data reads.</li>
     * <li><strong>Describe</strong>: reads of transaction IDs.</li>
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
     * <li>Deny</li>
     * <li>ALLOW</li>
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
     * <p>The name of the resource.</p>
     * <ul>
     * <li>The value can be the name of a topic or consumer group.</li>
     * <li>You can use an asterisk (\*) to indicate the names of all topics or consumer groups.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AclResourceName")
    public String aclResourceName;

    /**
     * <p>The mode that is used to match resources. Valid values:</p>
     * <ul>
     * <li><strong>LITERAL:</strong> full match</li>
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
     * <li><strong>Topic</strong>: topic</li>
     * <li><strong>Group</strong>: consumer group</li>
     * <li><strong>Cluster</strong>: cluster</li>
     * <li><strong>TransactionalId</strong>: transactional ID</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Topic</p>
     */
    @NameInMap("AclResourceType")
    public String aclResourceType;

    /**
     * <p>The IP address of the source.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can specify only a specific IP address or use the asterisk (\*) wildcard character to specify all IP addresses. CIDR blocks are not supported.</p>
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
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-v0h1cng0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the user.</p>
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
