// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateLocalFileUploadJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateLocalFileUploadJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateLocalFileUploadJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLocalFileUploadJobResponseBody self = new CreateLocalFileUploadJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLocalFileUploadJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateLocalFileUploadJobResponseBody setData(CreateLocalFileUploadJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLocalFileUploadJobResponseBodyData getData() {
        return this.data;
    }

    public CreateLocalFileUploadJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLocalFileUploadJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLocalFileUploadJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateLocalFileUploadJobResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static CreateLocalFileUploadJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLocalFileUploadJobResponseBodyData self = new CreateLocalFileUploadJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLocalFileUploadJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
