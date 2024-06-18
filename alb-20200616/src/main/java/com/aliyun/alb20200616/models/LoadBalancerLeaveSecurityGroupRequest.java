// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class LoadBalancerLeaveSecurityGroupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-iv9gj3lpak6fbj****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    public static LoadBalancerLeaveSecurityGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerLeaveSecurityGroupRequest self = new LoadBalancerLeaveSecurityGroupRequest();
        return TeaModel.build(map, self);
    }

    public LoadBalancerLeaveSecurityGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public LoadBalancerLeaveSecurityGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public LoadBalancerLeaveSecurityGroupRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public LoadBalancerLeaveSecurityGroupRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

}
