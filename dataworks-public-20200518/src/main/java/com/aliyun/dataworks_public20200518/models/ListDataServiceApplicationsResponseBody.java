// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApplicationsResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public ListDataServiceApplicationsResponseBodyData data;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApplicationsResponseBody self = new ListDataServiceApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApplicationsResponseBody setData(ListDataServiceApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceApplicationsResponseBodyData getData() {
        return this.data;
    }

    public ListDataServiceApplicationsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceApplicationsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public ListDataServiceApplicationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceApplicationsResponseBodyDataApplications extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("ApplicationId")
        public Long applicationId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ListDataServiceApplicationsResponseBodyDataApplications build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApplicationsResponseBodyDataApplications self = new ListDataServiceApplicationsResponseBodyDataApplications();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApplicationsResponseBodyDataApplications setApplicationId(Long applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public Long getApplicationId() {
            return this.applicationId;
        }

        public ListDataServiceApplicationsResponseBodyDataApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
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
        /**
         * <p>The basic information of the applications.</p>
         */
        @NameInMap("Applications")
        public java.util.List<ListDataServiceApplicationsResponseBodyDataApplications> applications;

        /**
         * <p>The page number of the returned page. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApplicationsResponseBodyData self = new ListDataServiceApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApplicationsResponseBodyData setApplications(java.util.List<ListDataServiceApplicationsResponseBodyDataApplications> applications) {
            this.applications = applications;
            return this;
        }
        public java.util.List<ListDataServiceApplicationsResponseBodyDataApplications> getApplications() {
            return this.applications;
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

    }

}
