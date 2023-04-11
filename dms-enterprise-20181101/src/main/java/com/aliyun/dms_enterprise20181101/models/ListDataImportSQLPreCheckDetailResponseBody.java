// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataImportSQLPreCheckDetailResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PreCheckSQLDetailList")
    public java.util.List<ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList> preCheckSQLDetailList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDataImportSQLPreCheckDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataImportSQLPreCheckDetailResponseBody self = new ListDataImportSQLPreCheckDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataImportSQLPreCheckDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setPreCheckSQLDetailList(java.util.List<ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList> preCheckSQLDetailList) {
        this.preCheckSQLDetailList = preCheckSQLDetailList;
        return this;
    }
    public java.util.List<ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList> getPreCheckSQLDetailList() {
        return this.preCheckSQLDetailList;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataImportSQLPreCheckDetailResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList extends TeaModel {
        @NameInMap("Skip")
        public Boolean skip;

        @NameInMap("SqlId")
        public Long sqlId;

        @NameInMap("SqlType")
        public String sqlType;

        @NameInMap("StatusCode")
        public String statusCode;

        public static ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList self = new ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList();
            return TeaModel.build(map, self);
        }

        public ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList setSkip(Boolean skip) {
            this.skip = skip;
            return this;
        }
        public Boolean getSkip() {
            return this.skip;
        }

        public ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList setSqlId(Long sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public Long getSqlId() {
            return this.sqlId;
        }

        public ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList setSqlType(String sqlType) {
            this.sqlType = sqlType;
            return this;
        }
        public String getSqlType() {
            return this.sqlType;
        }

        public ListDataImportSQLPreCheckDetailResponseBodyPreCheckSQLDetailList setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

    }

}
