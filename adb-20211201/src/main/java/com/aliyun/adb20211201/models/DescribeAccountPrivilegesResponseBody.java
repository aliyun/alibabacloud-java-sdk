// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountPrivilegesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAccountPrivilegesResponseBodyData> data;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Column")
        public String column;

        @NameInMap("Database")
        public String database;

        @NameInMap("Description")
        public String description;

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
        @NameInMap("PrivilegeObject")
        public DescribeAccountPrivilegesResponseBodyDataPrivilegeObject privilegeObject;

        @NameInMap("PrivilegeType")
        public String privilegeType;

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
