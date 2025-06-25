// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlIndexesResponseBody extends TeaModel {
    /**
     * <p>The number of indexes.````</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("IndexCount")
    public Integer indexCount;

    /**
     * <p>The queried indexes.</p>
     */
    @NameInMap("Indexes")
    public java.util.List<DescribeAdbMySqlIndexesResponseBodyIndexes> indexes;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>If the request was successful, a success message is returned.****</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F0983B43-B2EC-536A-8791-142B5CF1E9B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the database.</p>
     * <p>**</p>
     * <p>****\</p>
     * 
     * <strong>example:</strong>
     * <p>adb_demo</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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

    public static DescribeAdbMySqlIndexesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlIndexesResponseBody self = new DescribeAdbMySqlIndexesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlIndexesResponseBody setIndexCount(Integer indexCount) {
        this.indexCount = indexCount;
        return this;
    }
    public Integer getIndexCount() {
        return this.indexCount;
    }

    public DescribeAdbMySqlIndexesResponseBody setIndexes(java.util.List<DescribeAdbMySqlIndexesResponseBodyIndexes> indexes) {
        this.indexes = indexes;
        return this;
    }
    public java.util.List<DescribeAdbMySqlIndexesResponseBodyIndexes> getIndexes() {
        return this.indexes;
    }

    public DescribeAdbMySqlIndexesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdbMySqlIndexesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdbMySqlIndexesResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public DescribeAdbMySqlIndexesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAdbMySqlIndexesResponseBody setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public static class DescribeAdbMySqlIndexesResponseBodyIndexes extends TeaModel {
        /**
         * <p>The name of the column.</p>
         * 
         * <strong>example:</strong>
         * <p>preclcu</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The name of the index.</p>
         * 
         * <strong>example:</strong>
         * <p>ttl</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The index type.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeAdbMySqlIndexesResponseBodyIndexes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAdbMySqlIndexesResponseBodyIndexes self = new DescribeAdbMySqlIndexesResponseBodyIndexes();
            return TeaModel.build(map, self);
        }

        public DescribeAdbMySqlIndexesResponseBodyIndexes setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public DescribeAdbMySqlIndexesResponseBodyIndexes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAdbMySqlIndexesResponseBodyIndexes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
