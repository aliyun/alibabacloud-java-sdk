// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeClustersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Clusters")
    public DescribeClustersResponseBodyClusters clusters;

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

    public DescribeClustersResponseBody setClusters(DescribeClustersResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public DescribeClustersResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public static class DescribeClustersResponseBodyClustersCluster extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClustersResponseBodyClustersCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClustersCluster self = new DescribeClustersResponseBodyClustersCluster();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClustersCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class DescribeClustersResponseBodyClusters extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<DescribeClustersResponseBodyClustersCluster> cluster;

        public static DescribeClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseBodyClusters self = new DescribeClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseBodyClusters setCluster(java.util.List<DescribeClustersResponseBodyClustersCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<DescribeClustersResponseBodyClustersCluster> getCluster() {
            return this.cluster;
        }

    }

}
