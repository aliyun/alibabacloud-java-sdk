// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachLoadBalancersRequest extends TeaModel {
    /**
     * <p>Specifies whether to attach the CLB instance to the scaling group in an asynchronous manner. If you attach the CLB instance from the scaling group in an asynchronous manner, the call is successful only after all operations are successful. If a specific operation fails, the call fails. We recommend that you set this parameter to true. Valid values:</p>
     * <br>
     * <p>*   true: attaches the CLB instance to the scaling group in an asynchronous manner. In this case, the ID of the scaling activity is returned.</p>
     * <p>*   false: does not attach the CLB instance to the scaling group in an asynchronous manner.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [Ensure idempotence](https://help.aliyun.com/document_detail/25965.html).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to add the existing instances in the scaling group as backend servers of the load balancer. Valid values:</p>
     * <br>
     * <p>*   true: If you set this parameter to `true`, the attachment of the load balancer entails the addition of the existing instances in the scaling group to the backend server groups of the load balancer.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note** If a load balancer is currently attached to your scaling group, and you want to add the instances in your scaling group to the backend server groups of the load balancer, you can call this operation again and set the ForceAttach request parameter to true.</p>
     * <br>
     * <p>*   false: If you set this parameter to false, the attachment of the load balancer does not entail the addition of the existing instances in the scaling group to the backend server groups of the load balancer.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    /**
     * <p>The configurations of the classic load balancer (CLB, formerly known as SLB) instance.</p>
     */
    @NameInMap("LoadBalancerConfigs")
    public java.util.List<AttachLoadBalancersRequestLoadBalancerConfigs> loadBalancerConfigs;

    /**
     * <p>The IDs of the load balancers that you want to attach to the scaling group.</p>
     */
    @NameInMap("LoadBalancers")
    public java.util.List<String> loadBalancers;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <br>
     * <p>This parameter is required.</p>
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
         * <p>The ID of the CLB instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The weight of an Elastic Compute Service (ECS) instance or elastic container instance as a backend sever of the CLB instance. If an instance has a higher weight, more access traffic is routed to the instance. If an instance has zero weight, no access traffic is routed to the instance.</p>
         * <br>
         * <p>Valid values: 0 to 100.</p>
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
