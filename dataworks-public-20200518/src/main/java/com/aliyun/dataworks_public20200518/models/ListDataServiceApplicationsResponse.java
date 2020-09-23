// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApplicationsResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ListDataServiceApplicationsResponseData data;

    public static ListDataServiceApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApplicationsResponse self = new ListDataServiceApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApplicationsResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceApplicationsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServiceApplicationsResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApplicationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApplicationsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataServiceApplicationsResponse setData(ListDataServiceApplicationsResponseData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceApplicationsResponseData getData() {
        return this.data;
    }

    public static class ListDataServiceApplicationsResponseDataApplications extends TeaModel {
        @NameInMap("ApplicationId")
        @Validation(required = true)
        public Long applicationId;

        @NameInMap("ApplicationName")
        @Validation(required = true)
        public String applicationName;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static ListDataServiceApplicationsResponseDataApplications build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApplicationsResponseDataApplications self = new ListDataServiceApplicationsResponseDataApplications();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApplicationsResponseDataApplications setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public ListDataServiceApplicationsResponseDataApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListDataServiceApplicationsResponseDataApplications setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListDataServiceApplicationsResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Applications")
        @Validation(required = true)
        public java.util.List<ListDataServiceApplicationsResponseDataApplications> applications;

        public static ListDataServiceApplicationsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApplicationsResponseData self = new ListDataServiceApplicationsResponseData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApplicationsResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceApplicationsResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceApplicationsResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceApplicationsResponseData setApplications(java.util.List<ListDataServiceApplicationsResponseDataApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListDataServiceApplicationsResponseDataApplications> getApplications() {
            return this.applications;
        }

    }

}
