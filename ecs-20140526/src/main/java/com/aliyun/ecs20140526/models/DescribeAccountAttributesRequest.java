// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAccountAttributesRequest extends TeaModel {
    /**
     * <p>The type of resource quota to query in the specified region. Valid values of N: 1 to 8. Valid values:</p>
     * <ul>
     * <li><p>instance-network-type: available network types.</p>
     * </li>
     * <li><p>max-security-groups: the maximum number of security groups.</p>
     * </li>
     * <li><p>max-elastic-network-interfaces: the maximum number of Elastic Network Interfaces (ENIs).</p>
     * </li>
     * <li><p>max-postpaid-instance-vcpu-count: the maximum number of vCPUs for pay-as-you-go instances.</p>
     * </li>
     * <li><p>max-spot-instance-vcpu-count: the maximum number of vCPUs for spot instances.</p>
     * </li>
     * <li><p>used-postpaid-instance-vcpu-count: the number of vCPUs that have been used by pay-as-you-go instances.</p>
     * </li>
     * <li><p>used-spot-instance-vcpu-count: the number of vCPUs that have been used by spot instances.</p>
     * </li>
     * <li><p>max-postpaid-yundisk-capacity: the maximum total capacity of pay-as-you-go cloud disks used as data disks. (This parameter value is deprecated.)</p>
     * </li>
     * <li><p>used-postpaid-yundisk-capacity: the capacity of pay-as-you-go cloud disks that have been used as data disks. (This parameter value is deprecated.)</p>
     * </li>
     * <li><p>max-dedicated-hosts: the maximum number of dedicated hosts.</p>
     * </li>
     * <li><p>supported-postpaid-instance-types: the instance types of pay-as-you-go I/O optimized instances.</p>
     * </li>
     * <li><p>max-axt-command-count: the maximum number of Cloud Assistant commands.</p>
     * </li>
     * <li><p>max-axt-invocation-daily: the maximum number of Cloud Assistant commands that can be executed per day.</p>
     * </li>
     * <li><p>real-name-authentication: whether the account has completed real-name registration.</p>
     * <blockquote>
     * <p>You must complete real-name registration before you can create ECS instances in regions in the Chinese mainland.</p>
     * </blockquote>
     * </li>
     * <li><p>max-cloud-assistant-activation-count: the maximum number of Cloud Assistant managed instance dynamic codes that can be created.</p>
     * </li>
     * </ul>
     * <p>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>max-security-groups</p>
     */
    @NameInMap("AttributeName")
    public java.util.List<String> attributeName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAccountAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAttributesRequest self = new DescribeAccountAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAttributesRequest setAttributeName(java.util.List<String> attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public java.util.List<String> getAttributeName() {
        return this.attributeName;
    }

    public DescribeAccountAttributesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAccountAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAccountAttributesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAccountAttributesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAccountAttributesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
