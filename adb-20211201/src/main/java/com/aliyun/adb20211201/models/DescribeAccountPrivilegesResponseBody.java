// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegesResponseBody extends TeaModel {
    /**
     * <p>The list of permission details.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAccountPrivilegesResponseBodyData> data;

    /**
     * <p>The page number, which is the same as the page number in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page, which is the same as the page size in the request.</p>
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
     * <p>DA32480A-E3E5-1BE7-BA98-724551DC04C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of permissions that the user has at the privilege level.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAccountPrivilegesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountPrivilegesResponseBody self = new DescribeAccountPrivilegesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountPrivilegesResponseBody setData(java.util.List<DescribeAccountPrivilegesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAccountPrivilegesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAccountPrivilegesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccountPrivilegesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAccountPrivilegesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountPrivilegesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccountPrivilegesResponseBodyDataPrivilegeObject extends TeaModel {
        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>db1</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>a test column</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>tabl1</p>
         */
        @NameInMap("Table")
        public String table;

        public static DescribeAccountPrivilegesResponseBodyDataPrivilegeObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountPrivilegesResponseBodyDataPrivilegeObject self = new DescribeAccountPrivilegesResponseBodyDataPrivilegeObject();
            return TeaModel.build(map, self);
        }

        public DescribeAccountPrivilegesResponseBodyDataPrivilegeObject setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public DescribeAccountPrivilegesResponseBodyDataPrivilegeObject setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeAccountPrivilegesResponseBodyDataPrivilegeObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccountPrivilegesResponseBodyDataPrivilegeObject setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeAccountPrivilegesResponseBodyData extends TeaModel {
        /**
         * <p>The privilege object, which is a triplet of database, table, and column, along with additional description information.</p>
         */
        @NameInMap("PrivilegeObject")
        public DescribeAccountPrivilegesResponseBodyDataPrivilegeObject privilegeObject;

        /**
         * <p>The privilege level, which can be Global, Databae, Table, or Column. This value is returned by the DescribeEnabledPrivileges operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Column</p>
         */
        @NameInMap("PrivilegeType")
        public String privilegeType;

        /**
         * <p>The list of permissions.</p>
         */
        @NameInMap("Privileges")
        public java.util.List<String> privileges;

        public static DescribeAccountPrivilegesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountPrivilegesResponseBodyData self = new DescribeAccountPrivilegesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountPrivilegesResponseBodyData setPrivilegeObject(DescribeAccountPrivilegesResponseBodyDataPrivilegeObject privilegeObject) {
            this.privilegeObject = privilegeObject;
            return this;
        }
        public DescribeAccountPrivilegesResponseBodyDataPrivilegeObject getPrivilegeObject() {
            return this.privilegeObject;
        }

        public DescribeAccountPrivilegesResponseBodyData setPrivilegeType(String privilegeType) {
            this.privilegeType = privilegeType;
            return this;
        }
        public String getPrivilegeType() {
            return this.privilegeType;
        }

        public DescribeAccountPrivilegesResponseBodyData setPrivileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            return this;
        }
        public java.util.List<String> getPrivileges() {
            return this.privileges;
        }

    }

}
