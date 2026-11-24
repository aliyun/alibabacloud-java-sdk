// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachServerGroupsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the token value from your client and ensure that it is unique across different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to add the existing ECS instances or ECI instances in the scaling group to the newly added server groups. Valid values:</p>
     * <ul>
     * <li><p>true: adds the instances.</p>
     * </li>
     * <li><p>false: does not add the instances.</p>
     * </li>
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
     * <p>The ID of the region to which the scaling group belongs.</p>
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
     * <p>asg-bp1fo0dbtsbmqa9h****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The information about the load balancing server groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServerGroups")
    public java.util.List<AttachServerGroupsRequestServerGroups> serverGroups;

    public static AttachServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachServerGroupsRequest self = new AttachServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AttachServerGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachServerGroupsRequest setForceAttach(Boolean forceAttach) {
        this.forceAttach = forceAttach;
        return this;
    }
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    public AttachServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public AttachServerGroupsRequest setServerGroups(java.util.List<AttachServerGroupsRequestServerGroups> serverGroups) {
        this.serverGroups = serverGroups;
        return this;
    }
    public java.util.List<AttachServerGroupsRequestServerGroups> getServerGroups() {
        return this.serverGroups;
    }

    public static class AttachServerGroupsRequestServerGroups extends TeaModel {
        /**
         * <p>The port number used by the ECS instance or ECI instance after Auto Scaling adds it to the server group.</p>
         * <p>Valid values: 1 to 65535.</p>
         * <blockquote>
         * <p>This parameter is required for ALB and NLB load balancing. You cannot modify the Settings of this parameter for GWLB load balancing, and the default value is 6081.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the load balancing server group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-5yc3bd9lfyh*****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        /**
         * <p>The type of the load balancing server group. Valid values:</p>
         * <ul>
         * <li>ALB: Application Load Balancer (ALB).</li>
         * <li>NLB: Network Load Balancer (NLB).</li>
         * <li>GWLB: Gateway Load Balancer (GWLB).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the ECS instance or ECI instance as a backend server after Auto Scaling adds it to the server group. Valid values: 0 to 100.</p>
         * <p>A higher weight indicates that Auto Scaling will allocate more access requests to the ECS instance or ECI instance. If the weight is set to 0, the instance does not receive access requests.</p>
         * <blockquote>
         * <p>This parameter is required for ALB and NLB load balancing. You cannot modify the Settings of this parameter for GWLB load balancing.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static AttachServerGroupsRequestServerGroups build(java.util.Map<String, ?> map) throws Exception {
            AttachServerGroupsRequestServerGroups self = new AttachServerGroupsRequestServerGroups();
            return TeaModel.build(map, self);
        }

        public AttachServerGroupsRequestServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AttachServerGroupsRequestServerGroups setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public AttachServerGroupsRequestServerGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AttachServerGroupsRequestServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
