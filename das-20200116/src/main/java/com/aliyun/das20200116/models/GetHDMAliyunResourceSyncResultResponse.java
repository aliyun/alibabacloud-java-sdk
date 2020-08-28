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

    }

    public static class GetHDMAliyunResourceSyncResultResponseDataSubResults extends TeaModel {
        @NameInMap("ResourceSyncSubResult")
        @Validation(required = true)
        public java.util.List<GetHDMAliyunResourceSyncResultResponseDataSubResultsResourceSyncSubResult> resourceSyncSubResult;

        public static GetHDMAliyunResourceSyncResultResponseDataSubResults build(java.util.Map<String, ?> map) throws Exception {
            GetHDMAliyunResourceSyncResultResponseDataSubResults self = new GetHDMAliyunResourceSyncResultResponseDataSubResults();
            return TeaModel.build(map, self);
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

    }

}
