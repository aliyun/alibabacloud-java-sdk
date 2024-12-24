// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchCreateTablesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B7F4B621-E41E-4C84-B97F-42B5380A32BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The list of error messages for creating data tables.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ErrorDetail&quot;:{},&quot;TableName&quot;:&quot;test&quot;]</p>
     */
    @NameInMap("TableErrors")
    public java.util.List<TableError> tableErrors;

    public static BatchCreateTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateTablesResponseBody self = new BatchCreateTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreateTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreateTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchCreateTablesResponseBody setTableErrors(java.util.List<TableError> tableErrors) {
        this.tableErrors = tableErrors;
        return this;
    }
    public java.util.List<TableError> getTableErrors() {
        return this.tableErrors;
    }

}
