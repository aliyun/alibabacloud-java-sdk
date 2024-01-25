// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class QueryRenewPriceRequest extends TeaModel {
    @NameInMap("ClusterBizId")
    public String clusterBizId;

    @NameInMap("Instances")
    public String instances;

    public static QueryRenewPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRenewPriceRequest self = new QueryRenewPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRenewPriceRequest setClusterBizId(String clusterBizId) {
        this.clusterBizId = clusterBizId;
        return this;
    }
    public String getClusterBizId() {
        return this.clusterBizId;
    }

    public QueryRenewPriceRequest setInstances(String instances) {
        this.instances = instances;
        return this;
    }
    public String getInstances() {
        return this.instances;
    }

}
