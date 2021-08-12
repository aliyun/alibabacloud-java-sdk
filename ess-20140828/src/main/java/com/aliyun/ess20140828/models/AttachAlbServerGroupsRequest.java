// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class AttachAlbServerGroupsRequest extends TeaModel {
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

    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    @NameInMap("AlbServerGroup")
    public java.util.List<AttachAlbServerGroupsRequestAlbServerGroup> albServerGroup;

    public static AttachAlbServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachAlbServerGroupsRequest self = new AttachAlbServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AttachAlbServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachAlbServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachAlbServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachAlbServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
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

    public AttachAlbServerGroupsRequest setAlbServerGroup(java.util.List<AttachAlbServerGroupsRequestAlbServerGroup> albServerGroup) {
        this.albServerGroup = albServerGroup;
        return this;
    }
    public java.util.List<AttachAlbServerGroupsRequestAlbServerGroup> getAlbServerGroup() {
        return this.albServerGroup;
    }

    public static class AttachAlbServerGroupsRequestAlbServerGroup extends TeaModel {
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Port")
        public Integer port;

        public static AttachAlbServerGroupsRequestAlbServerGroup build(java.util.Map<String, ?> map) throws Exception {
            AttachAlbServerGroupsRequestAlbServerGroup self = new AttachAlbServerGroupsRequestAlbServerGroup();
            return TeaModel.build(map, self);
        }

        public AttachAlbServerGroupsRequestAlbServerGroup setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public AttachAlbServerGroupsRequestAlbServerGroup setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public AttachAlbServerGroupsRequestAlbServerGroup setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

}
