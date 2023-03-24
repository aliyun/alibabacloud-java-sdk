// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountAllPrivilegesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAccountAllPrivilegesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountAllPrivilegesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountAllPrivilegesResponseBody self = new DescribeAccountAllPrivilegesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountAllPrivilegesResponseBody setData(DescribeAccountAllPrivilegesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAccountAllPrivilegesResponseBodyData getData() {
        return this.data;
    }

    public DescribeAccountAllPrivilegesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject extends TeaModel {
        @NameInMap("Column")
        public String column;

        @NameInMap("Database")
        public String database;

        @NameInMap("Description")
        public String description;

        @NameInMap("Table")
        public String table;

        public static DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject self = new DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeAccountAllPrivilegesResponseBodyDataResult extends TeaModel {
        @NameInMap("PrivilegeObject")
        public DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject privilegeObject;

        @NameInMap("PrivilegeType")
        public String privilegeType;

        @NameInMap("Privileges")
        public java.util.List<String> privileges;

        public static DescribeAccountAllPrivilegesResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAllPrivilegesResponseBodyDataResult self = new DescribeAccountAllPrivilegesResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAllPrivilegesResponseBodyDataResult setPrivilegeObject(DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject privilegeObject) {
            this.privilegeObject = privilegeObject;
            return this;
        }
        public DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject getPrivilegeObject() {
            return this.privilegeObject;
        }

        public DescribeAccountAllPrivilegesResponseBodyDataResult setPrivilegeType(String privilegeType) {
            this.privilegeType = privilegeType;
            return this;
        }
        public String getPrivilegeType() {
            return this.privilegeType;
        }

        public DescribeAccountAllPrivilegesResponseBodyDataResult setPrivileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            return this;
        }
        public java.util.List<String> getPrivileges() {
            return this.privileges;
        }

    }

    public static class DescribeAccountAllPrivilegesResponseBodyData extends TeaModel {
        @NameInMap("Marker")
        public String marker;

        @NameInMap("Result")
        public java.util.List<DescribeAccountAllPrivilegesResponseBodyDataResult> result;

        @NameInMap("Truncated")
        public Boolean truncated;

        public static DescribeAccountAllPrivilegesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountAllPrivilegesResponseBodyData self = new DescribeAccountAllPrivilegesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountAllPrivilegesResponseBodyData setMarker(String marker) {
            this.marker = marker;
            return this;
        }
        public String getMarker() {
            return this.marker;
        }

        public DescribeAccountAllPrivilegesResponseBodyData setResult(java.util.List<DescribeAccountAllPrivilegesResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<DescribeAccountAllPrivilegesResponseBodyDataResult> getResult() {
            return this.result;
        }

        public DescribeAccountAllPrivilegesResponseBodyData setTruncated(Boolean truncated) {
            this.truncated = truncated;
            return this;
        }
        public Boolean getTruncated() {
            return this.truncated;
        }

    }

}
