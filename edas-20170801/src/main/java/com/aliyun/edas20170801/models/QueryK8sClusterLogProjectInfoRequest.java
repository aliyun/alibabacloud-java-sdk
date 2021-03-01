// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryK8sClusterLogProjectInfoRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    public static QueryK8sClusterLogProjectInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryK8sClusterLogProjectInfoRequest self = new QueryK8sClusterLogProjectInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryK8sClusterLogProjectInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
