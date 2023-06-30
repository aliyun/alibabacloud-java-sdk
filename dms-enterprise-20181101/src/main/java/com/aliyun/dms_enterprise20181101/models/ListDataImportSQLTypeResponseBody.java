// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataImportSQLTypeResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The types of SQL statements.</p>
     */
    @NameInMap("SqlTypeResult")
    public java.util.List<String> sqlTypeResult;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataImportSQLTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataImportSQLTypeResponseBody self = new ListDataImportSQLTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataImportSQLTypeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataImportSQLTypeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataImportSQLTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataImportSQLTypeResponseBody setSqlTypeResult(java.util.List<String> sqlTypeResult) {
        this.sqlTypeResult = sqlTypeResult;
        return this;
    }
    public java.util.List<String> getSqlTypeResult() {
        return this.sqlTypeResult;
    }

    public ListDataImportSQLTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
