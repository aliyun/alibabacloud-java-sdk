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

    }

}
