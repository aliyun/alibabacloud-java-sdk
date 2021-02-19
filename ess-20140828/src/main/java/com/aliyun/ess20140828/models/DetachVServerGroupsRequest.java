// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachVServerGroupsRequest extends TeaModel {
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

    @NameInMap("VServerGroup")
    public java.util.List<DetachVServerGroupsRequestVServerGroup> VServerGroup;

    public static DetachVServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachVServerGroupsRequest self = new DetachVServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DetachVServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachVServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachVServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachVServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
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

    public DetachVServerGroupsRequest setVServerGroup(java.util.List<DetachVServerGroupsRequestVServerGroup> VServerGroup) {
        this.VServerGroup = VServerGroup;
        return this;
    }
    public java.util.List<DetachVServerGroupsRequestVServerGroup> getVServerGroup() {
        return this.VServerGroup;
    }

    public static class DetachVServerGroupsRequestVServerGroupVServerGroupAttribute extends TeaModel {
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("Port")
        public Integer port;

        public static DetachVServerGroupsRequestVServerGroupVServerGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            DetachVServerGroupsRequestVServerGroupVServerGroupAttribute self = new DetachVServerGroupsRequestVServerGroupVServerGroupAttribute();
            return TeaModel.build(map, self);
        }

        public DetachVServerGroupsRequestVServerGroupVServerGroupAttribute setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public DetachVServerGroupsRequestVServerGroupVServerGroupAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class DetachVServerGroupsRequestVServerGroup extends TeaModel {
        @NameInMap("VServerGroupAttribute")
        public java.util.List<DetachVServerGroupsRequestVServerGroupVServerGroupAttribute> VServerGroupAttribute;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static DetachVServerGroupsRequestVServerGroup build(java.util.Map<String, ?> map) throws Exception {
            DetachVServerGroupsRequestVServerGroup self = new DetachVServerGroupsRequestVServerGroup();
            return TeaModel.build(map, self);
        }

        public DetachVServerGroupsRequestVServerGroup setVServerGroupAttribute(java.util.List<DetachVServerGroupsRequestVServerGroupVServerGroupAttribute> VServerGroupAttribute) {
            this.VServerGroupAttribute = VServerGroupAttribute;
            return this;
        }
        public java.util.List<DetachVServerGroupsRequestVServerGroupVServerGroupAttribute> getVServerGroupAttribute() {
            return this.VServerGroupAttribute;
        }

        public DetachVServerGroupsRequestVServerGroup setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

}
