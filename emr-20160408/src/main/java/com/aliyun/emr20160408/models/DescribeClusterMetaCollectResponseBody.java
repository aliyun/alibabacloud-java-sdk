// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterMetaCollectResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("MetaStoreType")
    public String metaStoreType;

    public static DescribeClusterMetaCollectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterMetaCollectResponseBody self = new DescribeClusterMetaCollectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterMetaCollectResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeClusterMetaCollectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterMetaCollectResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterMetaCollectResponseBody setMetaStoreType(String metaStoreType) {
        this.metaStoreType = metaStoreType;
        return this;
    }
    public String getMetaStoreType() {
        return this.metaStoreType;
    }

}
