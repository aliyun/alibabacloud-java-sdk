// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InstallAgentRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("DoAsync")
    public Boolean doAsync;

    /**
     * <p>The ID of the ECS instance. Separate multiple IDs with commas (,). Example: instanceId1,instanceId2.</p>
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
