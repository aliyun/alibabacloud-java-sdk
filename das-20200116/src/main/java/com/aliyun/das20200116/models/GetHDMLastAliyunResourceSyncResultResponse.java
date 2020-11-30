// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMLastAliyunResourceSyncResultResponse extends TeaModel {
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
    public GetHDMLastAliyunResourceSyncResultResponseData data;

    public static GetHDMLastAliyunResourceSyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHDMLastAliyunResourceSyncResultResponse self = new GetHDMLastAliyunResourceSyncResultResponse();
        return TeaModel.build(map, self);
    }

    public GetHDMLastAliyunResourceSyncResultResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHDMLastAliyunResourceSyncResultResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHDMLastAliyunResourceSyncResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHDMLastAliyunResourceSyncResultResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetHDMLastAliyunResourceSyncResultResponse setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public GetHDMLastAliyunResourceSyncResultResponse setData(GetHDMLastAliyunResourceSyncResultResponseData data) {
        this.data = data;
        return this;
    }
    public GetHDMLastAliyunResourceSyncResultResponseData getData() {
        return this.data;
    }

    public static class GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult extends TeaModel {
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

        public static GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult build(java.util.Map<String, ?> map) throws Exception {
            GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult self = new GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult();
            return TeaModel.build(map, self);
        }

        public GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult setSyncCount(Integer syncCount) {
            this.syncCount = syncCount;
            return this;
        }
        public Integer getSyncCount() {
            return this.syncCount;
        }

        public GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class GetHDMLastAliyunResourceSyncResultResponseDataSubResults extends TeaModel {
        @NameInMap("ResourceSyncSubResult")
        @Validation(required = true)
        public java.util.List<GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult> resourceSyncSubResult;

        public static GetHDMLastAliyunResourceSyncResultResponseDataSubResults build(java.util.Map<String, ?> map) throws Exception {
            GetHDMLastAliyunResourceSyncResultResponseDataSubResults self = new GetHDMLastAliyunResourceSyncResultResponseDataSubResults();
            return TeaModel.build(map, self);
        }

        public GetHDMLastAliyunResourceSyncResultResponseDataSubResults setResourceSyncSubResult(java.util.List<GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult> resourceSyncSubResult) {
            this.resourceSyncSubResult = resourceSyncSubResult;
            return this;
        }
        public java.util.List<GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult> getResourceSyncSubResult() {
            return this.resourceSyncSubResult;
        }

    }

    public static class GetHDMLastAliyunResourceSyncResultResponseData extends TeaModel {
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
        public GetHDMLastAliyunResourceSyncResultResponseDataSubResults subResults;

        public static GetHDMLastAliyunResourceSyncResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetHDMLastAliyunResourceSyncResultResponseData self = new GetHDMLastAliyunResourceSyncResultResponseData();
            return TeaModel.build(map, self);
        }

        public GetHDMLastAliyunResourceSyncResultResponseData setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public GetHDMLastAliyunResourceSyncResultResponseData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetHDMLastAliyunResourceSyncResultResponseData setResults(String results) {
            this.results = results;
            return this;
        }
        public String getResults() {
            return this.results;
        }

        public GetHDMLastAliyunResourceSyncResultResponseData setSubResults(GetHDMLastAliyunResourceSyncResultResponseDataSubResults subResults) {
            this.subResults = subResults;
            return this;
        }
        public GetHDMLastAliyunResourceSyncResultResponseDataSubResults getSubResults() {
            return this.subResults;
        }

    }

}
