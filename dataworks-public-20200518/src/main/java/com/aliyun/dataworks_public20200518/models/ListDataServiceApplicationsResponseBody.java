// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApplicationsResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Data")
    public ListDataServiceApplicationsResponseBodyData data;

    public static ListDataServiceApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApplicationsResponseBody self = new ListDataServiceApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApplicationsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApplicationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServiceApplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataServiceApplicationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceApplicationsResponseBody setData(ListDataServiceApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceApplicationsResponseBodyData getData() {
        return this.data;
    }

    public static class ListDataServiceApplicationsResponseBodyDataApplications extends TeaModel {
        @NameInMap("ApplicationName")
        public String applicationName;

        @NameInMap("ApplicationId")
        public Long applicationId;

        @NameInMap("ProjectId")
        public Long projectId;

        public static ListDataServiceApplicationsResponseBodyDataApplications build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApplicationsResponseBodyDataApplications self = new ListDataServiceApplicationsResponseBodyDataApplications();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApplicationsResponseBodyDataApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListDataServiceApplicationsResponseBodyDataApplications setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public ListDataServiceApplicationsResponseBodyDataApplications setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListDataServiceApplicationsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Applications")
        public java.util.List<ListDataServiceApplicationsResponseBodyDataApplications> applications;

        public static ListDataServiceApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApplicationsResponseBodyData self = new ListDataServiceApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApplicationsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceApplicationsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceApplicationsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceApplicationsResponseBodyData setApplications(java.util.List<ListDataServiceApplicationsResponseBodyDataApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListDataServiceApplicationsResponseBodyDataApplications> getApplications() {
            return this.applications;
        }

    }

}
