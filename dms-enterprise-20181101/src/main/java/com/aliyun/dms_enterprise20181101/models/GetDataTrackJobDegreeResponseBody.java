// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackJobDegreeResponseBody extends TeaModel {
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
     * <p>The progress details of the data tracking task.</p>
     */
    @NameInMap("JobDegree")
    public GetDataTrackJobDegreeResponseBodyJobDegree jobDegree;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataTrackJobDegreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataTrackJobDegreeResponseBody self = new GetDataTrackJobDegreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataTrackJobDegreeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataTrackJobDegreeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataTrackJobDegreeResponseBody setJobDegree(GetDataTrackJobDegreeResponseBodyJobDegree jobDegree) {
        this.jobDegree = jobDegree;
        return this;
    }
    public GetDataTrackJobDegreeResponseBodyJobDegree getJobDegree() {
        return this.jobDegree;
    }

    public GetDataTrackJobDegreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataTrackJobDegreeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataTrackJobDegreeResponseBodyJobDegree extends TeaModel {
        /**
         * <p>The progress of binary log download. Valid values: 0 to 1. A value of 1 indicates that binary log download is complete.</p>
         */
        @NameInMap("DownloadCompletionDegree")
        public Double downloadCompletionDegree;

        /**
         * <p>The progress of binary log parsing. Valid values: 0 to 1. A value of 1 indicates that binary log parsing is complete.</p>
         */
        @NameInMap("FilterCompletionDegree")
        public Double filterCompletionDegree;

        /**
         * <p>The status of the data tracking task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is being initialized.</p>
         * <p>*   **LISTING**: The binary logs are being obtained.</p>
         * <p>*   **LIST_SUCCESS**: The binary logs are successfully obtained.</p>
         * <p>*   **DOWNLOADING**: The binary logs are being downloaded.</p>
         * <p>*   **DOWNLOAD_FAIL**: The binary logs failed to be downloaded.</p>
         * <p>*   **DOWNLOAD_SUCCESS**: The binary logs are successfully downloaded.</p>
         * <p>*   **FILTERING**: The binary logs are being parsed.</p>
         * <p>*   **FILTER_FAIL**: The binary logs failed to be parsed.</p>
         * <p>*   **FILTER_SUCCESS**: The binary logs are successfully parsed.</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The progress of binary log obtaining. Valid values: 0 to 1. A value of 1 indicates that binary log obtaining is complete.</p>
         */
        @NameInMap("ListCompletionDegree")
        public Double listCompletionDegree;

        /**
         * <p>The description of the task status.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        public static GetDataTrackJobDegreeResponseBodyJobDegree build(java.util.Map<String, ?> map) throws Exception {
            GetDataTrackJobDegreeResponseBodyJobDegree self = new GetDataTrackJobDegreeResponseBodyJobDegree();
            return TeaModel.build(map, self);
        }

        public GetDataTrackJobDegreeResponseBodyJobDegree setDownloadCompletionDegree(Double downloadCompletionDegree) {
            this.downloadCompletionDegree = downloadCompletionDegree;
            return this;
        }
        public Double getDownloadCompletionDegree() {
            return this.downloadCompletionDegree;
        }

        public GetDataTrackJobDegreeResponseBodyJobDegree setFilterCompletionDegree(Double filterCompletionDegree) {
            this.filterCompletionDegree = filterCompletionDegree;
            return this;
        }
        public Double getFilterCompletionDegree() {
            return this.filterCompletionDegree;
        }

        public GetDataTrackJobDegreeResponseBodyJobDegree setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public GetDataTrackJobDegreeResponseBodyJobDegree setListCompletionDegree(Double listCompletionDegree) {
            this.listCompletionDegree = listCompletionDegree;
            return this;
        }
        public Double getListCompletionDegree() {
            return this.listCompletionDegree;
        }

        public GetDataTrackJobDegreeResponseBodyJobDegree setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

}
