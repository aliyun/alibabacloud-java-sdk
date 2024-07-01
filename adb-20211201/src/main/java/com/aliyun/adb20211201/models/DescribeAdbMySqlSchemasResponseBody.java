// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlSchemasResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * <ul>
     * <li>If the request was successful, a <strong>success</strong> message is returned.</li>
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
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried databases.</p>
     */
    @NameInMap("Schemas")
    public java.util.List<String> schemas;

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

    public static DescribeAdbMySqlSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdbMySqlSchemasResponseBody self = new DescribeAdbMySqlSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAdbMySqlSchemasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAdbMySqlSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAdbMySqlSchemasResponseBody setSchemas(java.util.List<String> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<String> getSchemas() {
        return this.schemas;
    }

    public DescribeAdbMySqlSchemasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
