// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncExecSqlDetailResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("StructSyncExecSqlDetail")
    public GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail structSyncExecSqlDetail;

    public static GetStructSyncExecSqlDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncExecSqlDetailResponseBody self = new GetStructSyncExecSqlDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStructSyncExecSqlDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStructSyncExecSqlDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStructSyncExecSqlDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStructSyncExecSqlDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStructSyncExecSqlDetailResponseBody setStructSyncExecSqlDetail(GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail structSyncExecSqlDetail) {
        this.structSyncExecSqlDetail = structSyncExecSqlDetail;
        return this;
    }
    public GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail getStructSyncExecSqlDetail() {
        return this.structSyncExecSqlDetail;
    }

    public static class GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail extends TeaModel {
        @NameInMap("TotalSqlCount")
        public Long totalSqlCount;

        @NameInMap("ExecSql")
        public String execSql;

        public static GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail self = new GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail();
            return TeaModel.build(map, self);
        }

        public GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail setTotalSqlCount(Long totalSqlCount) {
            this.totalSqlCount = totalSqlCount;
            return this;
        }
        public Long getTotalSqlCount() {
            return this.totalSqlCount;
        }

        public GetStructSyncExecSqlDetailResponseBodyStructSyncExecSqlDetail setExecSql(String execSql) {
            this.execSql = execSql;
            return this;
        }
        public String getExecSql() {
            return this.execSql;
        }

    }

}
