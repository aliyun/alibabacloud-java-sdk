// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAVerifyJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public CreateOTAVerifyJobResponseBodyData data;

    public static CreateOTAVerifyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAVerifyJobResponseBody self = new CreateOTAVerifyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOTAVerifyJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOTAVerifyJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOTAVerifyJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOTAVerifyJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOTAVerifyJobResponseBody setData(CreateOTAVerifyJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOTAVerifyJobResponseBodyData getData() {
        return this.data;
    }

    public static class CreateOTAVerifyJobResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        public static CreateOTAVerifyJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAVerifyJobResponseBodyData self = new CreateOTAVerifyJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOTAVerifyJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateOTAVerifyJobResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
