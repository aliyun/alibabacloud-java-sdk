// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachAlbServerGroupsRequest extends TeaModel {
    /**
     * <p>The information about the ALB server groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlbServerGroups")
    public java.util.List<AttachAlbServerGroupsRequestAlbServerGroups> albServerGroups;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](https://help.aliyun.com/document_detail/25965.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to add the existing Elastic Compute Service (ECS) instances or elastic container instances in the scaling group to the ALB server group. Valid values:</p>
     * <br>
     * <p>*   true: adds the existing ECS instances or elastic container instances in the scaling group to the ALB server group. In this case, the system returns the value of `ScalingActivityId`.</p>
     * <p>*   false: does not add the existing ECS instances or elastic container instances in the scaling group to the ALB server group.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * <br>
     * <p>Examples: `cn-hangzhou` and `cn-shanghai`. For more information about regions and zones, see [Regions and zones](https://help.aliyun.com/document_detail/40654.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
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
         * <p>You can attach only a limited number of ALB server groups to a scaling group. To view the predefined quota limit or manually request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port used by ECS instances or elastic container instances after being added as backend servers to the ALB server group.</p>
         * <br>
         * <p>Valid values: 1 to 65535.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of an ECS instance or elastic container instance after being added as a backend server to the ALB server group. Valid values: 0 to 100.</p>
         * <br>
         * <p>If you assign a higher weight to an instance, the instance is allocated a larger proportion of access requests. If you assign zero weight to an instance, the instance is allocated no access requests.</p>
         * <br>
         * <p>This parameter is required.</p>
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
