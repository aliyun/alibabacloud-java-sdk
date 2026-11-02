// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DescribeAclResourceNameRequest extends TeaModel {
    /**
     * <p>The matching pattern. Valid values:</p>
     * <ul>
     * <li><p>LITERAL: Exact match.</p>
     * </li>
     * <li><p>PREFIXED: Prefix match.</p>
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
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_post-cn-mp919o4v****</p>
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

    public static DescribeAclResourceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclResourceNameRequest self = new DescribeAclResourceNameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAclResourceNameRequest setAclResourcePatternType(String aclResourcePatternType) {
        this.aclResourcePatternType = aclResourcePatternType;
        return this;
    }
    public String getAclResourcePatternType() {
        return this.aclResourcePatternType;
    }

    public DescribeAclResourceNameRequest setAclResourceType(String aclResourceType) {
        this.aclResourceType = aclResourceType;
        return this;
    }
    public String getAclResourceType() {
        return this.aclResourceType;
    }

    public DescribeAclResourceNameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAclResourceNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
