// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceAuthorizedApisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public ListDataServiceAuthorizedApisResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceAuthorizedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAuthorizedApisResponseBody self = new ListDataServiceAuthorizedApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAuthorizedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceAuthorizedApisResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceAuthorizedApisResponseBody setData(ListDataServiceAuthorizedApisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDataServiceAuthorizedApisResponseBodyData getData() {
        return this.data;
    }

    public ListDataServiceAuthorizedApisResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataServiceAuthorizedApisResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataServiceAuthorizedApisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList extends TeaModel {
        @NameInMap("ApiStatus")
        public Integer apiStatus;

        @NameInMap("ApiId")
        public Long apiId;

        @NameInMap("GrantOperatorId")
        public String grantOperatorId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("GrantEndTime")
        public String grantEndTime;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GrantCreatedTime")
        public String grantCreatedTime;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("ApiPath")
        public String apiPath;

        public static ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList self = new ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setApiStatus(Integer apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public Integer getApiStatus() {
            return this.apiStatus;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setGrantOperatorId(String grantOperatorId) {
            this.grantOperatorId = grantOperatorId;
            return this;
        }
        public String getGrantOperatorId() {
            return this.grantOperatorId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setGrantEndTime(String grantEndTime) {
            this.grantEndTime = grantEndTime;
            return this;
        }
        public String getGrantEndTime() {
            return this.grantEndTime;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setGrantCreatedTime(String grantCreatedTime) {
            this.grantCreatedTime = grantCreatedTime;
            return this;
        }
        public String getGrantCreatedTime() {
            return this.grantCreatedTime;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

    }

    public static class ListDataServiceAuthorizedApisResponseBodyData extends TeaModel {
        @NameInMap("ApiAuthorizedList")
        public java.util.List<ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList> apiAuthorizedList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceAuthorizedApisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAuthorizedApisResponseBodyData self = new ListDataServiceAuthorizedApisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAuthorizedApisResponseBodyData setApiAuthorizedList(java.util.List<ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList> apiAuthorizedList) {
            this.apiAuthorizedList = apiAuthorizedList;
            return this;
        }
        public java.util.List<ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList> getApiAuthorizedList() {
            return this.apiAuthorizedList;
        }

        public ListDataServiceAuthorizedApisResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataServiceAuthorizedApisResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataServiceAuthorizedApisResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
