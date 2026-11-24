// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachAlbServerGroupsRequest extends TeaModel {
    /**
     * <p>The details of the ALB server groups.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlbServerGroups")
    public java.util.List<AttachAlbServerGroupsRequestAlbServerGroups> albServerGroups;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to add the existing Elastic Compute Service (ECS) instances or elastic container instances in the scaling group to the newly added ALB server groups. Valid values:</p>
     * <ul>
     * <li><p>true: adds ECS instances and returns <code>ScalingActivityId</code>. You can check whether the existing instances are added by viewing the ID of the scaling activity.</p>
     * </li>
     * <li><p>false: does not add ECS instances.</p>
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
     * <p>Examples: <code>cn-hangzhou</code> and <code>cn-shanghai</code>. For more information, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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

    public static AttachAlbServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachAlbServerGroupsRequest self = new AttachAlbServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public AttachAlbServerGroupsRequest setAlbServerGroups(java.util.List<AttachAlbServerGroupsRequestAlbServerGroups> albServerGroups) {
        this.albServerGroups = albServerGroups;
        return this;
    }
    public java.util.List<AttachAlbServerGroupsRequestAlbServerGroups> getAlbServerGroups() {
        return this.albServerGroups;
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

    public AttachAlbServerGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachAlbServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachAlbServerGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachAlbServerGroupsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static class AttachAlbServerGroupsRequestAlbServerGroups extends TeaModel {
        /**
         * <p>The ID of the ALB server group.</p>
         * <p>A scaling group can be associated with a limited number of ALB server groups. To view the quota or manually apply for a quota increase, go to the <a href="https://quotas.console.aliyun.com/products/ess/quotas">Quota Center</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-ddwb0y0g6y9bjm****</p>
         */
        @NameInMap("AlbServerGroupId")
        public String albServerGroupId;

        /**
         * <p>The port number used by the ECS instance or elastic container instance after Auto Scaling adds the instance to the ALB server group.</p>
         * <p>Valid values: 1 to 65535.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The weight of the ECS instance or elastic container instance as a backend server after Auto Scaling adds the instance to the ALB server group. Valid values: 0 to 100.</p>
         * <p>A higher weight specifies that more access requests are distributed to the ECS instance or elastic container instance. If the weight is 0, the ECS instance or elastic container instance does not receive access requests.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static AttachAlbServerGroupsRequestAlbServerGroups build(java.util.Map<String, ?> map) throws Exception {
            AttachAlbServerGroupsRequestAlbServerGroups self = new AttachAlbServerGroupsRequestAlbServerGroups();
            return TeaModel.build(map, self);
        }

        public AttachAlbServerGroupsRequestAlbServerGroups setAlbServerGroupId(String albServerGroupId) {
            this.albServerGroupId = albServerGroupId;
            return this;
        }
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        public AttachAlbServerGroupsRequestAlbServerGroups setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AttachAlbServerGroupsRequestAlbServerGroups setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
