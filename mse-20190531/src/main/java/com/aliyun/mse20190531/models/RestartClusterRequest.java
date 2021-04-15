// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RestartClusterRequest extends TeaModel {
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static RestartClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartClusterRequest self = new RestartClusterRequest();
        return TeaModel.build(map, self);
    }

    public RestartClusterRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public RestartClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RestartClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
