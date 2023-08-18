// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListClusterResponseBody extends TeaModel {
    @NameInMap("Clusters")
    public ListClusterResponseBodyClusters clusters;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterResponseBody self = new ListClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterResponseBody setClusters(ListClusterResponseBodyClusters clusters) {
        this.clusters = clusters;
        return this;
    }
    public ListClusterResponseBodyClusters getClusters() {
        return this.clusters;
    }

    public ListClusterResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListClusterResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClusterResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClusterResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListClusterResponseBodyClustersCluster extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListClusterResponseBodyClustersCluster build(java.util.Map<String, ?> map) throws Exception {
            ListClusterResponseBodyClustersCluster self = new ListClusterResponseBodyClustersCluster();
            return TeaModel.build(map, self);
        }

        public ListClusterResponseBodyClustersCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListClusterResponseBodyClustersCluster setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClusterResponseBodyClustersCluster setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListClusterResponseBodyClustersCluster setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClusterResponseBodyClustersCluster setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListClusterResponseBodyClustersCluster setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListClusterResponseBodyClustersCluster setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListClusterResponseBodyClustersCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListClusterResponseBodyClustersCluster setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListClusterResponseBodyClustersCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListClusterResponseBodyClusters extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<ListClusterResponseBodyClustersCluster> cluster;

        public static ListClusterResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            ListClusterResponseBodyClusters self = new ListClusterResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public ListClusterResponseBodyClusters setCluster(java.util.List<ListClusterResponseBodyClustersCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<ListClusterResponseBodyClustersCluster> getCluster() {
            return this.cluster;
        }

    }

}
