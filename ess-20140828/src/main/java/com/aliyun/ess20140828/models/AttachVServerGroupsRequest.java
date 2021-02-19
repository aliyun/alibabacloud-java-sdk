// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class AttachVServerGroupsRequest extends TeaModel {
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

    @NameInMap("VServerGroup")
    public java.util.List<AttachVServerGroupsRequestVServerGroup> VServerGroup;

    public static AttachVServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachVServerGroupsRequest self = new AttachVServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AttachVServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachVServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachVServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachVServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public AttachVServerGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachVServerGroupsRequest setForceAttach(Boolean forceAttach) {
        this.forceAttach = forceAttach;
        return this;
    }
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    public AttachVServerGroupsRequest setVServerGroup(java.util.List<AttachVServerGroupsRequestVServerGroup> VServerGroup) {
        this.VServerGroup = VServerGroup;
        return this;
    }
    public java.util.List<AttachVServerGroupsRequestVServerGroup> getVServerGroup() {
        return this.VServerGroup;
    }

    public static class AttachVServerGroupsRequestVServerGroupVServerGroupAttribute extends TeaModel {
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Port")
        public Integer port;

        public static AttachVServerGroupsRequestVServerGroupVServerGroupAttribute build(java.util.Map<String, ?> map) throws Exception {
            AttachVServerGroupsRequestVServerGroupVServerGroupAttribute self = new AttachVServerGroupsRequestVServerGroupVServerGroupAttribute();
            return TeaModel.build(map, self);
        }

        public AttachVServerGroupsRequestVServerGroupVServerGroupAttribute setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public AttachVServerGroupsRequestVServerGroupVServerGroupAttribute setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public AttachVServerGroupsRequestVServerGroupVServerGroupAttribute setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class AttachVServerGroupsRequestVServerGroup extends TeaModel {
        @NameInMap("VServerGroupAttribute")
        public java.util.List<AttachVServerGroupsRequestVServerGroupVServerGroupAttribute> VServerGroupAttribute;

        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        public static AttachVServerGroupsRequestVServerGroup build(java.util.Map<String, ?> map) throws Exception {
            AttachVServerGroupsRequestVServerGroup self = new AttachVServerGroupsRequestVServerGroup();
            return TeaModel.build(map, self);
        }

        public AttachVServerGroupsRequestVServerGroup setVServerGroupAttribute(java.util.List<AttachVServerGroupsRequestVServerGroupVServerGroupAttribute> VServerGroupAttribute) {
            this.VServerGroupAttribute = VServerGroupAttribute;
            return this;
        }
        public java.util.List<AttachVServerGroupsRequestVServerGroupVServerGroupAttribute> getVServerGroupAttribute() {
            return this.VServerGroupAttribute;
        }

        public AttachVServerGroupsRequestVServerGroup setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

    }

}
