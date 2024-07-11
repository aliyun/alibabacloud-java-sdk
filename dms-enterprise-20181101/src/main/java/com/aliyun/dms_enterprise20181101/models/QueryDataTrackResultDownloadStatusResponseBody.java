// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class QueryDataTrackResultDownloadStatusResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
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
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <ul>
         * <li><strong>INIT</strong>: The download task is being initialized.</li>
         * <li><strong>LISTING</strong>: The download task is in a transient intermediate state during the initialization.</li>
         * <li><strong>DOWNLOADING</strong>: The download task is being processed.</li>
         * <li><strong>DOWNLOAD_SUCCESS</strong>: The download task was successfully processed.</li>
         * <li><strong>DOWNLOAD_FAIL</strong>: The download task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DOWNLOAD_SUCCESS</p>
         */
        @NameInMap("DownloadStatus")
        public String downloadStatus;

        /**
         * <p>The URL that is used to download data tracking logs. This parameter is returned only when the value of DownloadStatus is DOWNLOAD_SUCCESS.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://idbsaasstore.oss-cn-zhangjiakou.aliyuncs.com/****_REDO_31201_207.zip?Expires=1682239593&OSSAccessKeyId=****&Signature=">https://idbsaasstore.oss-cn-zhangjiakou.aliyuncs.com/****_REDO_31201_207.zip?Expires=1682239593&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The description of the state.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
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
