// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachLoadBalancersRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("ForceDetach")
    public Boolean forceDetach;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("LoadBalancer")
    public java.util.List<String> loadBalancer;

    public static DetachLoadBalancersRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachLoadBalancersRequest self = new DetachLoadBalancersRequest();
        return TeaModel.build(map, self);
    }

    public DetachLoadBalancersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachLoadBalancersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DetachLoadBalancersRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DetachLoadBalancersRequest setForceDetach(Boolean forceDetach) {
        this.forceDetach = forceDetach;
        return this;
    }
    public Boolean getForceDetach() {
        return this.forceDetach;
    }

    public DetachLoadBalancersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachLoadBalancersRequest setLoadBalancer(java.util.List<String> loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }
    public java.util.List<String> getLoadBalancer() {
        return this.loadBalancer;
    }

}
