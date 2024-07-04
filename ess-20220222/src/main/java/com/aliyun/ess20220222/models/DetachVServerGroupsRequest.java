// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachVServerGroupsRequest extends TeaModel {
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
     * <p>Specifies whether to remove the existing instances in the scaling group from the vServer group marked for detachment.</p>
     * <ul>
     * <li>true: If you set this parameter to <code>true</code>, the detachment of the load balancer from the scaling group causes automatic removal of the existing instances in the scaling group from the corresponding vServer group.</li>
     * <li>false: If you set this parameter to <code>false</code>, the detachment of the load balancer from the scaling group does not cause automatic removal of the existing instances in the scaling group from the corresponding vServer group.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceDetach")
    public Boolean forceDetach;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group. Examples: cn-hangzhou and cn-shanghai.</p>
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
     * <p>The collection of information about the vServer groups marked for detachment.</p>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The port number that Auto Scaling employs to incorporate instances into the vServer group. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend vServer group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-bp1jp1rge****</p>
         */
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
        /**
         * <p>The ID of the load balancer to which the vServer group belongs.</p>
         * <blockquote>
         * <p> You can detach vServer groups of up to five load balancers from a scaling group in one call.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1p90y3ya9h8s62d****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The attributes of the backend vServer group.</p>
         */
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
