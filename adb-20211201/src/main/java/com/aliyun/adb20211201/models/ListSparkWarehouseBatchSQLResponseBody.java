// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkWarehouseBatchSQLResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListSparkWarehouseBatchSQLResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSparkWarehouseBatchSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkWarehouseBatchSQLResponseBody self = new ListSparkWarehouseBatchSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkWarehouseBatchSQLResponseBody setData(ListSparkWarehouseBatchSQLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSparkWarehouseBatchSQLResponseBodyData getData() {
        return this.data;
    }

    public ListSparkWarehouseBatchSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSparkWarehouseBatchSQLResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The queried Spark SQL statements.</p>
         */
        @NameInMap("Queries")
        public java.util.List<SparkBatchSQL> queries;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSparkWarehouseBatchSQLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSparkWarehouseBatchSQLResponseBodyData self = new ListSparkWarehouseBatchSQLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSparkWarehouseBatchSQLResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListSparkWarehouseBatchSQLResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListSparkWarehouseBatchSQLResponseBodyData setQueries(java.util.List<SparkBatchSQL> queries) {
            this.queries = queries;
            return this;
        }
        public java.util.List<SparkBatchSQL> getQueries() {
            return this.queries;
        }

        public ListSparkWarehouseBatchSQLResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
