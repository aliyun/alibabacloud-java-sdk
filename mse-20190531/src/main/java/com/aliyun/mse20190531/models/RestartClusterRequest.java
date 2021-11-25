// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RestartClusterRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PodNameList")
    public String podNameList;

    @NameInMap("RequestPars")
    public String requestPars;

    public static RestartClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartClusterRequest self = new RestartClusterRequest();
        return TeaModel.build(map, self);
    }

    public RestartClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RestartClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RestartClusterRequest setPodNameList(String podNameList) {
        this.podNameList = podNameList;
        return this;
    }
    public String getPodNameList() {
        return this.podNameList;
    }

    public RestartClusterRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
