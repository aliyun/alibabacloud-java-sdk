// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclsRequest extends TeaModel {
    @NameInMap("AclOperationType")
    public String aclOperationType;

    @NameInMap("AclPermissionType")
    public String aclPermissionType;

    /**
     * <p>The name or ID of the resource.</p>
     * <br>
     * <p>*   The value can be the name of a topic or a consumer group.</p>
     * <p>*   You can use an asterisk (\\*) to represent the names of all topics or consumer groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclResourceName")
    public String aclResourceName;

    /**
     * <p>The match mode. Valid values:</p>
     * <br>
     * <p>*   LITERAL: full-name match</p>
     * <p>*   PREFIXED: prefix match</p>
     */
    @NameInMap("AclResourcePatternType")
    public String aclResourcePatternType;

    /**
     * <p>The resource type. Valid values:</p>
     * <br>
     * <p>*   **Topic**</p>
     * <p>*   **Group**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclResourceType")
    public String aclResourceType;

    @NameInMap("Host")
    public String host;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the user.</p>
     * <br>
     * <p>This parameter is required.</p>
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
