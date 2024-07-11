// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataImportSQLResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B43AD641-49C2-5299-9E06-1B37EC1B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of SQL statements.</p>
     */
    @NameInMap("SQLDetail")
    public GetDataImportSQLResponseBodySQLDetail SQLDetail;

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
        /**
         * <p>The SQL script.</p>
         * 
         * <strong>example:</strong>
         * <p>insert into t1 values (1);</p>
         */
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
