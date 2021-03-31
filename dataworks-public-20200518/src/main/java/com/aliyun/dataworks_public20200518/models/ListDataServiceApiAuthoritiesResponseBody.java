// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiAuthoritiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ListDataServiceApiAuthoritiesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceApiAuthoritiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiAuthoritiesResponseBody self = new ListDataServiceApiAuthoritiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiAuthoritiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApiAuthoritiesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApiAuthoritiesResponseBody setData(ListDataServiceApiAuthoritiesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceApiAuthoritiesResponseBodyData getData() {
        return this.data;
    }

    public ListDataServiceApiAuthoritiesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceApiAuthoritiesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServiceApiAuthoritiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatedTime")
        public String createdTime;

        public static ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords self = new ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

    }

    public static class ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList extends TeaModel {
        @NameInMap("ApiStatus")
        public Integer apiStatus;

        @NameInMap("ApiId")
        public Long apiId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("ApiPath")
        public String apiPath;

        @NameInMap("AuthorizationRecords")
        public java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords> authorizationRecords;

        public static ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList self = new ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setApiStatus(Integer apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public Integer getApiStatus() {
            return this.apiStatus;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setAuthorizationRecords(java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords> authorizationRecords) {
            this.authorizationRecords = authorizationRecords;
            return this;
        }
        public java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords> getAuthorizationRecords() {
            return this.authorizationRecords;
        }

    }

    public static class ListDataServiceApiAuthoritiesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("ApiAuthorizationList")
        public java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList> apiAuthorizationList;

        public static ListDataServiceApiAuthoritiesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiAuthoritiesResponseBodyData self = new ListDataServiceApiAuthoritiesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiAuthoritiesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceApiAuthoritiesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceApiAuthoritiesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceApiAuthoritiesResponseBodyData setApiAuthorizationList(java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList> apiAuthorizationList) {
            this.apiAuthorizationList = apiAuthorizationList;
            return this;
        }
        public java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList> getApiAuthorizationList() {
            return this.apiAuthorizationList;
        }

    }

}
