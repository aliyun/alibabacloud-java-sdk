// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListClusterVersionsRequest extends TeaModel {
    @NameInMap("ClusterType")
    public String clusterType;

    public static ListClusterVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterVersionsRequest self = new ListClusterVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterVersionsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

}
