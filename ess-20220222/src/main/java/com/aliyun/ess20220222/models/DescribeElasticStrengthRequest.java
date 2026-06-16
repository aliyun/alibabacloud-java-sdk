// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeElasticStrengthRequest extends TeaModel {
    /**
     * <p>A list of data disk categories used to evaluate elastic strength. If a category is incompatible, the response identifies the specific mismatched category.</p>
     * <blockquote>
     * <p>You can specify this parameter if <code>ScalingGroupId</code> is not specified.</p>
     * </blockquote>
     */
    @NameInMap("DataDiskCategories")
    public java.util.List<String> dataDiskCategories;

    /**
     * <p>The name of the image family. You can set this parameter to use the latest available image from the specified image family to create instances. If you specify ImageId, this parameter is ignored.</p>
     * <blockquote>
     * <p>If <code>ScalingGroupId</code> is not specified, you must specify at least one of <code>ImageId</code>, <code>ImageName</code>, or <code>ImageFamily</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CentOS7</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image used to create instances.</p>
     * <blockquote>
     * <p>If <code>ScalingGroupId</code> is not specified, you must specify at least one of <code>ImageId</code>, <code>ImageName</code>, or <code>ImageFamily</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. The name must be unique within a region. If you specify <code>ImageId</code>, this parameter is ignored.</p>
     * <p>You cannot use this parameter to specify a Marketplace image.</p>
     * <blockquote>
     * <p>If <code>ScalingGroupId</code> is not specified, you must specify at least one of <code>ImageId</code>, <code>ImageName</code>, or <code>ImageFamily</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ubuntu_18_04_x64_20G_alibase_20231225.vhd</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>A list of ECS instance types. If specified, this parameter overrides the instance types in the scaling configuration.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The number of IPv6 addresses to be configured for each instance. The elastic strength is lowered for instance types that do not support the specified number of IPv6 addresses.</p>
     * <blockquote>
     * <p>You can specify this parameter if <code>ScalingGroupId</code> is not specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <blockquote>
     * <p>Warning: This parameter is deprecated. Use <code>SpotStrategy</code> instead.
     * The spot strategy for pay-as-you-go instances. If specified, this parameter overrides the spot strategy in the scaling configuration. Valid values:</p>
     * </blockquote>
     * <ul>
     * <li><p><code>NoSpot</code>: A regular pay-as-you-go instance.</p>
     * </li>
     * <li><p><code>SpotWithPriceLimit</code>: A spot instance with a specified maximum price.</p>
     * </li>
     * <li><p><code>SpotAsPriceGo</code>: A spot instance where the system automatically bids at the current market price.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>NoSpot</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("PriorityStrategy")
    public String priorityStrategy;

    /**
     * <p>The ID of the region where the scaling group is located.</p>
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
     * <p>The IDs of one or more scaling groups to query in a batch operation.</p>
     */
    @NameInMap("ScalingGroupIds")
    public java.util.List<String> scalingGroupIds;

    /**
     * <p>The spot strategy for instances. Valid values:</p>
     * <ul>
     * <li><p><code>NoSpot</code>: A regular pay-as-you-go instance.</p>
     * </li>
     * <li><p><code>SpotWithPriceLimit</code>: A spot instance with a specified maximum price.</p>
     * </li>
     * <li><p><code>SpotAsPriceGo</code>: A spot instance where the system automatically bids at the current market price.</p>
     * </li>
     * </ul>
     * <p>Default value: <code>NoSpot</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>A list of system disk categories. If specified, this parameter overrides the system disk categories in the scaling configuration. Valid values:</p>
     * <ul>
     * <li><p><code>cloud</code>: Basic Cloud Disk.</p>
     * </li>
     * <li><p><code>cloud_efficiency</code>: Ultra Cloud Disk.</p>
     * </li>
     * <li><p><code>cloud_ssd</code>: Standard SSD.</p>
     * </li>
     * <li><p><code>cloud_essd</code>: ESSD.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if <code>ScalingGroupId</code> is not specified.</p>
     * </blockquote>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>A list of VSwitch IDs.</p>
     * <blockquote>
     * <p>This parameter is required if <code>ScalingGroupId</code> is not specified.</p>
     * </blockquote>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static DescribeElasticStrengthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticStrengthRequest self = new DescribeElasticStrengthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticStrengthRequest setDataDiskCategories(java.util.List<String> dataDiskCategories) {
        this.dataDiskCategories = dataDiskCategories;
        return this;
    }
    public java.util.List<String> getDataDiskCategories() {
        return this.dataDiskCategories;
    }

    public DescribeElasticStrengthRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

    public DescribeElasticStrengthRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeElasticStrengthRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public DescribeElasticStrengthRequest setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeElasticStrengthRequest setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }
    public Integer getIpv6AddressCount() {
        return this.ipv6AddressCount;
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

    public DescribeElasticStrengthRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeElasticStrengthRequest setSystemDiskCategories(java.util.List<String> systemDiskCategories) {
        this.systemDiskCategories = systemDiskCategories;
        return this;
    }
    public java.util.List<String> getSystemDiskCategories() {
        return this.systemDiskCategories;
    }

    public DescribeElasticStrengthRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

}
