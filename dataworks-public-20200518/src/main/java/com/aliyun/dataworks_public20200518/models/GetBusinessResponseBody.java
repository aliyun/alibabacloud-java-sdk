// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBusinessResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetBusinessResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBusinessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessResponseBody self = new GetBusinessResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBusinessResponseBody setData(GetBusinessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBusinessResponseBodyData getData() {
        return this.data;
    }

    public GetBusinessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetBusinessResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetBusinessResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBusinessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBusinessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBusinessResponseBodyData extends TeaModel {
        @NameInMap("BusinessId")
        public Long businessId;

        @NameInMap("BusinessName")
        public String businessName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("UseType")
        public String useType;

        public static GetBusinessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBusinessResponseBodyData self = new GetBusinessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBusinessResponseBodyData setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public GetBusinessResponseBodyData setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public GetBusinessResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBusinessResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBusinessResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetBusinessResponseBodyData setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

}
