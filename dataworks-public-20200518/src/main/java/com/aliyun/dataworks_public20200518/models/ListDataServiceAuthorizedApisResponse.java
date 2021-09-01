// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceAuthorizedApisResponse extends TeaModel {
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
    public ListDataServiceAuthorizedApisResponseData data;

    public static ListDataServiceAuthorizedApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAuthorizedApisResponse self = new ListDataServiceAuthorizedApisResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAuthorizedApisResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceAuthorizedApisResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServiceAuthorizedApisResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceAuthorizedApisResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceAuthorizedApisResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDataServiceAuthorizedApisResponse setData(ListDataServiceAuthorizedApisResponseData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceAuthorizedApisResponseData getData() {
        return this.data;
    }

    public static class ListDataServiceAuthorizedApisResponseDataApiAuthorizedList extends TeaModel {
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

        @NameInMap("GrantCreatedTime")
        @Validation(required = true)
        public String grantCreatedTime;

        @NameInMap("GrantEndTime")
        @Validation(required = true)
        public String grantEndTime;

        @NameInMap("GrantOperatorId")
        @Validation(required = true)
        public String grantOperatorId;

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

        public static ListDataServiceAuthorizedApisResponseDataApiAuthorizedList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAuthorizedApisResponseDataApiAuthorizedList self = new ListDataServiceAuthorizedApisResponseDataApiAuthorizedList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setApiStatus(Integer apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public Integer getApiStatus() {
            return this.apiStatus;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setGrantCreatedTime(String grantCreatedTime) {
            this.grantCreatedTime = grantCreatedTime;
            return this;
        }
        public String getGrantCreatedTime() {
            return this.grantCreatedTime;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setGrantEndTime(String grantEndTime) {
            this.grantEndTime = grantEndTime;
            return this;
        }
        public String getGrantEndTime() {
            return this.grantEndTime;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setGrantOperatorId(String grantOperatorId) {
            this.grantOperatorId = grantOperatorId;
            return this;
        }
        public String getGrantOperatorId() {
            return this.grantOperatorId;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceAuthorizedApisResponseDataApiAuthorizedList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDataServiceAuthorizedApisResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("ApiAuthorizedList")
        @Validation(required = true)
        public java.util.List<ListDataServiceAuthorizedApisResponseDataApiAuthorizedList> apiAuthorizedList;

        public static ListDataServiceAuthorizedApisResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAuthorizedApisResponseData self = new ListDataServiceAuthorizedApisResponseData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAuthorizedApisResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceAuthorizedApisResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceAuthorizedApisResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListDataServiceAuthorizedApisResponseData setApiAuthorizedList(java.util.List<ListDataServiceAuthorizedApisResponseDataApiAuthorizedList> apiAuthorizedList) {
            this.apiAuthorizedList = apiAuthorizedList;
            return this;
        }
        public java.util.List<ListDataServiceAuthorizedApisResponseDataApiAuthorizedList> getApiAuthorizedList() {
            return this.apiAuthorizedList;
        }

    }

}
