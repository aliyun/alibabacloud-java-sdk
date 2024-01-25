// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class GetClusterDetailRequest extends TeaModel {
    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetClusterDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDetailRequest self = new GetClusterDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterDetailRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public GetClusterDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
