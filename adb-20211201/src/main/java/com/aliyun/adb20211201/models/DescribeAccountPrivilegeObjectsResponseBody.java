// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegeObjectsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAccountPrivilegeObjectsResponseBodyData> data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Column")
        public String column;

        @NameInMap("Database")
        public String database;

        @NameInMap("Description")
        public String description;

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
