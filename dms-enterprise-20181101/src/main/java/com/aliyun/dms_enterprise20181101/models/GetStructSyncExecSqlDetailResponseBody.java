// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncExecSqlDetailResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1810E635-A2D7-428B-BAA9-85DAEB9B1A77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the SQL statements.</p>
     */
    @NameInMap("StructSyncExecSqlDetail")
    public GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail structSyncExecSqlDetail;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetStructSyncExecSqlDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncExecSqlDetailResponseBody self = new GetStructSyncExecSqlDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStructSyncExecSqlDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStructSyncExecSqlDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStructSyncExecSqlDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStructSyncExecSqlDetailResponseBody setStructSyncExecSqlDetail(GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail structSyncExecSqlDetail) {
        this.structSyncExecSqlDetail = structSyncExecSqlDetail;
        return this;
    }
    public GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail getStructSyncExecSqlDetail() {
        return this.structSyncExecSqlDetail;
    }

    public GetStructSyncExecSqlDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail extends TeaModel {
        /**
         * <p>The SQL statements that are executed.</p>
         */
        @NameInMap("ExecSql")
        public String execSql;

        /**
         * <p>The total number of SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalSqlCount")
        public Long totalSqlCount;

        public static GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail self = new GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail();
            return TeaModel.build(map, self);
        }

        public GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail setExecSql(String execSql) {
            this.execSql = execSql;
            return this;
        }
        public String getExecSql() {
            return this.execSql;
        }

        public GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail setTotalSqlCount(Long totalSqlCount) {
            this.totalSqlCount = totalSqlCount;
            return this;
        }
        public Long getTotalSqlCount() {
            return this.totalSqlCount;
        }

    }

}
