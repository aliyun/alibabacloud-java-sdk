// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeHpcClustersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("HpcClusters")
    @Validation(required = true)
    public DescribeHpcClustersResponseHpcClusters hpcClusters;

    public static DescribeHpcClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHpcClustersResponse self = new DescribeHpcClustersResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeHpcClustersResponseHpcClustersHpcCluster extends TeaModel {
        @NameInMap("HpcClusterId")
        @Validation(required = true)
        public String hpcClusterId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeHpcClustersResponseHpcClustersHpcCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeHpcClustersResponseHpcClustersHpcCluster self = new DescribeHpcClustersResponseHpcClustersHpcCluster();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeHpcClustersResponseHpcClusters extends TeaModel {
        @NameInMap("HpcCluster")
        @Validation(required = true)
        public java.util.List<DescribeHpcClustersResponseHpcClustersHpcCluster> hpcCluster;

        public static DescribeHpcClustersResponseHpcClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeHpcClustersResponseHpcClusters self = new DescribeHpcClustersResponseHpcClusters();
            return TeaModel.build(map, self);
        }

    }

}
