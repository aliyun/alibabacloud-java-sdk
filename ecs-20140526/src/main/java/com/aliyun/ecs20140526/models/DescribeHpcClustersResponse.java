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

    public DescribeHpcClustersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHpcClustersResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeHpcClustersResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHpcClustersResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHpcClustersResponse setHpcClusters(DescribeHpcClustersResponseHpcClusters hpcClusters) {
        this.hpcClusters = hpcClusters;
        return this;
    }
    public DescribeHpcClustersResponseHpcClusters getHpcClusters() {
        return this.hpcClusters;
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

        public DescribeHpcClustersResponseHpcClustersHpcCluster setHpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        public DescribeHpcClustersResponseHpcClustersHpcCluster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHpcClustersResponseHpcClustersHpcCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribeHpcClustersResponseHpcClusters setHpcCluster(java.util.List<DescribeHpcClustersResponseHpcClustersHpcCluster> hpcCluster) {
            this.hpcCluster = hpcCluster;
            return this;
        }
        public java.util.List<DescribeHpcClustersResponseHpcClustersHpcCluster> getHpcCluster() {
            return this.hpcCluster;
        }

    }

}
