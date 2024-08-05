// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceClusterListResponseBody extends TeaModel {
    @NameInMap("InstanceClusters")
    public DescribeInstanceClusterListResponseBodyInstanceClusters instanceClusters;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceClusterListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceClusterListResponseBody self = new DescribeInstanceClusterListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceClusterListResponseBody setInstanceClusters(DescribeInstanceClusterListResponseBodyInstanceClusters instanceClusters) {
        this.instanceClusters = instanceClusters;
        return this;
    }
    public DescribeInstanceClusterListResponseBodyInstanceClusters getInstanceClusters() {
        return this.instanceClusters;
    }

    public DescribeInstanceClusterListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceClusterListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceClusterListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceClusterListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-08-14T17:46:59+08:00</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>Test TrafficControl</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceClusterId")
        public String instanceClusterId;

        @NameInMap("InstanceClusterName")
        public String instanceClusterName;

        @NameInMap("InstanceClusterStatus")
        public String instanceClusterStatus;

        @NameInMap("InstanceClusterType")
        public String instanceClusterType;

        /**
         * <strong>example:</strong>
         * <p>2024-01-12T10:11:08+08:00</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster self = new DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster setInstanceClusterId(String instanceClusterId) {
            this.instanceClusterId = instanceClusterId;
            return this;
        }
        public String getInstanceClusterId() {
            return this.instanceClusterId;
        }

        public DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster setInstanceClusterName(String instanceClusterName) {
            this.instanceClusterName = instanceClusterName;
            return this;
        }
        public String getInstanceClusterName() {
            return this.instanceClusterName;
        }

        public DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster setInstanceClusterStatus(String instanceClusterStatus) {
            this.instanceClusterStatus = instanceClusterStatus;
            return this;
        }
        public String getInstanceClusterStatus() {
            return this.instanceClusterStatus;
        }

        public DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster setInstanceClusterType(String instanceClusterType) {
            this.instanceClusterType = instanceClusterType;
            return this;
        }
        public String getInstanceClusterType() {
            return this.instanceClusterType;
        }

        public DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeInstanceClusterListResponseBodyInstanceClusters extends TeaModel {
        @NameInMap("InstanceCluster")
        public java.util.List<DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster> instanceCluster;

        public static DescribeInstanceClusterListResponseBodyInstanceClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceClusterListResponseBodyInstanceClusters self = new DescribeInstanceClusterListResponseBodyInstanceClusters();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceClusterListResponseBodyInstanceClusters setInstanceCluster(java.util.List<DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster> instanceCluster) {
            this.instanceCluster = instanceCluster;
            return this;
        }
        public java.util.List<DescribeInstanceClusterListResponseBodyInstanceClustersInstanceCluster> getInstanceCluster() {
            return this.instanceCluster;
        }

    }

}
