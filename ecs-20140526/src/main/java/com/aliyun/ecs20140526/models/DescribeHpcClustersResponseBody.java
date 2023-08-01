// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeHpcClustersResponseBody extends TeaModel {
    /**
     * <p>The name of the HPC cluster.</p>
     */
    @NameInMap("HpcClusters")
    public DescribeHpcClustersResponseBodyHpcClusters hpcClusters;

    /**
     * <p>Details about the HPC clusters. The value is an array that consists of the information of each HPC cluster.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The total number of HPC clusters.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the HPC cluster.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHpcClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHpcClustersResponseBody self = new DescribeHpcClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHpcClustersResponseBody setHpcClusters(DescribeHpcClustersResponseBodyHpcClusters hpcClusters) {
        this.hpcClusters = hpcClusters;
        return this;
    }
    public DescribeHpcClustersResponseBodyHpcClusters getHpcClusters() {
        return this.hpcClusters;
    }

    public DescribeHpcClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHpcClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHpcClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHpcClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHpcClustersResponseBodyHpcClustersHpcCluster extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <p>The description of the HPC cluster.</p>
         */
        @NameInMap("HpcClusterId")
        public String hpcClusterId;

        @NameInMap("Name")
        public String name;

        public static DescribeHpcClustersResponseBodyHpcClustersHpcCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeHpcClustersResponseBodyHpcClustersHpcCluster self = new DescribeHpcClustersResponseBodyHpcClustersHpcCluster();
            return TeaModel.build(map, self);
        }

        public DescribeHpcClustersResponseBodyHpcClustersHpcCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHpcClustersResponseBodyHpcClustersHpcCluster setHpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }
        public String getHpcClusterId() {
            return this.hpcClusterId;
        }

        public DescribeHpcClustersResponseBodyHpcClustersHpcCluster setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeHpcClustersResponseBodyHpcClusters extends TeaModel {
        @NameInMap("HpcCluster")
        public java.util.List<DescribeHpcClustersResponseBodyHpcClustersHpcCluster> hpcCluster;

        public static DescribeHpcClustersResponseBodyHpcClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeHpcClustersResponseBodyHpcClusters self = new DescribeHpcClustersResponseBodyHpcClusters();
            return TeaModel.build(map, self);
        }

        public DescribeHpcClustersResponseBodyHpcClusters setHpcCluster(java.util.List<DescribeHpcClustersResponseBodyHpcClustersHpcCluster> hpcCluster) {
            this.hpcCluster = hpcCluster;
            return this;
        }
        public java.util.List<DescribeHpcClustersResponseBodyHpcClustersHpcCluster> getHpcCluster() {
            return this.hpcCluster;
        }

    }

}
