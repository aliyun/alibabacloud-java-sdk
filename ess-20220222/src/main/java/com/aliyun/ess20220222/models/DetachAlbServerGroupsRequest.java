// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachAlbServerGroupsRequest extends TeaModel {
    /**
     * <p>Details of the ALB server groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlbServerGroups")
    public java.util.List<DetachAlbServerGroupsRequestAlbServerGroups> albServerGroups;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure the idempotence of a request](https://help.aliyun.com/document_detail/25965.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to remove existing Elastic Compute Service (ECS) instances from the ALB server group that you want to disassociate from the scaling group. Valid values:</p>
     * <br>
     * <p>*   true: removes existing ECS instances and returns the value of the `ScalingActivityId` parameter. You can use the scaling activity ID to check whether the ECS instances are removed.</p>
     * <p>*   false: does not remove existing ECS instances.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceDetach")
    public Boolean forceDetach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group. Examples: cn-hangzhou and cn-shanghai.</p>
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

    public static DetachAlbServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachAlbServerGroupsRequest self = new DetachAlbServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DetachAlbServerGroupsRequest setAlbServerGroups(java.util.List<DetachAlbServerGroupsRequestAlbServerGroups> albServerGroups) {
        this.albServerGroups = albServerGroups;
        return this;
    }
    public java.util.List<DetachAlbServerGroupsRequestAlbServerGroups> getAlbServerGroups() {
        return this.albServerGroups;
    }

    public DetachAlbServerGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachAlbServerGroupsRequest setForceDetach(Boolean forceDetach) {
        this.forceDetach = forceDetach;
        return this;
    }
    public Boolean getForceDetach() {
        return this.forceDetach;
    }

    public DetachAlbServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachAlbServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachAlbServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachAlbServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static class DetachAlbServerGroupsRequestAlbServerGroups extends TeaModel {
        /**
         * <p>The ID of the ALB server group.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by the ECS instances in the ALB server group.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Port")
        public Integer port;

        public static DetachAlbServerGroupsRequestAlbServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DetachAlbServerGroupsRequestAlbServerGroups self = new DetachAlbServerGroupsRequestAlbServerGroups();
            return TeaModel.build(map, self);
        }

        public DetachAlbServerGroupsRequestAlbServerGroups setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public DetachAlbServerGroupsRequestAlbServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
