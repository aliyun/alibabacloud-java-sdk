// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlSchemasResponseBody extends TeaModel {
    /**
     * <p>The additional information about the call result. Valid values:</p>
     * <ul>
     * <li>If the request was successful, <strong>Success</strong> is returned. </li>
     * <li>If the request failed, a specific error code is returned.</li>
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
     * <p>The list of databases.</p>
     */
    @NameInMap("Schemas")
    public java.util.List<String> schemas;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
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
