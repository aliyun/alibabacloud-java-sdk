// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlColumnsResponseBody extends TeaModel {
    /**
     * <p>The total number of columns.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ColumnCount")
    public Integer columnCount;

    /**
     * <p>Details of the columns.</p>
     */
    @NameInMap("Columns")
    public java.util.List<DescribeAdbMySqlColumnsResponseBodyColumns> columns;

    /**
     * <p>The message returned for the operation. Valid values:</p>
     * <ul>
     * <li><strong>Success</strong> is returned if the operation is successful.</li>
     * <li>An error message is returned if the operation fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A9F013CD-0222-595E-8157-445969B97F03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The operation is successful.</li>
     * <li><strong>false</strong>: The operation fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static DescribeAdbMySqlColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlColumnsResponseBody self = new DescribeAdbMySqlColumnsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlColumnsResponseBody setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
        return this;
    }
    public Integer getColumnCount() {
        return this.columnCount;
    }

    public DescribeAdbMySqlColumnsResponseBody setColumns(java.util.List<DescribeAdbMySqlColumnsResponseBodyColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<DescribeAdbMySqlColumnsResponseBodyColumns> getColumns() {
        return this.columns;
    }

    public DescribeAdbMySqlColumnsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdbMySqlColumnsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdbMySqlColumnsResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public DescribeAdbMySqlColumnsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAdbMySqlColumnsResponseBody setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class DescribeAdbMySqlColumnsResponseBodyColumns extends TeaModel {
        /**
         * <p>The comments of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The data type of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>bigint</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAdbMySqlColumnsResponseBodyColumns build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdbMySqlColumnsResponseBodyColumns self = new DescribeAdbMySqlColumnsResponseBodyColumns();
            return TeaModel.build(map, self);
        }

        public DescribeAdbMySqlColumnsResponseBodyColumns setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeAdbMySqlColumnsResponseBodyColumns setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAdbMySqlColumnsResponseBodyColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
