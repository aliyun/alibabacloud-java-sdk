// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeClustersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Clusters")
    public java.util.List<DescribeClustersResponseBodyClusters> clusters;

    public static DescribeClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersResponseBody self = new DescribeClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClustersResponseBody setClusters(java.util.List<DescribeClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public static class DescribeClustersResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClusters self = new DescribeClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
