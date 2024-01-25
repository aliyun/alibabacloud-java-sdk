// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryOrderRequest extends TeaModel {
    @NameInMap("ClusterBizId")
    public String clusterBizId;

    public static QueryOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderRequest self = new QueryOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

}
