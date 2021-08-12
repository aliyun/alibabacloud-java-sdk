// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachAlbServerGroupsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ForceDetach")
    public Boolean forceDetach;

    @NameInMap("AlbServerGroup")
    public java.util.List<DetachAlbServerGroupsRequestAlbServerGroup> albServerGroup;

    public static DetachAlbServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachAlbServerGroupsRequest self = new DetachAlbServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DetachAlbServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachAlbServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachAlbServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachAlbServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
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

    public DetachAlbServerGroupsRequest setAlbServerGroup(java.util.List<DetachAlbServerGroupsRequestAlbServerGroup> albServerGroup) {
        this.albServerGroup = albServerGroup;
        return this;
    }
    public java.util.List<DetachAlbServerGroupsRequestAlbServerGroup> getAlbServerGroup() {
        return this.albServerGroup;
    }

    public static class DetachAlbServerGroupsRequestAlbServerGroup extends TeaModel {
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        @NameInMap("Port")
        public Integer port;

        public static DetachAlbServerGroupsRequestAlbServerGroup build(java.util.Map<String, ?> map) throws Exception {
            DetachAlbServerGroupsRequestAlbServerGroup self = new DetachAlbServerGroupsRequestAlbServerGroup();
            return TeaModel.build(map, self);
        }

        public DetachAlbServerGroupsRequestAlbServerGroup setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public DetachAlbServerGroupsRequestAlbServerGroup setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
