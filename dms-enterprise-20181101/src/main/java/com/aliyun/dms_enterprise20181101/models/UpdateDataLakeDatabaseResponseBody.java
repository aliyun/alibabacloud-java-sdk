// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateDataLakeDatabaseResponseBody extends TeaModel {
    @NameInMap("Database")
    public DLDatabase database;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>4E1D2B4D-3E53-4ABC-999D-1D2520B3471A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateDataLakeDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataLakeDatabaseResponseBody self = new UpdateDataLakeDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataLakeDatabaseResponseBody setDatabase(DLDatabase database) {
        this.database = database;
        return this;
    }
    public DLDatabase getDatabase() {
        return this.database;
    }

    public UpdateDataLakeDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateDataLakeDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateDataLakeDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataLakeDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
