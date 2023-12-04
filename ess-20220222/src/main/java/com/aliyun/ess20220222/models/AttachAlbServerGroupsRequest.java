// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachAlbServerGroupsRequest extends TeaModel {
    /**
     * <p>Details of the ALB server group.</p>
     */
    @NameInMap("AlbServerGroups")
    public java.util.List<AttachAlbServerGroupsRequestAlbServerGroups> albServerGroups;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure the idempotence of a request](~~25965~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to add the ECS instances in the scaling group to the ALB server group. Valid values:</p>
     * <br>
     * <p>*   true: adds the ECS instances to the ALB server group and returns the value of the `ScalingActivityId` parameter. You can check whether the ECS instances are added to the ALB server group by using the ID of the scaling activity.</p>
     * <p>*   false: does not add the ECS instances to the ALB server group.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group, such as cn-hangzhou and cn-shanghai. For more information, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static AttachAlbServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachAlbServerGroupsRequest self = new AttachAlbServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AttachAlbServerGroupsRequest setAlbServerGroups(java.util.List<AttachAlbServerGroupsRequestAlbServerGroups> albServerGroups) {
        this.albServerGroups = albServerGroups;
        return this;
    }
    public java.util.List<AttachAlbServerGroupsRequestAlbServerGroups> getAlbServerGroups() {
        return this.albServerGroups;
    }

    public AttachAlbServerGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachAlbServerGroupsRequest setForceAttach(Boolean forceAttach) {
        this.forceAttach = forceAttach;
        return this;
    }
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    public AttachAlbServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachAlbServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachAlbServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachAlbServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static class AttachAlbServerGroupsRequestAlbServerGroups extends TeaModel {
        /**
         * <p>The ID of the ALB server group.</p>
         * <br>
         * <p>You can associate only a limited number of ALB server groups with a scaling group. To view the quota or manually request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by the ECS instance after the ECS instance is added to the ALB server group. Valid values: 1 to 65535.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of the ECS instance as a backend server after the instance is added to the ALB server group.</p>
         * <br>
         * <p>If you increase the weight of an ECS instance in an ALB server group, the number of access requests that are forwarded to the ECS instance increases. If you set the Weight parameter for an ECS instance to 0, no access requests are forwarded to the ECS instance. Valid values: 0 to 100.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static AttachAlbServerGroupsRequestAlbServerGroups build(java.util.Map<String, ?> map) throws Exception {
            AttachAlbServerGroupsRequestAlbServerGroups self = new AttachAlbServerGroupsRequestAlbServerGroups();
            return TeaModel.build(map, self);
        }

        public AttachAlbServerGroupsRequestAlbServerGroups setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public AttachAlbServerGroupsRequestAlbServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AttachAlbServerGroupsRequestAlbServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
