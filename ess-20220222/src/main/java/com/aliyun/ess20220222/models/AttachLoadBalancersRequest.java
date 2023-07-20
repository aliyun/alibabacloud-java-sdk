// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachLoadBalancersRequest extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ForceAttach")
    public Boolean forceAttach;

    @NameInMap("LoadBalancerConfigs")
    public java.util.List<AttachLoadBalancersRequestLoadBalancerConfigs> loadBalancerConfigs;

    @NameInMap("LoadBalancers")
    public java.util.List<String> loadBalancers;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

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
