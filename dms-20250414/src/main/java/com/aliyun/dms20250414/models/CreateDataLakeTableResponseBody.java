// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataLakeTableResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request, used for log tracing and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>7FAD400F-7A5C-4193-8F9A-39D86C4F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The details of the table.</p>
     */
    @NameInMap("Table")
    public DLTable table;

    public static CreateDataLakeTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLakeTableResponseBody self = new CreateDataLakeTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataLakeTableResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataLakeTableResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataLakeTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataLakeTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDataLakeTableResponseBody setTable(DLTable table) {
        this.table = table;
        return this;
    }
    public DLTable getTable() {
        return this.table;
    }

}
