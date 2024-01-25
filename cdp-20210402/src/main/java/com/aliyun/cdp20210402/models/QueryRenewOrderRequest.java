// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryRenewOrderRequest extends TeaModel {
    @NameInMap("ClusterBizId")
    public String clusterBizId;

    public static QueryRenewOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewOrderRequest self = new QueryRenewOrderRequest();
        return TeaModel.build(map, self);
    }

    public QueryRenewOrderRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

}
