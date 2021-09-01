// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBusinessResponse extends TeaModel {
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
    public ListBusinessResponseData data;

    public static ListBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessResponse self = new ListBusinessResponse();
        return TeaModel.build(map, self);
    }

    public ListBusinessResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBusinessResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListBusinessResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListBusinessResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListBusinessResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBusinessResponse setData(ListBusinessResponseData data) {
        this.data = data;
        return this;
    }
    public ListBusinessResponseData getData() {
        return this.data;
    }

    public static class ListBusinessResponseDataBusiness extends TeaModel {
        @NameInMap("BusinessId")
        @Validation(required = true)
        public Long businessId;

        @NameInMap("BusinessName")
        @Validation(required = true)
        public String businessName;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        public static ListBusinessResponseDataBusiness build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessResponseDataBusiness self = new ListBusinessResponseDataBusiness();
            return TeaModel.build(map, self);
        }

        public ListBusinessResponseDataBusiness setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public ListBusinessResponseDataBusiness setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public ListBusinessResponseDataBusiness setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBusinessResponseDataBusiness setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBusinessResponseDataBusiness setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBusinessResponseDataBusiness setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class ListBusinessResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Business")
        @Validation(required = true)
        public java.util.List<ListBusinessResponseDataBusiness> business;

        public static ListBusinessResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessResponseData self = new ListBusinessResponseData();
            return TeaModel.build(map, self);
        }

        public ListBusinessResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBusinessResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBusinessResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListBusinessResponseData setBusiness(java.util.List<ListBusinessResponseDataBusiness> business) {
            this.business = business;
            return this;
        }
        public java.util.List<ListBusinessResponseDataBusiness> getBusiness() {
            return this.business;
        }

    }

}
