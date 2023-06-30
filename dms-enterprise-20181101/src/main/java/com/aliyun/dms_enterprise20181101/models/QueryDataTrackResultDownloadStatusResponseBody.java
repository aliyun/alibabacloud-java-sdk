// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class QueryDataTrackResultDownloadStatusResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the download progress.</p>
     */
    @NameInMap("StatusResult")
    public QueryDataTrackResultDownloadStatusResponseBodyStatusResult statusResult;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
        /**
         * <p>The status of the download task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The download task is being initialized.</p>
         * <p>*   **LISTING**: The download task is in a transient intermediate state during the initialization.</p>
         * <p>*   **DOWNLOADING**: The download task is being processed.</p>
         * <p>*   **DOWNLOAD_SUCCESS**: The download task was successfully processed.</p>
         * <p>*   **DOWNLOAD_FAIL**: The download task failed.</p>
         */
        @NameInMap("DownloadStatus")
        public String downloadStatus;

        /**
         * <p>The URL that is used to download data tracking logs. This parameter is returned only when the value of DownloadStatus is DOWNLOAD_SUCCESS.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The description of the state.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The total number of entries returned.</p>
         */
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
