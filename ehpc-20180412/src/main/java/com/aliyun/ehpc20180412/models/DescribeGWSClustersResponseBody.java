// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSClustersResponseBody extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Clusters")
    public DescribeGWSClustersResponseBodyClusters clusters;

    public static DescribeGWSClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSClustersResponseBody self = new DescribeGWSClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGWSClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGWSClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGWSClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGWSClustersResponseBody setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public DescribeGWSClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGWSClustersResponseBody setClusters(DescribeGWSClustersResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public DescribeGWSClustersResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public static class DescribeGWSClustersResponseBodyClustersClusterInfo extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeGWSClustersResponseBodyClustersClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSClustersResponseBodyClustersClusterInfo self = new DescribeGWSClustersResponseBodyClustersClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGWSClustersResponseBodyClustersClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
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
