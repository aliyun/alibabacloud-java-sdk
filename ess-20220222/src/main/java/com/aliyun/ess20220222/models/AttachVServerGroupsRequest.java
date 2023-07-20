// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachVServerGroupsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("VServerGroups")
    public java.util.List<AttachVServerGroupsRequestVServerGroups> VServerGroups;

    public static AttachVServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachVServerGroupsRequest self = new AttachVServerGroupsRequest();
        return TeaModel.build(map, self);
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

    public AttachVServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachVServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachVServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachVServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public AttachVServerGroupsRequest setVServerGroups(java.util.List<AttachVServerGroupsRequestVServerGroups> VServerGroups) {
        this.VServerGroups = VServerGroups;
        return this;
    }
    public java.util.List<AttachVServerGroupsRequestVServerGroups> getVServerGroups() {
        return this.VServerGroups;
    }

    public static class AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("Weight")
        public Integer weight;

        public static AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes build(java.util.Map<String, ?> map) throws Exception {
            AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes self = new AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes();
            return TeaModel.build(map, self);
        }

        public AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class AttachVServerGroupsRequestVServerGroups extends TeaModel {
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("VServerGroupAttributes")
        public java.util.List<AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes> VServerGroupAttributes;

        public static AttachVServerGroupsRequestVServerGroups build(java.util.Map<String, ?> map) throws Exception {
            AttachVServerGroupsRequestVServerGroups self = new AttachVServerGroupsRequestVServerGroups();
            return TeaModel.build(map, self);
        }

        public AttachVServerGroupsRequestVServerGroups setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public AttachVServerGroupsRequestVServerGroups setVServerGroupAttributes(java.util.List<AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes> VServerGroupAttributes) {
            this.VServerGroupAttributes = VServerGroupAttributes;
            return this;
        }
        public java.util.List<AttachVServerGroupsRequestVServerGroupsVServerGroupAttributes> getVServerGroupAttributes() {
            return this.VServerGroupAttributes;
        }

    }

}
