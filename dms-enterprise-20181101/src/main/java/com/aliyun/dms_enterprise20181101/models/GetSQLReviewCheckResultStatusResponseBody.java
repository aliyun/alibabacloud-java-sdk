// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetSQLReviewCheckResultStatusResponseBody extends TeaModel {
    @NameInMap("CheckResultStatus")
    public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatus checkResultStatus;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CheckNotPass")
        public Long checkNotPass;

        @NameInMap("CheckPass")
        public Long checkPass;

        @NameInMap("ForceNotPass")
        public Long forceNotPass;

        @NameInMap("ForcePass")
        public Long forcePass;

        @NameInMap("New")
        public Long _new;

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
        @NameInMap("MustImprove")
        public Long mustImprove;

        @NameInMap("PotentialIssue")
        public Long potentialIssue;

        @NameInMap("SuggestImprove")
        public Long suggestImprove;

        @NameInMap("TableIndexSuggest")
        public Long tableIndexSuggest;

        @NameInMap("UseDmsDmlUnlock")
        public Long useDmsDmlUnlock;

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
        @NameInMap("CheckStatusResult")
        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusCheckStatusResult checkStatusResult;

        @NameInMap("CheckedCount")
        public Long checkedCount;

        @NameInMap("SQLReviewResult")
        public GetSQLReviewCheckResultStatusResponseBodyCheckResultStatusSQLReviewResult SQLReviewResult;

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
