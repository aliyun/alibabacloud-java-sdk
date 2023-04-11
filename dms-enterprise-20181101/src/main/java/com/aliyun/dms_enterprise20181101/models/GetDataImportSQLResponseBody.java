// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataImportSQLResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SQLDetail")
    public GetDataImportSQLResponseBodySQLDetail SQLDetail;

    @NameInMap("Success")
    public Boolean success;

    public static GetDataImportSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataImportSQLResponseBody self = new GetDataImportSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataImportSQLResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataImportSQLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataImportSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataImportSQLResponseBody setSQLDetail(GetDataImportSQLResponseBodySQLDetail SQLDetail) {
        this.SQLDetail = SQLDetail;
        return this;
    }
    public GetDataImportSQLResponseBodySQLDetail getSQLDetail() {
        return this.SQLDetail;
    }

    public GetDataImportSQLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataImportSQLResponseBodySQLDetail extends TeaModel {
        @NameInMap("ExecSql")
        public String execSql;

        public static GetDataImportSQLResponseBodySQLDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataImportSQLResponseBodySQLDetail self = new GetDataImportSQLResponseBodySQLDetail();
            return TeaModel.build(map, self);
        }

        public GetDataImportSQLResponseBodySQLDetail setExecSql(String execSql) {
            this.execSql = execSql;
            return this;
        }
        public String getExecSql() {
            return this.execSql;
        }

    }

}
