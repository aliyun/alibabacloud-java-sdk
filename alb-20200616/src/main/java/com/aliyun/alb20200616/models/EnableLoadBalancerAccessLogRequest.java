// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableLoadBalancerAccessLogRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ALB instance ID.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The project to which the access log is shipped.</p>
     */
    @NameInMap("LogProject")
    public String logProject;

    /**
     * <p>The Logstore to which the access log is shipped.</p>
     */
    @NameInMap("LogStore")
    public String logStore;

    public static EnableLoadBalancerAccessLogRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableLoadBalancerAccessLogRequest self = new EnableLoadBalancerAccessLogRequest();
        return TeaModel.build(map, self);
    }

    public EnableLoadBalancerAccessLogRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableLoadBalancerAccessLogRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public EnableLoadBalancerAccessLogRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public EnableLoadBalancerAccessLogRequest setLogProject(String logProject) {
        this.logProject = logProject;
        return this;
    }
    public String getLogProject() {
        return this.logProject;
    }

    public EnableLoadBalancerAccessLogRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

}
