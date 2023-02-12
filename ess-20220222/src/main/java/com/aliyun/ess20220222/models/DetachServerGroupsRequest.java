// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachServerGroupsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ForceDetach")
    public Boolean forceDetach;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

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
        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

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
