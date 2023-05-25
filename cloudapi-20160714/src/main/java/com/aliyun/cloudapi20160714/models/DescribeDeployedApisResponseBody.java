// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployedApisResponseBody extends TeaModel {
    @NameInMap("DeployedApis")
    public DescribeDeployedApisResponseBodyDeployedApis deployedApis;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDeployedApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployedApisResponseBody self = new DescribeDeployedApisResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeployedApisResponseBody setDeployedApis(DescribeDeployedApisResponseBodyDeployedApis deployedApis) {
        this.deployedApis = deployedApis;
        return this;
    }
    public DescribeDeployedApisResponseBodyDeployedApis getDeployedApis() {
        return this.deployedApis;
    }

    public DescribeDeployedApisResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeployedApisResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeployedApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeployedApisResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem extends TeaModel {
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiMethod")
        public String apiMethod;

        @NameInMap("ApiName")
        public String apiName;

        @NameInMap("ApiPath")
        public String apiPath;

        @NameInMap("DeployedTime")
        public String deployedTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("Visibility")
        public String visibility;

        public static DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem self = new DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiMethod(String apiMethod) {
            this.apiMethod = apiMethod;
            return this;
        }
        public String getApiMethod() {
            return this.apiMethod;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setApiPath(String apiPath) {
            this.apiPath = apiPath;
            return this;
        }
        public String getApiPath() {
            return this.apiPath;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setDeployedTime(String deployedTime) {
            this.deployedTime = deployedTime;
            return this;
        }
        public String getDeployedTime() {
            return this.deployedTime;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

    }

    public static class DescribeDeployedApisResponseBodyDeployedApis extends TeaModel {
        @NameInMap("DeployedApiItem")
        public java.util.List<DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem> deployedApiItem;

        public static DescribeDeployedApisResponseBodyDeployedApis build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApisResponseBodyDeployedApis self = new DescribeDeployedApisResponseBodyDeployedApis();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApisResponseBodyDeployedApis setDeployedApiItem(java.util.List<DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem> deployedApiItem) {
            this.deployedApiItem = deployedApiItem;
            return this;
        }
        public java.util.List<DescribeDeployedApisResponseBodyDeployedApisDeployedApiItem> getDeployedApiItem() {
            return this.deployedApiItem;
        }

    }

}
