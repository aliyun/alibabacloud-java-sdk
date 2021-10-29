// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMAliyunResourceSyncResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetHDMAliyunResourceSyncResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Synchro")
    public String synchro;

    public static GetHDMAliyunResourceSyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHDMAliyunResourceSyncResultResponseBody self = new GetHDMAliyunResourceSyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHDMAliyunResourceSyncResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHDMAliyunResourceSyncResultResponseBody setData(GetHDMAliyunResourceSyncResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHDMAliyunResourceSyncResultResponseBodyData getData() {
        return this.data;
    }

    public GetHDMAliyunResourceSyncResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHDMAliyunResourceSyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHDMAliyunResourceSyncResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetHDMAliyunResourceSyncResultResponseBody setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public static class GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("SyncCount")
        public Integer syncCount;

        public static GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult build(java.util.Map<String, ?> map) throws Exception {
            GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult self = new GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult();
            return TeaModel.build(map, self);
        }

        public GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult setSyncCount(Integer syncCount) {
            this.syncCount = syncCount;
            return this;
        }
        public Integer getSyncCount() {
            return this.syncCount;
        }

    }

    public static class GetHDMAliyunResourceSyncResultResponseBodyDataSubResults extends TeaModel {
        @NameInMap("ResourceSyncSubResult")
        public java.util.List<GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult> resourceSyncSubResult;

        public static GetHDMAliyunResourceSyncResultResponseBodyDataSubResults build(java.util.Map<String, ?> map) throws Exception {
            GetHDMAliyunResourceSyncResultResponseBodyDataSubResults self = new GetHDMAliyunResourceSyncResultResponseBodyDataSubResults();
            return TeaModel.build(map, self);
        }

        public GetHDMAliyunResourceSyncResultResponseBodyDataSubResults setResourceSyncSubResult(java.util.List<GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult> resourceSyncSubResult) {
            this.resourceSyncSubResult = resourceSyncSubResult;
            return this;
        }
        public java.util.List<GetHDMAliyunResourceSyncResultResponseBodyDataSubResultsResourceSyncSubResult> getResourceSyncSubResult() {
            return this.resourceSyncSubResult;
        }

    }

    public static class GetHDMAliyunResourceSyncResultResponseBodyData extends TeaModel {
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Results")
        public String results;

        @NameInMap("SubResults")
        public GetHDMAliyunResourceSyncResultResponseBodyDataSubResults subResults;

        @NameInMap("SyncStatus")
        public String syncStatus;

        public static GetHDMAliyunResourceSyncResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHDMAliyunResourceSyncResultResponseBodyData self = new GetHDMAliyunResourceSyncResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHDMAliyunResourceSyncResultResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetHDMAliyunResourceSyncResultResponseBodyData setResults(String results) {
            this.results = results;
            return this;
        }
        public String getResults() {
            return this.results;
        }

        public GetHDMAliyunResourceSyncResultResponseBodyData setSubResults(GetHDMAliyunResourceSyncResultResponseBodyDataSubResults subResults) {
            this.subResults = subResults;
            return this;
        }
        public GetHDMAliyunResourceSyncResultResponseBodyDataSubResults getSubResults() {
            return this.subResults;
        }

        public GetHDMAliyunResourceSyncResultResponseBodyData setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

    }

}
