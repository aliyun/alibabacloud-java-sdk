// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class QueryHBaseHaDBResponseBody extends TeaModel {
    @NameInMap("ClusterList")
    public QueryHBaseHaDBResponseBodyClusterList clusterList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryHBaseHaDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHBaseHaDBResponseBody self = new QueryHBaseHaDBResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHBaseHaDBResponseBody setClusterList(QueryHBaseHaDBResponseBodyClusterList clusterList) {
        this.clusterList = clusterList;
        return this;
    }
    public QueryHBaseHaDBResponseBodyClusterList getClusterList() {
        return this.clusterList;
    }

    public QueryHBaseHaDBResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryHBaseHaDBResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryHBaseHaDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHBaseHaDBResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryHBaseHaDBResponseBodyClusterListCluster extends TeaModel {
        @NameInMap("ActiveName")
        public String activeName;

        @NameInMap("BdsName")
        public String bdsName;

        @NameInMap("HaName")
        public String haName;

        @NameInMap("StandbyName")
        public String standbyName;

        public static QueryHBaseHaDBResponseBodyClusterListCluster build(java.util.Map<String, ?> map) throws Exception {
            QueryHBaseHaDBResponseBodyClusterListCluster self = new QueryHBaseHaDBResponseBodyClusterListCluster();
            return TeaModel.build(map, self);
        }

        public QueryHBaseHaDBResponseBodyClusterListCluster setActiveName(String activeName) {
            this.activeName = activeName;
            return this;
        }
        public String getActiveName() {
            return this.activeName;
        }

        public QueryHBaseHaDBResponseBodyClusterListCluster setBdsName(String bdsName) {
            this.bdsName = bdsName;
            return this;
        }
        public String getBdsName() {
            return this.bdsName;
        }

        public QueryHBaseHaDBResponseBodyClusterListCluster setHaName(String haName) {
            this.haName = haName;
            return this;
        }
        public String getHaName() {
            return this.haName;
        }

        public QueryHBaseHaDBResponseBodyClusterListCluster setStandbyName(String standbyName) {
            this.standbyName = standbyName;
            return this;
        }
        public String getStandbyName() {
            return this.standbyName;
        }

    }

    public static class QueryHBaseHaDBResponseBodyClusterList extends TeaModel {
        @NameInMap("Cluster")
        public java.util.List<QueryHBaseHaDBResponseBodyClusterListCluster> cluster;

        public static QueryHBaseHaDBResponseBodyClusterList build(java.util.Map<String, ?> map) throws Exception {
            QueryHBaseHaDBResponseBodyClusterList self = new QueryHBaseHaDBResponseBodyClusterList();
            return TeaModel.build(map, self);
        }

        public QueryHBaseHaDBResponseBodyClusterList setCluster(java.util.List<QueryHBaseHaDBResponseBodyClusterListCluster> cluster) {
            this.cluster = cluster;
            return this;
        }
        public java.util.List<QueryHBaseHaDBResponseBodyClusterListCluster> getCluster() {
            return this.cluster;
        }

    }

}
