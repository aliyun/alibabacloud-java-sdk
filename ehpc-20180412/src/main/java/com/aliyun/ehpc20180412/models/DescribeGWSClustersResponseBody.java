// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSClustersResponseBody extends TeaModel {
    /**
     * <p>The type of the account. Valid values:</p>
     * <br>
     * <p>*   sub: a RAM user.</p>
     * <p>*   parent: an Alibaba Cloud account.</p>
     */
    @NameInMap("CallerType")
    public String callerType;

    /**
     * <p>The information of the visualization services.</p>
     */
    @NameInMap("Clusters")
    public DescribeGWSClustersResponseBodyClusters clusters;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGWSClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSClustersResponseBody self = new DescribeGWSClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGWSClustersResponseBody setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public DescribeGWSClustersResponseBody setClusters(DescribeGWSClustersResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public DescribeGWSClustersResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public DescribeGWSClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGWSClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGWSClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGWSClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGWSClustersResponseBodyClustersClusterInfo extends TeaModel {
        /**
         * <p>The ID of the visualization service.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time when the visualization service was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of visualization instances.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The status of the visualization services. Valid values:</p>
         * <br>
         * <p>*   creating: The service is being created.</p>
         * <p>*   starting: The service is being started.</p>
         * <p>*   running: The service is running.</p>
         * <p>*   deleted: The service is deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeGWSClustersResponseBodyClustersClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSClustersResponseBodyClustersClusterInfo self = new DescribeGWSClustersResponseBodyClustersClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeGWSClustersResponseBodyClusters extends TeaModel {
        @NameInMap("ClusterInfo")
        public java.util.List<DescribeGWSClustersResponseBodyClustersClusterInfo> clusterInfo;

        public static DescribeGWSClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSClustersResponseBodyClusters self = new DescribeGWSClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeGWSClustersResponseBodyClusters setClusterInfo(java.util.List<DescribeGWSClustersResponseBodyClustersClusterInfo> clusterInfo) {
            this.clusterInfo = clusterInfo;
            return this;
        }
        public java.util.List<DescribeGWSClustersResponseBodyClustersClusterInfo> getClusterInfo() {
            return this.clusterInfo;
        }

    }

}
