// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegeObjectsResponseBody extends TeaModel {
    /**
     * <p>The list of privileges.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAccountPrivilegeObjectsResponseBodyData> data;

    /**
     * <p>The page number, which is the same as the value passed in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size, which is the same as the value passed in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34B2AD29-682F-1C14-B3AA-9EF1A96084B8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAccountPrivilegeObjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountPrivilegeObjectsResponseBody self = new DescribeAccountPrivilegeObjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountPrivilegeObjectsResponseBody setData(java.util.List<DescribeAccountPrivilegeObjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAccountPrivilegeObjectsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAccountPrivilegeObjectsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccountPrivilegeObjectsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAccountPrivilegeObjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountPrivilegeObjectsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccountPrivilegeObjectsResponseBodyData extends TeaModel {
        /**
         * <p>The column name. This field is returned when the privilege level is Column.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The database name. This field is returned when the privilege level is Database, Table, or Column.</p>
         * 
         * <strong>example:</strong>
         * <p>tdb1</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The description specified when the table or column is created. This field has a value only when the privilege level is Database or Table, representing the description of the database or table, respectively.</p>
         * 
         * <strong>example:</strong>
         * <p>a test db</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The table name. This field is returned when the privilege level is Table or Column.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
        @NameInMap("Table")
        public String table;

        public static DescribeAccountPrivilegeObjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountPrivilegeObjectsResponseBodyData self = new DescribeAccountPrivilegeObjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountPrivilegeObjectsResponseBodyData setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public DescribeAccountPrivilegeObjectsResponseBodyData setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeAccountPrivilegeObjectsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccountPrivilegeObjectsResponseBodyData setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

}
