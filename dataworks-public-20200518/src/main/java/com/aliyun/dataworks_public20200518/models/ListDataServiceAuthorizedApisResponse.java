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

    }

}
