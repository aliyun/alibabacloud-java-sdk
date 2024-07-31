// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiAuthoritiesResponseBody extends TeaModel {
    /**
     * <p>The APIs on which other users are granted the access permissions.</p>
     */
    @NameInMap("Data")
    public ListDataServiceApiAuthoritiesResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataServiceApiAuthoritiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiAuthoritiesResponseBody self = new ListDataServiceApiAuthoritiesResponseBody();
        return TeaModel.build(map, self);
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

    public ListDataServiceApiAuthoritiesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDataServiceApiAuthoritiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataServiceApiAuthoritiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords extends TeaModel {
        /**
         * <p>The time when the access permissions on the API were granted to other users.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-23T00:21:01+0800</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the API owner.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The end time of the validity period of the authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-24T00:21:01+0800</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the workspace to which the access permissions on the API are granted.</p>
         * 
         * <strong>example:</strong>
         * <p>10004</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords self = new ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
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

    }

    public static class ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList extends TeaModel {
        /**
         * <p>The API ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10002</p>
         */
        @NameInMap("ApiId")
        public Long apiId;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>My API name</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <p>The path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/1</p>
         */
        @NameInMap("ApiPath")
        public String apiPath;

        /**
         * <p>The status of the API. Valid values: 0 and 1. The value 0 indicates that the API is not published. The value 1 indicates that the API is published.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ApiStatus")
        public Integer apiStatus;

        /**
         * <p>The authorization records.</p>
         */
        @NameInMap("AuthorizationRecords")
        public java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords> authorizationRecords;

        /**
         * <p>The time when the API was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-23T00:21:01+0800</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the Alibaba Cloud account used by the API owner.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ab123</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The time when the API was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-23T00:21:01+0800</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        public static ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList self = new ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setApiStatus(Integer apiStatus) {
            this.apiStatus = apiStatus;
            return this;
        }
        public Integer getApiStatus() {
            return this.apiStatus;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setAuthorizationRecords(java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords> authorizationRecords) {
            this.authorizationRecords = authorizationRecords;
            return this;
        }
        public java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationListAuthorizationRecords> getAuthorizationRecords() {
            return this.authorizationRecords;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDataServiceApiAuthoritiesResponseBodyData extends TeaModel {
        /**
         * <p>The APIs on which other users are granted the access permissions.</p>
         */
        @NameInMap("ApiAuthorizationList")
        public java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList> apiAuthorizationList;

        /**
         * <p>The page number. The value of this parameter is the same as that of the PageNumber parameter in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataServiceApiAuthoritiesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceApiAuthoritiesResponseBodyData self = new ListDataServiceApiAuthoritiesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDataServiceApiAuthoritiesResponseBodyData setApiAuthorizationList(java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList> apiAuthorizationList) {
            this.apiAuthorizationList = apiAuthorizationList;
            return this;
        }
        public java.util.List<ListDataServiceApiAuthoritiesResponseBodyDataApiAuthorizationList> getApiAuthorizationList() {
            return this.apiAuthorizationList;
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

    }

}
