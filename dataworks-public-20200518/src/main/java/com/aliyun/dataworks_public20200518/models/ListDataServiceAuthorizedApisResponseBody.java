// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceAuthorizedApisResponseBody extends TeaModel {
    /**
     * <p>The information about the APIs that you are authorized to access.</p>
     */
    @NameInMap("Data")
    public ListDataServiceAuthorizedApisResponseBodyData data;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
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

    public static ListDataServiceAuthorizedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAuthorizedApisResponseBody self = new ListDataServiceAuthorizedApisResponseBody();
        return TeaModel.build(map, self);
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

    public ListDataServiceAuthorizedApisResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceAuthorizedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceAuthorizedApisResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The name of the API.</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The path of the API.</p>
         */
        @NameInMap("ApiPath")
        public String apiPath;

        /**
         * <p>The status of the API. Valid values: 0 and 1. The value 0 indicates that the API is not published. The value 1 indicates that the API is published.</p>
         */
        @NameInMap("ApiStatus")
        public Integer apiStatus;

        /**
         * <p>The time when the API was created.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the API owner.</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The time when the access permissions of the API were granted.</p>
         */
        @NameInMap("GrantCreatedTime")
        public String grantCreatedTime;

        /**
         * <p>The expiration time for the granted access permissions of the API.</p>
         */
        @NameInMap("GrantEndTime")
        public String grantEndTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who granted the access permissions of the API.</p>
         */
        @NameInMap("GrantOperatorId")
        public String grantOperatorId;

        /**
         * <p>The ID of the API group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the API was last updated.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList self = new ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setApiStatus(Integer apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public Integer getApiStatus() {
            return this.apiStatus;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setGrantCreatedTime(String grantCreatedTime) {
            this.grantCreatedTime = grantCreatedTime;
            return this;
        }
        public String getGrantCreatedTime() {
            return this.grantCreatedTime;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setGrantEndTime(String grantEndTime) {
            this.grantEndTime = grantEndTime;
            return this;
        }
        public String getGrantEndTime() {
            return this.grantEndTime;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setGrantOperatorId(String grantOperatorId) {
            this.grantOperatorId = grantOperatorId;
            return this;
        }
        public String getGrantOperatorId() {
            return this.grantOperatorId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDataServiceAuthorizedApisResponseBodyData extends TeaModel {
        /**
         * <p>The list of APIs that you are authorized to access.</p>
         */
        @NameInMap("ApiAuthorizedList")
        public java.util.List<ListDataServiceAuthorizedApisResponseBodyDataApiAuthorizedList> apiAuthorizedList;

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
         * <p>The total number of returned entries.</p>
         */
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
