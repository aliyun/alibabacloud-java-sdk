// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachServerGroupsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](~~25965~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to remove the Elastic Compute Service (ECS) instances in the scaling group from the detached server group.</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceDetach")
    public Boolean forceDetach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
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

    /**
     * <p>Details of the server groups.</p>
     */
    @NameInMap("ServerGroups")
    public java.util.List<DetachServerGroupsRequestServerGroups> serverGroups;

    public static DetachServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachServerGroupsRequest self = new DetachServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DetachServerGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachServerGroupsRequest setForceDetach(Boolean forceDetach) {
        this.forceDetach = forceDetach;
        return this;
    }
    public Boolean getForceDetach() {
        return this.forceDetach;
    }

    public DetachServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DetachServerGroupsRequest setServerGroups(java.util.List<DetachServerGroupsRequestServerGroups> serverGroups) {
        this.serverGroups = serverGroups;
        return this;
    }
    public java.util.List<DetachServerGroupsRequestServerGroups> getServerGroups() {
        return this.serverGroups;
    }

    public static class DetachServerGroupsRequestServerGroups extends TeaModel {
        /**
         * <p>The port number that is used by an ECS instance after Auto Scaling adds the ECS instance to the server group.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the server group.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The type of the server group. Valid values:</p>
         * <br>
         * <p>*   ALB</p>
         * <p>*   NLB</p>
         */
        @NameInMap("Type")
        public String type;

        public static DetachServerGroupsRequestServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DetachServerGroupsRequestServerGroups self = new DetachServerGroupsRequestServerGroups();
            return TeaModel.build(map, self);
        }

        public DetachServerGroupsRequestServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DetachServerGroupsRequestServerGroups setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public DetachServerGroupsRequestServerGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
