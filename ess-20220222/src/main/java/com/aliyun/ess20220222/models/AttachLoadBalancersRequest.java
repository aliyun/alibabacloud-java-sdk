// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachLoadBalancersRequest extends TeaModel {
    /**
     * <p>Specifies whether to use asynchronous calls when adding load balancing instances. Asynchronous calls ensure the transactionality of operations, meaning that either all operations succeed or none of the operations take effect if any operation fails. Use asynchronous calls. Valid values:</p>
     * <ul>
     * <li>true: asynchronous call. The request returns the ID of the scaling activity.</li>
     * <li>false: synchronous call.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>Ensures the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to ensure that the value is unique across different requests. The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to add all existing instances in the scaling group as backend servers of the load balancing instances. Valid values:</p>
     * <ul>
     * <li><p>true: adds all existing instances. If this parameter is set to <code>true</code>, when the load balancing instances are added to the scaling group, the system adds all existing instances in the scaling group as backend servers of the load balancing instances.</p>
     * <blockquote>
     * <p>If a load balancing instance is already added to the scaling group and you want to add all instances in the scaling group as backend servers of the load balancing instance, you can add the load balancing instance to the scaling group again and set ForceAttach to true.</p>
     * </blockquote>
     * </li>
     * <li><p>false: does not add existing instances. If this parameter is set to false, when the load balancing instances are added to the scaling group, the system does not add the existing instances in the scaling group as backend servers of the load balancing instances.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    /**
     * <p>The configurations of the load balancing CLB (formerly SLB) instances.</p>
     */
    @NameInMap("LoadBalancerConfigs")
    public java.util.List<AttachLoadBalancersRequestLoadBalancerConfigs> loadBalancerConfigs;

    /**
     * <p>The IDs of the load balancing CLB (formerly SLB) instances to add.</p>
     */
    @NameInMap("LoadBalancers")
    public java.util.List<String> loadBalancers;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1avr6ensitts3w****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static AttachLoadBalancersRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachLoadBalancersRequest self = new AttachLoadBalancersRequest();
        return TeaModel.build(map, self);
    }

    public AttachLoadBalancersRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public AttachLoadBalancersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachLoadBalancersRequest setForceAttach(Boolean forceAttach) {
        this.forceAttach = forceAttach;
        return this;
    }
    public Boolean getForceAttach() {
        return this.forceAttach;
    }

    public AttachLoadBalancersRequest setLoadBalancerConfigs(java.util.List<AttachLoadBalancersRequestLoadBalancerConfigs> loadBalancerConfigs) {
        this.loadBalancerConfigs = loadBalancerConfigs;
        return this;
    }
    public java.util.List<AttachLoadBalancersRequestLoadBalancerConfigs> getLoadBalancerConfigs() {
        return this.loadBalancerConfigs;
    }

    public AttachLoadBalancersRequest setLoadBalancers(java.util.List<String> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public java.util.List<String> getLoadBalancers() {
        return this.loadBalancers;
    }

    public AttachLoadBalancersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AttachLoadBalancersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AttachLoadBalancersRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static class AttachLoadBalancersRequestLoadBalancerConfigs extends TeaModel {
        /**
         * <p>The ID of the load balancing CLB (formerly SLB) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>147b46d767c-cn-qingdao-cm5****</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The weight of the ECS instance or ECI instance as a backend server after Auto Scaling adds the instance to the SLB server group. A higher weight indicates that the ECS instance or ECI instance is allocated more access requests. If the weight is 0, the ECS instance or ECI instance does not receive access requests.</p>
         * <p>Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static AttachLoadBalancersRequestLoadBalancerConfigs build(java.util.Map<String, ?> map) throws Exception {
            AttachLoadBalancersRequestLoadBalancerConfigs self = new AttachLoadBalancersRequestLoadBalancerConfigs();
            return TeaModel.build(map, self);
        }

        public AttachLoadBalancersRequestLoadBalancerConfigs setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public AttachLoadBalancersRequestLoadBalancerConfigs setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
