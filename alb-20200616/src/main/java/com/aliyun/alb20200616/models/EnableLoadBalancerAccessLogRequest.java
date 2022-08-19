// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class EnableLoadBalancerAccessLogRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("LogProject")
    public String logProject;

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
