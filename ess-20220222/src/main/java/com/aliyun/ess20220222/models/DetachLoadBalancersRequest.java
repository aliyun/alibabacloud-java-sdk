// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachLoadBalancersRequest extends TeaModel {
    /**
     * <p>Specifies whether to detach the CLB instance from the scaling group in an asynchronous manner. If you detach the CLB instance from the scaling group in an asynchronous manner, the call is successful only after all operations are successful. If a specific operation fails, the call fails. We recommend that you set this parameter to true.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: detaches the CLB instance from the scaling group in an asynchronous manner. In this case, the ID of the scaling activity is returned.</li>
     * <li>false: does not detach the CLB instance from the scaling group in an asynchronous manner.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to remove Elastic Compute Service (ECS) instances in the scaling group from the backend server groups of the load balancer. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceDetach")
    public Boolean forceDetach;

    /**
     * <p>The IDs of the CLB instances. You can specify up to five instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancers")
    public java.util.List<String> loadBalancers;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
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
     * <p>asg-bp1ffogfdauy0jw0****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DetachLoadBalancersRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachLoadBalancersRequest self = new DetachLoadBalancersRequest();
        return TeaModel.build(map, self);
    }

    public DetachLoadBalancersRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public DetachLoadBalancersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachLoadBalancersRequest setForceDetach(Boolean forceDetach) {
        this.forceDetach = forceDetach;
        return this;
    }
    public Boolean getForceDetach() {
        return this.forceDetach;
    }

    public DetachLoadBalancersRequest setLoadBalancers(java.util.List<String> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public java.util.List<String> getLoadBalancers() {
        return this.loadBalancers;
    }

    public DetachLoadBalancersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DetachLoadBalancersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

}
