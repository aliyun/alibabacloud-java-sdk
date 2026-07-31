// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAccountAllPrivilegesResponseBody extends TeaModel {
    /**
     * <p>Permission details.</p>
     */
    @NameInMap("Data")
    public DescribeAccountAllPrivilegesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3BB185E9-BB54-1727-B876-13243E4C0EB5</p>
     */
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
        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>tdb1</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>Description of the permission object.</p>
         * 
         * <strong>example:</strong>
         * <p>id of table</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table1</p>
         */
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
        /**
         * <p>The permission object, represented as a trituple of database, table, and column. All fields are empty for Global-level permissions.</p>
         */
        @NameInMap("PrivilegeObject")
        public DescribeAccountAllPrivilegesResponseBodyDataResultPrivilegeObject privilegeObject;

        /**
         * <p>The permission level, returned by the <code>DescribeEnabledPrivileges</code> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Global</p>
         */
        @NameInMap("PrivilegeType")
        public String privilegeType;

        /**
         * <p>List of permissions.</p>
         */
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
        /**
         * <p>If the <code>Truncated</code> field in the response is <code>true</code>, pass this value in subsequent calls to retrieve the next set of results.</p>
         * 
         * <strong>example:</strong>
         * <p>0573e74fd1ccb01739993a691e876074db6e1b6ad79f54115f0e98528432ba6a523cfec5780ade5189299cc3396f6ff7</p>
         */
        @NameInMap("Marker")
        public String marker;

        /**
         * <p>List of permissions.</p>
         */
        @NameInMap("Result")
        public java.util.List<DescribeAccountAllPrivilegesResponseBodyDataResult> result;

        /**
         * <p>If the response is truncated, this field is <code>true</code>. Continue calling this operation until this field becomes <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
