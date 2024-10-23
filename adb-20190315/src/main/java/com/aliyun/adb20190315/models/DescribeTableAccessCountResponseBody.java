// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeTableAccessCountResponseBody extends TeaModel {
    /**
     * <p>Details about the table usage.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeTableAccessCountResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C242707A-01D1-54DA-A5F6-671557******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTableAccessCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTableAccessCountResponseBody self = new DescribeTableAccessCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTableAccessCountResponseBody setItems(java.util.List<DescribeTableAccessCountResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeTableAccessCountResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeTableAccessCountResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTableAccessCountResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTableAccessCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTableAccessCountResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTableAccessCountResponseBodyItems extends TeaModel {
        /**
         * <p>The number of accesses to the table.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AccessCount")
        public String accessCount;

        /**
         * <p>The ID of the cluster to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp1r053byu48p****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The date when the table was used.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-08-30</p>
         */
        @NameInMap("ReportDate")
        public String reportDate;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The database to which the table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>tpch</p>
         */
        @NameInMap("TableSchema")
        public String tableSchema;

        public static DescribeTableAccessCountResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeTableAccessCountResponseBodyItems self = new DescribeTableAccessCountResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeTableAccessCountResponseBodyItems setAccessCount(String accessCount) {
            this.accessCount = accessCount;
            return this;
        }
        public String getAccessCount() {
            return this.accessCount;
        }

        public DescribeTableAccessCountResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeTableAccessCountResponseBodyItems setReportDate(String reportDate) {
            this.reportDate = reportDate;
            return this;
        }
        public String getReportDate() {
            return this.reportDate;
        }

        public DescribeTableAccessCountResponseBodyItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeTableAccessCountResponseBodyItems setTableSchema(String tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public String getTableSchema() {
            return this.tableSchema;
        }

    }

}
