// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataLakeDatabaseResponseBody extends TeaModel {
    @NameInMap("Database")
    public DLDatabase database;

    /**
     * <strong>example:</strong>
     * <p>404</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>code: 404, can not find catalog, name : hive1 request id: FF737753-9641-1F51-AFDA-7DF541114B29</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E5EE2B9E-2F95-57FA-B284-CB441CEE49D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataLakeDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataLakeDatabaseResponseBody self = new GetDataLakeDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataLakeDatabaseResponseBody setDatabase(DLDatabase database) {
        this.database = database;
        return this;
    }
    public DLDatabase getDatabase() {
        return this.database;
    }

    public GetDataLakeDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataLakeDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataLakeDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataLakeDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
