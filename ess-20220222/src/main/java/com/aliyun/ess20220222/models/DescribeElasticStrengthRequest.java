// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeElasticStrengthRequest extends TeaModel {
    /**
     * <p>The instance types. The instance types specified by this parameter overwrite the instance types specified in the scaling configuration.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The preemption policy that you want to apply to pay-as-you-go instances. The preemption policy specified by this parameter overwrites the preemption policy specified in the scaling configuration. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instances are created as regular pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The instances are created as preemptible instances that have a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instances are created as preemptible instances for which the market price at the time of purchase is automatically used as the bidding price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    /**
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The IDs of the scaling groups that you want to query.</p>
     */
    @NameInMap("ScalingGroupIds")
    public java.util.List<String> scalingGroupIds;

    /**
     * <p>The categories of the system disks. The categories of the system disks specified by this parameter overwrite the categories of the system disks specified in the scaling configuration. Valid values:</p>
     * <ul>
     * <li>cloud: basic disk.</li>
     * <li>cloud_efficiency: ultra disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>cloud_essd: Enterprise SSD (ESSD).</li>
     * </ul>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    public static DescribeElasticStrengthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticStrengthRequest self = new DescribeElasticStrengthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticStrengthRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeElasticStrengthRequest setPriorityStrategy(String priorityStrategy) {
        this.priorityStrategy = priorityStrategy;
        return this;
    }
    public String getPriorityStrategy() {
        return this.priorityStrategy;
    }

    public DescribeElasticStrengthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeElasticStrengthRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeElasticStrengthRequest setScalingGroupIds(java.util.List<String> scalingGroupIds) {
        this.scalingGroupIds = scalingGroupIds;
        return this;
    }
    public java.util.List<String> getScalingGroupIds() {
        return this.scalingGroupIds;
    }

    public DescribeElasticStrengthRequest setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
        this.systemDiskCategories = systemDiskCategories;
        return this;
    }
    public java.util.List<String> getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

}
