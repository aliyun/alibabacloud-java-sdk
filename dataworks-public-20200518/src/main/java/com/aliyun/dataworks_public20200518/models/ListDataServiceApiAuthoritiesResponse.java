// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiAuthoritiesResponse extends TeaModel {
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
    public ListDataServiceApiAuthoritiesResponseData data;

    public static ListDataServiceApiAuthoritiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiAuthoritiesResponse self = new ListDataServiceApiAuthoritiesResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiAuthoritiesResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceApiAuthoritiesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServiceApiAuthoritiesResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApiAuthoritiesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApiAuthoritiesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataServiceApiAuthoritiesResponse setData(ListDataServiceApiAuthoritiesResponseData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceApiAuthoritiesResponseData getData() {
        return this.data;
    }

    public static class ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords extends TeaModel {
        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        @NameInMap("CreatorId")
        @Validation(required = true)
        public String creatorId;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords self = new ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

    public static class ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList extends TeaModel {
        @NameInMap("ApiId")
        @Validation(required = true)
        public Long apiId;

        @NameInMap("ApiName")
        @Validation(required = true)
        public String apiName;

        @NameInMap("ApiPath")
        @Validation(required = true)
        public String apiPath;

        @NameInMap("ApiStatus")
        @Validation(required = true)
        public Integer apiStatus;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        @NameInMap("CreatorId")
        @Validation(required = true)
        public String creatorId;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public String modifiedTime;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("AuthorizationRecords")
        @Validation(required = true)
        public java.util.List<ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords> authorizationRecords;

        public static ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList self = new ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setApiStatus(Integer apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public Integer getApiStatus() {
            return this.apiStatus;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList setAuthorizationRecords(java.util.List<ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords> authorizationRecords) {
            this.authorizationRecords = authorizationRecords;
            return this;
        }
        public java.util.List<ListDataServiceApiAuthoritiesResponseDataApiAuthorizationListAuthorizationRecords> getAuthorizationRecords() {
            return this.authorizationRecords;
        }

    }

    public static class ListDataServiceApiAuthoritiesResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("ApiAuthorizationList")
        @Validation(required = true)
        public java.util.List<ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList> apiAuthorizationList;

        public static ListDataServiceApiAuthoritiesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiAuthoritiesResponseData self = new ListDataServiceApiAuthoritiesResponseData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiAuthoritiesResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceApiAuthoritiesResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceApiAuthoritiesResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceApiAuthoritiesResponseData setApiAuthorizationList(java.util.List<ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList> apiAuthorizationList) {
            this.apiAuthorizationList = apiAuthorizationList;
            return this;
        }
        public java.util.List<ListDataServiceApiAuthoritiesResponseDataApiAuthorizationList> getApiAuthorizationList() {
            return this.apiAuthorizationList;
        }

    }

}
