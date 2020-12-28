// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSClustersResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Clusters")
    public java.util.List<DescribeGWSClustersResponseBodyClusters> clusters;

    @NameInMap("CallerType")
    public String callerType;

    public static DescribeGWSClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSClustersResponseBody self = new DescribeGWSClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGWSClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeGWSClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGWSClustersResponseBody setClusters(java.util.List<DescribeGWSClustersResponseBodyClusters> clusters) {
        this.clusters = clusters;
        return this;
    }
    public java.util.List<DescribeGWSClustersResponseBodyClusters> getClusters() {
        return this.clusters;
    }

    public DescribeGWSClustersResponseBody setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public static class DescribeGWSClustersResponseBodyClusters extends TeaModel {
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

        public static DescribeGWSClustersResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSClustersResponseBodyClusters self = new DescribeGWSClustersResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public DescribeGWSClustersResponseBodyClusters setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeGWSClustersResponseBodyClusters setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGWSClustersResponseBodyClusters setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeGWSClustersResponseBodyClusters setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGWSClustersResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
