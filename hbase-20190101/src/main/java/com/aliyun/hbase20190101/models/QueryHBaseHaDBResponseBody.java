// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class QueryHBaseHaDBResponseBody extends TeaModel {
    @NameInMap("ClusterList")
    public QueryHBaseHaDBResponseBodyClusterList clusterList;

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
     * <p>963355AD-A3B1-4654-AFFC-B5186EB8F889</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

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

    public QueryHBaseHaDBResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Standby</p>
         */
        @NameInMap("HbaseType")
        public String hbaseType;

        /**
         * <strong>example:</strong>
         * <p>ha-v21tmnxjwh2yuy1il-phoenix.bds.9b78df04-b.rds.aliyuncs.com:8765</p>
         */
        @NameInMap("SlbConnAddr")
        public String slbConnAddr;

        /**
         * <strong>example:</strong>
         * <p>phoenix</p>
         */
        @NameInMap("SlbType")
        public String slbType;

        public static QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn build(java.util.Map<String, ?> map) throws Exception {
            QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn self = new QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn();
            return TeaModel.build(map, self);
        }

        public QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn setHbaseType(String hbaseType) {
            this.hbaseType = hbaseType;
            return this;
        }
        public String getHbaseType() {
            return this.hbaseType;
        }

        public QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn setSlbConnAddr(String slbConnAddr) {
            this.slbConnAddr = slbConnAddr;
            return this;
        }
        public String getSlbConnAddr() {
            return this.slbConnAddr;
        }

        public QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn setSlbType(String slbType) {
            this.slbType = slbType;
            return this;
        }
        public String getSlbType() {
            return this.slbType;
        }

    }

    public static class QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnList extends TeaModel {
        @NameInMap("HaSlbConn")
        public java.util.List<QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn> haSlbConn;

        public static QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnList build(java.util.Map<String, ?> map) throws Exception {
            QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnList self = new QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnList();
            return TeaModel.build(map, self);
        }

        public QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnList setHaSlbConn(java.util.List<QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn> haSlbConn) {
            this.haSlbConn = haSlbConn;
            return this;
        }
        public java.util.List<QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnListHaSlbConn> getHaSlbConn() {
            return this.haSlbConn;
        }

    }

    public static class QueryHBaseHaDBResponseBodyClusterListCluster extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hb-t4nn7dy1u1etbzmzm</p>
         */
        @NameInMap("ActiveName")
        public String activeName;

        /**
         * <p>bdsId</p>
         * 
         * <strong>example:</strong>
         * <p>bds-t4n3496whj23ia4k</p>
         */
        @NameInMap("BdsName")
        public String bdsName;

        /**
         * <strong>example:</strong>
         * <p>ha-v21tmnxjwh2yuy1il</p>
         */
        @NameInMap("HaName")
        public String haName;

        @NameInMap("HaSlbConnList")
        public QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnList haSlbConnList;

        /**
         * <strong>example:</strong>
         * <p>hb-t4n0ye37832tx22vz</p>
         */
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

        public QueryHBaseHaDBResponseBodyClusterListCluster setHaSlbConnList(QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnList haSlbConnList) {
            this.haSlbConnList = haSlbConnList;
            return this;
        }
        public QueryHBaseHaDBResponseBodyClusterListClusterHaSlbConnList getHaSlbConnList() {
            return this.haSlbConnList;
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
