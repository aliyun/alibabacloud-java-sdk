// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclsRequest extends TeaModel {
    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong></p>
     * </li>
     * <li><p><strong>Read</strong></p>
     * </li>
     * <li><p><strong>Describe</strong>: reads a transactional ID.</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: performs an idempotent write to a cluster. This value is not supported by Serverless instances. For Serverless instances, use IDEMPOTENT_WRITE.</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: performs an idempotent write to a cluster. This value is available only for Serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: queries configurations. This value is available only for Serverless instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Write</p>
     */
    @NameInMap("AclOperationType")
    public String aclOperationType;

    /**
     * <p>The authorization method. Valid values:</p>
     * <ul>
     * <li><p>DENY</p>
     * </li>
     * <li><p>ALLOW</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only for Serverless instances.</p>
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
     * <li><p>The name can be a topic name or a group name.</p>
     * </li>
     * <li><p>You can use an asterisk (\*) to represent all topic names or group names.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can use an asterisk (\*) only after you grant permissions to all resources.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("AclResourceName")
    public String aclResourceName;

    /**
     * <p>The match mode. Valid values:</p>
     * <ul>
     * <li><p>LITERAL: an exact match</p>
     * </li>
     * <li><p>PREFIXED: a prefix match</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LITERAL</p>
     */
    @NameInMap("AclResourcePatternType")
    public String aclResourcePatternType;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li><p><strong>Topic</strong></p>
     * </li>
     * <li><p><strong>Group</strong></p>
     * </li>
     * <li><p><strong>Cluster</strong></p>
     * </li>
     * <li><p><strong>TransactionalId</strong></p>
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
     * <li><p>You can set this parameter to a specific IP address or an asterisk (\<em>). An asterisk (\</em>) indicates all IP addresses. CIDR blocks are not supported.</p>
     * </li>
     * <li><p>This parameter is available only for Serverless instances.</p>
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
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-v0h1cng****</p>
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
     * <p>The username.</p>
     * <ul>
     * <li>An asterisk (\*) can be used to represent all users.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>A query with an asterisk (\*) returns authorizations only if authorization has been granted to all users.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test12****</p>
     */
    @NameInMap("Username")
    public String username;

    public static DescribeAclsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclsRequest self = new DescribeAclsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAclsRequest setAclOperationType(String aclOperationType) {
        this.aclOperationType = aclOperationType;
        return this;
    }
    public String getAclOperationType() {
        return this.aclOperationType;
    }

    public DescribeAclsRequest setAclPermissionType(String aclPermissionType) {
        this.aclPermissionType = aclPermissionType;
        return this;
    }
    public String getAclPermissionType() {
        return this.aclPermissionType;
    }

    public DescribeAclsRequest setAclResourceName(String aclResourceName) {
        this.aclResourceName = aclResourceName;
        return this;
    }
    public String getAclResourceName() {
        return this.aclResourceName;
    }

    public DescribeAclsRequest setAclResourcePatternType(String aclResourcePatternType) {
        this.aclResourcePatternType = aclResourcePatternType;
        return this;
    }
    public String getAclResourcePatternType() {
        return this.aclResourcePatternType;
    }

    public DescribeAclsRequest setAclResourceType(String aclResourceType) {
        this.aclResourceType = aclResourceType;
        return this;
    }
    public String getAclResourceType() {
        return this.aclResourceType;
    }

    public DescribeAclsRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DescribeAclsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAclsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAclsRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
