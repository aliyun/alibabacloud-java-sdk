// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ListNodeGroupConstraintsRequest extends TeaModel {
    @NameInMap("ClusterType")
    public String clusterType;

    public static ListNodeGroupConstraintsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupConstraintsRequest self = new ListNodeGroupConstraintsRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupConstraintsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

}
