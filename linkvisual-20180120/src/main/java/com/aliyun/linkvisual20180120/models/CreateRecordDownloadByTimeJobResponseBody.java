// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRecordDownloadByTimeJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateRecordDownloadByTimeJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateRecordDownloadByTimeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordDownloadByTimeJobResponseBody self = new CreateRecordDownloadByTimeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecordDownloadByTimeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRecordDownloadByTimeJobResponseBody setData(CreateRecordDownloadByTimeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateRecordDownloadByTimeJobResponseBodyData getData() {
        return this.data;
    }

    public CreateRecordDownloadByTimeJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateRecordDownloadByTimeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRecordDownloadByTimeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateRecordDownloadByTimeJobResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static CreateRecordDownloadByTimeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateRecordDownloadByTimeJobResponseBodyData self = new CreateRecordDownloadByTimeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateRecordDownloadByTimeJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
