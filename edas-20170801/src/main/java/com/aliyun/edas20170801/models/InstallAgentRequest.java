// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InstallAgentRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b3e3f77b-462e-<strong><strong>-</strong></strong>-bec8727a4dc8</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DoAsync")
    public Boolean doAsync;

    /**
     * <p>The ID of the ECS instance. Separate multiple IDs with commas (,). Example: instanceId1,instanceId2.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2ze7s2v0b789k60pk1af</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    public static InstallAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallAgentRequest self = new InstallAgentRequest();
        return TeaModel.build(map, self);
    }

    public InstallAgentRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InstallAgentRequest setDoAsync(Boolean doAsync) {
        this.doAsync = doAsync;
        return this;
    }
    public Boolean getDoAsync() {
        return this.doAsync;
    }

    public InstallAgentRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

}
