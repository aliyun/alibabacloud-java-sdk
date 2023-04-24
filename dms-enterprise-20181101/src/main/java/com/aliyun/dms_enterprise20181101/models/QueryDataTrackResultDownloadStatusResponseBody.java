// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class QueryDataTrackResultDownloadStatusResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatusResult")
    public QueryDataTrackResultDownloadStatusResponseBodyStatusResult statusResult;

    @NameInMap("Success")
    public Boolean success;

    public static QueryDataTrackResultDownloadStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDataTrackResultDownloadStatusResponseBody self = new QueryDataTrackResultDownloadStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDataTrackResultDownloadStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryDataTrackResultDownloadStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDataTrackResultDownloadStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDataTrackResultDownloadStatusResponseBody setStatusResult(QueryDataTrackResultDownloadStatusResponseBodyStatusResult statusResult) {
        this.statusResult = statusResult;
        return this;
    }
    public QueryDataTrackResultDownloadStatusResponseBodyStatusResult getStatusResult() {
        return this.statusResult;
    }

    public QueryDataTrackResultDownloadStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDataTrackResultDownloadStatusResponseBodyStatusResult extends TeaModel {
        @NameInMap("DownloadStatus")
        public String downloadStatus;

        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryDataTrackResultDownloadStatusResponseBodyStatusResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDataTrackResultDownloadStatusResponseBodyStatusResult self = new QueryDataTrackResultDownloadStatusResponseBodyStatusResult();
            return TeaModel.build(map, self);
        }

        public QueryDataTrackResultDownloadStatusResponseBodyStatusResult setDownloadStatus(String downloadStatus) {
            this.downloadStatus = downloadStatus;
            return this;
        }
        public String getDownloadStatus() {
            return this.downloadStatus;
        }

        public QueryDataTrackResultDownloadStatusResponseBodyStatusResult setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public QueryDataTrackResultDownloadStatusResponseBodyStatusResult setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public QueryDataTrackResultDownloadStatusResponseBodyStatusResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
