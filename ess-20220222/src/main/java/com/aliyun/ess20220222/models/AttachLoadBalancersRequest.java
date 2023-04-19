// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachLoadBalancersRequest extends TeaModel {
    /**
     * <p>The IDs of the CLB instances.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>Specifies whether to attach the CLB instance to the scaling group in an asynchronous manner. If you attach the CLB instance from the scaling group in an asynchronous manner, the call is successful only after all operations are successful. If a specific operation fails, the call fails. We recommend that you set this parameter to true. Valid values:</p>
     * <br>
     * <p>*   true: attaches the CLB instance to the scaling group in an asynchronous manner. In this case, the ID of the scaling activity is returned.</p>
     * <p>*   false: does not attach the CLB instance to the scaling group in an asynchronous manner.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25965~~).</p>
     */
    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    @NameInMap("LoadBalancerConfigs")
    public java.util.List<AttachLoadBalancersRequestLoadBalancerConfigs> loadBalancerConfigs;

    /**
     * <p>The IDs of the CLB instances.</p>
     */
    @NameInMap("LoadBalancers")
    public java.util.List<String> loadBalancers;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>Specifies whether to add all instances in the scaling group to the vServer groups of the CLB instance. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>Default value: false.</p>
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
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

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
