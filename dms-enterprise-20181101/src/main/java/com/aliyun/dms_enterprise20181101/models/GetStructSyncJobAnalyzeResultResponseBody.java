// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetStructSyncJobAnalyzeResultResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("StructSyncJobAnalyzeResult")
    public GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResult structSyncJobAnalyzeResult;

    public static GetStructSyncJobAnalyzeResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStructSyncJobAnalyzeResultResponseBody self = new GetStructSyncJobAnalyzeResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStructSyncJobAnalyzeResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStructSyncJobAnalyzeResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetStructSyncJobAnalyzeResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetStructSyncJobAnalyzeResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetStructSyncJobAnalyzeResultResponseBody setStructSyncJobAnalyzeResult(GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResult structSyncJobAnalyzeResult) {
        this.structSyncJobAnalyzeResult = structSyncJobAnalyzeResult;
        return this;
    }
    public GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResult getStructSyncJobAnalyzeResult() {
        return this.structSyncJobAnalyzeResult;
    }

    public static class GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultSummaryList extends TeaModel {
        @NameInMap("CompareType")
        public String compareType;

        @NameInMap("Count")
        public Long count;

        public static GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultSummaryList build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultSummaryList self = new GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultSummaryList();
            return TeaModel.build(map, self);
        }

        public GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultSummaryList setCompareType(String compareType) {
            this.compareType = compareType;
            return this;
        }
        public String getCompareType() {
            return this.compareType;
        }

        public GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultSummaryList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList extends TeaModel {
        @NameInMap("SourceTableName")
        public String sourceTableName;

        @NameInMap("TargetTableName")
        public String targetTableName;

        @NameInMap("Script")
        public String script;

        public static GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList self = new GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList();
            return TeaModel.build(map, self);
        }

        public GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResult extends TeaModel {
        @NameInMap("SummaryList")
        public java.util.List<GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultSummaryList> summaryList;

        @NameInMap("ResultList")
        public java.util.List<GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList> resultList;

        public static GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResult build(java.util.Map<String, ?> map) throws Exception {
            GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResult self = new GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResult();
            return TeaModel.build(map, self);
        }

        public GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResult setSummaryList(java.util.List<GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultSummaryList> summaryList) {
            this.summaryList = summaryList;
            return this;
        }
        public java.util.List<GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultSummaryList> getSummaryList() {
            return this.summaryList;
        }

        public GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResult setResultList(java.util.List<GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList> resultList) {
            this.resultList = resultList;
            return this;
        }
        public java.util.List<GetStructSyncJobAnalyzeResultResponseBodyStructSyncJobAnalyzeResultResultList> getResultList() {
            return this.resultList;
        }

    }

}
