// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateOTAStaticUpgradeJobResponse extends TeaModel {
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
    public CreateOTAStaticUpgradeJobResponseData data;

    public static CreateOTAStaticUpgradeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOTAStaticUpgradeJobResponse self = new CreateOTAStaticUpgradeJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateOTAStaticUpgradeJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOTAStaticUpgradeJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOTAStaticUpgradeJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOTAStaticUpgradeJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOTAStaticUpgradeJobResponse setData(CreateOTAStaticUpgradeJobResponseData data) {
        this.data = data;
        return this;
    }
    public CreateOTAStaticUpgradeJobResponseData getData() {
        return this.data;
    }

    public static class CreateOTAStaticUpgradeJobResponseData extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        public static CreateOTAStaticUpgradeJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateOTAStaticUpgradeJobResponseData self = new CreateOTAStaticUpgradeJobResponseData();
            return TeaModel.build(map, self);
        }

        public CreateOTAStaticUpgradeJobResponseData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateOTAStaticUpgradeJobResponseData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

}
