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

    public static class DescribeClustersResponseClustersCluster extends TeaModel {
        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        public static DescribeClustersResponseClustersCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeClustersResponseClustersCluster self = new DescribeClustersResponseClustersCluster();
            return TeaModel.build(map, self);
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

    }

}
