// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclsRequest extends TeaModel {
    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><p><strong>Write</strong>: Writes.</p>
     * </li>
     * <li><p><strong>Read</strong>: Reads.</p>
     * </li>
     * <li><p><strong>Describe</strong>: Reads a TransactionalId.</p>
     * </li>
     * <li><p><strong>IdempotentWrite</strong>: Idempotently writes to a cluster. This parameter is not supported for Serverless instances. For Serverless instances, use IDEMPOTENT_WRITE.</p>
     * </li>
     * <li><p><strong>IDEMPOTENT_WRITE</strong>: Idempotently writes to a cluster. This parameter is available only for Serverless instances.</p>
     * </li>
     * <li><p><strong>DESCRIBE_CONFIGS</strong>: Queries configurations. This parameter is available only for Serverless instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Write</p>
     */
    @NameInMap("AclOperationType")
    public String aclOperationType;

    /**
     * <p>The permission type. Valid values:</p>
     * <ul>
     * <li>DENY: Denies access.</li>
     * <li>ALLOW: Allows access.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is supported only for Serverless instances.</p>
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
     * <li><p>The name of a topic or group.</p>
     * </li>
     * <li><p>You can use an asterisk (*) to represent the names of all topics or groups.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can use an asterisk (*) to query authorized resources only after permissions are granted to all resources.</li>
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
     * <li><p>LITERAL: exact match</p>
     * </li>
     * <li><p>PREFIXED: prefix match</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LITERAL</p>
     */
    @NameInMap("AclResourcePatternType")
    public String aclResourcePatternType;

    /**
     * <p>The resource type. Valid values:</p>
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
     * <li>Only specific IP addresses or * (all IP addresses allowed) are supported. CIDR blocks are not supported.</li>
     * <li>This parameter is supported only for Serverless instances.</li>
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
     * <p>alikafka_pre-cn-v0h1cng****</p>
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
     * <li>You can use an asterisk (*) to represent all users.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>You can use an asterisk (*) to query authorized users only after permissions are granted to all users.</li>
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
