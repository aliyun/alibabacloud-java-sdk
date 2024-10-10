// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class StartInstanceRefreshRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DesiredConfiguration")
    public StartInstanceRefreshRequestDesiredConfiguration desiredConfiguration;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxHealthyPercentage")
    public Integer maxHealthyPercentage;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("MinHealthyPercentage")
    public Integer minHealthyPercentage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
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
         * <strong>example:</strong>
         * <p>m-2ze8cqacj7opnf***</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
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
