// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAdbMySqlSchemasResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schemas")
    public java.util.List<String> schemas;

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
