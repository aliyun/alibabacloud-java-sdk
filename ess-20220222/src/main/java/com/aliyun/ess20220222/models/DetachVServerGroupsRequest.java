// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachVServerGroupsRequest extends TeaModel {
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

    @NameInMap("VServerGroups")
    public java.util.List<DetachVServerGroupsRequestVServerGroups> VServerGroups;

    public static DetachVServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachVServerGroupsRequest self = new DetachVServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DetachVServerGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachVServerGroupsRequest setForceDetach(Boolean forceDetach) {
        this.forceDetach = forceDetach;
        return this;
    }
    public Boolean getForceDetach() {
        return this.forceDetach;
    }

    public DetachVServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachVServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachVServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachVServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DetachVServerGroupsRequest setVServerGroups(java.util.List<DetachVServerGroupsRequestVServerGroups> VServerGroups) {
        this.VServerGroups = VServerGroups;
        return this;
    }
    public java.util.List<DetachVServerGroupsRequestVServerGroups> getVServerGroups() {
        return this.VServerGroups;
    }

    public static class DetachVServerGroupsRequestVServerGroupsVServerGroupAttributes extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        public static DetachVServerGroupsRequestVServerGroupsVServerGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            DetachVServerGroupsRequestVServerGroupsVServerGroupAttributes self = new DetachVServerGroupsRequestVServerGroupsVServerGroupAttributes();
            return TeaModel.build(map, self);
        }

        public DetachVServerGroupsRequestVServerGroupsVServerGroupAttributes setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DetachVServerGroupsRequestVServerGroupsVServerGroupAttributes setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

    }

    public static class DetachVServerGroupsRequestVServerGroups extends TeaModel {
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("VServerGroupAttributes")
        public java.util.List<DetachVServerGroupsRequestVServerGroupsVServerGroupAttributes> VServerGroupAttributes;

        public static DetachVServerGroupsRequestVServerGroups build(java.util.Map<String, ?> map) throws Exception {
            DetachVServerGroupsRequestVServerGroups self = new DetachVServerGroupsRequestVServerGroups();
            return TeaModel.build(map, self);
        }

        public DetachVServerGroupsRequestVServerGroups setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DetachVServerGroupsRequestVServerGroups setVServerGroupAttributes(java.util.List<DetachVServerGroupsRequestVServerGroupsVServerGroupAttributes> VServerGroupAttributes) {
            this.VServerGroupAttributes = VServerGroupAttributes;
            return this;
        }
        public java.util.List<DetachVServerGroupsRequestVServerGroupsVServerGroupAttributes> getVServerGroupAttributes() {
            return this.VServerGroupAttributes;
        }

    }

}
