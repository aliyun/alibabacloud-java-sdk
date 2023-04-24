// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataTrackJobDegreeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("JobDegree")
    public GetDataTrackJobDegreeResponseBodyJobDegree jobDegree;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DownloadCompletionDegree")
        public Double downloadCompletionDegree;

        @NameInMap("FilterCompletionDegree")
        public Double filterCompletionDegree;

        @NameInMap("JobStatus")
        public String jobStatus;

        @NameInMap("ListCompletionDegree")
        public Double listCompletionDegree;

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
