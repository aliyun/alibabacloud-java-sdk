// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBusinessResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ListBusinessResponseBodyData data;

    public static ListBusinessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessResponseBody self = new ListBusinessResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBusinessResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBusinessResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListBusinessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBusinessResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListBusinessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListBusinessResponseBody setData(ListBusinessResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBusinessResponseBodyData getData() {
        return this.data;
    }

    public static class ListBusinessResponseBodyDataBusiness extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("Description")
        public String description;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("BusinessId")
        public Long businessId;

        @NameInMap("BusinessName")
        public String businessName;

        @NameInMap("UseType")
        public String useType;

        public static ListBusinessResponseBodyDataBusiness build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessResponseBodyDataBusiness self = new ListBusinessResponseBodyDataBusiness();
            return TeaModel.build(map, self);
        }

        public ListBusinessResponseBodyDataBusiness setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBusinessResponseBodyDataBusiness setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBusinessResponseBodyDataBusiness setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBusinessResponseBodyDataBusiness setBusinessId(Long businessId) {
            this.businessId = businessId;
            return this;
        }
        public Long getBusinessId() {
            return this.businessId;
        }

        public ListBusinessResponseBodyDataBusiness setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public ListBusinessResponseBodyDataBusiness setUseType(String useType) {
            this.useType = useType;
            return this;
        }
        public String getUseType() {
            return this.useType;
        }

    }

    public static class ListBusinessResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Business")
        public java.util.List<ListBusinessResponseBodyDataBusiness> business;

        public static ListBusinessResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessResponseBodyData self = new ListBusinessResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBusinessResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBusinessResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBusinessResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListBusinessResponseBodyData setBusiness(java.util.List<ListBusinessResponseBodyDataBusiness> business) {
            this.business = business;
            return this;
        }
        public java.util.List<ListBusinessResponseBodyDataBusiness> getBusiness() {
            return this.business;
        }

    }

}
