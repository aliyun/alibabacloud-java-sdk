// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAVerifyJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateOTAVerifyJobResponseData data;

    public static CreateOTAVerifyJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAVerifyJobResponse self = new CreateOTAVerifyJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateOTAVerifyJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOTAVerifyJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOTAVerifyJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOTAVerifyJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOTAVerifyJobResponse setData(CreateOTAVerifyJobResponseData data) {
        this.data = data;
        return this;
    }
    public CreateOTAVerifyJobResponseData getData() {
        return this.data;
    }

    public static class CreateOTAVerifyJobResponseData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        public static CreateOTAVerifyJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAVerifyJobResponseData self = new CreateOTAVerifyJobResponseData();
            return TeaModel.build(map, self);
        }

        public CreateOTAVerifyJobResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateOTAVerifyJobResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
