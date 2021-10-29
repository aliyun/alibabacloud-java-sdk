// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMLastAliyunResourceSyncResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHDMLastAliyunResourceSyncResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Synchro")
    public String synchro;

    public static GetHDMLastAliyunResourceSyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHDMLastAliyunResourceSyncResultResponseBody self = new GetHDMLastAliyunResourceSyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHDMLastAliyunResourceSyncResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHDMLastAliyunResourceSyncResultResponseBody setData(GetHDMLastAliyunResourceSyncResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHDMLastAliyunResourceSyncResultResponseBodyData getData() {
        return this.data;
    }

    public GetHDMLastAliyunResourceSyncResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHDMLastAliyunResourceSyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHDMLastAliyunResourceSyncResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetHDMLastAliyunResourceSyncResultResponseBody setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public static class GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("SyncCount")
        public Integer syncCount;

        public static GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult build(java.util.Map<String, ?> map) throws Exception {
            GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult self = new GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult();
            return TeaModel.build(map, self);
        }

        public GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult setSyncCount(Integer syncCount) {
            this.syncCount = syncCount;
            return this;
        }
        public Integer getSyncCount() {
            return this.syncCount;
        }

    }

    public static class GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResults extends TeaModel {
        @NameInMap("ResourceSyncSubResult")
        public java.util.List<GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult> resourceSyncSubResult;

        public static GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResults build(java.util.Map<String, ?> map) throws Exception {
            GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResults self = new GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResults();
            return TeaModel.build(map, self);
        }

        public GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResults setResourceSyncSubResult(java.util.List<GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult> resourceSyncSubResult) {
            this.resourceSyncSubResult = resourceSyncSubResult;
            return this;
        }
        public java.util.List<GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult> getResourceSyncSubResult() {
            return this.resourceSyncSubResult;
        }

    }

    public static class GetHDMLastAliyunResourceSyncResultResponseBodyData extends TeaModel {
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Results")
        public String results;

        @NameInMap("SubResults")
        public GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResults subResults;

        @NameInMap("SyncStatus")
        public String syncStatus;

        public static GetHDMLastAliyunResourceSyncResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHDMLastAliyunResourceSyncResultResponseBodyData self = new GetHDMLastAliyunResourceSyncResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHDMLastAliyunResourceSyncResultResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetHDMLastAliyunResourceSyncResultResponseBodyData setResults(String results) {
            this.results = results;
            return this;
        }
        public String getResults() {
            return this.results;
        }

        public GetHDMLastAliyunResourceSyncResultResponseBodyData setSubResults(GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResults subResults) {
            this.subResults = subResults;
            return this;
        }
        public GetHDMLastAliyunResourceSyncResultResponseBodyDataSubResults getSubResults() {
            return this.subResults;
        }

        public GetHDMLastAliyunResourceSyncResultResponseBodyData setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

    }

}
