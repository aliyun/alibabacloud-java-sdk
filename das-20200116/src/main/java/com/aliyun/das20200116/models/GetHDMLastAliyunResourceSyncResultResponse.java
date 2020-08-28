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

    }

    public static class GetHDMLastAliyunResourceSyncResultResponseDataSubResults extends TeaModel {
        @NameInMap("ResourceSyncSubResult")
        @Validation(required = true)
        public java.util.List<GetHDMLastAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult> resourceSyncSubResult;

        public static GetHDMLastAliyunResourceSyncResultResponseDataSubResults build(java.util.Map<String, ?> map) throws Exception {
            GetHDMLastAliyunResourceSyncResultResponseDataSubResults self = new GetHDMLastAliyunResourceSyncResultResponseDataSubResults();
            return TeaModel.build(map, self);
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

    }

}
