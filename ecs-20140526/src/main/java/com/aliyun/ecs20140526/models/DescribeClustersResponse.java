// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeClustersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Clusters")
    @Validation(required = true)
    public DescribeClustersResponseClusters clusters;

    public static DescribeClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClustersResponse self = new DescribeClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClustersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClustersResponse setClusters(DescribeClustersResponseClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public DescribeClustersResponseClusters getClusters() {
        return this.clusters;
    }

    public static class DescribeClustersResponseClustersCluster extends TeaModel {
        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        public static DescribeClustersResponseClustersCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseClustersCluster self = new DescribeClustersResponseClustersCluster();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseClustersCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class DescribeClustersResponseClusters extends TeaModel {
        @NameInMap("Cluster")
        @Validation(required = true)
        public java.util.List<DescribeClustersResponseClustersCluster> cluster;

        public static DescribeClustersResponseClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseClusters self = new DescribeClustersResponseClusters();
            return TeaModel.build(map, self);
        }

        public DescribeClustersResponseClusters setCluster(java.util.List<DescribeClustersResponseClustersCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<DescribeClustersResponseClustersCluster> getCluster() {
            return this.cluster;
        }

    }

}
