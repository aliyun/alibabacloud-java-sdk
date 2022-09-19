// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlColumnsResponseBody extends TeaModel {
    @NameInMap("Columns")
    public java.util.List<DescribeAdbMySqlColumnsResponseBodyColumns> columns;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schema")
    public String schema;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TableName")
    public String tableName;

    public static DescribeAdbMySqlColumnsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlColumnsResponseBody self = new DescribeAdbMySqlColumnsResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Name")
        public String name;

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
