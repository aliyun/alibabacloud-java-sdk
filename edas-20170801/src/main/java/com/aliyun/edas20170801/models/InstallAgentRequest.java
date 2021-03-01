// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InstallAgentRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("DoAsync")
    public Boolean doAsync;

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

    public InstallAgentRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public InstallAgentRequest setDoAsync(Boolean doAsync) {
        this.doAsync = doAsync;
        return this;
    }
    public Boolean getDoAsync() {
        return this.doAsync;
    }

}
