// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachVServerGroupsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to add the existing Elastic Compute Service (ECS) instances or elastic container instances in the scaling group to the new vServer group. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group. Examples: cn-hangzhou and cn-shanghai. For information about regions and zones, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The information about the vServer groups.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The port number over which Auto Scaling adds ECS instances or elastic container instances to the new vServer group. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the vServer group.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1u7etiogg38yvwz****</p>
         */
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        /**
         * <p>The weight of an ECS instance or elastic container instance as a backend server. Valid values: 0 to 100.</p>
         * <p>Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The ID of the CLB instance to which the new vServer group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-bp1jp1rge****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The attributes of the vServer group.</p>
         */
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
