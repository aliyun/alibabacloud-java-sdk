// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeElasticStrengthRequest extends TeaModel {
    /**
     * <p>The disk categories of the data disks. The disk categories that do not match the specified criteria are returned after you call this operation.</p>
     * <blockquote>
     * <p> If you do not specify the scaling group ID, you must specify this parameter.</p>
     * </blockquote>
     */
    @NameInMap("DataDiskCategories")
    public java.util.List<String> dataDiskCategories;

    /**
     * <p>The name of the image family. You can specify the ImageFamily request parameter to obtain the most recent available images in the current image family for instance creation. If you specify ImageId, you cannot specify ImageFamily.</p>
     * <blockquote>
     * <p> If you do not specify the scaling group ID, you must specify at least one of ImageId, ImageName, and ImageFamily.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CentOS7</p>
     */
    @NameInMap("ImageFamily")
    public String imageFamily;

    /**
     * <p>The ID of the image file that provides the image resource for Auto Scaling to create instances.</p>
     * <blockquote>
     * <p> If you do not specify the scaling group ID, you must specify at least one of ImageId, ImageName, and ImageFamily.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>centos6u5_64_20G_aliaegis****.vhd</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the image. Each image name must be unique in a region. If you specify ImageId, ImageName is ignored.</p>
     * <p>You cannot use ImageName to specify an Alibaba Cloud Marketplace image.</p>
     * <blockquote>
     * <p> If you do not specify the scaling group ID, you must specify at least one of ImageId, ImageName, and ImageFamily.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ubuntu_18_04_x64_20G_alibase_20231225.vhd</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The instance types. The instance types specified by this parameter overwrite the instance types specified in the scaling configuration.</p>
     */
    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <p>The number of IPv6 addresses. If the instance type that you specified does meet the requirement for the number of IPv6 addresses, the scaling strength is weak.</p>
     * <blockquote>
     * <p> If you do not specify the scaling group ID, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Ipv6AddressCount")
    public Integer ipv6AddressCount;

    /**
     * <p>**</p>
     * <p><strong>Warning</strong> This parameter is deprecated. We recommend that you use SpotStrategy.</p>
     * <p>The preemption policy that you want to apply to pay-as-you-go instances. The preemption policy specified by this parameter overwrites the preemption policy specified in the scaling configuration. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instances are created as regular pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The instances are created as preemptible instances with a user-defined maximum hourly price.</li>
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
     * <p>The instance bidding policy. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instances are created as pay-as-you-go instances.</li>
     * <li>SpotWithPriceLimit: The instances are created as preemptible instances with a user-defined maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instances are created as preemptible instances for which the market price at the time of purchase is used as the bid price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The categories of the system disks. The categories of the system disks specified by this parameter overwrite the categories of the system disks specified in the scaling configuration. Valid values:</p>
     * <ul>
     * <li>cloud: basic disk.</li>
     * <li>cloud_efficiency: ultra disk.</li>
     * <li>cloud_ssd: standard SSD.</li>
     * <li>cloud_essd: Enterprise SSD (ESSD).</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify the scaling group ID, you must specify this parameter.</p>
     * </blockquote>
     */
    @NameInMap("SystemDiskCategories")
    public java.util.List<String> systemDiskCategories;

    /**
     * <p>The vSwitch IDs.</p>
     * <blockquote>
     * <p> If you do not specify the scaling group ID, you must specify this parameter.</p>
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
