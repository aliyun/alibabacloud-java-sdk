// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateLocalRecordDownloadByTimeJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateLocalRecordDownloadByTimeJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateLocalRecordDownloadByTimeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLocalRecordDownloadByTimeJobResponseBody self = new CreateLocalRecordDownloadByTimeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLocalRecordDownloadByTimeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLocalRecordDownloadByTimeJobResponseBody setData(CreateLocalRecordDownloadByTimeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLocalRecordDownloadByTimeJobResponseBodyData getData() {
        return this.data;
    }

    public CreateLocalRecordDownloadByTimeJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLocalRecordDownloadByTimeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLocalRecordDownloadByTimeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateLocalRecordDownloadByTimeJobResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static CreateLocalRecordDownloadByTimeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLocalRecordDownloadByTimeJobResponseBodyData self = new CreateLocalRecordDownloadByTimeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLocalRecordDownloadByTimeJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
