// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ResizeNodeCountRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("NodeCount")
    public Integer nodeCount;

    public static ResizeNodeCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeNodeCountRequest self = new ResizeNodeCountRequest();
        return TeaModel.build(map, self);
    }

    public ResizeNodeCountRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeNodeCountRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public ResizeNodeCountRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

}
