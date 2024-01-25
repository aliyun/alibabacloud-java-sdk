// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryScaleUpOrderRequest extends TeaModel {
    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryScaleUpOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScaleUpOrderRequest self = new QueryScaleUpOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryScaleUpOrderRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public QueryScaleUpOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
