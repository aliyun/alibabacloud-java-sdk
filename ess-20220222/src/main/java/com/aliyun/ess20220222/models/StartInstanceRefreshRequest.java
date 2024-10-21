// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class StartInstanceRefreshRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see &quot;How to ensure idempotence&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The desired configurations of the instance refresh task.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>When you call this operation, you must specify one of the following parameters: ScalingConfigurationId and ImageId.</p>
     * </li>
     * <li><p>Instances whose configurations match the desired configurations of the task are ignored during instance refresh.</p>
     * </li>
     * </ul>
     */
    @NameInMap("DesiredConfiguration")
    public StartInstanceRefreshRequestDesiredConfiguration desiredConfiguration;

    /**
     * <p>The ratio of instances that can exceed the upper limit of the scaling group capacity to all instances in the scaling group during instance refresh. Valid values: 100 to 200. Default value: 120.</p>
     * <blockquote>
     * <p> If you set MinHealthyPercentage and MaxHealthyPercentage to 100, Auto Scaling refreshes the configurations of one instance each time the instance refresh task starts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxHealthyPercentage")
    public Integer maxHealthyPercentage;

    /**
     * <p>The ratio of instances that are in the In Service state to all instances in the scaling group during instance refresh. Valid values: 0 to 100. Default value: 80.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("MinHealthyPercentage")
    public Integer minHealthyPercentage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static StartInstanceRefreshRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRefreshRequest self = new StartInstanceRefreshRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRefreshRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartInstanceRefreshRequest setDesiredConfiguration(StartInstanceRefreshRequestDesiredConfiguration desiredConfiguration) {
        this.desiredConfiguration = desiredConfiguration;
        return this;
    }
    public StartInstanceRefreshRequestDesiredConfiguration getDesiredConfiguration() {
        return this.desiredConfiguration;
    }

    public StartInstanceRefreshRequest setMaxHealthyPercentage(Integer maxHealthyPercentage) {
        this.maxHealthyPercentage = maxHealthyPercentage;
        return this;
    }
    public Integer getMaxHealthyPercentage() {
        return this.maxHealthyPercentage;
    }

    public StartInstanceRefreshRequest setMinHealthyPercentage(Integer minHealthyPercentage) {
        this.minHealthyPercentage = minHealthyPercentage;
        return this;
    }
    public Integer getMinHealthyPercentage() {
        return this.minHealthyPercentage;
    }

    public StartInstanceRefreshRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartInstanceRefreshRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartInstanceRefreshRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartInstanceRefreshRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static class StartInstanceRefreshRequestDesiredConfiguration extends TeaModel {
        /**
         * <p>The image ID.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>After the instance refresh task is complete, the active scaling configuration uses the image specified by this parameter.</p>
         * </li>
         * <li><p>If the instance configuration source of the scaling group is a launch template, you cannot specify this parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m-2ze8cqacj7opnf***</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the scaling configuration.</p>
         * <blockquote>
         * <p> After the instance refresh task is complete, the scaling group uses the scaling configuration specified by this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>asc-2zed7lqn4ts4****</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        public static StartInstanceRefreshRequestDesiredConfiguration build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRefreshRequestDesiredConfiguration self = new StartInstanceRefreshRequestDesiredConfiguration();
            return TeaModel.build(map, self);
        }

        public StartInstanceRefreshRequestDesiredConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public StartInstanceRefreshRequestDesiredConfiguration setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

    }

}
