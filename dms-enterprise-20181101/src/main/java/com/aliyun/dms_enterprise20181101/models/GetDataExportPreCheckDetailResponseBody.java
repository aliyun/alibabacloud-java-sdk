// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataExportPreCheckDetailResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates the result of the precheck task.</p>
     */
    @NameInMap("PreCheckResult")
    public GetDataExportPreCheckDetailResponseBodyPreCheckResult preCheckResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataExportPreCheckDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataExportPreCheckDetailResponseBody self = new GetDataExportPreCheckDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataExportPreCheckDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataExportPreCheckDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataExportPreCheckDetailResponseBody setPreCheckResult(GetDataExportPreCheckDetailResponseBodyPreCheckResult preCheckResult) {
        this.preCheckResult = preCheckResult;
        return this;
    }
    public GetDataExportPreCheckDetailResponseBodyPreCheckResult getPreCheckResult() {
        return this.preCheckResult;
    }

    public GetDataExportPreCheckDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataExportPreCheckDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailListPreCheckDetailList extends TeaModel {
        /**
         * <p>The estimated number of data rows to be affected.</p>
         */
        @NameInMap("AffectRows")
        public Long affectRows;

        /**
         * <p>The SQL statement.</p>
         */
        @NameInMap("SQL")
        public String SQL;

        public static GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailListPreCheckDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailListPreCheckDetailList self = new GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailListPreCheckDetailList();
            return TeaModel.build(map, self);
        }

        public GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailListPreCheckDetailList setAffectRows(Long affectRows) {
            this.affectRows = affectRows;
            return this;
        }
        public Long getAffectRows() {
            return this.affectRows;
        }

        public GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailListPreCheckDetailList setSQL(String SQL) {
            this.SQL = SQL;
            return this;
        }
        public String getSQL() {
            return this.SQL;
        }

    }

    public static class GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailList extends TeaModel {
        @NameInMap("PreCheckDetailList")
        public java.util.List<GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailListPreCheckDetailList> preCheckDetailList;

        public static GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailList self = new GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailList();
            return TeaModel.build(map, self);
        }

        public GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailList setPreCheckDetailList(java.util.List<GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailListPreCheckDetailList> preCheckDetailList) {
            this.preCheckDetailList = preCheckDetailList;
            return this;
        }
        public java.util.List<GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailListPreCheckDetailList> getPreCheckDetailList() {
            return this.preCheckDetailList;
        }

    }

    public static class GetDataExportPreCheckDetailResponseBodyPreCheckResult extends TeaModel {
        /**
         * <p>Specifies whether to skip verification. Valid values:</p>
         * <br>
         * <p>- true</p>
         * <p>- false</p>
         */
        @NameInMap("IgnoreAffectRows")
        public Boolean ignoreAffectRows;

        /**
         * <p>The list of pre-check details.</p>
         */
        @NameInMap("PreCheckDetailList")
        public GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailList preCheckDetailList;

        public static GetDataExportPreCheckDetailResponseBodyPreCheckResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataExportPreCheckDetailResponseBodyPreCheckResult self = new GetDataExportPreCheckDetailResponseBodyPreCheckResult();
            return TeaModel.build(map, self);
        }

        public GetDataExportPreCheckDetailResponseBodyPreCheckResult setIgnoreAffectRows(Boolean ignoreAffectRows) {
            this.ignoreAffectRows = ignoreAffectRows;
            return this;
        }
        public Boolean getIgnoreAffectRows() {
            return this.ignoreAffectRows;
        }

        public GetDataExportPreCheckDetailResponseBodyPreCheckResult setPreCheckDetailList(GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailList preCheckDetailList) {
            this.preCheckDetailList = preCheckDetailList;
            return this;
        }
        public GetDataExportPreCheckDetailResponseBodyPreCheckResultPreCheckDetailList getPreCheckDetailList() {
            return this.preCheckDetailList;
        }

    }

}
