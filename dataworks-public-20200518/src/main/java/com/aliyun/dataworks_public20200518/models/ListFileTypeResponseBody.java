// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListFileTypeResponseBody extends TeaModel {
    /**
     * <p>The information of the node types.</p>
     */
    @NameInMap("NodeTypeInfoList")
    public ListFileTypeResponseBodyNodeTypeInfoList nodeTypeInfoList;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFileTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileTypeResponseBody self = new ListFileTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileTypeResponseBody setNodeTypeInfoList(ListFileTypeResponseBodyNodeTypeInfoList nodeTypeInfoList) {
        this.nodeTypeInfoList = nodeTypeInfoList;
        return this;
    }
    public ListFileTypeResponseBodyNodeTypeInfoList getNodeTypeInfoList() {
        return this.nodeTypeInfoList;
    }

    public ListFileTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo extends TeaModel {
        /**
         * <p>The code of the node type.</p>
         * <br>
         * <p>The codes and names of node types have the following mappings:</p>
         * <br>
         * <p>6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>The name of the node type.</p>
         * <br>
         * <p>The codes and names of node types have the following mappings:</p>
         * <br>
         * <p>6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), and 1221 (PyODPS 3)</p>
         */
        @NameInMap("NodeTypeName")
        public String nodeTypeName;

        public static ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo self = new ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo();
            return TeaModel.build(map, self);
        }

        public ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo setNodeTypeName(String nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

    }

    public static class ListFileTypeResponseBodyNodeTypeInfoList extends TeaModel {
        /**
         * <p>The information of the node type.</p>
         */
        @NameInMap("NodeTypeInfo")
        public java.util.List<ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo> nodeTypeInfo;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFileTypeResponseBodyNodeTypeInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListFileTypeResponseBodyNodeTypeInfoList self = new ListFileTypeResponseBodyNodeTypeInfoList();
            return TeaModel.build(map, self);
        }

        public ListFileTypeResponseBodyNodeTypeInfoList setNodeTypeInfo(java.util.List<ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo> nodeTypeInfo) {
            this.nodeTypeInfo = nodeTypeInfo;
            return this;
        }
        public java.util.List<ListFileTypeResponseBodyNodeTypeInfoListNodeTypeInfo> getNodeTypeInfo() {
            return this.nodeTypeInfo;
        }

        public ListFileTypeResponseBodyNodeTypeInfoList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListFileTypeResponseBodyNodeTypeInfoList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileTypeResponseBodyNodeTypeInfoList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
