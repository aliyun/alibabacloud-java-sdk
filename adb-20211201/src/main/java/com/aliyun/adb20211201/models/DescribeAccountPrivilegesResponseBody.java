// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegesResponseBody extends TeaModel {
    /**
     * <p>Details of the permissions.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAccountPrivilegesResponseBodyData> data;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DA32480A-E3E5-1BE7-BA98-724551DC04C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>column1</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>db1</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The description of the permission object.</p>
         * 
         * <strong>example:</strong>
         * <p>a test column</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the table.</p>
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
         * <p>The objects on which the permission takes effect, including databases, tables, columns, and additional descriptions.</p>
         */
        @NameInMap("PrivilegeObject")
        public DescribeAccountPrivilegesResponseBodyDataPrivilegeObject privilegeObject;

        /**
         * <p>The permission level of the permission. Valid values: <code>Global</code>, <code>Database</code>, <code>Table</code>, and <code>Column</code>. You can call the <code>DescribeEnabledPrivileges</code> parameter to query the permission level of a specific permission.</p>
         * 
         * <strong>example:</strong>
         * <p>Column</p>
         */
        @NameInMap("PrivilegeType")
        public String privilegeType;

        /**
         * <p>The name of the permission. You can call the <code>DescribeEnabledPrivileges</code> operation to query the name of the permission.</p>
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
