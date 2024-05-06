// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class QueryXpackRelatedDBResponseBody extends TeaModel {
    @NameInMap("ClusterList")
    public QueryXpackRelatedDBResponseBodyClusterList clusterList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryXpackRelatedDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryXpackRelatedDBResponseBody self = new QueryXpackRelatedDBResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryXpackRelatedDBResponseBody setClusterList(QueryXpackRelatedDBResponseBodyClusterList clusterList) {
        this.clusterList = clusterList;
        return this;
    }
    public QueryXpackRelatedDBResponseBodyClusterList getClusterList() {
        return this.clusterList;
    }

    public QueryXpackRelatedDBResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryXpackRelatedDBResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryXpackRelatedDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryXpackRelatedDBResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryXpackRelatedDBResponseBodyClusterListCluster extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("DBVersion")
        public String DBVersion;

        @NameInMap("IsRelated")
        public Boolean isRelated;

        @NameInMap("Status")
        public String status;

        public static QueryXpackRelatedDBResponseBodyClusterListCluster build(java.util.Map<String, ?> map) throws Exception {
            QueryXpackRelatedDBResponseBodyClusterListCluster self = new QueryXpackRelatedDBResponseBodyClusterListCluster();
            return TeaModel.build(map, self);
        }

        public QueryXpackRelatedDBResponseBodyClusterListCluster setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public QueryXpackRelatedDBResponseBodyClusterListCluster setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QueryXpackRelatedDBResponseBodyClusterListCluster setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public QueryXpackRelatedDBResponseBodyClusterListCluster setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public QueryXpackRelatedDBResponseBodyClusterListCluster setIsRelated(Boolean isRelated) {
            this.isRelated = isRelated;
            return this;
        }
        public Boolean getIsRelated() {
            return this.isRelated;
        }

        public QueryXpackRelatedDBResponseBodyClusterListCluster setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryXpackRelatedDBResponseBodyClusterList extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<QueryXpackRelatedDBResponseBodyClusterListCluster> cluster;

        public static QueryXpackRelatedDBResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            QueryXpackRelatedDBResponseBodyClusterList self = new QueryXpackRelatedDBResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public QueryXpackRelatedDBResponseBodyClusterList setCluster(java.util.List<QueryXpackRelatedDBResponseBodyClusterListCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<QueryXpackRelatedDBResponseBodyClusterListCluster> getCluster() {
            return this.cluster;
        }

    }

}
