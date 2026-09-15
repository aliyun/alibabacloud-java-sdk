// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class QueryLumaWithSQLResponseBody extends TeaModel {
    /**
     * <p>The response code of the operation. A value of Success indicates that the call succeeded. Otherwise, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The execution result of the SQL query, including column definitions and row data.</p>
     */
    @NameInMap("Data")
    public ExecutionResult data;

    /**
     * <p>The message returned by the operation. The value is Operation success if the call succeeds, or a specific error description if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. Use this ID for troubleshooting and when submitting a ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryLumaWithSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLumaWithSQLResponseBody self = new QueryLumaWithSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLumaWithSQLResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLumaWithSQLResponseBody setData(ExecutionResult data) {
        this.data = data;
        return this;
    }
    public ExecutionResult getData() {
        return this.data;
    }

    public QueryLumaWithSQLResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLumaWithSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLumaWithSQLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
