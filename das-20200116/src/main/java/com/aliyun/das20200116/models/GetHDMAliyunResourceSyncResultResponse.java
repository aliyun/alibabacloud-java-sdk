// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMAliyunResourceSyncResultResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Synchro")
    @Validation(required = true)
    public String synchro;

    @NameInMap("Data")
    @Validation(required = true)
    public GetHDMAliyunResourceSyncResultResponseData data;

    public static GetHDMAliyunResourceSyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHDMAliyunResourceSyncResultResponse self = new GetHDMAliyunResourceSyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetHDMAliyunResourceSyncResultResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHDMAliyunResourceSyncResultResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHDMAliyunResourceSyncResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHDMAliyunResourceSyncResultResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetHDMAliyunResourceSyncResultResponse setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public GetHDMAliyunResourceSyncResultResponse setData(GetHDMAliyunResourceSyncResultResponseData data) {
        this.data = data;
        return this;
    }
    public GetHDMAliyunResourceSyncResultResponseData getData() {
        return this.data;
    }

    public static class GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult extends TeaModel {
        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("SyncCount")
        @Validation(required = true)
        public Integer syncCount;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("ErrMsg")
        @Validation(required = true)
        public String errMsg;

        public static GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult build(java.util.Map<String, ?> map) throws Exception {
            GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult self = new GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult();
            return TeaModel.build(map, self);
        }

        public GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult setSyncCount(Integer syncCount) {
            this.syncCount = syncCount;
            return this;
        }
        public Integer getSyncCount() {
            return this.syncCount;
        }

        public GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class GetHDMAliyunResourceSyncResultResponseDataSubResults extends TeaModel {
        @NameInMap("ResourceSyncSubResult")
        @Validation(required = true)
        public java.util.List<GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult> resourceSyncSubResult;

        public static GetHDMAliyunResourceSyncResultResponseDataSubResults build(java.util.Map<String, ?> map) throws Exception {
            GetHDMAliyunResourceSyncResultResponseDataSubResults self = new GetHDMAliyunResourceSyncResultResponseDataSubResults();
            return TeaModel.build(map, self);
        }

        public GetHDMAliyunResourceSyncResultResponseDataSubResults setResourceSyncSubResult(java.util.List<GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult> resourceSyncSubResult) {
            this.resourceSyncSubResult = resourceSyncSubResult;
            return this;
        }
        public java.util.List<GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult> getResourceSyncSubResult() {
            return this.resourceSyncSubResult;
        }

    }

    public static class GetHDMAliyunResourceSyncResultResponseData extends TeaModel {
        @NameInMap("SyncStatus")
        @Validation(required = true)
        public String syncStatus;

        @NameInMap("ErrorMsg")
        @Validation(required = true)
        public String errorMsg;

        @NameInMap("Results")
        @Validation(required = true)
        public String results;

        @NameInMap("SubResults")
        @Validation(required = true)
        public GetHDMAliyunResourceSyncResultResponseDataSubResults subResults;

        public static GetHDMAliyunResourceSyncResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetHDMAliyunResourceSyncResultResponseData self = new GetHDMAliyunResourceSyncResultResponseData();
            return TeaModel.build(map, self);
        }

        public GetHDMAliyunResourceSyncResultResponseData setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public GetHDMAliyunResourceSyncResultResponseData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetHDMAliyunResourceSyncResultResponseData setResults(String results) {
            this.results = results;
            return this;
        }
        public String getResults() {
            return this.results;
        }

        public GetHDMAliyunResourceSyncResultResponseData setSubResults(GetHDMAliyunResourceSyncResultResponseDataSubResults subResults) {
            this.subResults = subResults;
            return this;
        }
        public GetHDMAliyunResourceSyncResultResponseDataSubResults getSubResults() {
            return this.subResults;
        }

    }

}
