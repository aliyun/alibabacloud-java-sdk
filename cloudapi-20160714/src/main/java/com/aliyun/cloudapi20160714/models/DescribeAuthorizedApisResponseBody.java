// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAuthorizedApisResponseBody extends TeaModel {
    @NameInMap("AuthorizedApis")
    public DescribeAuthorizedApisResponseBodyAuthorizedApis authorizedApis;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAuthorizedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthorizedApisResponseBody self = new DescribeAuthorizedApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthorizedApisResponseBody setAuthorizedApis(DescribeAuthorizedApisResponseBodyAuthorizedApis authorizedApis) {
        this.authorizedApis = authorizedApis;
        return this;
    }
    public DescribeAuthorizedApisResponseBodyAuthorizedApis getAuthorizedApis() {
        return this.authorizedApis;
    }

    public DescribeAuthorizedApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAuthorizedApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAuthorizedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuthorizedApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("AuthVaildTime")
        public String authVaildTime;

        @NameInMap("AuthorizationSource")
        public String authorizationSource;

        @NameInMap("AuthorizedTime")
        public String authorizedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StageName")
        public String stageName;

        public static DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi self = new DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi();
            return TeaModel.build(map, self);
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setAuthVaildTime(String authVaildTime) {
            this.authVaildTime = authVaildTime;
            return this;
        }
        public String getAuthVaildTime() {
            return this.authVaildTime;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setAuthorizationSource(String authorizationSource) {
            this.authorizationSource = authorizationSource;
            return this;
        }
        public String getAuthorizationSource() {
            return this.authorizationSource;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setAuthorizedTime(String authorizedTime) {
            this.authorizedTime = authorizedTime;
            return this;
        }
        public String getAuthorizedTime() {
            return this.authorizedTime;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribeAuthorizedApisResponseBodyAuthorizedApis extends TeaModel {
        @NameInMap("AuthorizedApi")
        public java.util.List<DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi> authorizedApi;

        public static DescribeAuthorizedApisResponseBodyAuthorizedApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthorizedApisResponseBodyAuthorizedApis self = new DescribeAuthorizedApisResponseBodyAuthorizedApis();
            return TeaModel.build(map, self);
        }

        public DescribeAuthorizedApisResponseBodyAuthorizedApis setAuthorizedApi(java.util.List<DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi> authorizedApi) {
            this.authorizedApi = authorizedApi;
            return this;
        }
        public java.util.List<DescribeAuthorizedApisResponseBodyAuthorizedApisAuthorizedApi> getAuthorizedApi() {
            return this.authorizedApi;
        }

    }

}
