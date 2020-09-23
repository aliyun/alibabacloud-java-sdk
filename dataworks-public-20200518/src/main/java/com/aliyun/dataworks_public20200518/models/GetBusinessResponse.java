// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBusinessResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public GetBusinessResponseData data;

    public static GetBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessResponse self = new GetBusinessResponse();
        return TeaModel.build(map, self);
    }

    public GetBusinessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBusinessResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBusinessResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBusinessResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBusinessResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBusinessResponse setData(GetBusinessResponseData data) {
        this.data = data;
        return this;
    }
    public GetBusinessResponseData getData() {
        return this.data;
    }

    public static class GetBusinessResponseData extends TeaModel {
        @NameInMap("BusinessId")
        @Validation(required = true)
        public Long businessId;

        @NameInMap("BusinessName")
        @Validation(required = true)
        public String businessName;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        public static GetBusinessResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetBusinessResponseData self = new GetBusinessResponseData();
            return TeaModel.build(map, self);
        }

        public GetBusinessResponseData setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetBusinessResponseData setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public GetBusinessResponseData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetBusinessResponseData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBusinessResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBusinessResponseData setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

}
