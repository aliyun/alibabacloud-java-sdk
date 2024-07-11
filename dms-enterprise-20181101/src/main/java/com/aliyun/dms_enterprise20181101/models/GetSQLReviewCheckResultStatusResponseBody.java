// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewCheckResultStatusResponseBody extends TeaModel {
    /**
     * <p>The result of the SQL review.</p>
     */
    @NameInMap("CheckResultStatus")
    public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus checkResultStatus;

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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSQLReviewCheckResultStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSQLReviewCheckResultStatusResponseBody self = new GetSQLReviewCheckResultStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSQLReviewCheckResultStatusResponseBody setCheckResultStatus(GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus checkResultStatus) {
        this.checkResultStatus = checkResultStatus;
        return this;
    }
    public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus getCheckResultStatus() {
        return this.checkResultStatus;
    }

    public GetSQLReviewCheckResultStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSQLReviewCheckResultStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSQLReviewCheckResultStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSQLReviewCheckResultStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult extends TeaModel {
        /**
         * <p>The number of SQL statements that failed to pass the review.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckNotPass")
        public Long checkNotPass;

        /**
         * <p>The number of SQL statements that passed the review.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CheckPass")
        public Long checkPass;

        /**
         * <p>The number of SQL statements that failed to pass the manual review.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ForceNotPass")
        public Long forceNotPass;

        /**
         * <p>The number of SQL statements that passed the manual review.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ForcePass")
        public Long forcePass;

        /**
         * <p>The number of SQL statements to be reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("New")
        public Long _new;

        /**
         * <p>The number of abnormal SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Unknown")
        public Long unknown;

        public static GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult build(java.util.Map<String, ?> map) throws Exception {
            GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult self = new GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult();
            return TeaModel.build(map, self);
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult setCheckNotPass(Long checkNotPass) {
            this.checkNotPass = checkNotPass;
            return this;
        }
        public Long getCheckNotPass() {
            return this.checkNotPass;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult setCheckPass(Long checkPass) {
            this.checkPass = checkPass;
            return this;
        }
        public Long getCheckPass() {
            return this.checkPass;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult setForceNotPass(Long forceNotPass) {
            this.forceNotPass = forceNotPass;
            return this;
        }
        public Long getForceNotPass() {
            return this.forceNotPass;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult setForcePass(Long forcePass) {
            this.forcePass = forcePass;
            return this;
        }
        public Long getForcePass() {
            return this.forcePass;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult set_new(Long _new) {
            this._new = _new;
            return this;
        }
        public Long get_new() {
            return this._new;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult setUnknown(Long unknown) {
            this.unknown = unknown;
            return this;
        }
        public Long getUnknown() {
            return this.unknown;
        }

    }

    public static class GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult extends TeaModel {
        /**
         * <p>The number of SQL statements that must be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MustImprove")
        public Long mustImprove;

        /**
         * <p>The number of SQL statements that have potential issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PotentialIssue")
        public Long potentialIssue;

        /**
         * <p>The number of SQL statements that can be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SuggestImprove")
        public Long suggestImprove;

        /**
         * <p>The number of SQL statements that can use indexes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TableIndexSuggest")
        public Long tableIndexSuggest;

        /**
         * <p>The number of SQL statements that can be used for lock-free data changes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UseDmsDmlUnlock")
        public Long useDmsDmlUnlock;

        /**
         * <p>The number of SQL statements that can be used for lock-free schema changes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UseDmsToolkit")
        public Long useDmsToolkit;

        public static GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult build(java.util.Map<String, ?> map) throws Exception {
            GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult self = new GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult();
            return TeaModel.build(map, self);
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult setMustImprove(Long mustImprove) {
            this.mustImprove = mustImprove;
            return this;
        }
        public Long getMustImprove() {
            return this.mustImprove;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult setPotentialIssue(Long potentialIssue) {
            this.potentialIssue = potentialIssue;
            return this;
        }
        public Long getPotentialIssue() {
            return this.potentialIssue;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult setSuggestImprove(Long suggestImprove) {
            this.suggestImprove = suggestImprove;
            return this;
        }
        public Long getSuggestImprove() {
            return this.suggestImprove;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult setTableIndexSuggest(Long tableIndexSuggest) {
            this.tableIndexSuggest = tableIndexSuggest;
            return this;
        }
        public Long getTableIndexSuggest() {
            return this.tableIndexSuggest;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult setUseDmsDmlUnlock(Long useDmsDmlUnlock) {
            this.useDmsDmlUnlock = useDmsDmlUnlock;
            return this;
        }
        public Long getUseDmsDmlUnlock() {
            return this.useDmsDmlUnlock;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult setUseDmsToolkit(Long useDmsToolkit) {
            this.useDmsToolkit = useDmsToolkit;
            return this;
        }
        public Long getUseDmsToolkit() {
            return this.useDmsToolkit;
        }

    }

    public static class GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus extends TeaModel {
        /**
         * <p>The result of the SQL status check.</p>
         */
        @NameInMap("CheckStatusResult")
        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult checkStatusResult;

        /**
         * <p>The number of SQL statements that were reviewed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CheckedCount")
        public Long checkedCount;

        /**
         * <p>The optimization suggestion for SQL statements.</p>
         */
        @NameInMap("SQLReviewResult")
        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult SQLReviewResult;

        /**
         * <p>The total number of SQL statements.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalSQLCount")
        public Long totalSQLCount;

        public static GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus build(java.util.Map<String, ?> map) throws Exception {
            GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus self = new GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus();
            return TeaModel.build(map, self);
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus setCheckStatusResult(GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult checkStatusResult) {
            this.checkStatusResult = checkStatusResult;
            return this;
        }
        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult getCheckStatusResult() {
            return this.checkStatusResult;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus setCheckedCount(Long checkedCount) {
            this.checkedCount = checkedCount;
            return this;
        }
        public Long getCheckedCount() {
            return this.checkedCount;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus setSQLReviewResult(GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult SQLReviewResult) {
            this.SQLReviewResult = SQLReviewResult;
            return this;
        }
        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult getSQLReviewResult() {
            return this.SQLReviewResult;
        }

        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus setTotalSQLCount(Long totalSQLCount) {
            this.totalSQLCount = totalSQLCount;
            return this;
        }
        public Long getTotalSQLCount() {
            return this.totalSQLCount;
        }

    }

}
