// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlTablesResponseBody extends TeaModel {
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
     * <p>7A7D49E3-5585-5DF8-B62C-75C46B4991DC</p>
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
     * <p>The names of tables.</p>
     */
    @NameInMap("Tables")
    public java.util.List<String> tables;

    public static DescribeAdbMySqlTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlTablesResponseBody self = new DescribeAdbMySqlTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdbMySqlTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdbMySqlTablesResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public DescribeAdbMySqlTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAdbMySqlTablesResponseBody setTables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<String> getTables() {
        return this.tables;
    }

}
