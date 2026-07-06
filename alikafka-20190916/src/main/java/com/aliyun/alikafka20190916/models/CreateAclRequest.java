// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateAclRequest extends TeaModel {
    /**
     * <p>Operation type. Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong>: write</p>
     * </li>
     * <li><p><strong>Read</strong>: read</p>
     * </li>
     * <li><p><strong>Describe</strong>: read TransactionalId</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: idempotent write to Cluster</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: idempotent write to Cluster, only available for Serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: query configuration, only available for Serverless instances.</p>
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
     * <p>Batch authorization operation types. Multiple operations are separated by commas (,).</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong>: read</p>
     * </li>
     * <li><p><strong>Read</strong>: write</p>
     * </li>
     * <li><p><strong>Describe</strong>: read TransactionalId</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: idempotent write to Cluster</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: idempotent write to Cluster, only available for Serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: query configuration, only available for Serverless instances.</p>
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
     * <li><p><strong>DENY</strong>: deny.</p>
     * </li>
     * <li><p><strong>ALLOW</strong>: allow.</p>
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
     * <li><p>The name of the resource, which can be a topic name, Group ID, cluster name, or transaction ID.</p>
     * </li>
     * <li><p>You can use an asterisk (\*) to represent all resources of this type.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Only after authorization is granted to all resources can you query the authorized resources using an asterisk (\*).</li>
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
     * <p>Matching pattern. Valid values:</p>
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
     * <p>Resource type. Valid values:</p>
     * <ul>
     * <li><p><strong>Topic</strong>: message topic.</p>
     * </li>
     * <li><p><strong>Group</strong>: consumer group.</p>
     * </li>
     * <li><p><strong>Cluster</strong>: instance.</p>
     * </li>
     * <li><p><strong>TransactionalId</strong>: transaction ID.</p>
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
     * <p>Source IP.</p>
     * <blockquote>
     * <ul>
     * <li><p>Only specific IP addresses or \* (all IPs) are supported. IP address ranges are not supported.</p>
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
     * <ul>
     * <li>You can use an asterisk (\*) to represent all usernames.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Only after authorization is granted to all users can you query the authorized users using an asterisk (\*).</li>
     * </ul>
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
